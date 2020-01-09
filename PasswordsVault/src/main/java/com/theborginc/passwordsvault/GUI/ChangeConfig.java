/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theborginc.passwordsvault.GUI;

/**
 *
 * @author joyceliu
 */
public class ChangeConfig extends javax.swing.JFrame {

    /**
     * Creates new form ChangeConfig
     */
    public ChangeConfig() {
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

        cycleEncryptor = new javax.swing.JButton();
        Regen2FA = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        BackTitleImg = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 410));
        setMinimumSize(new java.awt.Dimension(610, 410));
        setSize(new java.awt.Dimension(610, 410));
        getContentPane().setLayout(null);

        cycleEncryptor.setBackground(new java.awt.Color(0, 0, 0));
        cycleEncryptor.setForeground(new java.awt.Color(255, 255, 255));
        cycleEncryptor.setText("Cycle Encryptor");
        cycleEncryptor.setToolTipText("");
        cycleEncryptor.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        cycleEncryptor.setBorderPainted(false);
        cycleEncryptor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cycleEncryptor.setLocation(new java.awt.Point(220, 210));
        cycleEncryptor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cycleEncryptorActionPerformed(evt);
            }
        });
        getContentPane().add(cycleEncryptor);
        cycleEncryptor.setBounds(220, 210, 200, 30);

        Regen2FA.setBackground(new java.awt.Color(0, 0, 0));
        Regen2FA.setForeground(new java.awt.Color(255, 255, 255));
        Regen2FA.setText("Regenerate 2FA Key");
        Regen2FA.setToolTipText("");
        Regen2FA.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Regen2FA.setBorderPainted(false);
        Regen2FA.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Regen2FA.setLocation(new java.awt.Point(220, 140));
        Regen2FA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Regen2FAActionPerformed(evt);
            }
        });
        getContentPane().add(Regen2FA);
        Regen2FA.setBounds(220, 140, 200, 30);

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
        Background.setBounds(0, 0, 610, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Regen2FAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Regen2FAActionPerformed
        GoogleAuthMaker twoFAMaker = new GoogleAuthMaker();//generate 2fa code object

        try {
            StringSelection stringSelection = new StringSelection(twoFAMaker.newCode());//copy the new generated code to clipboard
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
            Regen2FA.setText("Paste To Browser");//tell user to past the qr code url to browser
        } catch (IOException e) {
            System.out.println("Write Error");
        }
    }//GEN-LAST:event_Regen2FAActionPerformed

    private void cycleEncryptorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cycleEncryptorActionPerformed
        EncryptDecrypt editor = new EncryptDecrypt();
        try {
            editor.encrypt(CONFIG.getSecretKey(), Cipher.DECRYPT_MODE, "./src/main/resources/passwords.txt", "./src/main/resources/passwords.json");
            CONFIG.newSecretKey();
            editor.encrypt(CONFIG.getSecretKey(), Cipher.ENCRYPT_MODE, "./src/main/resources/passwords.json", "./src/main/resources/passwords.txt");
            editor.clear();
        } catch (Exception e) {
            System.out.println("Failed cycling");
        }
    }//GEN-LAST:event_cycleEncryptorActionPerformed

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
            java.util.logging.Logger.getLogger(ChangeConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangeConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangeConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangeConfig.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeConfig().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackTitleImg;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Regen2FA;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton cycleEncryptor;
    // End of variables declaration//GEN-END:variables
}
