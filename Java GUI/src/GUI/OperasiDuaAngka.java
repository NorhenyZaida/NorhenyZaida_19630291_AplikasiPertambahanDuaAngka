/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class OperasiDuaAngka extends javax.swing.JFrame {
    int hasil = 0;

    private Object integer;

    /**
     * Creates new form OperasiDuaAngka
     */
    public OperasiDuaAngka() {
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

        jPanel1 = new javax.swing.JPanel();
        textAngkaPertama = new javax.swing.JTextField();
        textAngkaKedua = new javax.swing.JTextField();
        textHasil = new javax.swing.JTextField();
        labelOperator = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buttonTambah = new javax.swing.JButton();
        buttonKurang = new javax.swing.JButton();
        buttonKali = new javax.swing.JButton();
        buttonBagi = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operasi Dua Angka");
        setBackground(new java.awt.Color(0, 255, 204));

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operasi Dua Angka", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 102))); // NOI18N

        labelOperator.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelOperator.setText("+");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("=");

        buttonTambah.setBackground(new java.awt.Color(255, 255, 255));
        buttonTambah.setText("Tambah");
        buttonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTambahActionPerformed(evt);
            }
        });

        buttonKurang.setBackground(new java.awt.Color(255, 255, 255));
        buttonKurang.setText("Kurang");
        buttonKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKurangActionPerformed(evt);
            }
        });

        buttonKali.setBackground(new java.awt.Color(255, 255, 255));
        buttonKali.setText("kali");
        buttonKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKaliActionPerformed(evt);
            }
        });

        buttonBagi.setBackground(new java.awt.Color(255, 255, 255));
        buttonBagi.setText("Bagi");
        buttonBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonBagiActionPerformed(evt);
            }
        });

        buttonHapus.setBackground(new java.awt.Color(255, 255, 255));
        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonKeluar.setBackground(new java.awt.Color(255, 255, 255));
        buttonKeluar.setText("keluar");
        buttonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonTambah)
                        .addGap(18, 18, 18)
                        .addComponent(buttonKurang)
                        .addGap(18, 18, 18)
                        .addComponent(buttonKali)
                        .addGap(18, 18, 18)
                        .addComponent(buttonBagi)
                        .addGap(18, 18, 18)
                        .addComponent(buttonHapus)
                        .addGap(18, 18, 18)
                        .addComponent(buttonKeluar)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textAngkaPertama, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(labelOperator)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textAngkaKedua, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textAngkaPertama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelOperator)
                    .addComponent(jLabel2)
                    .addComponent(textAngkaKedua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonTambah)
                    .addComponent(buttonKurang)
                    .addComponent(buttonKali)
                    .addComponent(buttonBagi)
                    .addComponent(buttonHapus)
                    .addComponent(buttonKeluar))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKeluarActionPerformed
         String tanya ="Apakah anda yakin akan keluar Aplikasi?";
         boolean yakin = JOptionPane.showConfirmDialog(rootPane, tanya)== JOptionPane.YES_OPTION;
            if (yakin){
            System.exit(0);
            }
    }//GEN-LAST:event_buttonKeluarActionPerformed

    private void buttonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTambahActionPerformed
       hasil = getAngkaPertama()+getAngkaKedua();
       textHasil.setText(hasil+"");
        labelOperator.setText("+");
    }//GEN-LAST:event_buttonTambahActionPerformed

    private void buttonKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKaliActionPerformed
        hasil = getAngkaPertama()*getAngkaKedua();
       textHasil.setText(hasil+"");
        labelOperator.setText("*");
    }//GEN-LAST:event_buttonKaliActionPerformed

    private void buttonBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonBagiActionPerformed
        hasil = getAngkaPertama()/getAngkaKedua();
       textHasil.setText(hasil+"");
        labelOperator.setText("/");
    }//GEN-LAST:event_buttonBagiActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
      textAngkaPertama.setText("");
      textAngkaKedua.setText("");
      textHasil.setText("");
      labelOperator.setText("");
      textAngkaPertama.requestFocus();
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonKurangActionPerformed
      hasil = getAngkaPertama()-getAngkaKedua();
       textHasil.setText(hasil+"");
        labelOperator.setText("-");
    }//GEN-LAST:event_buttonKurangActionPerformed

    private int getAngkaPertama(){
        return Integer.valueOf(textAngkaPertama.getText());
    }
    
    private int getAngkaKedua(){
        return Integer.valueOf(textAngkaKedua.getText());
    }
                
    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OperasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OperasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OperasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OperasiDuaAngka.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OperasiDuaAngka().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonBagi;
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonKali;
    private javax.swing.JButton buttonKeluar;
    private javax.swing.JButton buttonKurang;
    private javax.swing.JButton buttonTambah;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelOperator;
    private javax.swing.JTextField textAngkaKedua;
    private javax.swing.JTextField textAngkaPertama;
    private javax.swing.JTextField textHasil;
    // End of variables declaration//GEN-END:variables
}
