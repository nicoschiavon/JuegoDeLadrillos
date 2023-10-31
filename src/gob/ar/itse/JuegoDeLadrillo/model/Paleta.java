/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gob.ar.itse.JuegoDeLadrillo.model;

import gob.ar.itse.JuegoDeLadrillos.controller.Universo;
import gob.ar.itse.JuegoDeLadrillos.view.JuegoDeLadrillos;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author nico_
 */
public class Paleta {
    private String imagen;
    private Image imgObjeto;
    public int paletaPosX;
    public int paletaPosY;
    public int paletaWidth;
    public int paletaHeight;
    public int paletaYdir = 0;
    private int limiteIzquierdo = 0;
    private int limiteDerecho;
   
   
   
   //Constructor
    public Paleta (int x, int y) {
       this.paletaPosX = x;
       this.paletaPosY = y;
       this.imgObjeto = new ImageIcon(getClass().getClassLoader().getResource("imagen/Paddle.png")).getImage();
       this.paletaHeight = imgObjeto.getHeight(null);
       this.paletaWidth = imgObjeto.getWidth(null);
    }
   
    public void limiteY(int width) {
   
       this.limiteDerecho = width - imgObjeto.getWidth(null);
       
    }
    
    public void moverDerecha() {
        JuegoDeLadrillos.play = true;
        paletaPosX += 20;
    }
    
    public void mvoerIzquierda() {
        JuegoDeLadrillos.play = true;
        paletaPosX -= 20;
    }
    
    //Generar numeros random
    private int getNumberRandom(int maximo) {
        return (int) (Math.random() * maximo +1);
    }
  
    public void dibujar(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(imgObjeto, this.paletaPosX, this.paletaPosY, null);
    }
}
