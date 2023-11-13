
package gob.ar.itse.JuegoDeLadrillos.controller;

import gob.ar.itse.JuegoDeLadrillos.view.JuegoDeLadrillos;
import gob.ar.itse.JuegoDeLadrillos.view.JugadoresView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

/**
 *
 * @author nico_
 */
public class JugadoresController implements ActionListener {

    JugadoresView view;

    public JugadoresController() {
    
        this.view = new JugadoresView();
        this.addListeners();
    }
    
    public void addListeners() {
    
        this.view.getBtnLla().addActionListener(this);
        this.view.getBtnUp().addActionListener(this);
        this.view.getBtnReturn().addActionListener(this);
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

        PrincipalController pri;
        pri =  new PrincipalController();
        if (e.getSource() == this.view.getBtnLla()) {
            System.out.println("Boton Lla presionado");
            Universo.mapa.clear();
            Universo.actualizarLadrillo();
             Universo.fondo = new ImageIcon(getClass().getResource("/Imagen/leon.jpg")).getImage();
            JuegoDeLadrillos jg;
            jg = new JuegoDeLadrillos();
            this.view.dispose();
            
            jg.mostrar();
            jg.nivel1();
        }
        
        if (e.getSource() == this.view.getBtnUp()) {
            System.out.println("Boton up");
            Universo.fondo = new ImageIcon(getClass().getResource("/Imagen/bg3.png")).getImage();
            JuegoDeLadrillos jg;
            jg = new JuegoDeLadrillos();
            jg.mostrar();
            jg.nivel3();
        }
        
        if (e.getSource() ==  this.view.getBtnReturn()) {
        
            ocultar();
            pri.mostrar();
        
        } 
    }
    
}
