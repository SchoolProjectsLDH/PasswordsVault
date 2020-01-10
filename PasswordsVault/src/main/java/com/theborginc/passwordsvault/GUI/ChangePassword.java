package com.theborginc.passwordsvault.GUI;

import com.theborginc.passwordsvault.Auth.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import javax.crypto.Cipher;

/**
 *
 * @author keshavgupta
 */
public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangeUsername
     */
    public ChangePassword() {
        initComponents();
        incorrectPassLabel.setVisible(false);
        dontMatchLabel.setVisible(false);
        requiredLabel.setVisible(false);
        weakLabel.setVisible(false);
    }
    
    private final static Configs CONFIG = new Configs();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        requiredLabel = new javax.swing.JLabel();
        incorrectPassLabel = new javax.swing.JLabel();
        weakLabel = new javax.swing.JLabel();
        dontMatchLabel = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        confirmLabel = new javax.swing.JLabel();
        confirmPassField = new javax.swing.JPasswordField();
        newPassLabel = new javax.swing.JLabel();
        newPassField = new javax.swing.JPasswordField();
        prevPassLabel = new javax.swing.JLabel();
        prevPassField = new javax.swing.JPasswordField();
        TitleLabel = new javax.swing.JLabel();
        BackTitleImg = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(610, 410));
        setResizable(false);
        getContentPane().setLayout(null);

        requiredLabel.setBackground(new java.awt.Color(0, 102, 204));
        requiredLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        requiredLabel.setForeground(new java.awt.Color(255, 255, 255));
        requiredLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        requiredLabel.setText("This is required");
        getContentPane().add(requiredLabel);
        requiredLabel.setBounds(430, 180, 180, 50);

        incorrectPassLabel.setBackground(new java.awt.Color(0, 102, 204));
        incorrectPassLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        incorrectPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        incorrectPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        incorrectPassLabel.setText("Incorrect Pass");
        getContentPane().add(incorrectPassLabel);
        incorrectPassLabel.setBounds(430, 120, 180, 50);

        weakLabel.setBackground(new java.awt.Color(0, 102, 204));
        weakLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        weakLabel.setForeground(new java.awt.Color(255, 255, 255));
        weakLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weakLabel.setText("Weak Password");
        getContentPane().add(weakLabel);
        weakLabel.setBounds(230, 290, 180, 30);

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
        confirmLabel.setText("Confirm Password:");
        getContentPane().add(confirmLabel);
        confirmLabel.setBounds(0, 240, 210, 50);

        confirmPassField.setBackground(new java.awt.Color(0, 0, 0));
        confirmPassField.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        confirmPassField.setForeground(new java.awt.Color(255, 255, 255));
        confirmPassField.setToolTipText("Password");
        confirmPassField.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(confirmPassField);
        confirmPassField.setBounds(210, 240, 220, 50);

        newPassLabel.setBackground(new java.awt.Color(0, 102, 204));
        newPassLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        newPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        newPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        newPassLabel.setText("New Password:");
        getContentPane().add(newPassLabel);
        newPassLabel.setBounds(0, 180, 210, 50);

        newPassField.setBackground(new java.awt.Color(0, 0, 0));
        newPassField.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        newPassField.setForeground(new java.awt.Color(255, 255, 255));
        newPassField.setToolTipText("Password");
        newPassField.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(newPassField);
        newPassField.setBounds(210, 180, 220, 50);

        prevPassLabel.setBackground(new java.awt.Color(0, 102, 204));
        prevPassLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        prevPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        prevPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        prevPassLabel.setText("Previous Password:");
        getContentPane().add(prevPassLabel);
        prevPassLabel.setBounds(0, 120, 210, 50);

        prevPassField.setBackground(new java.awt.Color(0, 0, 0));
        prevPassField.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        prevPassField.setForeground(new java.awt.Color(255, 255, 255));
        prevPassField.setToolTipText("Password");
        prevPassField.setCaretColor(new java.awt.Color(255, 255, 255));
        getContentPane().add(prevPassField);
        prevPassField.setBounds(210, 120, 220, 50);

        TitleLabel.setBackground(new java.awt.Color(0, 102, 204));
        TitleLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Change Password");
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
        Background.setBounds(0, 0, 620, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new PasswordsList().setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed
    
    private boolean updateInvalidFields() throws IOException{
        if(!String.valueOf(prevPassField.getPassword()).equals(CONFIG.getPassword())){
            incorrectPassLabel.setVisible(true);
        }
        if(!String.valueOf(newPassField.getPassword()).equals(String.valueOf(confirmPassField.getPassword()))){
            dontMatchLabel.setVisible(true);
        }
        if(String.valueOf(newPassField.getPassword()).equals("")){
            requiredLabel.setVisible(true);
        }
        return (String.valueOf(prevPassField.getPassword()).equals(CONFIG.getPassword()) && String.valueOf(newPassField.getPassword()).equals(String.valueOf(confirmPassField.getPassword())) && (String.valueOf(newPassField.getPassword()).equals("") == false));
    }
    
    private boolean checkStrong(String passwordSelect){
        return(passwordSelect.matches(".*\\d.*") && passwordSelect.matches("(?s).*[A-Z].*") && passwordSelect.matches(".*\\W.*"));
        //Contains a number, symbol, capital letter, lowercase letter
    }
    
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        try{
            incorrectPassLabel.setVisible(false);
            dontMatchLabel.setVisible(false);
            requiredLabel.setVisible(false);
            weakLabel.setVisible(false);
            
            if(this.updateInvalidFields()){//if all fields are filled
                if(this.checkStrong(String.valueOf(newPassField.getPassword()))){//check if the password is strong
                    CONFIG.setPassword(String.valueOf(newPassField.getPassword()));//set password
                    java.awt.EventQueue.invokeLater(() -> {//back to passwordslist
                        new PasswordsList().setVisible(true);
                    });
                    this.dispose();
                }else{//if not strong
                    weakLabel.setVisible(true);//weak alert
                }
            }
        }catch(IOException e){
            System.out.println("Could not read data from configs");
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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ChangePassword().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackTitleImg;
    private javax.swing.JLabel Background;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JLabel confirmLabel;
    private javax.swing.JPasswordField confirmPassField;
    private javax.swing.JLabel dontMatchLabel;
    private javax.swing.JLabel incorrectPassLabel;
    private javax.swing.JPasswordField newPassField;
    private javax.swing.JLabel newPassLabel;
    private javax.swing.JPasswordField prevPassField;
    private javax.swing.JLabel prevPassLabel;
    private javax.swing.JLabel requiredLabel;
    private javax.swing.JLabel weakLabel;
    // End of variables declaration//GEN-END:variables
}
