/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
 
package Model;
import java.sql.*;
import javax.swing.JOptionPane;

public class Connection {

    private String driver = "com.mysql.cj.jdbc.Driver";
    private String host = "jdbc:mysql://localhost:3306/dbsisfo";
    private String user = "root";
    private String pass = "";
    private Connection koneksi;

    public Connection getKoneksi() {
        //Connect ke koneksi
        try {
            Class.forName(driver);
        }catch(ClassNotFoundException ce){
            JOptionPane.showMessageDialog(null, ce+"Gagal Connect ke driver");
        }
        
        //Connect ke database;
        try{
            koneksi = (Connection) DriverManager.getConnection(host,user,pass);
        }catch(SQLException ce){
            JOptionPane.showMessageDialog(null, ce+"Gagal Connect ke database");
        }
        return koneksi;
    }

    public void setKoneksi(Connection koneksi) {
        this.koneksi = koneksi;
    }
}
