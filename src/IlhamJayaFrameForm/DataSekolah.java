/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package IlhamJayaFrameForm;


import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


/**
 *
 * @author RPL 3_24
 */
public class DataSekolah extends javax.swing.JFrame {

    //private object JoptionPane();
    public DataSekolah() {
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
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSCHOOLField = new javax.swing.JTextField();
        jSAVEButton = new javax.swing.JButton();
        jDELETEButton = new javax.swing.JButton();
        jEDITButton = new javax.swing.JButton();
        jCLEARButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jNAMEField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jADDRESSField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jNISNField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelData = new javax.swing.JTable();
        jEXITButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistem Administrasi Data Sekolah - Muh Ilham Jaya");

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Mongolian Baiti", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Sistem Administrasi Sekolah");

        jLabel6.setText("Sekolah Asal :");

        jSAVEButton.setText("SIMPAN");
        jSAVEButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSAVEButtonMouseClicked(evt);
            }
        });

        jDELETEButton.setText("HAPUS");
        jDELETEButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDELETEButtonMouseClicked(evt);
            }
        });

        jEDITButton.setText("EDIT");
        jEDITButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEDITButtonMouseClicked(evt);
            }
        });
        jEDITButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jEDITButtonActionPerformed(evt);
            }
        });

        jCLEARButton.setText("BERSIHKAN KOLOM");
        jCLEARButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCLEARButtonMouseClicked(evt);
            }
        });

        jLabel1.setText("Ini adalah Aplikasi Sistem Administrasi Sekolah Berbasis Desktop, Dibuat menggunakan Java dan Netbeans Program ini dibuat untuk Memanajemen data siswa.");

        jLabel3.setText("Nama :");

        jLabel4.setText("Alamat :");

        jADDRESSField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jADDRESSFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("NISN :");

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei Light", 3, 8)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 51));
        jLabel7.setText("@Muhammad Ilham Jaya 2024");

        tabelData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NISN", "Nama", "Alamat", "Asal Sekolah"
            }
        ));
        jScrollPane1.setViewportView(tabelData);

        jEXITButton.setText("Keluar");
        jEXITButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jEXITButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jEXITButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jSCHOOLField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGap(39, 39, 39)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jADDRESSField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jNAMEField, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jNISNField, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSAVEButton, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jEDITButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDELETEButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCLEARButton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 126, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(417, 417, 417)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jNISNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jNAMEField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jADDRESSField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jSCHOOLField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCLEARButton)
                    .addComponent(jDELETEButton)
                    .addComponent(jEDITButton)
                    .addComponent(jSAVEButton))
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jEXITButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(134, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSAVEButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSAVEButtonMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dataModel = (DefaultTableModel) tabelData.getModel();
            var list = new ArrayList<>();
            tabelData.setAutoCreateColumnsFromModel(true);
            list.add(jNISNField.getText());
            list.add(jNAMEField.getText());
            list.add(jADDRESSField.getText());
            list.add(jSCHOOLField.getText());
            dataModel.addRow(list.toArray());
    }//GEN-LAST:event_jSAVEButtonMouseClicked

    private void jEDITButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jEDITButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jEDITButtonActionPerformed

    private void jCLEARButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCLEARButtonMouseClicked
        // TODO add your handling code here:
        jNISNField.setText("");
        jNAMEField.setText("");
        jADDRESSField.setText("");
        jSCHOOLField.setText("");
    }//GEN-LAST:event_jCLEARButtonMouseClicked

    private void jADDRESSFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jADDRESSFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jADDRESSFieldActionPerformed
    /*public void cleanTable()
    {
        DefaultTableModel tabelModel = (DefaultTableModel) tabelData.getModel();
    int baris = tabelModel.getRowCount(); for (int a=0;a<baris;a++)
    {
    tabelModel.removeRow(0);
    }*/
    

    private void jDELETEButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDELETEButtonMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dataModel = (DefaultTableModel) tabelData.getModel();
        try{
            int Selectedrowindex = tabelData.getSelectedRow();
            int SelectedRowIndex = 0;
            dataModel.removeRow(tabelData.getRowCount()-1);
        }catch (Exception ex)
        {
            JoptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_jDELETEButtonMouseClicked

    private void jEDITButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEDITButtonMouseClicked
        DefaultTableModel Model = (DefaultTableModel) tabelData.getModel();
        if (tabelData.getSelectedRowCount () == 1){
         String NISN = jNISNField.getText();
         String NAMA = jNAMEField.getText();
         String ALAMAT = jADDRESSField.getText();
         String SEKOLAH = jSCHOOLField.getText();
         Model.setValueAt (NISN, tabelData.getSelectedRow(), 0);
         Model.setValueAt (NAMA, tabelData.getSelectedRow(), 1);
         Model.setValueAt (ALAMAT, tabelData.getSelectedRow(), 2);
         Model.setValueAt (SEKOLAH, tabelData.getSelectedRow(), 3);
        }
    }//GEN-LAST:event_jEDITButtonMouseClicked

    private void jEXITButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jEXITButtonMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jEXITButtonMouseClicked

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
            java.util.logging.Logger.getLogger(DataSekolah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataSekolah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataSekolah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataSekolah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataSekolah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jADDRESSField;
    private javax.swing.JButton jCLEARButton;
    private javax.swing.JButton jDELETEButton;
    private javax.swing.JButton jEDITButton;
    private javax.swing.JButton jEXITButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jNAMEField;
    private javax.swing.JTextField jNISNField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jSAVEButton;
    private javax.swing.JTextField jSCHOOLField;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelData;
    // End of variables declaration//GEN-END:variables
}
    class JoptionPane {
        public static void showMessageDialog(Object object, Exception ex){
             throw new UnsupportedOperationException("Not Supported Yet");
        }
        public JoptionPane(){
            
        }
    }