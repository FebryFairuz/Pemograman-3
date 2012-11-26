import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Component;
import javax.swing.*;
import java.util.List;
import java.util.ArrayList;

public class tugas{
	private static final JComboBox cmbHobi = new JComboBox();
	private static JList listData = new JList();
	private static List<String> dftrHobi = new ArrayList<String>();
	private static final List<String> dftrHasil = new ArrayList<String>();
	
	public static void isiCombo(){
		DefaultComboBoxModel model = new DefaultComboBoxModel(dftrHobi.toArray());
		cmbHobi.setModel(model);
	}
	public static void tambahHobi(String data){
		dftrHobi.add(data);
		isiCombo();
	}
	public static void main (String[] xx){
		
		JPanel canvas = new JPanel(new BorderLayout());
		JPanel section = new JPanel(new BorderLayout());
		JPanel aside = new JPanel(new GridLayout(1,2));
		JPanel title = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel form  = new JPanel(new GridLayout(4,2));
		JPanel table = new JPanel();
		JPanel pNim = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel pNama = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel pHobi = new JPanel(new FlowLayout(FlowLayout.LEADING));
		JPanel ptNim = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel ptNama = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel cHobi = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel cHasil = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JPanel bSave = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JPanel bReset = new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		JLabel heading = new JLabel("Input Mahasiswa");
		JLabel nim = new JLabel("NIM");
		JLabel nama = new JLabel("Nama");
		JLabel hobi = new JLabel("Hobi");
		JLabel tes = new JLabel("Ini hasil Tabel List");
		
		final JTextField txtNim = new JTextField(15);
        final JTextField txtNama = new JTextField(15);		
		
		final JButton btnSave = new JButton("Save");
		JButton btnReset = new JButton("Reset");
		
		tambahHobi("-Pilih Hobi-");
		tambahHobi("berenang");
		tambahHobi("makan");
		
		canvas.add(title, BorderLayout.NORTH);
		canvas.add(section, BorderLayout.CENTER);
		section.add(aside);
		aside.add(form);
		aside.add(table);
		
		pNim.add(nim);
		pNama.add(nama);
		pHobi.add(hobi);
		ptNim.add(txtNim);
		ptNama.add(txtNama);
		cHobi.add(cmbHobi);
		bSave.add(btnSave);
		bReset.add(btnReset);
		
		title.add(heading);
		form.add(pNim);
		form.add(ptNim);
		form.add(pNama);
		form.add(ptNama);
		form.add(pHobi);
		form.add(cHobi);
		form.add(bSave);
		form.add(bReset);
		table.add(tes);
		table.add(listData);
		
		//buat frame
		// menginstankan Frame
        JFrame fr = new JFrame("Combo dan List");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.getContentPane().add(canvas);
        // ukuran frame
        fr.setSize(800,300);		
		
        // posisi di tengah
        fr.setLocationRelativeTo(null);
        
        // tampilkan
        fr.setVisible(true);
		//sampai sini
		
		class isiData implements ActionListener{
			public void actionPerformed(ActionEvent e){
				String hnim = txtNim.getText();
				System.out.println("Isi text nim : "+hnim);				
				
				String hnama = txtNama.getText();			
				System.out.println("Isi text nama : "+hnama);
				
				//JComboBox cbHobi = (JComboBox) e.getSource();
				//String hHobi = (String) cbHobi.getSelectedItem();
				String hHobi = (String) cmbHobi.getSelectedItem();
				System.out.println("Isi combo hobi : "+hHobi);
								
				Record re = new Record();
				re.setNim(hnim);
				re.setNama(hnama);
				re.setHobi(hHobi);
				//tambahListData(re);
				
				txtNim.setText("");
				txtNim.requestFocus();
				txtNama.setText("");
				txtNama.requestFocus();
				cmbHobi.setSelectedItem("-Pilih Hobi-");
				cmbHobi.requestFocus();
			}
		}

		//pasang listener
		isiData hisi = new isiData();
		btnSave.addActionListener(hisi);
		
	}
}
