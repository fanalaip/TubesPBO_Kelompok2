/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Model;

import java.util.ArrayList;

public class kelas {
    
    private String nama_kelas;

    public void setNamaKelas(String nama_kelas){
        this.nama_kelas = nama_kelas;
    }
    public String getNamaKelas(){
        return nama_kelas;
    }
    
    public void kelasTujuh(Database db, String nama_siswa){
        try{
            db.connect();
            String sql = "SELECT nama_siswa FROM kelas WHERE  nama_kelas = '7A'";
            db.setRs(db.getStmt().executeQuery(sql));
            db.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void kelasDelapan(Database db, String nama_siswa){
        try{
            db.connect();
            String sql = "SELECT nama_siswa FROM kelas WHERE  nama_kelas = '8A'";
            db.setRs(db.getStmt().executeQuery(sql));
            db.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public void kelasSembilan(Database db, String nama_siswa){
        try{
            db.connect();
            String sql = "SELECT nama_siswa FROM kelas WHERE  nama_kelas = '9A'";
            db.setRs(db.getStmt().executeQuery(sql));
            db.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
