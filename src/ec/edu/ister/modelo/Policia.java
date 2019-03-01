/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.modelo;

import java.sql.Date;

/**
 *
 * @author Carlos Carvajal y Luis Cevallos
 */
public class Policia {

    private String cedulaPol;
    private String nombresPol;
    private String apellidoPol;
    private String gerarquiaPol;
    private String correoPol;
    private String direccionPol;
    private String telefonoPol;
    /**
     * @return the correoPol
     */
    public String getCorreoPol() {
        return correoPol;
    }

    /**
     * @param correoPol the correoPol to set
     */
    public void setCorreoPol(String correoPol) {
        this.correoPol = correoPol;
    }


    /**
     * @return the cedulaPol
     */
    public String getCedulaPol() {
        return cedulaPol;
    }

    /**
     * @param cedulaPol the cedulaPol to set
     */
    public void setCedulaPol(String cedulaPol) {
        this.cedulaPol = cedulaPol;
    }

    /**
     * @return the nombresPol
     */
    public String getNombresPol() {
        return nombresPol;
    }

    /**
     * @param nombresPol the nombresPol to set
     */
    public void setNombresPol(String nombresPol) {
        this.nombresPol = nombresPol;
    }

    /**
     * @return the apellidoPol
     */
    public String getApellidoPol() {
        return apellidoPol;
    }

    /**
     * @param apellidoPol the apellidoPol to set
     */
    public void setApellidoPol(String apellidoPol) {
        this.apellidoPol = apellidoPol;
    }

    /**
     * @return the gerarquiaPol
     */
    public String getGerarquiaPol() {
        return gerarquiaPol;
    }

    /**
     * @param gerarquiaPol the gerarquiaPol to set
     */
    public void setGerarquiaPol(String gerarquiaPol) {
        this.gerarquiaPol = gerarquiaPol;
    }

    /**
     * @return the direccionPol
     */
    public String getDireccionPol() {
        return direccionPol;
    }

    /**
     * @param direccionPol the direccionPol to set
     */
    public void setDireccionPol(String direccionPol) {
        this.direccionPol = direccionPol;
    }

    /**
     * @return the telefonoPol
     */
    public String getTelefonoPol() {
        return telefonoPol;
    }

    /**
     * @param telefonoPol the telefonoPol to set
     */
    public void setTelefonoPol(String telefonoPol) {
        this.telefonoPol = telefonoPol;
    }

    public void getCedulaPol(String cedulaPol) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
