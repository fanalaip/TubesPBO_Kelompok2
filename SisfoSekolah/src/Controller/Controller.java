/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Controller;

import GUI.login;
import Model.Database;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Controller implements ActionListener{
    private login view;
    private Database db;
    
    public Controller() {
        view = new login();
        view.addActionListener(this);
        view.setVisible(true);
        db = new Database();
    };

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        if (source.equals(view.getBtnLogin())) {
            if (view.getUser() == "Siswa") {
                view.dispose();
                new ControllerSiswa(db);
            }
            else if (view.getUser() == "Guru") {
                view.dispose();
                new ControllerGuru(db);
            }
            else if (view.getUser() == "Admin") {
                view.dispose();
                new ControllerAdmin(db);
            }
        }
    }    
}

