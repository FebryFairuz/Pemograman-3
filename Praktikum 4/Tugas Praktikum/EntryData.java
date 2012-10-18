import javax.swing.*;
import java.awt.*;

public class EntryData {
	public static void main(String[] xx){
		JLabel lbHeader = new JLabel("Entry Data");
		JLabel lbNim = new JLabel("NIM");
		JLabel lbNama = new JLabel("Nama");
		JLabel lbHobi = new JLabel ("Hobi");
		JLabel lbJenKel = new JLabel ("Jenis Kelamin");
		
		JCheckBox futsal = new JCheckBox("Futsal");
		JCheckBox basket = new JCheckBox ("Basket");
		JCheckBox singing = new JCheckBox("Singing");
		
		ButtonGroup buttonGroup = new ButtonGroup();
		JRadioButton pr, wa;
		pr = new JRadioButton ("Pria");
		buttonGroup.add(pr);
		wa = new JRadioButton("Wanita");
		buttonGroup.add(wa);
		pr.setSelected(true);
		
		JTextField tfNim = new JTextField(20);
        JTextField tfNama = new JTextField(20);
		
		JButton btnSimpan = new JButton("Simpan");
        JButton btnBatal = new JButton("Batal");
		
		
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
		JPanel panel8 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel panel9 = new JPanel(new FlowLayout(FlowLayout.LEADING));
		
		//inisialisasi
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
		section.add(panel8);
		section.add(panel7);
		section.add(panel9);		
		
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
		panel8.add(futsal);
		panel8.add(futsal);
		panel8.add(basket);
		panel8.add(singing);
		panel9.add(pr);
		panel9.add(wa);
		
		//buat frame
		// menginstankan Frame
        JFrame fr = new JFrame("Belajar Layout");
		
		fr.getContentPane().add(canvas);
        // ukuran frame
        fr.setSize(500,400);		
		
        // posisi di tengah
        fr.setLocationRelativeTo(null);
        
        // tampilkan
        fr.setVisible(true);
		//sampai sini
	}
}
