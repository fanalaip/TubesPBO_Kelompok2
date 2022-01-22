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
import Model.Koneksi;
import Model.kelas;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.sql.Statement;

public class ControllerSiswa implements ActionListener{
    private guiSiswa viewSiswa;           
    Database db;
    private kelas kelas;  
    ArrayList<List> list = new ArrayList();
    private String nama_siswa;
    private String nis;
    
    Koneksi kn = new Koneksi() ;
    
    public ControllerSiswa(Database db) {
        viewSiswa = new guiSiswa();
        viewSiswa.setVisible(true);
        viewSiswa.addActionListener(this);
        db = new Database();
        this.db = db;       
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
                        if (viewSiswa.getNIS().equals("")){
                            JOptionPane.showMessageDialog(null, "NIS harus diisi terlebih dahulu");
                        } else {
                            String NIS = viewSiswa.getNIS();
                            Display dis = new Display() ;
                            dis.DisplayNilai(viewSiswa.getjTableSiswa(), NIS) ;
                            viewSiswa.resetTable();
                        }
                    } catch (Exception es) {
                        System.out.println("Error 404 "+ es.getMessage());
                        JOptionPane.showMessageDialog(null, "Data siswa tidak ditemukan");
                    }
                }else if(source.equals(viewSiswa.getBtnPilih())){
                    Display dis = new Display();
                    dis.DisplaySiswa(viewSiswa.getDaftarSiswa(), viewSiswa.getChooseKelas());
                }
            } catch (Exception ef) {
                JOptionPane.showMessageDialog(null, "Data siswa tidak ditemukan");
            }
    }

    private void lihatNilai(String nis) {
        try {
            int j = 0 ;
            
            Statement stmt = (Statement) kn.getKoneksi().createStatement() ;
            String sql = "SELECT nilai.mapel, nilai.activity, nilai.nilai FROM kelas INNER JOIN nilai ON kelas.nis = nilai.nis WHERE NIS = '" + nis +"'";
            ResultSet rs = stmt.executeQuery(sql) ;
            //String sql ="SELECT nilai.mapel, nilai.activity, nilai.nilai FROM kelas INNER JOIN nilai ON kelas.nis = nilai.nis ;";
            //String sql = "SELECT * FROM mapel NATURAL JOIN jadwal NATURAL JOIN enroll WHERE NIS = '" + NIS +"'";
            /*
            while(dbsisfo.getRs().next()){
                viewSiswa.setTabel(
                        dbsisfo.getRs().getString("nama_mapel"),
                        dbsisfo.getRs().getString("aktivitas"),
                        dbsisfo.getRs().getString("nilai"),
                        j);
                j++;
            }
            dbsisfo.disconnect();
            */
            viewSiswa.getjTableSiswa();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "NIS tidak ditemukan di database.");
            ex.printStackTrace();
        }
    }
    /*
    public void listSiswa(Database db, String nama_siswa){
        try{
            kelas.lihatSiswa(db, nama_siswa);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    */
    
    /*
    public void kelasTujuh(JTable jtable, String nama_siswa){
        try {
            db.connect();
            String sql = "SELECT nama_siswa FROM kelas WHERE  nama_kelas = '7A'";
            db.setRs(db.getStmt().executeQuery(sql));
            db.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void kelasDelapan(Database db, String nama_siswa){
        try{
            db.connect();
            String sql = "SELECT nama_siswa FROM kelas WHERE  nama_kelas = '8A'";
            db.setRs(db.getStmt().executeQuery(sql));
            db.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void kelasSembilan(Database db, String nama_siswa){
        try{
            db.connect();
            String sql = "SELECT nama_siswa FROM kelas WHERE  nama_kelas = '9A'";
            db.setRs(db.getStmt().executeQuery(sql));
            db.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    */
}


