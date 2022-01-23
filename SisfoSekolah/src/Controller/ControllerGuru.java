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
import Model.Koneksi;
import Model.siswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ControllerGuru extends MouseAdapter implements ActionListener {
    private guiGuru viewGuru;
    private Database db;    
    private siswa student ;
    Koneksi kn = new Koneksi() ;
    
    public ControllerGuru(Database db) {
        this.db = db;
        viewGuru = new guiGuru();
        viewGuru.addActionListener(this);
        viewGuru.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        try {
            if (source.equals(viewGuru.getBtnBack())) {
                new Controller();
                viewGuru.dispose();
            } 
            else if (source.equals(viewGuru.getBtnAdd())) {
                try {
                        String nis = viewGuru.getTfNIS();
                        String nama_mapel = viewGuru.getCbMapelText();
                        String aktivitas = viewGuru.getCbTaskText();
                        String nilai = viewGuru.getTfNilai();
                        if ((nis == null) || nama_mapel == null || aktivitas == null || nilai == null ) {
                            JOptionPane.showMessageDialog(viewGuru, "Input Belum Benar");
                        }else if(nis != null && nama_mapel != null && aktivitas != null && nilai != null ){
                           addNilai(nis , nama_mapel, aktivitas, nilai);
                           JOptionPane.showMessageDialog(viewGuru, "Nilai berhasil diinput.");
                           viewGuru.resetView();  
                        }  
                } catch (Exception es) {
                    JOptionPane.showMessageDialog(null, "input salah" + es) ; 
                    es.printStackTrace();
                }
            }else if(source.equals(viewGuru.getBtnCari())){
                Display dis = new Display();
                dis.DisplaySiswa(viewGuru.getjTableSiswa(), viewGuru.getCbKelasText());
            }
        } catch (Exception ef) {
            JOptionPane.showMessageDialog(null, "Error");
        }
    }
    
    public void addNilai(String nis, String mapel, String activity, String nilai) {
        try {
            Statement stmt = (Statement) kn.getKoneksi().createStatement();
            String sql = "INSERT INTO nilai VALUES ('"
                    +nis+"','"
                    +mapel+"','"
                    +activity+"','"
                    +nilai+"')";
            stmt.executeUpdate(sql);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    } 
}