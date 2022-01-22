/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Controller;

import Model.Koneksi;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTable;
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
    
    public void DisplayKelas(String nama, String kelas, String nis) {
        try {
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "SELECT nama_siswa, nama_kelas FROM kelas WHERE nis = '" + nis +"'";
            stmt.executeUpdate(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
    private void showActionPerformed(java.awt.event.ActionEvent evt) {                                     
        try{
            ResultSet rs = stat.executeQuery("SELECT nama_siswa, nama_kelas FROM kelas WHERE nis = '" + nis +"'");
            jLabel1.setText(rs.getString("name"));
            jLabel12.setText(rs.getString("e_id"));
        } catch(Exception e) {
            System.out.print(e);
        }
    }   
}

//String sql = "SELECT nama_siswa, nama_kelas FROM kelas WHERE nis = '" + NIS +"'";