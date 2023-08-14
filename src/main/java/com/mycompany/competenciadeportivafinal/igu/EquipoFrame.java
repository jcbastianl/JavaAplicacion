package com.mycompany.competenciadeportivafinal.igu;

import com.mycompany.competenciadeportivafinal.logica.Controladora;
import com.mycompany.competenciadeportivafinal.logica.Equipo;
import com.mycompany.competenciadeportivafinal.logica.Liga;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EquipoFrame extends javax.swing.JFrame {

    Controladora control = new Controladora();

    private Liga selectedLiga;

    public EquipoFrame() {
        initComponents();
        llenarComboBoxLigas();
llenarTablaEquipos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombreEquipo = new javax.swing.JTextField();
        btnAgregarEquipo = new javax.swing.JButton();
        cmbEscojerLiga = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEquipos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("EQUIPO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del Equipo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 110, -1, -1));

        txtNombreEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEquipoActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 106, 149, -1));

        btnAgregarEquipo.setText("Agregar");
        btnAgregarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEquipoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarEquipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 106, -1, -1));

        cmbEscojerLiga.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEscojerLiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEscojerLigaActionPerformed(evt);
            }
        });
        jPanel1.add(cmbEscojerLiga, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 148, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Liga");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 153, -1, -1));

        tablaEquipos.setBackground(new java.awt.Color(255, 255, 255));
        tablaEquipos.setForeground(new java.awt.Color(0, 0, 0));
        tablaEquipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Equipos", "Liga"
            }
        ));
        jScrollPane1.setViewportView(tablaEquipos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 114));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RESIZEER1).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 600, 630));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 590, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void llenarTablaEquipos() {
    // Obtén la lista de equipos desde la base de datos utilizando la clase ControladoraPersistencia
    List<Equipo> equipos = control.obtenerEquipos();

    // Obtén el modelo de la tabla
    DefaultTableModel model = (DefaultTableModel) tablaEquipos.getModel();

    // Limpia la tabla antes de agregar los datos
    model.setRowCount(0);

    // Agrega los equipos al modelo de la tabla
    for (Equipo equipo : equipos) {
        model.addRow(new Object[]{equipo.getNombre(), equipo.getLiga().getNombre()});
    }
}
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEquipos;
    private javax.swing.JTextField txtNombreEquipo;
    // End of variables declaration//GEN-END:variables
}
