/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Model;

import java.util.ArrayList;

public class siswa extends Identity{
    private String nis;
    private ArrayList<siswa> listMapel; 
    
    public siswa(String nisl){
        super(nama);
        this.nis = nis;
    }   
    public void setNIS(String a){
        this.nis = a;
    }
    public String getNIS(){
        return nis;
    }
    public int getAngkatan(){
        /*
            FUNGSI INI BERFUNGSI UNTUK MENGETAHUI ANGKATAN DARI NIS PESERTA DIDIK
            Asumsikan NIS pada suatu sekolah terdiri dari 5 digit.
            Dua digit pertama adalah angkatan siswa tersebut masuk.
            Asumsikan satu angkatan kurang dari 999 siswa.
            Asumsikan sekolah ini berdiri tahun 2010.
            Contoh: 19201 (angkatan 2019) 19000 19999
                    20500 (angkatan 2020)
                    21444 (angkatan 2021)
        */
        int angkatan = Integer.parseInt(Integer.toString(Integer.valueOf(nis)).substring(0,1)) + 2 ;
        return 2000+angkatan ;
    }
     public void addNilai(Database db) {
        try {
            db.connect();
            String sql = "INSERT INTO nilai VALUES ('"
                    +getNIS()+"','"
                    +getNamaSiswa()+"','"
                    +super.getMataPelajaran()+"','"
                    +super.getAktivitas()+"','"
                    +super.getNilai()+"')"
                    ;
            db.setRs(db.getStmt().executeQuery(sql));
            db.disconnect();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }  
}
