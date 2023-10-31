/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gob.ar.itse.JuegoDeLadrillo.model;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 * @author nico_
 */
public class Objeto {
    
    private String imagen;
    private Image imgObjeto;
    public int ballPosX;
    public int ballPosY = 400;
    public int ballXdir =-4;
    public int ballYdir = -4;
    public int ballwidth;
    public int ballheight;
    private int limiteIzquierdo = 0;
    private int limiteDerecho;
    private int limiteSuperior;
    private int limiteInferior;
   
   
   
   //Constructor
    public Objeto (int x, int y) {
       this.ballPosX = x;
       this.ballPosY = y;
       this.imgObjeto = new ImageIcon(getClass().getClassLoader().getResource("imagen/Ball.png")).getImage();
       this.ballheight = imgObjeto.getHeight(null);
       this.ballwidth = imgObjeto.getWidth(null);
       this.imagen = imagen;
    }

    public String getImagen() {
        return this.imagen;
    }
   
    public void limitesXY(int width, int heigth) {
   
       this.limiteDerecho = width - imgObjeto.getWidth(null);
       this.limiteInferior = heigth - imgObjeto.getHeight(null);
    }
    
    //Generar numeros random
    private int getNumberRandom(int maximo) {
        return (int) (Math.random() * maximo +1);
    }
  
    public void dibujar(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(imgObjeto, this.ballPosX, this.ballPosY, null);
    }
}
