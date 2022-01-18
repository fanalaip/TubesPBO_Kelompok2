/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Model;

public class matapelajaran {
   private String nama_mapel;
   
   public matapelajaran(String nama_mapel) {
       this.nama_mapel = nama_mapel ;
   } 
   public void setMataPelajaran(String nama_mapel){
       this.nama_mapel = nama_mapel;
   }
   public String getMataPelajaran(){
       return nama_mapel;
   }
}
