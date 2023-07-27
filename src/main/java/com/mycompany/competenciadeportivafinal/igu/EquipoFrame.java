package com.mycompany.competenciadeportivafinal.igu;

import com.mycompany.competenciadeportivafinal.logica.Controladora;
import com.mycompany.competenciadeportivafinal.logica.Equipo;
import com.mycompany.competenciadeportivafinal.logica.Liga;
import java.util.List;
import javax.swing.JOptionPane;

public class EquipoFrame extends javax.swing.JFrame {

    Controladora control = new Controladora();

    private Liga selectedLiga;

    public EquipoFrame() {
        initComponents();
        llenarComboBoxLigas();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreEquipo = new javax.swing.JTextField();
        btnAgregarEquipo = new javax.swing.JButton();
        cmbEscojerLiga = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del Equipo:");

        txtNombreEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEquipoActionPerformed(evt);
            }
        });

        btnAgregarEquipo.setText("Agregar");
        btnAgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEquipoActionPerformed(evt);
            }
        });

        cmbEscojerLiga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEscojerLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEscojerLigaActionPerformed(evt);
            }
        });

        jLabel2.setText("Liga");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmbEscojerLiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAgregarEquipo)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarEquipo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEscojerLiga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEquipoActionPerformed
  // Obtiene el nombre del equipo desde el cuadro de texto
    String nombreEquipo = txtNombreEquipo.getText();

    // Verifica que se haya seleccionado una liga antes de continuar
    Liga selectedLiga = control.obtenerLigaPorNombre(cmbEscojerLiga.getSelectedItem().toString());
    if (selectedLiga == null) {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una liga antes de agregar el equipo.", "Liga no seleccionada", JOptionPane.WARNING_MESSAGE);
        return;
    }

    // Llama al método agregarEquipo de la controladora y le pasa el nombre del equipo
    control.agregarEquipo(nombreEquipo, selectedLiga);

    JOptionPane.showMessageDialog(this, "El equipo ha sido agregado exitosamente.", "Equipo Agregado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAgregarEquipoActionPerformed

    private void txtNombreEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEquipoActionPerformed

    }//GEN-LAST:event_txtNombreEquipoActionPerformed

    private void cmbEscojerLigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEscojerLigaActionPerformed
// Obtén el nombre de la liga seleccionada en el JComboBox
        Object selectedLigaObject = cmbEscojerLiga.getSelectedItem();
        if (selectedLigaObject == null) {
            // No hay elemento seleccionado, así que no hacemos nada o mostramos un mensaje de error si es necesario
            return;
        }

        String nombreLigaSeleccionada = selectedLigaObject.toString();

        // Obtiene la liga correspondiente a partir del nombre seleccionado
        selectedLiga = control.obtenerLigaPorNombre(nombreLigaSeleccionada);
    }//GEN-LAST:event_cmbEscojerLigaActionPerformed

    private void llenarComboBoxLigas() {
        // Obtén la lista de ligas desde la base de datos utilizando la clase ControladoraPersistencia
        List<Liga> ligas = control.obtenerLigas();

        // Elimina los elementos existentes del JComboBox
        cmbEscojerLiga.removeAllItems();

        // Agrega las ligas al JComboBox
        for (Liga liga : ligas) {
            cmbEscojerLiga.addItem(liga.getNombre()); // Suponiendo que 'getNombre()' devuelve el nombre de la liga
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEquipo;
    private javax.swing.JComboBox<String> cmbEscojerLiga;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNombreEquipo;
    // End of variables declaration//GEN-END:variables
}
