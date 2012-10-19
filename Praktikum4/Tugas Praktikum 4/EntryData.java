/*
* NIM : 4510210039
* Nama : Febri Damatraseta Fairuz
*/
import javax.swing.*;
import java.awt.*;

public class EntryData {	
	public static void main(String[] xx){
		//bikin label
		JLabel lbHeader = new JLabel("Entry Data");
		JLabel lbNim = new JLabel("NIM");
		JLabel lbNama = new JLabel("Nama");
		JLabel lbHobi = new JLabel ("Hobi");
		JLabel lbJenKel = new JLabel ("Jenis Kelamin");
		
		//bikin text field
		JTextField tfNim = new JTextField(20);
        JTextField tfNama = new JTextField(20);
		
		//bikin checkbox
		JCheckBox futsal = new JCheckBox("Futsal");
		JCheckBox basket = new JCheckBox ("Basket");
		JCheckBox singing = new JCheckBox("Singing");
		
		//bikin radio button
		ButtonGroup buttonGroup = new ButtonGroup();
		JRadioButton pria, wanita;
		pria = new JRadioButton ("Pria");
		buttonGroup.add(pria);
		wanita = new JRadioButton("Wanita");
		buttonGroup.add(wanita);
		pria.setSelected(true);		
		
		//bikin button
		ImageIcon picSimpan = new ImageIcon("images/pic-ok.gif");
		ImageIcon picBatal = new ImageIcon("images/pic-cancel.gif");
		JButton btnSimpan = new JButton("Simpan",picSimpan);
        JButton btnBatal = new JButton("Batal",picBatal); 
	
		//panel
		JPanel canvas = new JPanel(new BorderLayout());
		JPanel section = new JPanel(new GridLayout(4,2));
		JPanel top = new JPanel();
		JPanel center = new JPanel();
		JPanel bottom = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel panel4 = new JPanel();
		JPanel panel3 = new JPanel(new FlowLayout(FlowLayout.LEADING));		
		JPanel panel5 = new JPanel();
		JPanel panel6 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel panel7 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel panelHobi = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel panelKelamin = new JPanel(new FlowLayout(FlowLayout.LEADING));
		
		//pembungkusan
		canvas.add(top, BorderLayout.NORTH);
		canvas.add(center, BorderLayout.WEST);
		canvas.add(bottom, BorderLayout.SOUTH);
		
		top.add(panel1);
		
		center.add(section);
		
		section.add(panel2);
		section.add(panel4);
		section.add(panel3);
		section.add(panel5);
		section.add(panel6);
		section.add(panelHobi);
		section.add(panel7);
		section.add(panelKelamin);		
		
		bottom.add(btnSimpan);
		bottom.add(btnBatal);
		
		//panel
		panel1.add(lbHeader);
		panel2.add(lbNim);
		panel3.add(lbNama);
		panel4.add(tfNim);
		panel5.add(tfNama);
		panel6.add(lbHobi);
		panel7.add(lbJenKel);
		panelHobi.add(futsal);
		panelHobi.add(futsal);
		panelHobi.add(basket);
		panelHobi.add(singing);
		panelKelamin.add(pria);
		panelKelamin.add(wanita);
		
		//buat frame
		// menginstankan Frame
        JFrame fr = new JFrame("Belajar Layout");
		
		fr.getContentPane().add(canvas);
        // ukuran frame
        fr.setSize(500,300);		
		
        // posisi di tengah
        fr.setLocationRelativeTo(null);
        
        // tampilkan
        fr.setVisible(true);
		//sampai sini
	}
}
