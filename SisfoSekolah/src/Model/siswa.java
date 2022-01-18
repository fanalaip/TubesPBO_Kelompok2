/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Model;

import java.util.ArrayList;

public class siswa extends Identity {
    private String nis;
    private ArrayList<siswa> listMapel; 
    
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

 //Masih error bagian get mapel, aktivitas, nilai
     public void addNilai(Database db) {
        try {
            db.connect();
            
            String sql = "INSERT INTO nilai VALUES ('"
                    +getNIS()+"','"
                    +getNama()+"','"
                    +getMataPelajaran()+"','"
                    +getAktivitas()+"','"
                    +getNilai()+"')";
            /*
            String sql = "INSERT INTO nilai VALUES ('"
                    +getNIS()+"','"
                    +getNama()+"','"
                    +getMataPelajaran()+"','"
                    +getAktivitas()+"','"
                    +getNilai()+"')"
                    ;
            */
            db.setRs(db.getStmt().executeQuery(sql));
            db.disconnect();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }  

}
