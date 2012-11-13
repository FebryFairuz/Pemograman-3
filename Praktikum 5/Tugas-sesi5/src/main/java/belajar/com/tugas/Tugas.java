/*
4510210039
Febri Damatraseta Fairuz
febryfairuz.wordpress.com
(c)Selasa 13 November 2012
*/

package belajar.com.tugas;

import java.awt.event.*;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.*;
import javax.swing.JOptionPane;

public class Tugas{
	public static void main(String args[]){
		//bikin button
		final JButton btnClick = new JButton("Click Me !");
	
		//panel
		JPanel canvas = new JPanel(new FlowLayout(FlowLayout.CENTER,0,70));
		
		//pembungkusan
		canvas.add(btnClick);
		
		//membuat listener
		class click implements ActionListener{
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(null,"You Click me guys..!!! (c)febryfairuz.wordpress.com");
				btnClick.setEnabled(true);
			}
		}		
		//pasang listener
		click c = new click();
		btnClick.addActionListener(c);
				
		//buat frame
		// menginstankan Frame
        JFrame fr = new JFrame("Tugas Sesi-05");
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.getContentPane().add(canvas);
        // ukuran frame
        fr.setSize(200,200);		
		
        // posisi di tengah
        fr.setLocationRelativeTo(null);
        
        // tampilkan
        fr.setVisible(true);
		//sampai sini
	}
}
