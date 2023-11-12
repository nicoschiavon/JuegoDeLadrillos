/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gob.ar.itse.JuegoDeLadrillo.model;

/**
 *
 * @author nico_
 */
public class Ranking {
    String nombre;
    int score;
    int pos;
    int id;

    public Ranking() {
    }

    public Ranking(String nombre, int score, int pos, int id) {
        this.nombre = nombre;
        this.score = score;
        this.pos = pos;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    
}
