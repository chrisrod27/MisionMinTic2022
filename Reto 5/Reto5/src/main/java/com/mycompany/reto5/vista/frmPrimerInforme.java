/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.reto5.vista;

import com.mycompany.reto5.modelo.DAO.PrimeraConsulta;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class frmPrimerInforme extends javax.swing.JFrame {

    /**
     * Creates new form frmPrimerInforme
     */
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    public frmPrimerInforme() {
        initComponents();
        
        modelo.addColumn("ID_Lider");
        modelo.addColumn("Nombre");
        modelo.addColumn("Primer Apellido");
        modelo.addColumn("Ciudad Residencia");
        jtbDatos.setModel(modelo);
        
        PrimeraConsulta primer_consulta = new PrimeraConsulta();
        primer_consulta.primeraconsulta(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbDatos = new javax.swing.JTable();

        jLabel1.setText("Primer Informe: Lideres");

        jtbDatos.setModel(modelo);
        jScrollPane1.setViewportView(jtbDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbDatos;
    // End of variables declaration//GEN-END:variables
}
