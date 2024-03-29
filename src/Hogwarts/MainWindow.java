/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogwarts;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author jpn
 */
public class MainWindow extends javax.swing.JFrame
{

    InfDB idb;

    /**
     * Creates new form huvudfonster
     */
    public MainWindow(InfDB idb)
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

        btnVisaForNamn = new javax.swing.JButton();
        tfAngivetId = new javax.swing.JTextField();
        lblRubrikVisafornamn = new javax.swing.JLabel();
        lblAngeId = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVisaForNamn.setText("Hämta namn");
        btnVisaForNamn.addActionListener(new java.awt.event.ActionListener()
        {
            public void actionPerformed(java.awt.event.ActionEvent evt)
            {
                btnVisaForNamnActionPerformed(evt);
            }
        });

        tfAngivetId.setColumns(2);

        lblRubrikVisafornamn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRubrikVisafornamn.setText("Visa förnamn");

        lblAngeId.setText("Ange id:");

        lblName.setText("lblNamn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblRubrikVisafornamn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnVisaForNamn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblAngeId)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfAngivetId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(lblName)))
                .addContainerGap(271, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblRubrikVisafornamn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfAngivetId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAngeId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVisaForNamn)
                    .addComponent(lblName))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVisaForNamnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisaForNamnActionPerformed

        if (Validation.textFieldHasValue(tfAngivetId) && Validation.isInteger(tfAngivetId))
        {
            try
            {
                String id = tfAngivetId.getText();
                String query = "SELECT FORNAMN FROM ELEV where ELEV_ID =" + id;
                String result = idb.fetchSingle(query);
                lblName.setText(result);
            } 
            catch (InfException e)
            {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
                System.out.println("Internt felmeddelande" + e.getMessage());
            }

        }


    }//GEN-LAST:event_btnVisaForNamnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVisaForNamn;
    private javax.swing.JLabel lblAngeId;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRubrikVisafornamn;
    private javax.swing.JTextField tfAngivetId;
    // End of variables declaration//GEN-END:variables
}
