/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Sekolah1;

public class matapelajaran {
   private String nama_mapel;
   private float kkm;
   private float bobotNilai;
   
   public matapelajaran(String nama_mapel, float kkm, float bobotNilai) {
       this.nama_mapel = nama_mapel ;
       this.kkm =kkm ;
       this.bobotNilai = bobotNilai ;
   }
   
   public void setMataPelajaran(String a){
       this.nama_mapel = a;
   }
   public void setKKM(float a){
       this.kkm = a;
   }
   public void setBobotNilai(float a){
       this.bobotNilai = a;
   }
   public String getMataPelajaran(){
       return nama_mapel;
   }
   public float getKKM(){
       return kkm;
   }
   public float getBobotNilai(){
       return bobotNilai;
   }
   public void listMapel() {
       
   }
}
