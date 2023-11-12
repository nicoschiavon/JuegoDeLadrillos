
package gob.ar.itse.JuegoDeLadrillos.controller;

import gob.ar.itse.JuegoDeLadrillo.dao.ranking.RankingDao;
import gob.ar.itse.JuegoDeLadrillo.model.Ranking;
import gob.ar.itse.JuegoDeLadrillos.view.JuegoDeLadrillos;
import gob.ar.itse.JuegoDeLadrillos.view.RankingView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nico_
 */
public class RankingController implements ActionListener {
    RankingView view;
    RankingDao rankingDao;
    DefaultTableModel datos;
    DefaultTableModel datos1;
    PrincipalController princ;
    
    
    public RankingController() {
        this.view = new RankingView();
        this.rankingDao = new RankingDao();
        this.datos = (DefaultTableModel) this.view.getTblRanking().getModel();
        
        this.addListeners();
        this.evnBuscar();
    }
    
    private void addListeners() {
    
        this.view.getMniSalir().addActionListener(this);  
        this.view.getBtnReturn().addActionListener(this);
    }
    
    public void envAgregar (Ranking rankingIn) {
        
        int resultado;
        
        resultado = this.rankingDao.agregar(rankingIn);
        
        evnBuscar();
    }
    
    public final void evnBuscar() {
    
        List<Ranking> rankings;
        this.datos.setNumRows(0);
        
        rankings = rankingDao.findAll();
        
        for (Ranking ranking : rankings) {
            
            String[] fila = new String[2];
            fila[0] = ranking.getNombre();
            fila[1] = String.valueOf(ranking.getScore());
            this.datos.addRow(fila);
            }
        
        
    }
    
    public final void envBuscar10() {
    
       List<Ranking> rankings;
        this.datos.setNumRows(0);
        
        rankings = rankingDao.find10();
        
        for (Ranking ranking : rankings) {
            
            String[] fila = new String[2];
            fila[0] = ranking.getNombre();
            fila[1] = String.valueOf(ranking.getScore());
            this.datos.addRow(fila);
            } 
        
    }
    
    public void mostrar() {
        this.view.toFront();
        this.view.setVisible(true);
    }
    
    public void ocultar() {
        this.view.dispose();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        int score = JuegoDeLadrillos.score;
        
        String nombre = JuegoDeLadrillos.iniciales;
        Ranking rankingIn;
        rankingIn = new Ranking();
        rankingIn.setNombre(nombre);
        
        rankingIn.setScore(score);
        PrincipalController pri;
        pri =  new PrincipalController();
        
        if (e.getSource() == this.view.getMniSalir()) {
            ocultar();
            pri.mostrar();
            
        }
        
        
        if (e.getSource() == this.view.getCmbxRanking()) {
        
            String opcionSeleccionada = (String) this.view.getCmbxRanking().getSelectedItem();
            
            switch (opcionSeleccionada) {
            
                case "Ultimos Jugadores":
                    System.out.println("Ultimos");
                    break;
                case "Top 10":
                    envBuscar10();
                    break;
                case "Top 100":
                    System.out.println("100");
                    break;
                case "Top 1000":
                    System.out.println("1000");
                    break;
                default:
                    break;
            }
        }
        
        if (e.getSource() == this.view.getBtnReturn()) {
        
            ocultar();
            pri.mostrar();
        }
    }
     
}
