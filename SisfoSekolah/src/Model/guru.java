/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Model;
public class guru {
    private String nama_guru, kode_guru, mapelAjar;
    private int nid;
    
    public guru (String nama_guru, String kode_guru, String mapelAjar, int nid) {
        this.nama_guru = nama_guru ;
        this.kode_guru = kode_guru ;
        this.mapelAjar = mapelAjar ;
        this.nid = nid ;
    }
    public void setNamaGuru(String a){
        this.nama_guru = a;
    }
    public void setNID(int a){
        this.nid = a;
    }
    public void setKodeGuru(String a){
        this.kode_guru = a;
    }
    public String getNamaGuru(){
        return nama_guru;
    }
    public int getNID(){
        return nid;
    }
    public String getKodeGuru(){
        return kode_guru;
    }
    public int getAngkatan(){
    /*
    FUNGSI INI BERFUNGSI UNTUK MENGETAHUI AWAL TAHUN GURU MENGAJAR DARI NID GURU
            Asumsikan NID pada suatu sekolah terdiri dari 6 digit. Dua digit pertama adalah tahun awal guru tersebut mengajar di sekolah.
            Asumsikan jumlah guru di sekolah tersebut kurang dari 9999 guru. Asumsikan sekolah ini berdiri tahun 2010.
            Contoh: 192013 (angkatan 2019) 19000 19999
                    205001 (angkatan 2020)
                    214444 (angkatan 2021)    
    */    
        int angkatan = Integer.parseInt(Integer.toString(nid).substring(0,1));
        return 2000+angkatan ;
    }
}
