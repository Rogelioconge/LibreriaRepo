/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UBAM.Combos;

/**
 *
 * @author rogerconge
 */
public class Idiomas {

     private int id;
    private String nombre_idioma;

    public Idiomas() {
    }
    
    
    
    public Idiomas(int id, String nombre_idioma) {
        this.id = id;
        this.nombre_idioma = nombre_idioma;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_idioma() {
        return nombre_idioma;
    }

    public void setNombre_idioma(String nombre_idioma) {
        this.nombre_idioma = nombre_idioma;
    }
   
    
    
}
