
package gob.ar.itse.JuegoDeLadrillos.controller;

import gob.ar.itse.JuegoDeLadrillos.view.JuegoDeLadrillos;
import gob.ar.itse.JuegoDeLadrillos.view.PrincipalView;

import gob.ar.itse.JuegoDeLadrillos.controller.JuegoDeLadrilloController;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author nico_
 */
public class PrincipalController implements ActionListener {
    
    PrincipalView view;
    Map<String, Object> views;
    

    public PrincipalController() {
    
        this.view = new PrincipalView();
        this.views = new TreeMap<>();
        addListeners();
    }
    
    private void addListeners() {
        this.view.getBtnIniciar().addActionListener(this);
        this.view.getBtnRanking().addActionListener(this);
        this.view.getBtnSalir().addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == this.view.getBtnIniciar()) {
            System.out.println("Boton jugar");
            this.view.dispose();
            JugadoresController jugadores;
            jugadores = new JugadoresController();
            jugadores.mostrar();
            
            /*
            JuegoDeLadrillos jg;
            jg = new JuegoDeLadrillos();
            jg.mostrar();
            
            /*
            JuegoDeLadrilloController game;
            String key = e.getActionCommand();
            if (this.views.containsKey(key)) {
                jg = (JuegoDeLadrillos) this.views.get(key);
            } else {
                jg = new JuegoDeLadrillos();
                this.views.put(key, jg);
            }
            jg.mostrar();     */
        }
        
        if (e.getSource() == this.view.getBtnSalir()) {
            System.exit(0);
        }
            
        
        
        if (e.getSource() == this.view.getBtnRanking()) {
            this.view.dispose();
            RankingController ranking;
            ranking = new RankingController();
            ranking.mostrar();
           /* RankingController ranking;
            String key = e.getActionCommand();
            if (this.views.containsKey(key)) {
                ranking = (RankingController) this.views.get(key);
            } else {
                ranking = new RankingController(this.view.getDskEscritorio());
                this.views.put(key, ranking);
            }
            ranking.mostrar();*/
        }
        
    }
    
    
    public void mostrar() {
        this.view.setVisible(true);
    }
}
