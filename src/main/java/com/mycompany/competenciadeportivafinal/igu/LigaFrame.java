
package com.mycompany.competenciadeportivafinal.igu;

import com.mycompany.competenciadeportivafinal.logica.Controladora;

import java.util.Date;
import javax.swing.JOptionPane;




public class LigaFrame extends javax.swing.JFrame {

    
    public LigaFrame() {
        initComponents();
        
    }

    Controladora control = new Controladora();
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtnombreliga = new javax.swing.JTextField();
        cmbDeportes = new javax.swing.JComboBox<>();
        DateFechaInicio = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        DateFechaFin = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre de la Liga:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 108, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Deporte:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 193, -1, -1));

        txtnombreliga.setBackground(new java.awt.Color(255, 255, 255));
        txtnombreliga.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtnombreliga.setForeground(new java.awt.Color(0, 0, 0));
        txtnombreliga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreligaActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombreliga, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 104, 353, -1));

        cmbDeportes.setBackground(new java.awt.Color(255, 255, 255));
        cmbDeportes.setForeground(new java.awt.Color(0, 0, 0));
        cmbDeportes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Futbol", "Basket", "" }));
        cmbDeportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDeportesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbDeportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 188, -1, -1));

        DateFechaInicio.setBackground(new java.awt.Color(0, 0, 0));
        DateFechaInicio.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(DateFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 146, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Fecha Inicio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 154, -1, -1));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Fecha Final");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, 154, -1, -1));

        DateFechaFin.setBackground(new java.awt.Color(0, 0, 0));
        DateFechaFin.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(DateFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 146, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LIGA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 33, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desktop-wallpaper-super-campeones-el-original (1).jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 550, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreligaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreligaActionPerformed

    }//GEN-LAST:event_txtnombreligaActionPerformed

    private void cmbDeportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDeportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbDeportesActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        EquipoFrame pantallaequipo = new EquipoFrame();
        pantallaequipo.setVisible(true);
        pantallaequipo.setLocationRelativeTo(null);

        String nombre = txtnombreliga.getText();
        String deporte = cmbDeportes.getSelectedItem().toString();

        Date fechaInicio = DateFechaInicio.getDate();
        Date fechaFin = DateFechaFin.getDate();

        // Luego, llama al método agregarLiga de la controladora
        control.agregarLiga(nombre, deporte, fechaInicio, fechaFin);

        JOptionPane.showMessageDialog(this, "La Liga ha sido creada exitosamente.", "Liga Creada", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser DateFechaFin;
    private com.toedter.calendar.JDateChooser DateFechaInicio;
    private javax.swing.JComboBox<String> cmbDeportes;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtnombreliga;
    // End of variables declaration//GEN-END:variables
}
