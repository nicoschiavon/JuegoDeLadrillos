
package gob.ar.itse.JuegoDeLadrillos.controller;

import gob.ar.itse.JuegoDeLadrillos.view.JuegoDeLadrillos;
import gob.ar.itse.JuegoDeLadrillos.view.JugadoresView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

        if (e.getSource() == this.view.getBtnLla()) {
            System.out.println("Boton Lla presionado");
            JuegoDeLadrillos jg;
            jg = new JuegoDeLadrillos();
            this.view.dispose();
            jg.mostrar();
            jg.nivel1();
        }
        
        if (e.getSource() == this.view.getBtnUp()) {
            System.out.println("Boton up");
            JuegoDeLadrillos jg;
            jg = new JuegoDeLadrillos();
            jg.mostrar();
            jg.nivel3();
        }
    }
    
}
