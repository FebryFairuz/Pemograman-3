package belajar.swing.container;

import javax.swing.JFrame;
import javax.swing.JDialog;

public class BelajarDialog{
	public static void main(String[] xx)throws Exception{
		//membuat frame
		//membuat object fr yang bertipe JFrame
		JFrame fr = new JFrame();
		
		//Judul Frame
		fr.setTitle("Belajar Dislog");
		
		//ukurannya
		fr.setSize(800,600);
		
		//posisi frame ditengah
		fr.setLocationRelativeTo(null);
		
		//setelah melakukan compile jika frame sudah diexit maka compile pun berhenti
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		fr.setVisible(true);
		
		//membuat file dialog		
		JDialog jd = new JDialog(fr);
		jd.setSize(200,200);
		jd.setTitle("Dialog Box");
		
		//frame induk tak bisa dioperasikan
		jd.setModal(true);
		fr.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
		
		//delay dulu 5 detik
		Thread.sleep(5*1000);
		
		//tampilkan dialog
		jd.setVisible(true);
	}
}