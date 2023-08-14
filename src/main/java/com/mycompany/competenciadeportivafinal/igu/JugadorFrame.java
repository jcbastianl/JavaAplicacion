package com.mycompany.competenciadeportivafinal.igu;

import com.mycompany.competenciadeportivafinal.logica.Controladora;
import com.mycompany.competenciadeportivafinal.logica.Equipo;
import com.mycompany.competenciadeportivafinal.logica.Jugador;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JugadorFrame extends javax.swing.JFrame {

    Controladora control = new Controladora();
    private javax.swing.table.DefaultTableModel modeloTabla;

    public JugadorFrame() {
        initComponents();
        llenarComboBoxEquipos();
        llenarTablaJugadores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDorsal = new javax.swing.JTextField();
        txtPosicion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        cmbEquipo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaModelo = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 141, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Apellidos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 183, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dorsal");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 231, -1, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Posición");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 279, 54, -1));

        txtApellido.setForeground(new java.awt.Color(0, 0, 0));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 179, 440, -1));

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 137, 440, -1));

        txtDorsal.setForeground(new java.awt.Color(0, 0, 0));
        txtDorsal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDorsalActionPerformed(evt);
            }
        });
        jPanel1.add(txtDorsal, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 227, 440, -1));

        txtPosicion.setForeground(new java.awt.Color(0, 0, 0));
        txtPosicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPosicionActionPerformed(evt);
            }
        });
        jPanel1.add(txtPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 275, 440, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar Jugador");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 399, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Edad");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(49, 329, -1, -1));

        jLabel8.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Equipo");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        txtEdad.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(txtEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 325, 440, -1));

        cmbEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEquipoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 367, -1, -1));

        tablaModelo.setBackground(new java.awt.Color(255, 255, 255));
        tablaModelo.setForeground(new java.awt.Color(0, 0, 0));
        tablaModelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre", "apellido", "dorsal", "edad", "Equipo"
            }
        ));
        jScrollPane1.setViewportView(tablaModelo);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 458, 532, 209));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Jugador");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(159, 36, 335, 62));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/6212 (1).jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 730));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 660, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEquipoActionPerformed
        // Llamar al método para llenar la JComboBox de equipos con los equipos de la liga seleccionada
        llenarComboBoxEquipos();

        // Actualizar la tabla de jugadores con los nuevos datos del equipo seleccionado
        llenarTablaJugadores();
    }//GEN-LAST:event_cmbEquipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Obtener los datos del jugador desde los campos de texto
        int dorsal = Integer.parseInt(txtDorsal.getText());
        String nombre = txtNombre.getText();
        int edad = Integer.parseInt(txtEdad.getText());
        String apellido = txtApellido.getText();
        String posicion = txtPosicion.getText();

        // Obtener el equipo seleccionado en el ComboBox
        String nombreEquipo = cmbEquipo.getSelectedItem().toString();
        Equipo equipo = control.obtenerEquipoPorNombre(nombreEquipo);

        // Agregar el jugador al equipo
        control.agregarJugador(dorsal, nombre, edad, apellido, posicion, equipo);

        // Actualizar la tabla de jugadores con los nuevos datos
        llenarTablaJugadores();

        JOptionPane.showMessageDialog(this, "El jugador ha sido agregado exitosamente.", "Jugador Agregado", JOptionPane.INFORMATION_MESSAGE);

        // Reiniciar los campos de texto
        txtDorsal.setText("");
        txtNombre.setText("");
        txtEdad.setText("");
        txtApellido.setText("");
        txtPosicion.setText("");

        // Actualizar la JComboBox de equipos con el nuevo equipo agregado
        llenarComboBoxEquipos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtPosicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPosicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPosicionActionPerformed

    private void txtDorsalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDorsalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDorsalActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void llenarTablaJugadores() {
        // Obtén la lista de jugadores desde la base de datos utilizando la clase ControladoraPersistencia
    List<Jugador> jugadores = control.obtenerJugadores();

    // Inicializa el modelo de la tabla
    DefaultTableModel model = new DefaultTableModel(
            new Object[][]{},
            new String[]{"Nombre", "Apellido", "Dorsal", "Edad", "Equipo"}
    );

    // Agrega los jugadores al modelo de la tabla junto con el nombre del equipo al que pertenecen
    for (Jugador jugador : jugadores) {
        Object[] fila = {jugador.getNombre(), jugador.getApellido(), jugador.getDorsal(), jugador.getEdad(), jugador.getEquipo().getNombre()};
        model.addRow(fila);
    }

    // Establece el modelo de la tabla con los datos actualizados
    tablaModelo.setModel(model);
    }
    private void llenarComboBoxEquipos() {
        // Obtener la lista de todos los equipos utilizando la instancia de la clase Controladora
        List<Equipo> equipos = control.obtenerEquipos();

        // Guardar el equipo actualmente seleccionado (si hay alguno)
        Object equipoSeleccionado = cmbEquipo.getSelectedItem();

        // Limpiar la JComboBox de equipos antes de agregar los nuevos elementos
        cmbEquipo.removeAllItems();

        // Agregar los nombres de los equipos a la JComboBox de equipos
        for (Equipo equipo : equipos) {
            cmbEquipo.addItem(equipo.getNombre());
        }

        // Establecer el equipo previamente seleccionado nuevamente en el JComboBox (si existe)
        if (equipoSeleccionado != null) {
            cmbEquipo.setSelectedItem(equipoSeleccionado);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmbEquipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaModelo;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDorsal;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPosicion;
    // End of variables declaration//GEN-END:variables
}
