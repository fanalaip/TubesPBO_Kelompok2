/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Controller;

//import Model.Koneksi;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import Model.Koneksi;
import Model.kelas;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Display {
    Koneksi kn = new Koneksi() ;
     
    public void DisplaySiswa(JTable jtable, String nama_kelas){
        try{
            DefaultTableModel tblModel = (DefaultTableModel) jtable.getModel();
            tblModel.setRowCount(0);
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "SELECT * FROM kelas WHERE nama_kelas='"+nama_kelas+"'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String nis = rs.getString("nis");
                String nama_siswa = rs.getString("nama_siswa");
                String tbData[] = {nama_siswa, nis};
                tblModel.addRow(tbData);
            }
        }catch(Exception e){
            e.printStackTrace();
        }   
    }
    
    public void DisplayNilai(JTable jtable, String nis){
        try{
            DefaultTableModel tblModel = (DefaultTableModel) jtable.getModel();
            tblModel.setRowCount(0);
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "SELECT * FROM nilai WHERE nis = '" + nis +"'";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String mapel = rs.getString("mapel");
                String activity = rs.getString("activity");
                String nilai = rs.getString("nilai");
                String tbData[] = {mapel, activity, nilai};
                tblModel.addRow(tbData);
            }
        }catch(Exception e){
            e.printStackTrace();
        }   
    }
    
    public void DisplayKelasAdmin(JList jListKelas){
        try {
            DefaultListModel model = new DefaultListModel();
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "SELECT DISTINCT nama_kelas FROM kelas ";
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                String nama_kelas = rs.getString("nama_kelas");
                model.addElement(nama_kelas);
            }
            jListKelas.setModel(model);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    public kelas DisplayBio(String nis) {
        try {
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "SELECT nama_siswa, nama_kelas FROM kelas WHERE nis = '" + nis +"'";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                kelas Class = new kelas(rs.getString("nama_kelas"), rs.getString("nama_siswa"), nis) ;
                return Class ;
            }
            return null ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null ;
    }
    
    public String DisplayWaliKelas(String kelas) {
        try {
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "SELECT DISTINCT nama_guru FROM guru INNER JOIN kelas ON kelas.kode_guru = guru.kode_guru WHERE nama_kelas = '"+kelas+"'" ;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                String guru = rs.getString("nama_guru") ;
                return guru ;
            }
            return null ;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null ;
    }
}