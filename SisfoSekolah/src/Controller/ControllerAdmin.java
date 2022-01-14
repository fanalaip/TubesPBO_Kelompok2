/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Controller;

import GUI.guiAdmin;
import Model.Database;
import Model.admin;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class ControllerAdmin extends MouseAdapter implements ActionListener {
    private guiAdmin viewAdmin;
    private admin adminModel;
    private Database dbsisfo;

    public ControllerAdmin(Database dbsisfo) {
        this.viewAdmin = viewAdmin;
        this.adminModel = adminModel;
        this.dbsisfo = dbsisfo;
        
        viewAdmin = new guiAdmin();
        viewAdmin.addActionListener(this);
        viewAdmin.addMouseAdapter(this);
        
        viewAdmin.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
