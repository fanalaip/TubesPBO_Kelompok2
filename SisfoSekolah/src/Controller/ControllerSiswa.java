/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Controller;

import GUI.guiSiswa;
import Model.Database;
import Model.siswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class ControllerSiswa implements ActionListener{
    private guiSiswa viewSiswa;           
    Database db;
    private siswa siswa;  
    
    public ControllerSiswa(Database db) {
        viewSiswa = new guiSiswa();
        viewSiswa.setVisible(true);
        viewSiswa.addActionListener(this);    
        this.db = db;
        //combobox();        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
            try {
                if (source.equals(viewSiswa.getButtonBack())) {
                    new Controller();
                    viewSiswa.dispose();
                } 
                else if (source.equals(viewSiswa.getBtnCariNIS())) {
                    try {
                        if (viewSiswa.getjTextFieldNIS().getText().equals("")){
                            JOptionPane.showMessageDialog(null, "NIS harus diisi terlebih dahulu");
                        } else {
                            String NIS = viewSiswa.getjTextFieldNIS().getText();
                            viewSiswa.resetTable();
                            lihatNilai(NIS, db);
                        }
                    } catch (Exception es) {
                        System.out.println("Error 404 "+ es.getMessage());
                        JOptionPane.showMessageDialog(null, "Data siswa tidak ditemukan");
                    }
                }
            } catch (Exception ef) {
                JOptionPane.showMessageDialog(null, "Data siswa tidak ditemukan");
            }
    }

    /*
    private void combobox() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    */

    private void lihatNilai(String NIS, Database dbsisfo) {
        try {
            int j = 0 ;
            dbsisfo.connect() ;
            String sql = "SELECT * FROM mata_kuliah NATURAL JOIN jadwal NATURAL JOIN enroll WHERE NIS = '" + NIS +"'";
            dbsisfo.setRs(dbsisfo.getStmt().executeQuery(sql));
            while(dbsisfo.getRs().next()){
                viewSiswa.setTabel(
                        dbsisfo.getRs().getString("id"),
                        dbsisfo.getRs().getString("nis"),
                        dbsisfo.getRs().getString("nama_siswa"),
                        dbsisfo.getRs().getString("angkatan"), 
                        j);
                j++;
            }
            dbsisfo.disconnect();
            viewSiswa.getjTableSiswa();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "NIS tidak ditemukan di database.");
            ex.printStackTrace();
        }
    }
}

