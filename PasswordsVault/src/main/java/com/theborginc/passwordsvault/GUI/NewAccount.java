package com.theborginc.passwordsvault.GUI;

import com.theborginc.passwordsvault.Auth.DatabaseEditor;

/**
 *
 * @author keshavgupta
 */
public class NewAccount extends javax.swing.JFrame {

    /**
     * Creates new form NewAccount
     */
    public NewAccount() {
        initComponents();
        unfilledParram.setVisible(false);//init visibility of alert
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        unfilledParram = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        usernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        titleLabel = new javax.swing.JLabel();
        titleField = new javax.swing.JTextField();
        accountTypeLabel = new javax.swing.JLabel();
        accountTypeBox = new javax.swing.JComboBox<>();
        Back = new javax.swing.JButton();
        SubmitButton = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        BackTitleImg = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 410));
        setMinimumSize(new java.awt.Dimension(610, 410));
        getContentPane().setLayout(null);

        unfilledParram.setBackground(new java.awt.Color(0, 102, 204));
        unfilledParram.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        unfilledParram.setForeground(new java.awt.Color(255, 255, 255));
        unfilledParram.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unfilledParram.setText("Please Fill In the Parameters");
        getContentPane().add(unfilledParram);
        unfilledParram.setBounds(140, 300, 330, 43);

        passwordLabel.setBackground(new java.awt.Color(0, 102, 204));
        passwordLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        passwordLabel.setForeground(new java.awt.Color(255, 255, 255));
        passwordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        passwordLabel.setText("Password:");
        getContentPane().add(passwordLabel);
        passwordLabel.setBounds(350, 200, 150, 43);

        passwordField.setBackground(new java.awt.Color(0, 0, 0));
        passwordField.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        passwordField.setForeground(new java.awt.Color(255, 255, 255));
        passwordField.setToolTipText("Username");
        passwordField.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordFieldActionPerformed(evt);
            }
        });
        getContentPane().add(passwordField);
        passwordField.setBounds(360, 240, 220, 50);

        usernameLabel.setBackground(new java.awt.Color(0, 102, 204));
        usernameLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(255, 255, 255));
        usernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        usernameLabel.setText("Username:");
        getContentPane().add(usernameLabel);
        usernameLabel.setBounds(10, 200, 150, 43);

        usernameField.setBackground(new java.awt.Color(0, 0, 0));
        usernameField.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        usernameField.setForeground(new java.awt.Color(255, 255, 255));
        usernameField.setToolTipText("Username");
        usernameField.setCaretColor(new java.awt.Color(255, 255, 255));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameField);
        usernameField.setBounds(20, 240, 220, 50);

        titleLabel.setBackground(new java.awt.Color(0, 102, 204));
        titleLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Title:");
        getContentPane().add(titleLabel);
        titleLabel.setBounds(320, 100, 150, 43);

        titleField.setBackground(new java.awt.Color(0, 0, 0));
        titleField.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        titleField.setForeground(new java.awt.Color(255, 255, 255));
        titleField.setToolTipText("Username");
        titleField.setCaretColor(new java.awt.Color(255, 255, 255));
        titleField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleFieldActionPerformed(evt);
            }
        });
        getContentPane().add(titleField);
        titleField.setBounds(360, 140, 220, 50);

        accountTypeLabel.setBackground(new java.awt.Color(0, 102, 204));
        accountTypeLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        accountTypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        accountTypeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        accountTypeLabel.setText("AccountType:");
        getContentPane().add(accountTypeLabel);
        accountTypeLabel.setBounds(20, 100, 150, 43);

        accountTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Email", "WiFi", "API Key", "Discord", "Phone", "General" }));
        accountTypeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accountTypeBoxActionPerformed(evt);
            }
        });
        getContentPane().add(accountTypeBox);
        accountTypeBox.setBounds(20, 140, 220, 27);

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

        SubmitButton.setBackground(new java.awt.Color(0, 0, 0));
        SubmitButton.setForeground(new java.awt.Color(255, 255, 255));
        SubmitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SubmitButton.png"))); // NOI18N
        SubmitButton.setText("Add Account");
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
        SubmitButton.setBounds(447, 320, 140, 50);

        TitleLabel.setBackground(new java.awt.Color(0, 102, 204));
        TitleLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("New Account");
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

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void passwordFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordFieldActionPerformed

    private void titleFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleFieldActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        java.awt.EventQueue.invokeLater(() -> {//passwords list window
            new PasswordsList().setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private boolean checkFilled(){
        boolean filled;//stores whether the values are filled or not
        switch(accountTypeBox.getItemAt(accountTypeBox.getSelectedIndex())){//get the account type
            case "API Key"://api key does not check username field
                filled = (!titleField.getText().equals("") && !passwordField.getText().equals(""));
                break;
            case "Phone"://phone does not check username field
                filled = (!titleField.getText().equals("") && !passwordField.getText().equals(""));
                break;
            default://all other values check all fields
                filled = (!titleField.getText().equals("") && !usernameField.getText().equals("") && !passwordField.getText().equals(""));
                break;
        }
        return filled;
    }
    
    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        DatabaseEditor editor = new DatabaseEditor();
        unfilledParram.setVisible(false);
        if(this.checkFilled()){//if all are properly filled
            try {
                editor.JsonParse(accountTypeBox.getItemAt(accountTypeBox.getSelectedIndex()), titleField.getText(), usernameField.getText(), passwordField.getText());//add parameters to json file
            } catch (Exception e) {
                System.out.println("Encryption problem");
            }
            
            java.awt.EventQueue.invokeLater(() -> {//go to passwords list
                new PasswordsList().setVisible(true);
            });
            this.dispose();
        }else{
            unfilledParram.setVisible(true);//if incorrectly filled alert
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void accountTypeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accountTypeBoxActionPerformed
        switch(accountTypeBox.getItemAt(accountTypeBox.getSelectedIndex())){//when account type changes update field visibility
            case "API Key":
                usernameField.setVisible(false);
                usernameField.setText("");
                break;
            case "Phone":
                usernameField.setVisible(false);
                usernameField.setText("");
                break;
            default:
                usernameField.setVisible(true);
                break;
        }
    }//GEN-LAST:event_accountTypeBoxActionPerformed

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
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewAccount().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackTitleImg;
    private javax.swing.JLabel Background;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JComboBox<String> accountTypeBox;
    private javax.swing.JLabel accountTypeLabel;
    private javax.swing.JTextField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField titleField;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel unfilledParram;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
