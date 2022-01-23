/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package GUI;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTable;
import Controller.ControllerSiswa;
import Model.Koneksi;
import java.sql.ResultSet;
import java.sql.Statement;

public class guiSiswa extends javax.swing.JFrame {
    private ControllerSiswa controllerSiswa;
    private String nama_siswa;
    Koneksi kn = new Koneksi();
     
    public guiSiswa() {
        initComponents();
        DisplayCbKelas();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPaneDaftarSiswa = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jInternalFrameNilai = new javax.swing.JInternalFrame();
        jLSiswa = new javax.swing.JLabel();
        jLabelNIS = new javax.swing.JLabel();
        jTextFieldNIS = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelKelas = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSiswa = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelWaliKelas = new javax.swing.JLabel();
        jLabelKodeWakel = new javax.swing.JLabel();
        jLabelNamaWakel = new javax.swing.JLabel();
        jInternalFrameDaftarSiswa = new javax.swing.JInternalFrame();
        jLabelNamaSiswa = new javax.swing.JLabel();
        jcbKelas = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btnPilih = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jDaftarSiswa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrameNilai.setVisible(true);
        jInternalFrameNilai.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLSiswa.setFont(new java.awt.Font("Constantia", 1, 24)); // NOI18N
        jLSiswa.setText("SISWA");
        jInternalFrameNilai.getContentPane().add(jLSiswa, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 45, -1, -1));

        jLabelNIS.setText("NIS                    :");
        jInternalFrameNilai.getContentPane().add(jLabelNIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 93, -1, 39));
        jInternalFrameNilai.getContentPane().add(jTextFieldNIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(144, 97, 149, 31));

        btnSearch.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jInternalFrameNilai.getContentPane().add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(311, 101, -1, -1));

        btn_back.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        jInternalFrameNilai.getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 13, -1, 26));

        jLabel1.setText("NAMA                :");
        jInternalFrameNilai.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 159, -1, -1));

        jLabelKelas.setText("KELAS                :");
        jInternalFrameNilai.getContentPane().add(jLabelKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 20));

        jTableSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "MATA PELAJARAN", "TASK", "NILAI"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableSiswa.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jScrollPane3.setViewportView(jTableSiswa);

        jInternalFrameNilai.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 480, 370));
        jInternalFrameNilai.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 159, -1, -1));
        jInternalFrameNilai.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 188, -1, -1));

        jLabelWaliKelas.setText("WALI KELAS      :");
        jInternalFrameNilai.getContentPane().add(jLabelWaliKelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        jInternalFrameNilai.getContentPane().add(jLabelKodeWakel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 50, -1));
        jInternalFrameNilai.getContentPane().add(jLabelNamaWakel, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 20, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrameNilai, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrameNilai)
        );

        jTabbedPaneDaftarSiswa.addTab("NILAI", jPanel1);

        jInternalFrameDaftarSiswa.setVisible(true);

        jLabelNamaSiswa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabelNamaSiswa.setText("LIST NAMA SISWA");

        jcbKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbKelasActionPerformed(evt);
            }
        });

        jLabel2.setText("KELAS :");

        btnPilih.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnPilih.setForeground(new java.awt.Color(102, 102, 102));
        btnPilih.setText("Pilih");
        btnPilih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPilihActionPerformed(evt);
            }
        });

        jDaftarSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nama Siswa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jDaftarSiswa);

        javax.swing.GroupLayout jInternalFrameDaftarSiswaLayout = new javax.swing.GroupLayout(jInternalFrameDaftarSiswa.getContentPane());
        jInternalFrameDaftarSiswa.getContentPane().setLayout(jInternalFrameDaftarSiswaLayout);
        jInternalFrameDaftarSiswaLayout.setHorizontalGroup(
            jInternalFrameDaftarSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameDaftarSiswaLayout.createSequentialGroup()
                .addGroup(jInternalFrameDaftarSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrameDaftarSiswaLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabelNamaSiswa))
                    .addGroup(jInternalFrameDaftarSiswaLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnPilih))
                    .addGroup(jInternalFrameDaftarSiswaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jInternalFrameDaftarSiswaLayout.setVerticalGroup(
            jInternalFrameDaftarSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrameDaftarSiswaLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabelNamaSiswa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jInternalFrameDaftarSiswaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnPilih))
                .addGap(63, 63, 63)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80))
        );

        jTabbedPaneDaftarSiswa.addTab("DAFTAR SISWA", jInternalFrameDaftarSiswa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPaneDaftarSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jTabbedPaneDaftarSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_backActionPerformed

    private void jcbKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbKelasActionPerformed

    private void btnPilihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPilihActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPilihActionPerformed

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
            java.util.logging.Logger.getLogger(guiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiSiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiSiswa().setVisible(true);
            }
        });
    }
    public void setNama(String kelas){
        jLabel5.setText(kelas);
    }
    public void setKelas(String kelas){
        jLabel6.setText(kelas);
    }
    public JButton getButtonBack(){
        return btn_back;
    }
    
    public JTable getjTableSiswa() {
        return jTableSiswa;
    }
      
    public JTable getDaftarSiswa(){
        return jDaftarSiswa;
    }
      
    public JButton getBtnCariNIS(){
        return btnSearch;
    }
    
    public JLabel getNama(){
        return jLabel5 ;
    }
    
    public JLabel getKelas(){
        return jLabel6 ;
    }
    
    public JLabel getNamaWakel() {
        return jLabelNamaWakel ;
    }
    
    public JLabel getKodeWakel() {
        return jLabelKodeWakel ;
    }
        
    public void setNIS(){
        this.jTextFieldNIS = jTextFieldNIS;
    }
    
    public String getNIS(){
        return jTextFieldNIS.getText();
    }
    
    public JButton getBtnPilih(){
        return btnPilih;
    }
    
    public String getChooseKelas(){
        int i = jcbKelas.getSelectedIndex();
        return jcbKelas.getItemAt(i);
    }
    
    public void reset(){
        jcbKelas.setSelectedIndex(0);
    }
    
    public void DisplayCbKelas(){
       try{
           Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "SELECT DISTINCT nama_kelas FROM kelas " ;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                jcbKelas.addItem(rs.getString("nama_kelas"));
            }
       }catch(Exception e){
            e.printStackTrace();
       }   
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPilih;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btn_back;
    private javax.swing.JTable jDaftarSiswa;
    private javax.swing.JInternalFrame jInternalFrameDaftarSiswa;
    private javax.swing.JInternalFrame jInternalFrameNilai;
    private javax.swing.JLabel jLSiswa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelKelas;
    private javax.swing.JLabel jLabelKodeWakel;
    private javax.swing.JLabel jLabelNIS;
    private javax.swing.JLabel jLabelNamaSiswa;
    private javax.swing.JLabel jLabelNamaWakel;
    private javax.swing.JLabel jLabelWaliKelas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPaneDaftarSiswa;
    private javax.swing.JTable jTableSiswa;
    private javax.swing.JTextField jTextFieldNIS;
    private javax.swing.JComboBox<String> jcbKelas;
    // End of variables declaration//GEN-END:variables

    public void addActionListener(ControllerSiswa e) {
        btnSearch.addActionListener(e);
        btn_back.addActionListener(e);
        btnPilih.addActionListener(e);
    }

    public void resetTable() {
        int rowCount = jTableSiswa.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            setTabel("", "", "", i);
        }
    }
    
    public void setTabel(String nama_mapel, String aktivitas, String nilai, int j){
        jTableSiswa.setValueAt(nama_mapel, j, 1);
        jTableSiswa.setValueAt(aktivitas, j, 2);   
        jTableSiswa.setValueAt(nilai, j, 3);   
    }
}
