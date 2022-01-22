/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Model;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class admin {
    Koneksi kn = new Koneksi() ;

    public static void addSiswa(String nama_kelas, String nama_siswa, String nis, ArrayList<String> mapel, Database dbsisfo){
        try {
            dbsisfo.connect() ;
            String sql = "INSERT INTO kelas VALUES ('"
                    +nis+"','"
                    +nama_siswa+"','"
                    +nama_kelas+"','"
                    +mapel+"')";
            dbsisfo.setRs(dbsisfo.getStmt().executeQuery(sql));
            dbsisfo.disconnect();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void deleteKelas(String kelas){
        try{
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "DELETE FROM kelas WHERE nama_kelas = '" + kelas +"'";
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void updateKelas(String kelas, Database dbsisfo){
        try{
            dbsisfo.connect();
            String sql = "UPDATE kelas SET nama_kelas = '" + kelas +"' WHERE nama_kelas = '" + kelas +"' ";
            dbsisfo.setRs(dbsisfo.getStmt().executeQuery(sql));
            dbsisfo.disconnect();
        } catch (SQLException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}