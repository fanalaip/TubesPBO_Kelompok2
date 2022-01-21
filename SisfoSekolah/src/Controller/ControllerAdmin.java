/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Controller;

import GUI.guiAdmin;
import Model.Database;
import Model.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControllerAdmin extends MouseAdapter implements ActionListener {
    private guiAdmin viewAdmin;
    private admin adminModel;
    private Database db;

    public ControllerAdmin(Database db) {
        this.viewAdmin = viewAdmin;
        this.adminModel = adminModel;
        this.db = db;
        
        viewAdmin = new guiAdmin();
        viewAdmin.addActionListener(this);
        //viewAdmin.addMouseAdapter(this);
        
        viewAdmin.setVisible(true);
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
                        String kelas = viewAdmin.getSelectedKelas() ;
                        String nama = viewAdmin.getTfNama() ;
                        String nis = viewAdmin.getTfNIS() ;
                        if (nama==null || nis==null){
                            JOptionPane.showMessageDialog(null, "Data harus diisi terlebih dahulu");
                        } else {
                            
                        }
                    } catch (Exception es) {
                        System.out.println("Error 404 "+ es.getMessage());
                        JOptionPane.showMessageDialog(null, "Data tidak berhasil ditambahkan");
                    }
                }
                else if (source.equals(viewAdmin.getBtnDelete())) {
                    String kelas = viewAdmin.getSelectedKelas() ;
                    if (kelas == null) {
                        JOptionPane.showMessageDialog(null, "Tidak ada yang dihapus");
                    } else {
                        //adminModel.deleteKelas(kelas, db);
                        JOptionPane.showMessageDialog(null, "Kelas berhasil dihapus");
                    }
                }
                else if (source.equals(viewAdmin.getBtnUpdate())){
                    String kelas = viewAdmin.getSelectedKelas() ;
                    String edit = viewAdmin.getTfEditKelas();
                    if (kelas == null || edit == null ) {
                        JOptionPane.showMessageDialog(null, "Tidak ada yang diubah");
                    }else {
                        //adminModel.updateKelas(kelas, db);
                        JOptionPane.showMessageDialog(null, "Nama kelas berhasil diubah");
                    }
                }
            } catch (Exception ef) {
                JOptionPane.showMessageDialog(null, "Data siswa tidak berhasil di update");
            }
    }
}