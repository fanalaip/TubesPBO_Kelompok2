/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package GUI;

import Controller.ControllerAdmin;
import Controller.Display;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;

public class guiAdmin extends javax.swing.JFrame {
    
    public guiAdmin() {
        initComponents();
        //dis.DisplayKelasAdmin(jListKelas, kelas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tfNama = new javax.swing.JTextField();
        jLabelNama = new javax.swing.JLabel();
        btnTambah = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        tfNIS2 = new javax.swing.JTextField();
        jLabelTambahKelas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListKelas = new javax.swing.JList<>();
        jLabelAdmin = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabelListKelas = new javax.swing.JLabel();
        jLabelInputKelas = new javax.swing.JLabel();
        tfNama1 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jWaliKelas = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        jLabelInputNIS = new javax.swing.JLabel();
        jLabelInputNama = new javax.swing.JLabel();
        jLabelKetEdit = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfNIS1 = new javax.swing.JTextField();
        jLabelKelas = new javax.swing.JLabel();
        jLabelWali = new javax.swing.JLabel();
        tfEditKelas = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        tfNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNamaActionPerformed(evt);
            }
        });

        jLabelNama.setText("Klik satu kelas yang akan dihapus");

        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        tfNIS2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNIS2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelTambahKelas.setText("TAMBAH SISWA");

        jListKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListKelasMouseClicked(evt);
            }
        });
        jListKelas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListKelasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListKelas);

        jLabelAdmin.setText("ADMIN SISTEM INFORMASI SEKOLAH");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabelListKelas.setText("LIST KELAS");

        jLabelInputKelas.setText("Kelas");

        tfNama1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNama1ActionPerformed(evt);
            }
        });

        btnAdd.setText("Tambah");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jWaliKelas.setText("Wali kelas");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabelInputNIS.setText("NIS");

        jLabelInputNama.setText("Nama");

        jLabelKetEdit.setText("Edit nama kelas disini");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tfNIS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNIS1ActionPerformed(evt);
            }
        });

        tfEditKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfEditKelasActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTambahKelas)
                            .addComponent(jLabelInputKelas)
                            .addComponent(jLabelInputNama)
                            .addComponent(tfNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelInputNIS)
                            .addComponent(tfNIS1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jWaliKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelKelas)
                            .addComponent(jLabelWali)
                            .addComponent(btnAdd))
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnHapus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnUpdate)
                                .addGap(25, 25, 25))
                            .addComponent(jLabelListKelas)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelKetEdit)
                            .addComponent(tfEditKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelAdmin)
                        .addGap(142, 142, 142)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabelAdmin))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTambahKelas)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelInputKelas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelKelas)
                                .addGap(33, 33, 33)
                                .addComponent(jWaliKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelWali)
                                .addGap(30, 30, 30)
                                .addComponent(jLabelInputNama)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelInputNIS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNIS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(btnAdd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelListKelas)
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabelKetEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEditKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdate)
                                    .addComponent(btnHapus))))))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNamaActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void tfNama1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNama1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNama1ActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tfNIS1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNIS1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNIS1ActionPerformed

    private void jListKelasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jListKelasValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jListKelasValueChanged

    private void tfNIS2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNIS2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNIS2ActionPerformed

    private void tfEditKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfEditKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfEditKelasActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jListKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListKelasMouseClicked
        String kelas;
        Display dis = new Display();
        tfEditKelas.setText(jListKelas.getSelectedValue());
        jLabelKelas.setText(jListKelas.getSelectedValue());
        jLabelWali.setText(dis.DisplayWaliKelas(jListKelas.getSelectedValue()));
    }//GEN-LAST:event_jListKelasMouseClicked

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
            java.util.logging.Logger.getLogger(guiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new guiAdmin().setVisible(true);
            }
        });
    }
    public String getTfNama() {
       return tfNama1.getText();
    } 
    
    public String getTfNIS() {
        return tfNIS1.getText();
    }
    public void setKelas(String kelas){
        jLabelKelas.setText(kelas);
    }
    public String getTfEditKelas(){
        return tfEditKelas.getText();
    }
    public JButton getBtnAdd() {
        return btnAdd;
    }

    public JButton getBtnDelete() {
        return btnHapus;
    }
    
    public JButton getBtnBack() {
        return btnBack;
    }
    public JList getListKelas(){
        return jListKelas;
    }
    public JButton getBtnUpdate(){
        return btnUpdate;
    }
    public JLabel getWaliKelas() {
        return jLabelWali ;
    }
    
    public void setListKelas(String[] jListKelas) {
        this.jListKelas.setListData(jListKelas);
    }
    
    public String getSelectedKelas() {
        return jListKelas.getSelectedValue() ;
    }
    
    public JLabel getKelas() {
        return jLabelKelas ;
    }
    
    public void addActionListener(ActionListener e) {
        btnAdd.addActionListener(e);
        btnHapus.addActionListener(e);
        btnUpdate.addActionListener(e);
        btnBack.addActionListener(e);
    }

    public void addMouseAdapter(MouseAdapter e) {
        jListKelas.addMouseListener(e);
    }
    
    public void resetView(){;
        tfNIS1.setText("");
        tfNama1.setText("");
        tfEditKelas.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAdmin;
    private javax.swing.JLabel jLabelInputKelas;
    private javax.swing.JLabel jLabelInputNIS;
    private javax.swing.JLabel jLabelInputNama;
    private javax.swing.JLabel jLabelKelas;
    private javax.swing.JLabel jLabelKetEdit;
    private javax.swing.JLabel jLabelListKelas;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelTambahKelas;
    private javax.swing.JLabel jLabelWali;
    private javax.swing.JList<String> jListKelas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jWaliKelas;
    private javax.swing.JTextField tfEditKelas;
    private javax.swing.JTextField tfNIS1;
    private javax.swing.JTextField tfNIS2;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNama1;
    // End of variables declaration//GEN-END:variables
}
