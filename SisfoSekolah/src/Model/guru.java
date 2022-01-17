/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Model;

public class guru extends Identity{
    private String kode_guru, nid;
    
    public guru (String kode_guru, String nid, String nama) {
        super(nama);
        this.kode_guru = kode_guru ;
        this.nid = nid ;
    }
    public void setNID(String a){
        this.nid = a;
    }
    public void setKodeGuru(String a){
        this.kode_guru = a;
    }
    public String getNID(){
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
        int angkatan = Integer.parseInt(Integer.toString(Integer.valueOf(nid)).substring(0,1));
        return 2000+angkatan ;
    }
}
