/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Model;

public class kelulusan extends task {
    private int semester;
    private float nilaiSemester;
    private String status_lulus;
    
    public kelulusan (int semester, float nilaiSemester, String status_lulus, float nilai, String aktivitas, String nama_mapel, float kkm, float bobotNilai) {
        super(aktivitas, nilai, nama_mapel, kkm, bobotNilai) ;
        this.semester = semester ;
        this.nilaiSemester = nilaiSemester ;
        this.status_lulus = status_lulus ;
    }
    public void setSemester(int a){
        this.semester = a;
    }
    public void setNilaiSemester(float a){
        this.nilaiSemester = a;
    }
    public void setStatusKelulusan(String a){
        this.status_lulus = a;
    }
    public int getSemester(){
        return semester;
    }
}