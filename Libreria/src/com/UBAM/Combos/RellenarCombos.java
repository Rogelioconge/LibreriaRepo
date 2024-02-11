/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UBAM.Combos;

import com.UBAM.ConnectionMySQL.ConnectionMySQL;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author rogerconge
 */
public class RellenarCombos {
    ArrayList<Idiomas>lista;
      ArrayList<Generos>listaG;
      ArrayList<Editoriales>listaE;
    
    public RellenarCombos(){
        lista = new ArrayList(); 
        listaG = new ArrayList(); 
        listaE = new ArrayList(); 
    }  
    public void Agregaridiomas (Idiomas c){
        lista.add(c);
    }
    
    public void Agregargeneros (Generos c){
        listaG.add(c);
    }
    
        public void Agregareditorial (Editoriales c){
        listaE.add(c);
    }
    
}
