/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Model;

import java.util.ArrayList;

public class kelas {
    
    private String nama_kelas;

    public kelas(String nama_kelas) {
        this.nama_kelas = nama_kelas ;
    }

    public void setNamaKelas(String nama_kelas){
        this.nama_kelas = nama_kelas;
    }
    public String getNamaKelas(){
        return nama_kelas;
    }
}


