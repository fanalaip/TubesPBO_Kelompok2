/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package GUI;

import Model.Koneksi;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JTable;

public class guiGuru extends javax.swing.JFrame {
    Koneksi kn = new Koneksi();
    
    public guiGuru() {
        initComponents();
        DisplayCbKelas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelNIS = new javax.swing.JLabel();
        tfNIS = new javax.swing.JTextField();
        btnTambah = new javax.swing.JButton();
        cbMapel = new javax.swing.JComboBox<>();
        jLabelMapel = new javax.swing.JLabel();
        jLabelTask = new javax.swing.JLabel();
        jLabelNilai = new javax.swing.JLabel();
        cbTask = new javax.swing.JComboBox<>();
        tfNilai = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableSiswa = new javax.swing.JTable();
        jLabelInputNilai = new javax.swing.JLabel();
        jLabelDaftarSiswa = new javax.swing.JLabel();
        jLabelLamanGuru = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        jKelas1 = new javax.swing.JLabel();
        cbKelas = new javax.swing.JComboBox<>();
        btnCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelNIS.setText("NIS                 :");

        tfNIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNISActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah");
        btnTambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTambahMouseClicked(evt);
            }
        });
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        cbMapel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PKN", "IPA", "IPS", "Matematika" }));
        cbMapel.setSelectedIndex(-1);
        cbMapel.setToolTipText("");
        cbMapel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbMapelMouseClicked(evt);
            }
        });
        cbMapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMapelActionPerformed(evt);
            }
        });

        jLabelMapel.setText("MaPel             :");

        jLabelTask.setText("Task               :");

        jLabelNilai.setText("Nilai                :");

        cbTask.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tugas", "UTS", "UAS" }));
        cbTask.setSelectedIndex(-1);
        cbTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbTaskMouseClicked(evt);
            }
        });
        cbTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTaskActionPerformed(evt);
            }
        });

        tfNilai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNilaiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelNIS)
                        .addGap(18, 18, 18)
                        .addComponent(tfNIS, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelTask, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNilai, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelMapel, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfNilai, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbTask, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbMapel, 0, 155, Short.MAX_VALUE)))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(btnTambah)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNIS)
                    .addComponent(tfNIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMapel)
                    .addComponent(cbMapel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTask)
                    .addComponent(cbTask, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNilai)
                    .addComponent(tfNilai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnTambah)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTableSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nama Siswa", "NIS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jScrollPane4.setViewportView(jTableSiswa);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelInputNilai.setText("INPUT NILAI");

        jLabelDaftarSiswa.setText("DAFTAR SISWA");

        jLabelLamanGuru.setText("Laman Guru");

        btnKembali.setText("Back");
        btnKembali.setActionCommand(btnKembali.getActionCommand());
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jKelas1.setText("Kelas  :");

        cbKelas.setSelectedIndex(-1);
        cbKelas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbKelasMouseClicked(evt);
            }
        });
        cbKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKelasActionPerformed(evt);
            }
        });

        btnCari.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCariMouseClicked(evt);
            }
        });
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabelInputNilai)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelDaftarSiswa)
                .addGap(110, 110, 110))
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKembali))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jKelas1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCari))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLamanGuru)
                .addGap(289, 289, 289))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLamanGuru)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jKelas1)
                            .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCari))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelInputNilai)
                    .addComponent(jLabelDaftarSiswa))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(153, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// <editor-fold defaultstate="collapsed" desc="Generated Code"> 
    private void tfNISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNISActionPerformed

    private void cbMapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMapelActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbMapelActionPerformed

    private void cbTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTaskActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahActionPerformed

    private void tfNilaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNilaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNilaiActionPerformed

    private void cbMapelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbMapelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMapelMouseClicked

    private void cbTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbTaskMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTaskMouseClicked

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnTambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTambahMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTambahMouseClicked

    private void cbKelasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbKelasMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKelasMouseClicked

    private void cbKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKelasActionPerformed

    private void btnCariMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCariMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariMouseClicked

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCariActionPerformed
    // </editor-fold> 
    public static void main(String args[]) {
    // <editor-fold defaultstate="collapsed" desc="Generated Code">   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiGuru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }// </editor-fold> 
    
    public JComboBox<String> getCbKelas() {
        return cbKelas;
    }
    public String getCbKelasText () {
        int i = cbKelas.getSelectedIndex();
        return cbKelas.getItemAt(i);
    }
    public String getTfNIS() {
        return tfNIS.getText();
    }
    public JComboBox<String> getCbMapel() {
        return cbMapel;
    }
    public String getCbMapelText(){
        int i = cbMapel.getSelectedIndex();
        return cbMapel.getItemAt(i);
    }
    public JComboBox<String> getCbTask() {
        return cbTask;
    }
    public String getCbTaskText(){
        int i = cbTask.getSelectedIndex();
        return cbTask.getItemAt(i);
    }
    public String getTfNilai() {
       return tfNilai.getText();
    }
    
    public void setTfNIS(String tfNIS) {
        this.tfNIS.setText(tfNIS) ;
    }
    
    public void setTfNilai(String tfNilai) {
        this.tfNilai.setText(tfNilai) ;
    }
    
    public JButton getBtnBack() {
        return btnKembali;
    }
    public JButton getBtnAdd() {
        return btnTambah;
    }
    public JTable getjTableSiswa() {
        return jTableSiswa;
    }    
    public JButton getBtnCari(){
        return btnCari;
    }
    
    public void setjTableSiswa(JTable jTableMhs) {
        this.jTableSiswa = jTableMhs;
    }
    public void setTabel(String nama, String nis, int i) {
        jTableSiswa.setValueAt(nama, i, 0);
        jTableSiswa.setValueAt(nis, i, 1);
    }
    public void resetTable() {
        int rowCount = jTableSiswa.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            setTabel("", "", i);
        }
    }
    public void resetView(){;
        tfNIS.setText("");
        tfNilai.setText("");
        cbTask.setSelectedIndex(-1);
        cbMapel.setSelectedIndex(-1);
    }
    public void addActionListener(ActionListener e){
        btnTambah.addActionListener(e);
        btnKembali.addActionListener(e);
        btnCari.addActionListener(e);
    }
    
    public void DisplayCbKelas(){
       try{
           Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "SELECT DISTINCT nama_kelas FROM kelas " ;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                cbKelas.addItem(rs.getString("nama_kelas"));
            }
       }catch(Exception e){
            e.printStackTrace();
       }   
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> cbKelas;
    private javax.swing.JComboBox<String> cbMapel;
    private javax.swing.JComboBox<String> cbTask;
    private javax.swing.JLabel jKelas1;
    private javax.swing.JLabel jLabelDaftarSiswa;
    private javax.swing.JLabel jLabelInputNilai;
    private javax.swing.JLabel jLabelLamanGuru;
    private javax.swing.JLabel jLabelMapel;
    private javax.swing.JLabel jLabelNIS;
    private javax.swing.JLabel jLabelNilai;
    private javax.swing.JLabel jLabelTask;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableSiswa;
    private javax.swing.JTextField tfNIS;
    private javax.swing.JTextField tfNilai;
    // End of variables declaration//GEN-END:variables
}
