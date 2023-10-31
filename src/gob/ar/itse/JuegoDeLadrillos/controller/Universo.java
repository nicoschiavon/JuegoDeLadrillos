/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gob.ar.itse.JuegoDeLadrillos.controller;
import gob.ar.itse.JuegoDeLadrillos.view.JuegoDeLadrillos;
import gob.ar.itse.JuegoDeLadrillo.model.Ladrillo;
import gob.ar.itse.JuegoDeLadrillo.model.Objeto;
import gob.ar.itse.JuegoDeLadrillo.model.Paleta;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author nico_
 */
public class Universo extends JPanel {
    
    private Random random;
    private static Objeto pelota;
    private Paleta paleta;
    private static Ladrillo ladrillo;
    public static ArrayList<Ladrillo> mapa = new ArrayList<>();
   

    
    public Universo(Dimension d, Objeto pelota, Ladrillo ladrillo, Paleta paleta) {
    
        this.setSize(d);
        this.setPreferredSize(d);
        this.setBorder(BorderFactory.createLineBorder(Color.BLUE));
        this.setBackground(Color.WHITE);
        
        this.random = new Random();
        this.pelota = pelota;
        this.paleta = paleta;
        this.ladrillo = ladrillo;
       
        
       
        
        for (int i = 0; i < JuegoDeLadrillos.map.size(); i++){
            //for( int j = 0; j < 21; j++) {
             
                this.ladrillo = JuegoDeLadrillos.map.get(i);
                //this.ladrillo = new Ladrillo(j * 90 + 30, i * 70 + 20);
                
                
                this.mapa.add(this.ladrillo);
            //}    
           
        }
       
    }

    public static void actualizarLadrillo() {
        
        Universo.mapa.clear();
        for (int i = 0; i < JuegoDeLadrillos.map.size(); i++){
            //for( int j = 0; j < 21; j++) {

                ladrillo = JuegoDeLadrillos.map.get(i);
                //this.ladrillo = new Ladrillo(j * 90 + 30, i * 70 + 20);
             
               Universo.mapa.add(ladrillo);
            
            //}    
           
        }
    }
    
    public void agregarObjeto (Objeto pelota) {
        this.pelota = pelota;
        //this.pelota.limitesXY(this.getWidth(),this.getHeight());
    }
    
    public void agregarLadrillo (Ladrillo ladrillo) {
        this.ladrillo = ladrillo;
    }
    
    public void agregarPaleta (Paleta paleta) {
        this.paleta = paleta;
    }
    
     @Override
    public void doLayout() {
        super.doLayout();
  

        
        
    }
    
     @Override
    public void paintComponent(Graphics g) {
        // Llama al método paintComponent de la superclase
        super.paintComponent(g);
        
        this.pelota.dibujar(g);
        this.paleta.dibujar(g);
        for (int i = 0; i < mapa.size(); i++){
            this.ladrillo = mapa.get(i);
            
            this.ladrillo.dibujar(g);
              
        }
        /*
        if(JuegoDeLadrillos.lost == true) {
            Universo.mapa.clear();
            repaint();
        }*/
    }
    
}
