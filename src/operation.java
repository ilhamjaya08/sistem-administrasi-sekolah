/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author RPL 3_24
 */
public class operation extends javax.swing.JFrame {

    /**
     * Creates new form operation
     */
    public operation() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Jangka01 = new javax.swing.JTextField();
        Jangka02 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jHasil = new javax.swing.JTextField();
        jButtonTambah = new javax.swing.JButton();
        jButtonKali = new javax.swing.JButton();
        jButtonBagi = new javax.swing.JButton();
        jButtonKurang = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Angka 1:");

        jLabel2.setText("Angka 2:");

        Jangka01.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Jangka01KeyReleased(evt);
            }
        });

        Jangka02.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Jangka02KeyReleased(evt);
            }
        });

        jLabel3.setText("Hasil:");

        jHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHasilActionPerformed(evt);
            }
        });
        jHasil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jHasilKeyReleased(evt);
            }
        });

        jButtonTambah.setText("Tambah");
        jButtonTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTambahMouseClicked(evt);
            }
        });

        jButtonKali.setText("Kali");
        jButtonKali.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonKaliMouseClicked(evt);
            }
        });

        jButtonBagi.setText("Bagi");
        jButtonBagi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBagiMouseClicked(evt);
            }
        });

        jButtonKurang.setText("Kurang");
        jButtonKurang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonKurangMouseClicked(evt);
            }
        });

        jButtonClear.setText("Hapus Semua");
        jButtonClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonClearMouseClicked(evt);
            }
        });

        jButtonExit.setText("Keluar");
        jButtonExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonTambah)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonKurang)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBagi)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonKali)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Jangka01, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jangka02, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                                    .addComponent(jHasil))
                                .addGap(176, 176, 176)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonExit)
                            .addComponent(jButtonClear))
                        .addGap(136, 136, 136))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Jangka01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonClear))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Jangka02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButtonExit)))
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambah)
                    .addComponent(jButtonKurang)
                    .addComponent(jButtonBagi)
                    .addComponent(jButtonKali))
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jangka01KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jangka01KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Jangka01KeyReleased

    private void Jangka02KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Jangka02KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_Jangka02KeyReleased

    private void jHasilKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jHasilKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_jHasilKeyReleased

    private void jHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHasilActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_jHasilActionPerformed

    private void jButtonTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTambahMouseClicked
        // TODO add your handling code here:
        int a = Integer.parseInt(Jangka01.getText());
        int b = Integer.parseInt(Jangka02.getText());
        int hsl = a+b;
        jHasil.setText(String.valueOf(hsl));
    }//GEN-LAST:event_jButtonTambahMouseClicked

    private void jButtonKaliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonKaliMouseClicked
        // TODO add your handling code here:
        int a = Integer.parseInt(Jangka01.getText());
        int b = Integer.parseInt(Jangka02.getText());
        int hsl = a*b;
        jHasil.setText(String.valueOf(hsl));
    }//GEN-LAST:event_jButtonKaliMouseClicked

    private void jButtonBagiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBagiMouseClicked
        // TODO add your handling code here:
        int a = Integer.parseInt(Jangka01.getText());
        int b = Integer.parseInt(Jangka02.getText());
        int hsl = a/b;
        jHasil.setText(String.valueOf(hsl));
    }//GEN-LAST:event_jButtonBagiMouseClicked

    private void jButtonKurangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonKurangMouseClicked
        // TODO add your handling code here:
        int a = Integer.parseInt(Jangka01.getText());
        int b = Integer.parseInt(Jangka02.getText());
        int hsl = a-b;
        jHasil.setText(String.valueOf(hsl));
    }//GEN-LAST:event_jButtonKurangMouseClicked

    private void jButtonClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonClearMouseClicked
        // TODO add your handling code here:
        Jangka01.setText("");
        Jangka02.setText("");
        jHasil.setText("");
    }//GEN-LAST:event_jButtonClearMouseClicked

    private void jButtonExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonExitMouseClicked
        // TODO add your handling code here:
        dispose ();
            System.exit (0);
    }//GEN-LAST:event_jButtonExitMouseClicked

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
            java.util.logging.Logger.getLogger(operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(operation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new operation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Jangka01;
    private javax.swing.JTextField Jangka02;
    private javax.swing.JButton jButtonBagi;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonKali;
    private javax.swing.JButton jButtonKurang;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JTextField jHasil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
