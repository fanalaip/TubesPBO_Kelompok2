/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Controller;

import GUI.guiGuru;
import Model.Database;
import Model.guru;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class ControllerGuru extends MouseAdapter implements ActionListener {
    private guiGuru viewGuru;
    private Database db;
    
    public ControllerGuru(Database db) {
        this.db = db;
        viewGuru = new guiGuru();
        viewGuru.addActionListener(this);
        viewGuru.addMouseAdapter(this);
        //viewGuru.setDaftarMatkul(getMatkul());
        //combobox();
        viewGuru.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}