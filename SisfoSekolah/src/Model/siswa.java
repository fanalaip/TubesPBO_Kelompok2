/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Model;

//import java.sql.PreparedStatement;
//import java.util.ArrayList;

import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;

public class siswa extends Identity {
    private String nis;
    Koneksi kn = new Koneksi() ;
    
    public siswa(String nama, String nis){
        super(nama);
        this.nis = nis;
    }   

    public void setNIS(String nis){
        this.nis = nis;
    }
    public String getNIS(){
        return nis;
    }
    public void addNilai(String nis, String mapel, String activity, String nilai) {
        try {
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "INSERT INTO nilai VALUES ('"
                    +nis+"','"
                    +mapel+"','"
                    +activity+"','"
                    +nilai+"')";
            stmt.executeUpdate(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } 
}
