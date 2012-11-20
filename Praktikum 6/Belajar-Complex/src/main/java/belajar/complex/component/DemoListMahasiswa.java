package belajar.complex.component;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;

public class DemoListMahasiswa {
    private static JList listMhs = new JList();
    private static final List<Mahasiswa> dfrMhs = new ArrayList<Mahasiswa>();

    public static void isiCombo(){
        // data dimasukkan ke dalam class model
        DefaultComboBoxModel model = new DefaultComboBoxModel(dfrMhs.toArray());
        
        // pasang model di combo
        listMhs.setModel(model);
    }
    
    public static void tambahIsiList(Mahasiswa data){
        // data untuk ditampilkan dalam combo
        dfrMhs.add(data);
        isiCombo();
    }

    public static void main(String[] xx){
        Mahasiswa m = new Mahasiswa();
        m.setNpm("4510210039");
        m.setNama("Fairuz");
        tambahIsiList(m);
        
        final JTextField tfNpm = new JTextField(5);
        final JTextField tfNama = new JTextField(20);
        JButton btnTambah = new JButton("Tambah");
        
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.add(new JLabel("NPM : "));
        panel.add(tfNpm);
        panel.add(new JLabel("Nama : "));
        panel.add(tfNama);
        panel.add(btnTambah);
        
        JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout());
        
        panel2.add(listMhs);
        
        JPanel panel4 = new JPanel(new FlowLayout());
        panel4.add(new JLabel("Pilihan : "));
        final JTextField tfPilihan = new JTextField(20);
        tfPilihan.setEditable(false);
        panel4.add(tfPilihan);
        
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(3,1));
        
        panel3.add(panel);
        panel3.add(panel2);
        panel3.add(panel4);
        
        // menginstankan Frame
        JFrame fr = new JFrame("Belajar Combo");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        fr.getContentPane().add(panel3);
        // ukuran frame
        fr.setSize(800,200);
        
        // posisi di tengah
        fr.setLocationRelativeTo(null);
        
        // tampilkan
        fr.setVisible(true);
        
        // event handler untuk button
        class tmbhMhsList implements ActionListener{
            public void actionPerformed(ActionEvent e){
                String npm = tfNpm.getText();
                String nama = tfNama.getText();
                System.out.println("NPM : "+npm);
                System.out.println("Nama : "+nama);
                
                // tambahkan isinya ke dalam combo
                Mahasiswa x = new Mahasiswa();
                x.setNpm(npm);
                x.setNama(nama);
                tambahIsiList(x);
                
                // kosongkan textfield
                tfNama.setText("");
                tfNpm.setText("");
                tfNpm.requestFocus();
            }
        }
        
        // pasang event handler di button dan textfield
        tmbhMhsList l = new tmbhMhsList();
        btnTambah.addActionListener(l);
        
        // event handler untuk combo
        class PilihanListListener implements  ListSelectionListener {
            public void valueChanged(ListSelectionEvent e){
                JList l = (JList) e.getSource();
                int indexPilihan = l.getSelectedIndex();
                System.out.println("Pilihan : "+indexPilihan);
                
                if(indexPilihan < 0){
                    return; // tidak ada yang dipilih, lanjut saja
                }
                
                Mahasiswa x = dfrMhs.get(indexPilihan);
                tfPilihan.setText(x.getNpm() + " - "+x.getNama());
            }
        }
        
        // pasang listener di combo
        listMhs.addListSelectionListener(new PilihanListListener());
    }
}
