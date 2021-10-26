/*
Topik   : Sekolah
Ketua   : Arpriansah Yonathan (1301194112)
Anggota : Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Sekolah1;
public class guru {
    private String nama, kode_guru, mapelAjar;
    private int nip;
    
    public void setNamaGuru(String a){
        this.nama = a;
    }
    public void setNIP(int a){
        this.nip = a;
    }
    public void setKodeGuru(String a){
        this.kode_guru = a;
    }
    public String getNamaGuru(){
        return nama;
    }
    public int getNIP(){
        return nip;
    }
    public String getKodeGuru(){
        return kode_guru;
    }
    public String displayGuru(){
        return mapelAjar;
    }
}
