/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package GUI;

import Controller.ControllerAdmin;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.JButton;
import javax.swing.event.ListSelectionEvent;
import java.awt.List;

public class guiAdmin extends javax.swing.JFrame {

    /**
     * Creates new form guiAdmin
     */
    public guiAdmin() {
        initComponents();
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
        jLabelKetHapus = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tfNIS1 = new javax.swing.JTextField();
        jLabelKelas = new javax.swing.JLabel();
        jLabelWali = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabelTambahKelas.setText("TAMBAH SISWA");

        jListKelas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
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

        jLabelKetHapus.setText("Klik kelas yang ingin dihapus");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        tfNIS1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNIS1ActionPerformed(evt);
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
                        .addComponent(btnBack)
                        .addGap(212, 212, 212)
                        .addComponent(jLabelAdmin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTambahKelas)
                            .addComponent(jLabelInputKelas)
                            .addComponent(jLabelInputNama)
                            .addComponent(tfNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelInputNIS)
                            .addComponent(btnAdd)
                            .addComponent(tfNIS1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jWaliKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelKelas)
                            .addComponent(jLabelWali))
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelListKelas)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelKetHapus)
                            .addComponent(btnHapus))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBack)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabelAdmin)))
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNIS1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(btnAdd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelListKelas)
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabelKetHapus)
                                .addGap(7, 7, 7)
                                .addComponent(btnHapus)))))
                .addContainerGap(18, Short.MAX_VALUE))
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
        jLabelWali.setText(list.get(jListKelas.getSelectedIndex()).getItem(0));
        jLabelKelas.setText(list.get(jListKelas.getSelectedIndex()).getItem(1));
    }//GEN-LAST:event_jListKelasValueChanged

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
            public void run() {
                new guiAdmin().setVisible(true);
            }
        });
    }
    public String getTfKelas(){
        return tfKelas.getText();
    }
    
    public String getTfNama() {
       return tfNama1.getText();
    } 
    
    public String getTfNIS() {
        return tfNIS1.getText();
    }
    
    public JButton getBtnAdd() {
        return btnTambah;
    }

    public JButton getBtnDelete() {
        return btnHapus;
    }
    
    public JButton getBtnBack() {
        return btnBack;
    }
    
    public void setListKelas(String[] jListKelas) {
        this.jListKelas.setListData(jListKelas);
    }
    
    public String getSelectedKelas() {
        return jListKelas.getSelectedValue() ;
    }
  
    public void addActionListener(ActionListener e) {
        btnAdd.addActionListener(e);
        btnHapus.addActionListener(e);
        btnBack.addActionListener(e);
    }

    public void addMouseAdapter(MouseAdapter e) {
        jListKelas.addMouseListener(e);
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAdmin;
    private javax.swing.JLabel jLabelInputKelas;
    private javax.swing.JLabel jLabelInputNIS;
    private javax.swing.JLabel jLabelInputNama;
    private javax.swing.JLabel jLabelKelas;
    private javax.swing.JLabel jLabelKetHapus;
    private javax.swing.JLabel jLabelListKelas;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelTambahKelas;
    private javax.swing.JLabel jLabelWali;
    private javax.swing.JList<String> jListKelas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jWaliKelas;
    private javax.swing.JTextField tfNIS1;
    private javax.swing.JTextField tfNama;
    private javax.swing.JTextField tfNama1;
    // End of variables declaration//GEN-END:variables

    public void addActionListener(ControllerAdmin e) {
        btnBack.addActionListener(e);
        btnAdd.addActionListener(e);
        btnHapus.addActionListener(e);
    }

    public void addMouseAdapter(ControllerAdmin aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
