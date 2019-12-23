package com.theborginc.passwordsvault.GUI;

import com.theborginc.passwordsvault.Auth.*;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;

/**
 *
 * @author keshavgupta
 */
public class GenPass extends javax.swing.JFrame {

    /**
     * Creates new form GenPass
     */
    public GenPass() {
        initComponents();
        copiedFeedback.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        generatedPass = new javax.swing.JLabel();
        genPassLabel = new javax.swing.JLabel();
        copiedFeedback = new javax.swing.JLabel();
        lengthLabel = new javax.swing.JLabel();
        Back = new javax.swing.JButton();
        copyButton = new javax.swing.JButton();
        generatePassButton = new javax.swing.JButton();
        numbersSelect = new javax.swing.JToggleButton();
        capitalsSelect = new javax.swing.JToggleButton();
        lowercaseSelect = new javax.swing.JToggleButton();
        basicSymbolSelect = new javax.swing.JToggleButton();
        advSymbolSelect = new javax.swing.JToggleButton();
        lengthSpinner = new javax.swing.JSpinner();
        separator = new javax.swing.JSeparator();
        TitleLabel = new javax.swing.JLabel();
        BackTitleImg = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(610, 410));
        setMinimumSize(new java.awt.Dimension(610, 410));
        setSize(new java.awt.Dimension(610, 410));
        getContentPane().setLayout(null);

        generatedPass.setBackground(new java.awt.Color(0, 102, 204));
        generatedPass.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        generatedPass.setForeground(new java.awt.Color(255, 255, 255));
        generatedPass.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        generatedPass.setText("Generated Password Here");
        generatedPass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(generatedPass);
        generatedPass.setBounds(120, 290, 480, 43);

        genPassLabel.setBackground(new java.awt.Color(0, 102, 204));
        genPassLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        genPassLabel.setForeground(new java.awt.Color(255, 255, 255));
        genPassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        genPassLabel.setText("Password:");
        genPassLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(genPassLabel);
        genPassLabel.setBounds(10, 290, 110, 43);

        copiedFeedback.setBackground(new java.awt.Color(0, 102, 204));
        copiedFeedback.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        copiedFeedback.setForeground(new java.awt.Color(255, 255, 255));
        copiedFeedback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        copiedFeedback.setText("Copied!");
        getContentPane().add(copiedFeedback);
        copiedFeedback.setBounds(400, 230, 80, 30);

        lengthLabel.setBackground(new java.awt.Color(0, 102, 204));
        lengthLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        lengthLabel.setForeground(new java.awt.Color(255, 255, 255));
        lengthLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lengthLabel.setText("Length");
        getContentPane().add(lengthLabel);
        lengthLabel.setBounds(450, 140, 80, 30);

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

        copyButton.setText("Copy");
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });
        getContentPane().add(copyButton);
        copyButton.setBounds(240, 220, 140, 50);

        generatePassButton.setText("Generate");
        generatePassButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePassButtonActionPerformed(evt);
            }
        });
        getContentPane().add(generatePassButton);
        generatePassButton.setBounds(20, 220, 140, 50);

        numbersSelect.setText("1234");
        numbersSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersSelectActionPerformed(evt);
            }
        });
        getContentPane().add(numbersSelect);
        numbersSelect.setBounds(20, 100, 140, 29);

        capitalsSelect.setText("ABC");
        getContentPane().add(capitalsSelect);
        capitalsSelect.setBounds(240, 100, 140, 29);

        lowercaseSelect.setText("abc");
        getContentPane().add(lowercaseSelect);
        lowercaseSelect.setBounds(450, 100, 140, 29);

        basicSymbolSelect.setText("!@#$%&*=,./");
        getContentPane().add(basicSymbolSelect);
        basicSymbolSelect.setBounds(240, 160, 140, 29);

        advSymbolSelect.setText("()_+-[]|?<>");
        getContentPane().add(advSymbolSelect);
        advSymbolSelect.setBounds(20, 160, 140, 29);

        lengthSpinner.setModel(new javax.swing.SpinnerNumberModel(10, 10, 32, 1));
        getContentPane().add(lengthSpinner);
        lengthSpinner.setBounds(450, 160, 140, 26);
        getContentPane().add(separator);
        separator.setBounds(0, 190, 610, 12);

        TitleLabel.setBackground(new java.awt.Color(0, 102, 204));
        TitleLabel.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TitleLabel.setText("Generate Password");
        getContentPane().add(TitleLabel);
        TitleLabel.setBounds(0, 30, 610, 43);

        BackTitleImg.setBackground(new java.awt.Color(0, 102, 204));
        BackTitleImg.setFont(new java.awt.Font("Silom", 1, 18)); // NOI18N
        BackTitleImg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackTitleImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Title.png"))); // NOI18N
        getContentPane().add(BackTitleImg);
        BackTitleImg.setBounds(0, 0, 610, 100);

        Background.setBackground(new java.awt.Color(0, 0, 0));
        Background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/securitybg.jpg"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(0, 0, 610, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void numbersSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numbersSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numbersSelectActionPerformed

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        java.awt.EventQueue.invokeLater(() -> {
            new PasswordsList().setVisible(true);
        });
        this.dispose();
    }//GEN-LAST:event_BackActionPerformed

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        StringSelection stringSelection = new StringSelection(generatedPass.getText());
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        copiedFeedback.setVisible(true);
    }//GEN-LAST:event_copyButtonActionPerformed

    private void generatePassButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePassButtonActionPerformed
        try{
            PasswordGenerator passwordGenerator = new PasswordGenerator.PasswordGeneratorBuilder()
            .useNumbers(numbersSelect.isSelected())
            .useLowerCase(lowercaseSelect.isSelected())
            .useUpperCase(capitalsSelect.isSelected())
            .useBasicSymbols(basicSymbolSelect.isSelected())
            .useAdvSymbols(advSymbolSelect.isSelected())
            .build();
            generatedPass.setText(passwordGenerator.generate((Integer)lengthSpinner.getValue()));
        }catch(Exception e){
            generatedPass.setText("Invalid Selection");
        }
    }//GEN-LAST:event_generatePassButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GenPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GenPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GenPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GenPass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GenPass().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JLabel BackTitleImg;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JToggleButton advSymbolSelect;
    private javax.swing.JToggleButton basicSymbolSelect;
    private javax.swing.JToggleButton capitalsSelect;
    private javax.swing.JLabel copiedFeedback;
    private javax.swing.JButton copyButton;
    private javax.swing.JLabel genPassLabel;
    private javax.swing.JButton generatePassButton;
    private javax.swing.JLabel generatedPass;
    private javax.swing.JLabel lengthLabel;
    private javax.swing.JSpinner lengthSpinner;
    private javax.swing.JToggleButton lowercaseSelect;
    private javax.swing.JToggleButton numbersSelect;
    private javax.swing.JSeparator separator;
    // End of variables declaration//GEN-END:variables
}
