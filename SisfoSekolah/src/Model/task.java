/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Model;

import Model.matapelajaran;

public class task extends matapelajaran {
    private String aktivitas ;
    private int nilai ;

    public task (String aktivitas, int nilai, String nama_mapel) {
        super(nama_mapel) ;
        this.aktivitas = aktivitas ;
        this.nilai = nilai ;
    }
    
    public void setNilai(int nilai){
        this.nilai = nilai;
    }
    public void setAktivitas(String aktivitas){
        this.aktivitas = aktivitas;
    }
    public int getNilai(){
        return nilai;
    }
    public String getAktivitas(){
        return aktivitas;
    }
}
