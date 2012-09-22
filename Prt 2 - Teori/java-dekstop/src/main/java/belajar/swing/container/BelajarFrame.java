package belajar.swing.container;

import javax.swing.JFrame;

public class BelajarFrame{
	public static void main(String[] xx){
		//membuat object fr yang bertipe JFrame
		JFrame fr = new JFrame();
		
		//Judul Frame
		fr.setTitle("Belajar Frame");
		
		//ukurannya
		fr.setSize(800,600);
		
		//posisi frame ditengah
		fr.setLocationRelativeTo(null);
		
		//setelah melakukan compile jika frame sudah diexit maka compile pun berhenti
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//tidak ada decorasi
		//fr.setUndecorated(true);
		
		//mematikan maximise pada frame
		fr.setResizable(false);
		
		fr.setVisible(true);
	}
}