/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ister.vista;

import ec.edu.ister.controlador.Conexion;
import ec.edu.ister.controlador.GestionPolicias;
import ec.edu.ister.controlador.Validadores;
import ec.edu.ister.modelo.Policia;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos Carvajal y Luis Cevallos
 */
public final class FrmGestionPolicias extends javax.swing.JFrame {

    /**
     * Creates new form FrmGestionPoliticos
     */
    Validadores validar = new Validadores();
    GestionPolicias policias = new GestionPolicias();
    Policia policia = new Policia();
    Conexion mysql = new Conexion();
    Connection conexionMysql = mysql.getConexion();

    public FrmGestionPolicias() {
        initComponents();
        getDatosTabla("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.JPopupMenu();
        botonSeleccionar = new javax.swing.JMenuItem();
        botonEliminar = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        btlPolicias = new javax.swing.JTable();
        botonAgregar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        txtGerarquia = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        botonSeleccionar.setText("Seleccionar Político");
        botonSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSeleccionarActionPerformed(evt);
            }
        });
        grupo.add(botonSeleccionar);

        botonEliminar.setText("Eliminar Político");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        grupo.add(botonEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Policías Municipales de Runiñahui");
        setMinimumSize(new java.awt.Dimension(936, 557));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Proyecto Cliente Servidor    ||    Por: Carlos Carvajal y Luis Cevallos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 670, 30));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Cédula");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Nombres");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Apellidos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Gerarquía");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Correo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("Dirección");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("Teléfono");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        txtCedula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 190, 30));

        txtNombres.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 190, 30));

        txtApellidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });
        getContentPane().add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 190, 30));

        txtDireccion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDireccionKeyTyped(evt);
            }
        });
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 190, 30));

        txtTelefono.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 190, 30));

        txtBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 140, 30));

        btlPolicias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "CEDULA", "NOMBRES", "APELLIDOS", "GERARQUÍA", "CORREO", "DIRECCIÓN", "TELEFONO"
            }
        ));
        btlPolicias.setComponentPopupMenu(grupo);
        jScrollPane1.setViewportView(btlPolicias);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 590, 210));

        botonAgregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonAgregar.setText("Agregar");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 90, 30));

        botonModificar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });
        getContentPane().add(botonModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 80, 100, 30));

        botonBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 100, 30));

        botonActualizar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botonActualizar.setText("Actualizar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(botonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 120, 30));

        txtGerarquia.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        txtGerarquia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Capitan", "Sargento", "Cabo", "Oficial" }));
        getContentPane().add(txtGerarquia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 190, 30));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setText("Municipales de Rumiñahui");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtCorreo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        getContentPane().add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, 190, 30));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCedulaKeyTyped
        validar.numerico(evt);// TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaKeyTyped

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        validar.alfabetico(evt);// TODO add your handling code here:
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        validar.alfabetico(evt);// TODO add your handling code here:
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDireccionKeyTyped
//        Puede existir pardito con todos los caracteres
    }//GEN-LAST:event_txtDireccionKeyTyped

    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        validar.numerico(evt);// TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void txtBuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyTyped
        validar.numerico(evt);// TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarKeyTyped

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if (validar.cedulaEcuador(txtBuscar.getText())) {
            if (!getDatosTabla(txtBuscar.getText())) {
            JOptionPane.showMessageDialog(null, "Campo no encontrado");
        }
        }
        txtBuscar.setText("");
// TODO add your handling code here:
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        getDatosTabla("");// TODO add your handling code here:
    }//GEN-LAST:event_botonActualizarActionPerformed
    boolean getCamposEnBlanco() {
        String enBlanco = "";
        if (txtCedula.getText().equals(enBlanco) || txtNombres.equals(enBlanco) || txtApellidos.equals(enBlanco) || txtGerarquia.getActionCommand().equals("Seleccione") || txtDireccion.getText().equals(enBlanco) || txtTelefono.getText().equals(enBlanco) || txtCorreo.getText().equals(enBlanco)) {

            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios...");
            return true;

        } else {
            return false;
        }
    }
    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed


        if (!getCamposEnBlanco()) {
            if (validar.cedulaEcuador(txtCedula.getText())) {
                policias.setPolicia(txtCedula.getText(), txtNombres.getText(), txtApellidos.getText(), txtGerarquia.getSelectedItem().toString(), txtCorreo.getText(), txtDireccion.getText(), txtTelefono.getText());
                getDatosTabla("");
                setLimpiesa();
            }
        }

    }//GEN-LAST:event_botonAgregarActionPerformed

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed

        if (!getCamposEnBlanco()) {
            if (validar.cedulaEcuador(txtCedula.getText())) {
                if (policias.modificarPolicia(txtCedula.getText(), txtNombres.getText(), txtApellidos.getText(), txtGerarquia.getSelectedItem().toString(), txtCorreo.getText(), txtDireccion.getText(), txtTelefono.getText()) == 1) {
                getDatosTabla("");
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                setLimpiesa();
            } else {
                JOptionPane.showMessageDialog(null, "Error al Actualizado");
                setLimpiesa();
            }
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSeleccionarActionPerformed
        int campoTabla = btlPolicias.getSelectedRow();
        if (campoTabla >= 0) {
            txtCedula.setText(btlPolicias.getValueAt(campoTabla, 0).toString());
            txtNombres.setText(btlPolicias.getValueAt(campoTabla, 1).toString());
            txtApellidos.setText(btlPolicias.getValueAt(campoTabla, 2).toString());
            txtGerarquia.setSelectedItem(btlPolicias.getValueAt(campoTabla, 3).toString());
            txtCorreo.setText(btlPolicias.getValueAt(campoTabla, 4).toString());
            txtDireccion.setText(btlPolicias.getValueAt(campoTabla, 5).toString());
            txtTelefono.setText(btlPolicias.getValueAt(campoTabla, 6).toString());
        } else {
            JOptionPane.showMessageDialog(null, "No a seleciones una fila..");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_botonSeleccionarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        int fila = btlPolicias.getSelectedRow();
        if (JOptionPane.showConfirmDialog(null, "¿Seguro desea Eliminiar?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == 0) {
            policias.EliminarPolicia(btlPolicias.getValueAt(fila, 0).toString());
            getDatosTabla("");
            setLimpiesa();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_botonEliminarActionPerformed
    
    void setLimpiesa(){
        txtCedula.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtGerarquia.setSelectedItem("Seleccione");
        txtTelefono.setText("");
    }
    
    boolean getDatosTabla(String parametro) {

        DefaultTableModel obDefaultTabelModel = new DefaultTableModel();
        String busquedaMysql = "";
        obDefaultTabelModel.addColumn("CÉDULA");
        obDefaultTabelModel.addColumn("NOMBRE");
        obDefaultTabelModel.addColumn("APELLIDO");
        obDefaultTabelModel.addColumn("GERARQUIA");
        obDefaultTabelModel.addColumn("CORREO");
        obDefaultTabelModel.addColumn("DIRECCION");
        obDefaultTabelModel.addColumn("TELEFONO");

        btlPolicias.setModel(obDefaultTabelModel);

        if (parametro.equals("")) {
            busquedaMysql = "SELECT * FROM policia;";
        } else {
            busquedaMysql = "SELECT * FROM policia WHERE cedulaPol='" + parametro + "';";
        }
        String[] campoTabla = new String[7];
        try {
            Statement obStatement = conexionMysql.createStatement();
            ResultSet resultSet = obStatement.executeQuery(busquedaMysql);
            while (resultSet.next()) {
                campoTabla[0] = resultSet.getString(1);
                campoTabla[1] = resultSet.getString(2);
                campoTabla[2] = resultSet.getString(3);
                campoTabla[3] = resultSet.getString(4);
                campoTabla[4] = resultSet.getString(5);
                campoTabla[5] = resultSet.getString(6);
                campoTabla[6] = resultSet.getString(7);
                obDefaultTabelModel.addRow(campoTabla);
            }
            btlPolicias.setModel(obDefaultTabelModel);
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return false;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JMenuItem botonEliminar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JMenuItem botonSeleccionar;
    private javax.swing.JTable btlPolicias;
    private javax.swing.JPopupMenu grupo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JComboBox<String> txtGerarquia;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
