/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.controlador;

import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Carvajal y Luis Cevallos
 */
public class Validadores {

    public void numerico(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if (c < '0' || c > '9') {
            evt.consume();
        }
        {
        }
    }

    public void alfabetico(java.awt.event.KeyEvent evt) {
        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < ' ' || c > ' ')) {
            evt.consume();
        }
        {
        }
    }

    public boolean cedulaEcuador(String cedula) {
        boolean cedulaCorrecta = false;
        try {
            if (cedula.length() == 10) {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) { 
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null,"Una excepcion ocurrio en el proceso de validadcion");
            cedulaCorrecta = false;
        }

        if (!cedulaCorrecta) {
            JOptionPane.showMessageDialog(null,"La Cédula ingresada es Incorrecta"); 
        }
        return cedulaCorrecta;
    }
//    public boolean camposObligatorios(String cedulaPol,String nombresPol,String apellidoPol,String direccionPol, String telefonoPol){
//        String blanco="";
//        if (cedulaPol.equals(blanco) || nombresPol.equals(blanco) || apellidoPol.equals(blanco) || direccionPol.equals(blanco) || telefonoPol.equals(blanco)) {
//            JOptionPane.showMessageDialog(null,"No puden existir campos en blanco");
//            return true;
//        }else{
//            return false;
//        }
//    }
}
