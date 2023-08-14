/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.competenciadeportivafinal.igu;

import com.mycompany.competenciadeportivafinal.logica.Controladora;
import com.mycompany.competenciadeportivafinal.logica.Jornada;
import static com.mycompany.competenciadeportivafinal.logica.Jornada_.partidos;
import com.mycompany.competenciadeportivafinal.logica.Liga;
import com.mycompany.competenciadeportivafinal.logica.Partido;
import java.util.ArrayList;
import java.util.Date;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sebastian
 */
public class JornadaFrame extends javax.swing.JFrame {

    Controladora control = new Controladora();

    private List<Object[]> enfrentamientosData = new ArrayList<>();

    public JornadaFrame() {
        initComponents();
        llenarComboBoxLiga();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEnfrentamientos = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        btnCrearJornada = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaEnfrentamientos.setBackground(new java.awt.Color(255, 255, 255));
        tablaEnfrentamientos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        tablaEnfrentamientos.setForeground(new java.awt.Color(0, 0, 0));
        tablaEnfrentamientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Equipo Local", "Equipo Visita", "Fecha Enfrentamiento"
            }
        ));
        jScrollPane1.setViewportView(tablaEnfrentamientos);

        jComboBox1.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnCrearJornada.setText("Crea Jornada");
        btnCrearJornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearJornadaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/85f29371-838a-4fcc-85e4-b069f1ff704f.jpg"))); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("JORNADA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(btnCrearJornada)))
                .addGap(130, 130, 130))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearJornada))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String nombreLigaSeleccionada = (String) jComboBox1.getSelectedItem();
        actualizarTablaEnfrentamientos(nombreLigaSeleccionada);
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void btnCrearJornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearJornadaActionPerformed

        String nombreLigaSeleccionada = (String) jComboBox1.getSelectedItem();
        Liga selectedLiga = control.obtenerLigaPorNombre(nombreLigaSeleccionada);

        if (selectedLiga != null) {
            Date fechaInicio = new Date(); // Obtener la fecha actual como fecha de inicio de la jornada

            // Crear una nueva instancia de Jornada con enfrentamientos aleatorios
            control.crearNuevaJornada(selectedLiga, fechaInicio);
            
            
            // Agregar la nueva jornada a la lista de jornadas de la liga (si tienes una lista)
            // selectedLiga.getJornadas().add(nuevaJornada);
            // Después de crear la jornada, actualizas la tabla y el ComboBox de ligas
            actualizarTablaEnfrentamientos(nombreLigaSeleccionada);
            llenarComboBoxLiga();
        }
    }//GEN-LAST:event_btnCrearJornadaActionPerformed
    private void llenarComboBoxLiga() {
        List<Liga> ligas = control.obtenerLigas();

        // Crear un modelo de ComboBox
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        for (Liga liga : ligas) {
            comboBoxModel.addElement(liga.getNombre());
        }

        // Asignar el modelo al JComboBox
        jComboBox1.setModel(comboBoxModel);

        // Llama a este método para actualizar la tabla con la Liga seleccionada inicialmente
        String nombreLigaSeleccionada = (String) jComboBox1.getSelectedItem();
        actualizarTablaEnfrentamientos(nombreLigaSeleccionada);

    }

    private void actualizarTablaEnfrentamientos(String nombreLiga) {

        // Limpiar los datos anteriores
        enfrentamientosData.clear();

        // Obtén el objeto Liga basado en el nombre seleccionado
        Liga selectedLiga = control.obtenerLigaPorNombre(nombreLiga);

        if (selectedLiga != null) {
            // Obtiene las jornadas para la Liga seleccionada
            List<Jornada> jornadas = control.obtenerJornadasPorLiga(selectedLiga);

            for (Jornada jornada : jornadas) {
                for (Partido partido : jornada.getPartidos()) {
                    Object[] enfrentamiento = {
                        partido.getEquipoLocal().getNombre(),
                        partido.getEquipoVisitante().getNombre(),
                        partido.getFechaInicio()
                    };
                    enfrentamientosData.add(enfrentamiento);
                }
            }

            // Nombres de las columnas
            String[] columnNames = {"Equipo Local", "Equipo Visitante", "Fecha Enfrentamiento"};

            // Convertir la lista de enfrentamientos en una matriz de datos
            Object[][] data = enfrentamientosData.toArray(new Object[0][0]);

            // Crear un nuevo modelo de tabla con los datos
            DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

            // Establecer el nuevo modelo de tabla en la tabla
            tablaEnfrentamientos.setModel(tableModel);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearJornada;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEnfrentamientos;
    // End of variables declaration//GEN-END:variables
}
