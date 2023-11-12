/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gob.ar.itse.JuegoDeLadrillo.model;

import gob.ar.itse.JuegoDeLadrillos.controller.Universo;
import java.awt.BasicStroke;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;


/**
 *
 * @author nico_
 */
public class Ladrillo {
      
    private String imagen;
    private Image imgObjeto;
    public int ladrilloX;
    public int ladrilloY;
    public int brickWidth;
    public int brickHeight;
    
    public Ladrillo(int ladrilloX, int ladrilloY, Image img) {
        
        this.ladrilloX = ladrilloX;
        this.ladrilloY = ladrilloY;
        this.imgObjeto = img;
        this.brickHeight =  imgObjeto.getHeight(null);
        this.brickWidth = imgObjeto.getWidth(null);
          
    }

    
    
    
    
    
    public void dibujar(Graphics g) {
        
         Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(imgObjeto, this.ladrilloX, this.ladrilloY, null);
        
    }
    
    
    
}
