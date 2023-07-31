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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btnCrearJornada))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(230, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearJornada))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaEnfrentamientos;
    // End of variables declaration//GEN-END:variables
}
