/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package key_info;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.FlavorEvent;
import java.awt.datatransfer.FlavorListener;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author Khouiled
 */
public class key_info_frame extends javax.swing.JFrame {

    /**
     * Creates new form key_info_frame
     */
    public key_info_frame() {
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

        key_codeL = new javax.swing.JLabel();
        key_codeV = new javax.swing.JLabel();
        ex_key_codeL = new javax.swing.JLabel();
        ex_key_codeV = new javax.swing.JLabel();
        key_charV = new javax.swing.JLabel();
        key_charL = new javax.swing.JLabel();
        key_locationV = new javax.swing.JLabel();
        key_locationL = new javax.swing.JLabel();
        key_idV = new javax.swing.JLabel();
        key_idL = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        copy_txt_code = new javax.swing.JButton();
        always_copy = new javax.swing.JCheckBox();
        key_textL = new javax.swing.JLabel();
        key_textV = new javax.swing.JLabel();
        more_info = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Key Info");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        key_codeL.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        key_codeL.setText("Key Code :");

        key_codeV.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        ex_key_codeL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ex_key_codeL.setText("Extended Key Code :");

        ex_key_codeV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        key_charV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        key_charL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        key_charL.setText("Key Char :");

        key_locationV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        key_locationL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        key_locationL.setText("Key Location :");

        key_idV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        key_idL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        key_idL.setText("ID :");

        exit.setText("Exit");
        exit.setFocusPainted(false);
        exit.setFocusable(false);
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        copy_txt_code.setText("Copy Key Code");
        copy_txt_code.setFocusable(false);
        copy_txt_code.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copy_txt_codeActionPerformed(evt);
            }
        });

        always_copy.setText("Always Copy");
        always_copy.setFocusable(false);

        key_textL.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        key_textL.setText("Key Text :");

        key_textV.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        more_info.setText("More");
        more_info.setFocusable(false);
        more_info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                more_infoActionPerformed(evt);
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
                        .addComponent(key_codeL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key_codeV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ex_key_codeL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ex_key_codeV, javax.swing.GroupLayout.DEFAULT_SIZE, 257, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(key_charL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key_charV, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(key_locationL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key_locationV, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(key_idL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key_idV, javax.swing.GroupLayout.DEFAULT_SIZE, 354, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(copy_txt_code)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(always_copy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(more_info)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(exit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(key_textL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(key_textV, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key_codeL)
                    .addComponent(key_codeV, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ex_key_codeL)
                    .addComponent(ex_key_codeV, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key_textL)
                    .addComponent(key_textV, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key_charL)
                    .addComponent(key_charV, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key_locationL)
                    .addComponent(key_locationV, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(key_idL)
                    .addComponent(key_idV, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exit)
                    .addComponent(copy_txt_code)
                    .addComponent(always_copy)
                    .addComponent(more_info))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
KeyEvent e;
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
   key_codeV.setText(String.valueOf(evt.getKeyCode()));
   ex_key_codeV.setText(String.valueOf(evt.getExtendedKeyCode()));   
   key_charV.setText(String.valueOf(evt.getKeyChar()));
   key_idV.setText(String.valueOf(evt.getID()));
   key_locationV.setText(String.valueOf(evt.getKeyLocation()));
   key_textV.setText(String.valueOf(KeyEvent.getKeyText(evt.getKeyCode())));
       
         e = evt;
       
        if(always_copy.isSelected()){
        JTextArea ta  = new JTextArea();
        ta.setText(key_codeV.getText());
          ta.selectAll();
        ta.copy();
  
   }
       
    }//GEN-LAST:event_formKeyPressed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void copy_txt_codeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copy_txt_codeActionPerformed
    JTextArea ta  = new JTextArea();
        ta.setText(key_codeV.getText());
          ta.selectAll();
        ta.copy();
      
    }//GEN-LAST:event_copy_txt_codeActionPerformed

    private void more_infoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_more_infoActionPerformed
       JOptionPane.showMessageDialog(this, e,"More Information",JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_more_infoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(key_info_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new key_info_frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox always_copy;
    private javax.swing.JButton copy_txt_code;
    private javax.swing.JLabel ex_key_codeL;
    private javax.swing.JLabel ex_key_codeV;
    private javax.swing.JButton exit;
    private javax.swing.JLabel key_charL;
    private javax.swing.JLabel key_charV;
    private javax.swing.JLabel key_codeL;
    private javax.swing.JLabel key_codeV;
    private javax.swing.JLabel key_idL;
    private javax.swing.JLabel key_idV;
    private javax.swing.JLabel key_locationL;
    private javax.swing.JLabel key_locationV;
    private javax.swing.JLabel key_textL;
    private javax.swing.JLabel key_textV;
    private javax.swing.JButton more_info;
    // End of variables declaration//GEN-END:variables
}
