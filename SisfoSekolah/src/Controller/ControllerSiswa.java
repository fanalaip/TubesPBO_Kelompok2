/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Controller;

import GUI.guiSiswa;
import Model.Database;
import Model.siswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class ControllerSiswa implements ActionListener{
    private guiSiswa viewSiswa;           
    Database dbsisfo;
    private siswa siswa;  
    
    public ControllerSiswa(Database dbsisfo) {
        viewSiswa = new guiSiswa();
        viewSiswa.setVisible(true);
        viewSiswa.addActionListener(this);    
        this.dbsisfo = dbsisfo;
        combobox();
        viewSiswa.setVisible(true) ;        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void combobox() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
