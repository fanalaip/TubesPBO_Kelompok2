/*
Topik   : Sekolah
Ketua   : Arpriansah Yonathan (1301194112)
Anggota : Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Sekolah2;

import Sekolah3.matapelajaran;

public class nilai {
    private tugas task;
    private ujian exam;
    private int skor;
    private matapelajaran mapel;
    
    public void setTask(tugas a){
        this.task = a;
    }
    public void setExam(ujian a){
        this.exam = a;
    }
    public tugas getTask(){
        return task;
    }
    public ujian getExam(){
        return exam;
    }
   // public int hitungNilai(){
        
    //}
}
