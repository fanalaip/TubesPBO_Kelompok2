/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Model;

import java.sql.*;
import java.util.*;

public class Database {
    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/dbsisfo";
    private static final String USER = "root";
    private static final String PASS = "";
    
    private static Connection conn;
    private static Statement stmt;
    private static ResultSet rs;
    private String sql;
    
    private ArrayList<kelas> listKelas = new ArrayList();
    private ArrayList<siswa> listSiswa = new ArrayList();
    private ArrayList<matapelajaran> listMapel = new ArrayList();
    
    public Database() {
        loadSiswa();
        loadMapel();
        loadKelas();
    }

    public void connect() throws SQLException, ClassNotFoundException{
        Class.forName(JDBC_DRIVER);
        conn = DriverManager.getConnection(DB_URL,USER,PASS);
        stmt = conn.createStatement();
    }
    
    public void disconnect() throws SQLException {
        stmt.close();
        conn.close();
    }
    
    public Connection getConn() {
        return conn;
    }

    public ResultSet getRs() {
        return rs;
    }
    
    public Statement getStmt() {
        return stmt;
    }

    public static void setRs(ResultSet rs) {
        Database.rs = rs;
    }


    public void loadSiswa() {
        try {
           connect();
           sql = "SELECT * FROM mahasiswa";
           rs = stmt.executeQuery(sql);
           siswa m;
           while (rs.next()) {
               m = new siswa(
                   rs.getString("nis"),
                   rs.getString("nama_mhs")
               );
            listSiswa.add(m);
           }
           disconnect();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    public void loadKelas() {
        try {
           connect();
           sql = "SELECT * FROM ruangan"
                   + " natural join gedung";
           rs = stmt.executeQuery(sql);
           kelas m;
           while (rs.next()) {
               m = new kelas(
                   rs.getString("kode_gedung"),
                   rs.getString("nama_gedung"),
                   rs.getString("NO_Ruangan"),
                   rs.getInt("kapasitas")
               );
            listKelas.add(m);
           }
           disconnect();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    public void loadMapel() {
        try {
           connect();
           sql = "SELECT * FROM mata_kuliah NATURAL JOIN dosen";
           rs = stmt.executeQuery(sql);
           matapelajaran m;
           guru g;
           while (rs.next()) {
                g = new guru(
                    rs.getString("nid"), 
                    rs.getString("nama_dosen"));
                m = new matapelajaran(
                    rs.getString("kode_MK"),
                    rs.getString("nama_MK"),
                    rs.getString("SKS"),
                    g
                );
                listMapel.add(m);
           }
           disconnect();
       } catch (Exception e) {
           e.printStackTrace();
       }
    }

    public ArrayList<kelas> getListRuangan() {
        return listKelas;
    }

    public ArrayList<siswa> getListMahasiswa() {
        return listSiswa;
    }

    public ArrayList<matapelajaran> getListMatkul() {
        return listMapel;
    }
}
