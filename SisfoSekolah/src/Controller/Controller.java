/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Controller;

import GUI.login;
import Model.Koneksi;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Controller implements ActionListener{
    private login view;
    Koneksi kn = new Koneksi() ;
    
    public Controller() {
        view = new login();
        view.addActionListener(this);
        view.setVisible(true);
    };

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        if (source.equals(view.getBtnLogin())) {
            String username = view.getTfUser() ;
            String password = view.getTfPass() ;
            String loginAs = view.getUser() ;
            login(username, password, loginAs) ;
        }
    }
    
    public boolean login(String username, String password, String loginAs) {
        try {
            Statement stmt = (Statement) kn.getKoneksi().createStatement() ;
            String sql = "SELECT * FROM user WHERE username ='"+username+"' AND password = '"+password+"' AND enroll ='"+loginAs+"'" ;
            ResultSet rs = stmt.executeQuery(sql) ;
            if (rs.next()) {
                if (username.equals(rs.getString("username")) && password.equals(rs.getString("password"))) {
                    if (loginAs == "Siswa") {
                        view.dispose();
                        new ControllerSiswa();
                    } else if (loginAs == "Guru") {
                        view.dispose();
                        new ControllerGuru();
                    } else if (loginAs == "Admin") {
                        view.dispose();
                        new ControllerAdmin();
                    }
                }
            }else {
                        JOptionPane.showMessageDialog(null,"Data user tidak ditemukan") ;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e.getMessage()) ;
        }
        return false ;
    }
}