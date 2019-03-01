/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import ec.edu.ister.modelo.Policia;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;  
import javax.swing.JOptionPane; 

/**
 *
 * @author Carlos Carvajal y Luis Cevallos
 */
public class GestionPolicias extends Conexion {
    Policia policia = new Policia();
    public int registrarPolicia(Policia policia) { 
        ResultSet resultSet = null;
        Connection conexionMysql = getConexion();
        PreparedStatement preparedStatement = null;
        String insertarPolicia = "INSERT INTO policia (cedulaPol,nombresPol,apellidoPol,gerarquiaPol,correoPol,direccionPol,telefonoPol) VALUES(?,?,?,?,?,?,?);";
        try {
            preparedStatement = conexionMysql.prepareStatement(insertarPolicia);
            preparedStatement.setString(1, policia.getCedulaPol());
            preparedStatement.setString(2, policia.getNombresPol());
            preparedStatement.setString(3, policia.getApellidoPol());
            preparedStatement.setString(4, policia.getGerarquiaPol());
            preparedStatement.setString(5, policia.getCorreoPol());
            preparedStatement.setString(6, policia.getDireccionPol());
            preparedStatement.setString(7, policia.getTelefonoPol());
            preparedStatement.execute();
            return 1;
        } catch (SQLException e) {
            e.getMessage();
            return 0;
        } finally {
            try {
                conexionMysql.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }
    public int setPolicia(String cedulaPol, String nombresPol, String apellidoPol, String gerarquiaPol, String correoPol, String direccionPol, String telefonoPol) {

        policia.setCedulaPol(cedulaPol);
        policia.setNombresPol(nombresPol);
        policia.setApellidoPol(apellidoPol);
        policia.setGerarquiaPol(gerarquiaPol);
        policia.setCorreoPol(correoPol);
        policia.setDireccionPol(direccionPol);
        policia.setTelefonoPol(telefonoPol);

        if (registrarPolicia(policia) == 1) {
            JOptionPane.showMessageDialog(null, "Registro rabado...");

        } else {
            JOptionPane.showMessageDialog(null, "Error al grabar");

        }
        return 0;
    }
    public int modificarPolicia(String cedulaPol, String nombresPol, String apellidoPol, String gerarquiaPol, String correoPol, String direccionPol, String telefonoPol) {
        ResultSet resultSet = null;
        Connection conexionMysql = getConexion();
        PreparedStatement preparedStatement = null;
        
        String actualizarPolicia = "UPDATE policia SET nombresPol='" +nombresPol + "',apellidoPol='" + apellidoPol + "',gerarquiaPol='" + gerarquiaPol + "',correoPol='" + correoPol + "',direccionPol='" + direccionPol + "',telefonoPol='" + telefonoPol + "' WHERE cedulaPol='" + cedulaPol + "';";

        try {
            preparedStatement = conexionMysql.prepareStatement(actualizarPolicia);
            preparedStatement.execute();
            return 1;
        } catch (SQLException e) {
            e.getMessage();
            return 0;
        } finally {
            try {
                conexionMysql.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }
    public int EliminarPolicia(String cedulaPol) {
        ResultSet resultSet = null;
        Connection conexionMysql = getConexion();
        PreparedStatement preparedStatement = null;
        
        String eliminaPolicia = "DELETE FROM policia WHERE  cedulaPol='" + cedulaPol + "';";

        try {
            preparedStatement = conexionMysql.prepareStatement(eliminaPolicia);
            preparedStatement.executeUpdate();
            return 1;
        } catch (SQLException e) {
            e.getMessage();
            return 0;
        } finally {
            try {
                conexionMysql.close();
            } catch (SQLException e) {
                e.getMessage();
            }
        }
    }
}
