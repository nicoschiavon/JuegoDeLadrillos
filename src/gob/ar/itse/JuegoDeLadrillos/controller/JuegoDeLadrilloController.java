
package gob.ar.itse.JuegoDeLadrillos.controller;

import gob.ar.itse.JuegoDeLadrillo.model.Ladrillo;
import gob.ar.itse.JuegoDeLadrillo.model.Objeto;
import gob.ar.itse.JuegoDeLadrillo.model.Paleta;
import gob.ar.itse.JuegoDeLadrillos.view.JuegoDeLadrillosView;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 *
 * @author nico_
 */
public class JuegoDeLadrilloController extends JPanel implements ActionListener, KeyListener {

    JuegoDeLadrillosView view;
    private Timer timer;
    private Random random;
    private Paleta paleta;
    private Objeto pelota;
    private Ladrillo ladrillo;
    private ArrayList<Ladrillo> map = new ArrayList<Ladrillo>();
    private int puntos;
    public int ancho;
    public int alto;
    public int level;
    private int delay = 8;
    private boolean jugar;
    private String nombre;
    private ArrayList<String> ranking = new ArrayList<String>();
    
    public JuegoDeLadrilloController() {
    
        this.view = new JuegoDeLadrillosView();
        this.addListeners();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        alto = (int)d.getHeight();
        ancho = (int)d.getWidth();
        timer = new Timer(delay, this);
        
        this.random = new Random();
        this.paleta = new Paleta(ancho / 2,alto - 200);
        this.pelota = new Objeto(ancho / 2 + (paleta.paletaWidth/2), alto -230);
        nivel();
        
        
    }
    
    public void actualizarLadrillo() {
        map.clear();
        for (int i = 0; i < map.size(); i++){
        
            ladrillo = map.get(i);
        }
        view.repaint();
    }
    
    public void mostrar() {
        this.view.toFront();
        this.view.setVisible(true);
    }
    
    
    private void addListeners() {
        
        //this.view.getBtnSalir().addActionListener(this);
    }
    
    public void nivel(){
        
        this.map.clear();
        this.view.repaint();
        level = 1;
        Image img = new ImageIcon(getClass().getClassLoader().getResource("imagen/dolar.png")).getImage();
        for (int i = 0; i < 4; i++) {
            this.map.add(ladrillo);
            int j = 0;
            while(j * 88 < ancho) {
                this.ladrillo = new Ladrillo(j * 107, i * 40, img);
                this.map.add(ladrillo);
                j++;
            }
        }
        
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

        timer.start();
        
        if(jugar) {
        
            //Intersección Paleta y Pelota
            Rectangle r1 = new Rectangle(pelota.ballPosX, pelota.ballPosY, pelota.ballwidth, pelota.ballheight);
            Rectangle r2 = new Rectangle(paleta.paletaPosX, paleta.paletaPosY, paleta.paletaWidth, paleta.paletaHeight);
             if (r1.intersects(r2)) {
                 
                 if(pelota.ballPosX + pelota.ballwidth == paleta.paletaPosX){
                     pelota.ballYdir =- pelota.ballYdir;
                 }else if(pelota.ballPosX == paleta.paletaPosX + paleta.paletaWidth) {
                     pelota.ballYdir =- pelota.ballYdir;
                 }
                 pelota.ballYdir = - pelota.ballYdir;
             } 
             
            pelota.ballPosX += pelota.ballXdir;
            pelota.ballPosY += pelota.ballYdir;
         
            if (pelota.ballPosX < 0) {
                pelota.ballXdir =- pelota.ballXdir;
            }
            
            if (pelota.ballPosY < 0) {
                pelota.ballYdir =- pelota.ballYdir;
            }
            
            if (pelota.ballPosX > ancho) {
                pelota.ballXdir =- pelota.ballXdir;
            }
        
            //Intersección Ladrillo Y Pelota
            for (int i = 0; i < map.size(); i++) {
                this.ladrillo = map.get(i);
                Rectangle ladrilloRec = new Rectangle(this.ladrillo.ladrilloX, this.ladrillo.ladrilloY, this.ladrillo.brickWidth, this.ladrillo.brickHeight);
                Rectangle bolaRec = new Rectangle(this.pelota.ballPosX, this.pelota.ballPosY, this.pelota.ballwidth, this.pelota.ballheight);
                
                if(bolaRec.intersects(ladrilloRec)) {
                    this.map.remove(this.ladrillo);
                    puntos = puntos + 50;
                    
                    System.out.println("score: " + puntos);
                    this.actualizarLadrillo();
                    
                    pelota.ballYdir =- pelota.ballYdir;
                }
                
            }
            
            //Perder
            if (pelota.ballPosY > alto - 100) {
            
                jugar = false;
                timer.stop();
                 pelota.ballPosX = ancho / 2 + (paleta.paletaWidth/2);
                
                pelota.ballPosY = alto - 230;
                pelota.ballYdir = -4;
                pelota.ballYdir = -4;
                paleta.paletaPosX = ancho / 2;
                this.map.clear();
                this.view.repaint();
                nombre = JOptionPane.showInputDialog("Ingrese su nombre");
                ranking.add(nombre);
                ranking.add(String.valueOf(puntos));
            } else {
            
                //Ganar
                if (map.isEmpty()) {
                
                    timer.stop();
                    
                    pelota.ballPosX = ancho / 2;
                    pelota.ballPosY = (alto / 2) + 200;
                    
                    if (pelota.ballXdir > 0) {
                        pelota.ballYdir =- pelota.ballYdir;
                        pelota.ballXdir =- pelota.ballXdir;
                    }
                    
                    
                }
            }
        }
        this.view.repaint();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
        
            if (this.paleta.paletaPosX <= 0) {
                this.paleta.paletaPosX = 0;
            } else {
            
                this.paleta.mvoerIzquierda();
            }
        }
        
        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (this.paleta.paletaPosX >= ancho - paleta.paletaWidth) {
                this.paleta.paletaPosX = ancho - paleta.paletaWidth;
            } else {
                this.paleta.moverDerecha();
            }  
        }
        
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
        
            jugar = true;
        }
        
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void paintCompoment(Graphics g) {
    
        this.view.paintComponents(g);
        
        this.pelota.dibujar(g);
        this.paleta.dibujar(g);
        
        for (int i = 0; i < map.size(); i++) {
            this.ladrillo = map.get(i);
            this.ladrillo.dibujar(g);
        }
    
    }
}
