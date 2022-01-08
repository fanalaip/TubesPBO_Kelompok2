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
    
    private ArrayList<siswa> listMapel;
    private String nama_kelas;
    
    public void setNamaKelas(String a){
        this.nama_kelas = a;
    }
    public String getNamaKelas(){
        return nama_kelas;
    }
}
