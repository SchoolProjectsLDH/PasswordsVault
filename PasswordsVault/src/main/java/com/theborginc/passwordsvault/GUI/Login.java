/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theborginc.passwordsvault.GUI;
import com.theborginc.passwordsvault.Auth.*;
import java.io.IOException;
/**
 *
 * @author keshavgupta
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        Invalid2FA.setVisible(false);
        InvalidPass.setVisible(false);
        InvalidUser.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Invalid2FA = new javax.swing.JLabel();
        InvalidUser = new javax.swing.JLabel();
        InvalidPass = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        PassLabel = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        UsernameLabel = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        TwoFALabel = new javax.swing.JLabel();
        TwoFAField = new javax.swing.JTextField();
        TitleLabel = new javax.swing.JLabel();
        BackTitleImg = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login Page");
        setMinimumSize(new java.awt.Dimension(600, 400));
        getContentPane().setLayout(null);

        Invalid2FA.setBackground(new java.awt.Color(0, 102, 204));
        Invalid2FA.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        Invalid2FA.setForeground(new java.awt.Color(255, 255, 255));
        Invalid2FA.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Invalid2FA.setText("Invalid Code");
        getContentPane().add(Invalid2FA);
        Invalid2FA.setBounds(400, 240, 210, 43);

        InvalidUser.setBackground(new java.awt.Color(0, 102, 204));
        InvalidUser.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        InvalidUser.setForeground(new java.awt.Color(255, 255, 255));
        InvalidUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InvalidUser.setText("Invalid Username");
        getContentPane().add(InvalidUser);
        InvalidUser.setBounds(400, 120, 210, 43);

        InvalidPass.setBackground(new java.awt.Color(0, 102, 204));
        InvalidPass.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        InvalidPass.setForeground(new java.awt.Color(255, 255, 255));
        InvalidPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        InvalidPass.setText("Invalid Username");
        getContentPane().add(InvalidPass);
        InvalidPass.setBounds(400, 190, 210, 43);

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

        PassLabel.setBackground(new java.awt.Color(0, 102, 204));
        PassLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        PassLabel.setForeground(new java.awt.Color(255, 255, 255));
        PassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PassLabel.setText("Password:");
        PassLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(PassLabel);
        PassLabel.setBounds(0, 180, 210, 43);

        UsernameField.setBackground(new java.awt.Color(0, 0, 0));
        UsernameField.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        UsernameField.setForeground(new java.awt.Color(255, 255, 255));
        UsernameField.setToolTipText("Username");
        UsernameField.setCaretColor(new java.awt.Color(255, 255, 255));
        UsernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(UsernameField);
        UsernameField.setBounds(170, 120, 220, 50);

        UsernameLabel.setBackground(new java.awt.Color(0, 102, 204));
        UsernameLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        UsernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameLabel.setText("Username:");
        getContentPane().add(UsernameLabel);
        UsernameLabel.setBounds(0, 120, 210, 43);

        PasswordField.setBackground(new java.awt.Color(0, 0, 0));
        PasswordField.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        PasswordField.setForeground(new java.awt.Color(255, 255, 255));
        PasswordField.setToolTipText("Password");
        PasswordField.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(PasswordField);
        PasswordField.setBounds(170, 180, 220, 50);

        TwoFALabel.setBackground(new java.awt.Color(0, 102, 204));
        TwoFALabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        TwoFALabel.setForeground(new java.awt.Color(255, 255, 255));
        TwoFALabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TwoFALabel.setText("2FA Code:");
        TwoFALabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(TwoFALabel);
        TwoFALabel.setBounds(0, 240, 210, 43);

        TwoFAField.setBackground(new java.awt.Color(0, 0, 0));
        TwoFAField.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        TwoFAField.setForeground(new java.awt.Color(255, 255, 255));
        TwoFAField.setToolTipText("Username");
        TwoFAField.setCaretColor(new java.awt.Color(255, 255, 255));
        TwoFAField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TwoFAFieldActionPerformed(evt);
            }
        });
        getContentPane().add(TwoFAField);
        TwoFAField.setBounds(170, 240, 220, 50);

        TitleLabel.setBackground(new java.awt.Color(0, 102, 204));
        TitleLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Passwords Vault");
        getContentPane().add(TitleLabel);
        TitleLabel.setBounds(0, 30, 600, 43);

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

    private void UsernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsernameFieldActionPerformed

    private void TwoFAFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TwoFAFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TwoFAFieldActionPerformed
    
    private void updateInvalidFields() throws IOException{
        AuthChecker auth = new AuthChecker();
        Configs configs = new Configs();
        if(!UsernameField.getText().equals(configs.getUsername())){
            InvalidUser.setVisible(true);
        }
        if(!String.valueOf(PasswordField.getPassword()).equals(configs.getPassword())){
            InvalidPass.setVisible(true);
        }
        if(!TwoFAField.getText().equals(auth.getTFact())){
            Invalid2FA.setVisible(true);
        }
    }
    
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        try{
            AuthChecker auth = new AuthChecker();
            Invalid2FA.setVisible(false);
            InvalidPass.setVisible(false);
            InvalidUser.setVisible(false);
            this.updateInvalidFields();
            if(auth.compareValues(UsernameField.getText(), String.valueOf(PasswordField.getPassword()), TwoFAField.getText())){
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackTitleImg;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Invalid2FA;
    private javax.swing.JLabel InvalidPass;
    private javax.swing.JLabel InvalidUser;
    private javax.swing.JLabel PassLabel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTextField TwoFAField;
    private javax.swing.JLabel TwoFALabel;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    // End of variables declaration//GEN-END:variables
}