/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gob.ar.itse.JuegoDeLadrillos.execute;

import gob.ar.itse.JuegoDeLadrillos.controller.PrincipalController;
import gob.ar.itse.JuegoDeLadrillos.view.JuegoDeLadrillos;
import gob.ar.itse.JuegoDeLadrillos.view.PrincipalView;

/**
 *
 * @author nico_
 */
public class AppJuegoDeLadrillos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new JuegoDeLadrillos().setVisible(true);
                new PrincipalController().mostrar();
            }
        });
    }
    
}
