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
import javax.swing.JButton;

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
        jLabelHapusKelas = new javax.swing.JLabel();
        jLabelInputKelas = new javax.swing.JLabel();
        tfNama1 = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabelMapel = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        jLabelInputNIS = new javax.swing.JLabel();
        tfKelas = new javax.swing.JTextField();
        jLabelInputNama = new javax.swing.JLabel();
        tfNIS = new javax.swing.JTextField();
        cbPKn = new javax.swing.JCheckBox();
        cbMTK = new javax.swing.JCheckBox();
        cbIPS = new javax.swing.JCheckBox();
        cbIPA = new javax.swing.JCheckBox();
        jLabelKetHapus = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

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

        jLabelTambahKelas.setText("TAMBAH KELAS");

        jListKelas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListKelas);

        jLabelAdmin.setText("ADMIN SISTEM INFORMASI SEKOLAH");

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabelHapusKelas.setText("HAPUS KELAS");

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

        jLabelMapel.setText("Mata pelajaran");

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        jLabelInputNIS.setText("NIS");

        tfKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfKelasActionPerformed(evt);
            }
        });

        jLabelInputNama.setText("Nama");

        tfNIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNISActionPerformed(evt);
            }
        });

        cbPKn.setText("PKn");
        cbPKn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPKnActionPerformed(evt);
            }
        });

        cbMTK.setText("Matematika");
        cbMTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMTKActionPerformed(evt);
            }
        });

        cbIPS.setText("IPS");
        cbIPS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIPSActionPerformed(evt);
            }
        });

        cbIPA.setText("IPA");
        cbIPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbIPAActionPerformed(evt);
            }
        });

        jLabelKetHapus.setText("Klik kelas yang ingin dihapus");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

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
                            .addComponent(tfKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelInputNama)
                            .addComponent(tfNama1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelInputNIS)
                            .addComponent(tfNIS, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMapel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbPKn)
                                .addGap(28, 28, 28)
                                .addComponent(cbIPA))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbIPS)
                                .addGap(30, 30, 30)
                                .addComponent(cbMTK))
                            .addComponent(btnAdd))
                        .addGap(32, 32, 32)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelHapusKelas)
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
                                .addGap(7, 7, 7)
                                .addComponent(tfKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelInputNama)
                                .addGap(7, 7, 7)
                                .addComponent(tfNama1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelInputNIS)
                                .addGap(7, 7, 7)
                                .addComponent(tfNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelMapel)
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbPKn)
                                    .addComponent(cbIPA))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbIPS)
                                    .addComponent(cbMTK))
                                .addGap(18, 18, 18)
                                .addComponent(btnAdd))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelHapusKelas)
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(13, 13, 13)
                                .addComponent(jLabelKetHapus)
                                .addGap(7, 7, 7)
                                .addComponent(btnHapus))))))
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

    private void tfKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfKelasActionPerformed

    private void tfNISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNISActionPerformed

    private void cbPKnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPKnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPKnActionPerformed

    private void cbMTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMTKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMTKActionPerformed

    private void cbIPSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIPSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIPSActionPerformed

    private void cbIPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbIPAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbIPAActionPerformed

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
        return tfNIS.getText();
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
    
    public ArrayList<String> getMapel() {
        ArrayList<String> s = new ArrayList();
        if (cbMTK.isSelected()) {
            s.add(cbMTK.getText());
        }
        if (cbIPA.isSelected()) {
            s.add(cbIPA.getText());
        }
        if (cbIPS.isSelected()) {
            s.add(cbIPS.getText());
        }
        if (cbPKn.isSelected()) {
            s.add(cbPKn.getText());
        }
        if (s.isEmpty()){
            return null;
        }
        else {
            return s;
        }
    }
    
       
    public void addActionListener(ActionListener e) {
        btnAdd.addActionListener(e);
        btnHapus.addActionListener(e);
        btnBack.addActionListener(e);
    }

    public void addMouseAdapter(MouseAdapter e) {
        listJadwal.addMouseListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox cbIPA;
    private javax.swing.JCheckBox cbIPS;
    private javax.swing.JCheckBox cbMTK;
    private javax.swing.JCheckBox cbPKn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAdmin;
    private javax.swing.JLabel jLabelHapusKelas;
    private javax.swing.JLabel jLabelInputKelas;
    private javax.swing.JLabel jLabelInputNIS;
    private javax.swing.JLabel jLabelInputNama;
    private javax.swing.JLabel jLabelKetHapus;
    private javax.swing.JLabel jLabelMapel;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelTambahKelas;
    private javax.swing.JList<String> jListKelas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tfKelas;
    private javax.swing.JTextField tfNIS;
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
