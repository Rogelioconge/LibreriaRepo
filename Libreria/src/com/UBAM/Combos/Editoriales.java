/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UBAM.Combos;

/**
 *
 * @author rogerconge
 */
public class Editoriales {
private int idie;
    private String nombre_editorial;

    public Editoriales() {
    }
    
    
    public int getIdie() {
        return idie;
    }

    public void setIdie(int idie) {
        this.idie = idie;
    }

    public String getNombre_editorial() {
        return nombre_editorial;
    }

    public void setNombre_editorial(String nombre_editorial) {
        this.nombre_editorial = nombre_editorial;
    }
    

    
    public Editoriales(int idie, String nombre_editorial) {
        this.idie = idie;
        this.nombre_editorial = nombre_editorial;
    }
    
}
