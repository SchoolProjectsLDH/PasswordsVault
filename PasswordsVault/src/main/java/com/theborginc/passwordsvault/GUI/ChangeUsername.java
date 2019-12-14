/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theborginc.passwordsvault.GUI;

import com.theborginc.passwordsvault.Auth.AuthChecker;
import com.theborginc.passwordsvault.Auth.Configs;
import java.io.IOException;

/**
 *
 * @author keshavgupta
 */
public class ChangeUsername extends javax.swing.JFrame {

    /**
     * Creates new form ChangeUsername
     */
    public ChangeUsername() {
        initComponents();
        incorrectUserLabel.setVisible(false);
        dontMatchLabel.setVisible(false);
    }
    
    Configs configs = new Configs();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        incorrectUserLabel = new javax.swing.JLabel();
        dontMatchLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        confirmLabel = new javax.swing.JLabel();
        confirmUserField = new javax.swing.JTextField();
        newUserLabel = new javax.swing.JLabel();
        newUserField = new javax.swing.JTextField();
        prevUserLabel = new javax.swing.JLabel();
        prevUserField = new javax.swing.JTextField();
        TitleLabel = new javax.swing.JLabel();
        BackTitleImg = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 410));
        setMinimumSize(new java.awt.Dimension(610, 410));
        setResizable(false);
        getContentPane().setLayout(null);

        incorrectUserLabel.setBackground(new java.awt.Color(0, 102, 204));
        incorrectUserLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        incorrectUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        incorrectUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        incorrectUserLabel.setText("Incorrect User");
        getContentPane().add(incorrectUserLabel);
        incorrectUserLabel.setBounds(430, 120, 180, 50);

        dontMatchLabel.setBackground(new java.awt.Color(0, 102, 204));
        dontMatchLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        dontMatchLabel.setForeground(new java.awt.Color(255, 255, 255));
        dontMatchLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dontMatchLabel.setText("Don't match!");
        getContentPane().add(dontMatchLabel);
        dontMatchLabel.setBounds(430, 240, 180, 50);

        SubmitButton.setBackground(new java.awt.Color(0, 0, 0));
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SubmitButton.png"))); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.setToolTipText("");
        SubmitButton.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        SubmitButton.setBorderPainted(false);
        SubmitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        getContentPane().add(SubmitButton);
        SubmitButton.setBounds(487, 320, 100, 50);

        Back.setBackground(new java.awt.Color(0, 0, 0));
        Back.setForeground(new java.awt.Color(255, 255, 255));
        Back.setText("Back");
        Back.setToolTipText("");
        Back.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Back.setBorderPainted(false);
        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(30, 340, 50, 20);

        confirmLabel.setBackground(new java.awt.Color(0, 102, 204));
        confirmLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        confirmLabel.setForeground(new java.awt.Color(255, 255, 255));
        confirmLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        confirmLabel.setText("Confirm Username:");
        getContentPane().add(confirmLabel);
        confirmLabel.setBounds(0, 240, 210, 50);

        confirmUserField.setBackground(new java.awt.Color(0, 0, 0));
        confirmUserField.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        confirmUserField.setForeground(new java.awt.Color(255, 255, 255));
        confirmUserField.setToolTipText("Username");
        confirmUserField.setCaretColor(new java.awt.Color(255, 255, 255));
        confirmUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmUserFieldActionPerformed(evt);
            }
        });
        getContentPane().add(confirmUserField);
        confirmUserField.setBounds(210, 240, 220, 50);

        newUserLabel.setBackground(new java.awt.Color(0, 102, 204));
        newUserLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        newUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        newUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newUserLabel.setText("New Username:");
        getContentPane().add(newUserLabel);
        newUserLabel.setBounds(0, 180, 210, 50);

        newUserField.setBackground(new java.awt.Color(0, 0, 0));
        newUserField.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        newUserField.setForeground(new java.awt.Color(255, 255, 255));
        newUserField.setToolTipText("Username");
        newUserField.setCaretColor(new java.awt.Color(255, 255, 255));
        newUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newUserFieldActionPerformed(evt);
            }
        });
        getContentPane().add(newUserField);
        newUserField.setBounds(210, 180, 220, 50);

        prevUserLabel.setBackground(new java.awt.Color(0, 102, 204));
        prevUserLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        prevUserLabel.setForeground(new java.awt.Color(255, 255, 255));
        prevUserLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prevUserLabel.setText("Previous Username:");
        getContentPane().add(prevUserLabel);
        prevUserLabel.setBounds(0, 120, 210, 50);

        prevUserField.setBackground(new java.awt.Color(0, 0, 0));
        prevUserField.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        prevUserField.setForeground(new java.awt.Color(255, 255, 255));
        prevUserField.setToolTipText("Username");
        prevUserField.setCaretColor(new java.awt.Color(255, 255, 255));
        prevUserField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevUserFieldActionPerformed(evt);
            }
        });
        getContentPane().add(prevUserField);
        prevUserField.setBounds(210, 120, 220, 50);

        TitleLabel.setBackground(new java.awt.Color(0, 102, 204));
        TitleLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Change Username");
        getContentPane().add(TitleLabel);
        TitleLabel.setBounds(0, 30, 610, 43);

        BackTitleImg.setBackground(new java.awt.Color(0, 102, 204));
        BackTitleImg.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        BackTitleImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackTitleImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Title.png"))); // NOI18N
        getContentPane().add(BackTitleImg);
        BackTitleImg.setBounds(0, 0, 600, 100);

        Background.setBackground(new java.awt.Color(0, 0, 0));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securitybg.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 610, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void prevUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prevUserFieldActionPerformed

    private void newUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newUserFieldActionPerformed

    private void confirmUserFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmUserFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmUserFieldActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PasswordsList().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed
    
    private void updateInvalidFields() throws IOException{
        if(!prevUserField.getText().equals(configs.getUsername())){
            incorrectUserLabel.setVisible(true);
        }
        if(!newUserField.getText().equals(confirmUserField.getText())){
            dontMatchLabel.setVisible(true);
        }
    }
    
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        try{
            incorrectUserLabel.setVisible(false);
            dontMatchLabel.setVisible(false);
            this.updateInvalidFields();
            if(prevUserField.getText().equals(configs.getUsername()) && newUserField.getText().equals(confirmUserField.getText())){
                configs.setUsername(newUserField.getText());
                java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                        new PasswordsList().setVisible(true);
                    }
                });
                this.dispose();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChangeUsername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeUsername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeUsername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeUsername.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeUsername().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackTitleImg;
    private javax.swing.JLabel Background;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JTextField confirmUserField;
    private javax.swing.JLabel dontMatchLabel;
    private javax.swing.JLabel incorrectUserLabel;
    private javax.swing.JTextField newUserField;
    private javax.swing.JLabel newUserLabel;
    private javax.swing.JTextField prevUserField;
    private javax.swing.JLabel prevUserLabel;
    // End of variables declaration//GEN-END:variables
}
