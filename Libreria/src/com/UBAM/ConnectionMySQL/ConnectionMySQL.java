/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.UBAM.ConnectionMySQL;
import java.sql.*;

/**
 *
 * @author rogerconge
 */
public class ConnectionMySQL {
   Connection conexion = null;
    String url = "jdbc:mysql://localhost:8889/Libreria";
    String user = "root";
    String pass = "root";
    
    public Connection abrirConexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection(url,user,pass);
            if(conexion!=null){
                System.out.println("Conexión exitosa");
            }else{
                System.out.println("Error en la conexión");
            }
        }catch(Exception e){
            System.out.println("Error en la conexión: "+e);
        }
        return conexion;
    }
    
    public void cerrarConexion(){
        try{
            conexion.close();
            System.out.println("Cerrando conexión");
        }catch(Exception e){System.out.println("Error en: "+e);}
    }
    
    public ResultSet ejecutarConsulta(String sql) {
        ResultSet rs = null;
        try {
            Statement stmt = conexion.createStatement();
            rs = stmt.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("Error al ejecutar consulta: " + e);
        }
        return rs;
    }
}
