/*
Topik   : Sekolah
Anggota : Arpriansah Yonathan (1301194112)
          Balqis Sayyidahtul Atikah (1301193480)
          Igga Febrian Virgiani (1301194283)
          Manuel Benedict (1301194182)
 */
package Controller;

import GUI.guiSiswa;
import Model.Koneksi;
import Model.kelas;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;

public class ControllerSiswa implements ActionListener{
    private guiSiswa viewSiswa;           
    private kelas kelas;  
    ArrayList<List> list = new ArrayList();
    private String nama_siswa;
    private String nis;
    
    Koneksi kn = new Koneksi() ;
    
    public ControllerSiswa() {
        viewSiswa = new guiSiswa();
        viewSiswa.setVisible(true);
        viewSiswa.addActionListener(this);  
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
            try {
                if (source.equals(viewSiswa.getButtonBack())) {
                    new Controller();
                    viewSiswa.dispose();
                } 
                else if (source.equals(viewSiswa.getBtnCariNIS())) {
                    try {
                        if (viewSiswa.getNIS().equals("")){
                            JOptionPane.showMessageDialog(null, "NIS harus diisi terlebih dahulu");
                        } else {
                            String NIS = viewSiswa.getNIS();
                            Display dis = new Display() ;
                            dis.DisplayNilai(viewSiswa.getjTableSiswa(), NIS) ;
                            kelas Class = dis.DisplayBio(NIS) ;
                            viewSiswa.getNama().setText(Class.getNama()); 
                            viewSiswa.getKelas().setText(Class.getNamaKelas()); 
                        }
                    } catch (Exception es) {
                        System.out.println("Error 404 "+ es.getMessage());
                        JOptionPane.showMessageDialog(null, "Data siswa tidak ditemukan");
                    }
                }else if(source.equals(viewSiswa.getBtnPilih())){
                    Display dis = new Display();
                    dis.DisplaySiswa(viewSiswa.getDaftarSiswa(), viewSiswa.getChooseKelas());
                }
            } catch (Exception ef) {
                JOptionPane.showMessageDialog(null, "Data siswa tidak ditemukan");
            }
    }
}


