/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.reto5.vista;

/**
 *
 * @author HP
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
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
        btnGuardarPrimerInforme = new javax.swing.JButton();
        btnGenerarSegundoInforme = new javax.swing.JButton();
        btnGenerarTercerInforme = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        jLabel1.setText("SOLUCION RETO 5");

        btnGuardarPrimerInforme.setBackground(new java.awt.Color(0, 51, 255));
        btnGuardarPrimerInforme.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGuardarPrimerInforme.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarPrimerInforme.setText("Generar Primer Informe");
        btnGuardarPrimerInforme.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardarPrimerInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPrimerInformeActionPerformed(evt);
            }
        });

        btnGenerarSegundoInforme.setBackground(new java.awt.Color(255, 51, 204));
        btnGenerarSegundoInforme.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGenerarSegundoInforme.setText("Generar Segundo Informe");
        btnGenerarSegundoInforme.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerarSegundoInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarSegundoInformeActionPerformed(evt);
            }
        });

        btnGenerarTercerInforme.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnGenerarTercerInforme.setText("Generar Tercer Informe");
        btnGenerarTercerInforme.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerarTercerInforme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarTercerInformeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnGenerarTercerInforme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGuardarPrimerInforme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerarSegundoInforme, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jLabel1)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnGuardarPrimerInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerarSegundoInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerarTercerInforme, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarPrimerInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPrimerInformeActionPerformed
        // TODO add your handling code here:
        
        new frmPrimerInforme().setVisible(true);
    }//GEN-LAST:event_btnGuardarPrimerInformeActionPerformed

    private void btnGenerarSegundoInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarSegundoInformeActionPerformed
        // TODO add your handling code here:
        
        new frmSegundoInforme().setVisible(true);
    }//GEN-LAST:event_btnGenerarSegundoInformeActionPerformed

    private void btnGenerarTercerInformeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarTercerInformeActionPerformed
        // TODO add your handling code here:
        
        new frmTercerInforme().setVisible(true);
    }//GEN-LAST:event_btnGenerarTercerInformeActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGenerarSegundoInforme;
    private javax.swing.JButton btnGenerarTercerInforme;
    private javax.swing.JButton btnGuardarPrimerInforme;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}