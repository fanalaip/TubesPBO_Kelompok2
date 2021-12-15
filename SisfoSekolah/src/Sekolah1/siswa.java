/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Sekolah1;
public class siswa {
    private String nama_siswa;
    private int nis;
    
    public siswa(String nama_siswa, int nis){
        this.nama_siswa = nama_siswa;
        this.nis = nis;
    }
    
    public void setNamaSiswa(String a){
        this.nama_siswa = a;
    }
    public void setNIS(int a){
        this.nis = a;
    }
    public String getNamaSiswa(){
        return nama_siswa;
    }
    public int getNIS(){
        return nis;
    }
    public int getAngkatan(){
        /*
            FUNGSI INI BERFUNGSI UNTUK MENGETAHUI ANGKATAN DARI NIS PESERTA DIDIK
            Asumsikan NIS pada suatu sekolah terdiri dari 5 digit.
            Dua digit pertama adalah angkatan siswa tersebut masuk.
            Asumsikan satu angkatan kurang dari 999 siswa.
            Asumsikan sekolah ini berdiri tahun 2010.
            Contoh: 192013 (angkatan 2019) 19000 19999
                    205001 (angkatan 2020)
                    214444 (angkatan 2021)
        */
        int angkatan = Integer.parseInt(Integer.toString(nis).substring(0,1)) ;
        return 2000+angkatan ;
    }
    public void displayNilai(task score){
        
    }
    public void pinjamBuku(String buku) {
        /*
            Buku diluar matapelajaran.
            Siswa dapat meminjam maksimal 3 buku dalam rentang waktu dua minggu.
        */
    }
    public void kembalikanBuku(String buku) {
        
    }
    public void displayPinjam(String buku) {
        
    }
}
