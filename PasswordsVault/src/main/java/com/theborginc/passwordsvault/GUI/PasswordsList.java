/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.theborginc.passwordsvault.GUI;

import com.theborginc.passwordsvault.Auth.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.FileReader;
import org.json.simple.*;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author keshavgupta
 */
public class PasswordsList extends javax.swing.JFrame {
    int index = 0;
    private final Configs config = new Configs();
    /**
     * Creates new form PasswordsList
     */
    public PasswordsList() {
        initComponents();
        try{
            config.resetStrike();
        }catch(Exception e){
            e.printStackTrace();
        }
        this.updateTable();
    }
    
    private void updateTable() {//update table using json
        JSONParser jsonParser = new JSONParser();
        JSONArray passwords;
        
        for(int i = 0; i < 100;i++){
            directoryTable.setValueAt("", i, 0);//get scores in score field set to row and collumn
            directoryTable.setValueAt("", i, 1);
            directoryTable.setValueAt("", i, 2);
            directoryTable.setValueAt("", i, 3);
        }
        try (FileReader reader = new FileReader("./src/main/resources/passwords.json")){
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            passwords = (JSONArray) obj;
            passwords.forEach( emp -> parseObject( (JSONObject) emp ) );
            index = 0;
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    
    private void parseObject(JSONObject passwords){
        directoryTable.setValueAt(passwords.get("account"), index, 0);//get scores in score field set to row and collumn
        directoryTable.setValueAt(passwords.get("title"), index, 1);
        directoryTable.setValueAt(passwords.get("username"), index, 2);
        directoryTable.setValueAt(passwords.get("password"), index, 3);
        index++;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        directoryPane = new javax.swing.JScrollPane();
        directoryTable = new javax.swing.JTable();
        AddAccount = new javax.swing.JButton();
        DeleteAccount = new javax.swing.JButton();
        genPass = new javax.swing.JButton();
        logOut = new javax.swing.JButton();
        copyAccount = new javax.swing.JButton();
        changeMasterPass = new javax.swing.JButton();
        changeMasterUser = new javax.swing.JButton();
        TitleLabel = new javax.swing.JLabel();
        BackTitleImg = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(711, 452));
        setMinimumSize(new java.awt.Dimension(711, 452));
        setPreferredSize(new java.awt.Dimension(711, 452));
        setResizable(false);
        getContentPane().setLayout(null);

        directoryPane.setFocusTraversalKeysEnabled(false);
        directoryPane.setOpaque(false);

        directoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Account", "Title", "Username", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        directoryTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        directoryTable.setRequestFocusEnabled(false);
        directoryPane.setViewportView(directoryTable);
        if (directoryTable.getColumnModel().getColumnCount() > 0) {
            directoryTable.getColumnModel().getColumn(0).setHeaderValue("Account");
            directoryTable.getColumnModel().getColumn(1).setHeaderValue("Type");
            directoryTable.getColumnModel().getColumn(2).setHeaderValue("Username");
            directoryTable.getColumnModel().getColumn(3).setHeaderValue("Password");
        }

        getContentPane().add(directoryPane);
        directoryPane.setBounds(10, 90, 540, 330);
        directoryPane.getAccessibleContext().setAccessibleName("");
        directoryPane.getAccessibleContext().setAccessibleDescription("");

        AddAccount.setText("Add Account");
        AddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAccountActionPerformed(evt);
            }
        });
        getContentPane().add(AddAccount);
        AddAccount.setBounds(550, 100, 150, 29);

        DeleteAccount.setText("Delete Account");
        DeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteAccountActionPerformed(evt);
            }
        });
        getContentPane().add(DeleteAccount);
        DeleteAccount.setBounds(550, 130, 150, 29);

        genPass.setText("Generate Password");
        genPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genPassActionPerformed(evt);
            }
        });
        getContentPane().add(genPass);
        genPass.setBounds(550, 210, 150, 29);

        logOut.setText("Logout");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        getContentPane().add(logOut);
        logOut.setBounds(550, 390, 150, 29);

        copyAccount.setText("Copy Selected Pass");
        copyAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyAccountActionPerformed(evt);
            }
        });
        getContentPane().add(copyAccount);
        copyAccount.setBounds(550, 180, 150, 29);

        changeMasterPass.setText("Change Master Pass");
        changeMasterPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeMasterPassActionPerformed(evt);
            }
        });
        getContentPane().add(changeMasterPass);
        changeMasterPass.setBounds(550, 290, 150, 29);

        changeMasterUser.setText("Change Master User");
        changeMasterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeMasterUserActionPerformed(evt);
            }
        });
        getContentPane().add(changeMasterUser);
        changeMasterUser.setBounds(550, 260, 150, 29);

        TitleLabel.setBackground(new java.awt.Color(0, 102, 204));
        TitleLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Passwords");
        getContentPane().add(TitleLabel);
        TitleLabel.setBounds(0, 30, 710, 43);

        BackTitleImg.setBackground(new java.awt.Color(0, 102, 204));
        BackTitleImg.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        BackTitleImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackTitleImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Title.png"))); // NOI18N
        getContentPane().add(BackTitleImg);
        BackTitleImg.setBounds(0, 0, 710, 100);

        Background.setBackground(new java.awt.Color(0, 0, 0));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securitybg.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 710, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAccountActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new NewAccount().setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_AddAccountActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new Login().setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_logOutActionPerformed

    private void changeMasterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeMasterUserActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new ChangeUsername().setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_changeMasterUserActionPerformed

    private void changeMasterPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeMasterPassActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new ChangePassword().setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_changeMasterPassActionPerformed

    private void genPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genPassActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new GenPass().setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_genPassActionPerformed

    private void copyAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyAccountActionPerformed
        try{
            String password = (String) directoryTable.getValueAt(directoryTable.getSelectedRow(), 3);
            StringSelection stringSelection = new StringSelection(password);
            Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
            clipboard.setContents(stringSelection, null);
        }catch(Exception e){
            System.out.println("No Account Detected");
        }
    }//GEN-LAST:event_copyAccountActionPerformed

    private void DeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteAccountActionPerformed
        DatabaseEditor editor = new DatabaseEditor();
        try{
            editor.removeAccount(directoryTable.getSelectedRow());
        }catch(Exception e){
            System.out.println("Deletion Failed due to invalid selection.");
        }
        this.updateTable();
    }//GEN-LAST:event_DeleteAccountActionPerformed

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
            java.util.logging.Logger.getLogger(PasswordsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PasswordsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PasswordsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PasswordsList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new PasswordsList().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddAccount;
    private javax.swing.JLabel BackTitleImg;
    private javax.swing.JLabel Background;
    private javax.swing.JButton DeleteAccount;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JButton changeMasterPass;
    private javax.swing.JButton changeMasterUser;
    private javax.swing.JButton copyAccount;
    private javax.swing.JScrollPane directoryPane;
    private javax.swing.JTable directoryTable;
    private javax.swing.JButton genPass;
    private javax.swing.JButton logOut;
    // End of variables declaration//GEN-END:variables
}
