/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Carvajal y Luis Cevallos
 */
public class Conexion { 
    private Connection conexion = null; 
    public Connection getConexion(){ 
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://sql10.freemysqlhosting.net/sql10281189","sql10281189","BrahZJnEyh");  
//            System.out.println("Conexion exitosa");
        } catch(SQLException e){
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null,"Solucione problemas del servidor de Base de Datos..");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
      return conexion;  
    }
}
