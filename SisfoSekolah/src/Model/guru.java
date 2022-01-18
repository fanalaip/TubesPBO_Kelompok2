/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Model;

public class guru extends Identity{
    private String kode_guru;
    
    public guru (String nama, String kode_guru) {
        super(nama);
        this.kode_guru = kode_guru ;
    }
    public String getKodeGuru(){
        return kode_guru;
    }
}
