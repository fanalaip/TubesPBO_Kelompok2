/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Controller;

import GUI.guiAdmin;
import Model.Koneksi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ControllerAdmin extends MouseAdapter implements ActionListener {
    private guiAdmin viewAdmin;
    Koneksi kn = new Koneksi() ;

    public ControllerAdmin() {
        this.viewAdmin = viewAdmin;
        Display dis = new Display();
        
        viewAdmin = new guiAdmin();
        viewAdmin.addActionListener(this);
        
        viewAdmin.setVisible(true);
        dis.DisplayKelasAdmin(viewAdmin.getListKelas());
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        try {
            if (source.equals(viewAdmin.getBtnBack())) {
                new Controller();
                viewAdmin.dispose();
            }
            else if (source.equals(viewAdmin.getBtnAdd())) {
                try {
                    Display dis = new Display();
                    String kelas = viewAdmin.getKelas().getText();
                    String kode_guru = viewAdmin.getWaliKelas().getText() ;
                    String nama = viewAdmin.getTfNama() ;
                    String nis = viewAdmin.getTfNIS() ;
                    if (kelas==null || nama==null || nis==null || kode_guru==null){
                        JOptionPane.showMessageDialog(null, "Data harus diisi terlebih dahulu");
                    } else {
                        addSiswa(kelas, kode_guru, nis, nama);
                        JOptionPane.showMessageDialog(null, "Data berhasil ditambahkan");
                        viewAdmin.resetView();
                    }
                } catch (Exception es) {
                    System.out.println("Error 404 "+ es.getMessage());
                    JOptionPane.showMessageDialog(null, "Data tidak berhasil ditambahkan");
                }
            }
            else if (source.equals(viewAdmin.getBtnDelete())) {
                String kelas = viewAdmin.getTfEditKelas();
                if (kelas == null) {
                    JOptionPane.showMessageDialog(null, "Tidak ada yang dihapus");
                }else{
                    deleteKelas(kelas);
                    JOptionPane.showMessageDialog(null, "Kelas berhasil dihapus");
                }
            }else if (source.equals(viewAdmin.getBtnUpdate())){
                String kelas = viewAdmin.getKelas().getText();
                String edit = viewAdmin.getTfEditKelas();
                if (kelas == null || edit == null ) {
                    JOptionPane.showMessageDialog(null, "Tidak ada yang diubah");
                }else {
                    updateKelas(kelas, edit);
                    JOptionPane.showMessageDialog(null, "Nama kelas berhasil diubah");
                    viewAdmin.resetView();
                }
            }
        } catch (Exception ef) {
            JOptionPane.showMessageDialog(null, "Data kelas tidak berhasil di update");
        }
    }
    
    public void addSiswa(String nama_kelas, String kode_guru, String nis, String nama_siswa) {
       try {
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "INSERT INTO kelas VALUES ('"
                    +nama_kelas+"','"
                    +kode_guru+"','"
                    +nis+"','"
                    +nama_siswa+"')";
            stmt.executeUpdate(sql);
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public void deleteKelas(String kelas){
        try{
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "DELETE FROM kelas WHERE nama_kelas = '" + kelas +"'";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void updateKelas(String kelas, String edit){
        try{
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "UPDATE kelas SET nama_kelas = '" + edit +"' WHERE nama_kelas = '" + kelas +"' ";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}