/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Sekolah1;
public class guru {
    private String nama_guru, kode_guru, mapelAjar;
    private int nip;
    
    public guru (String nama_guru, String kode_guru, String mapelAjar, int nip) {
        this.nama_guru = nama_guru ;
        this.kode_guru = kode_guru ;
        this.mapelAjar = mapelAjar ;
        this.nip = nip ;
    }
    
    public void setNamaGuru(String a){
        this.nama_guru = a;
    }
    public void setNIP(int a){
        this.nip = a;
    }
    public void setKodeGuru(String a){
        this.kode_guru = a;
    }
    public String getNamaGuru(){
        return nama_guru;
    }
    public int getNIP(){
        return nip;
    }
    public String getKodeGuru(){
        return kode_guru;
    }
    public void displayGuru(){
        
    }
    public void pinjamBuku(String buku) {
        /*
            Guru dapat meminjam maksimal 5 buku dalam rentang waktu dua minggu.
        */
    }
    public void kembalikanBuku(String buku) {
        
    }
    public void displayPinjam(String buku) {
        
    }
}
