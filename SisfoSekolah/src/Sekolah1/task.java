/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Sekolah1;

import Sekolah1.matapelajaran;

public class task extends matapelajaran {
    private String aktivitas ;
    private float nilai ;

    public task (String aktivitas, float nilai, String nama_mapel, float kkm, float bobotNilai) {
        super(nama_mapel, kkm, bobotNilai) ;
        this.aktivitas = aktivitas ;
        this.nilai = nilai ;
    }
    
    public void setNilai(float a){
        this.nilai = a;
    }
    public void setAktivitas(String a){
        this.aktivitas = a;
    }
    public float getNilai(){
        return nilai;
    }
    public String getAktivitas(){
        return aktivitas;
    }
    public void inputNilai(float nilai) {
        
    }
    public void hitungNilai(float nilai){
        
    }
}
