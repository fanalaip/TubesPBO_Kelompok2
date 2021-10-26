/*
Topik   : Sekolah
Ketua   : Arpriansah Yonathan (1301194112)
Anggota : Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Sekolah3;

import Sekolah1.siswa;
import Sekolah2.task;

public class kelulusan {
    private int semester;
    private float nilai_akhir;
    private boolean status_lulus;
    private matapelajaran course;
    private siswa student;
    private task score;
    
    public void setSemester(int a){
        this.semester = a;
    }
    public void setNilaiAkhir(float a){
        this.nilai_akhir = a;
    }
    public void setStatusKelulusan(boolean a){
        this.status_lulus = a;
    }
    public void setCourse(matapelajaran a){
        this.course = a;
    }
    public void setStudent(siswa a){
        this.student = a;
    }
    public int getSemester(){
        return semester;
    }
    public float getNilaiAkhir(){
        return nilai_akhir;
    }
    public boolean getStatusKelulusan(){
        return status_lulus;
    }
    public matapelajaran getCourse(){
        return course;
    }
    public siswa getStudent(){
        return student;
    }
}
