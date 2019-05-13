/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogwarts;

import oru.inf.InfDB;

/**
 *
 * @author ludwi
 */
public class ElevMain extends javax.swing.JFrame
{

    private InfDB idb;

    /**
     * Creates new form MainElev
     */
    public ElevMain(InfDB idb)
    {
        initComponents();
        this.idb = idb;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        jCheckBox1 = new javax.swing.JCheckBox();
        lblElev = new javax.swing.JLabel();
        btnInfoElever = new javax.swing.JButton();
        btnInfoLarare = new javax.swing.JButton();
        btnElevhemspokalen = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblElev.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lblElev.setText("Elev");

        btnInfoElever.setText("Information om elever");
        btnInfoElever.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnInfoEleverActionPerformed(evt);
            }
        });

        btnInfoLarare.setText("Information om lärare");
        btnInfoLarare.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnInfoLarareActionPerformed(evt);
            }
        });

        btnElevhemspokalen.setText("Elevhemspokalen");
        btnElevhemspokalen.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnElevhemspokalenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblElev)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnInfoElever, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInfoLarare, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE)
                    .addComponent(btnElevhemspokalen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblElev)
                .addGap(18, 18, 18)
                .addComponent(btnInfoElever, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInfoLarare, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 329, Short.MAX_VALUE)
                .addComponent(btnElevhemspokalen, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInfoEleverActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnInfoEleverActionPerformed
    {//GEN-HEADEREND:event_btnInfoEleverActionPerformed
        new ElevInfoElever(idb).setVisible(true);
    }//GEN-LAST:event_btnInfoEleverActionPerformed

    private void btnInfoLarareActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnInfoLarareActionPerformed
    {//GEN-HEADEREND:event_btnInfoLarareActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInfoLarareActionPerformed

    private void btnElevhemspokalenActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnElevhemspokalenActionPerformed
    {//GEN-HEADEREND:event_btnElevhemspokalenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElevhemspokalenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElevhemspokalen;
    private javax.swing.JButton btnInfoElever;
    private javax.swing.JButton btnInfoLarare;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel lblElev;
    // End of variables declaration//GEN-END:variables
}
