package belajar.table.tugas;

import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.table.*;
import javax.swing.table.TableRowSorter;
import javax.swing.event.*;

public class Tugas_Tujuh{
	private static final JTable tabel = new JTable();
	private static final List<Produk> dataProduk = Data();
	
	public static void main(String[] args){
		JPanel panel = new JPanel(new BorderLayout());		
		JPanel panel2= new JPanel();
		
		JTextField tfFilter = new JTextField(30);
		panel2.add(new Label("Filter"));
		panel2.add(tfFilter);
		panel.add(panel2,BorderLayout.NORTH);
		
		JButton bFilter = new JButton("Filter");
		panel.add(bFilter,BorderLayout.SOUTH);
		
		TabelModel tModel = new TabelModel(dataProduk);
		tabel.setModel(tModel);
		
		JScrollPane scrTabel = new JScrollPane(tabel);
		panel.add(scrTabel,BorderLayout.CENTER);
			
		JFrame fr = new JFrame("Sorting JTabel - Tugas 7");
		fr.getContentPane().add(panel);
		fr.setSize(400,300);
		fr.setResizable(false);
		fr.setLocationRelativeTo(null);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fr.setVisible(true);
	}
	
	private static List<Produk> Data(){
		List<Produk> dtProduk = new ArrayList<Produk>();
		
		Produk p1 = new Produk();
		p1.setSimbol("AMZN");
		p1.setNama("Amazon");
		p1.setHarga(4128);
		dtProduk.add(p1);
		
		Produk p2 = new Produk();
		p2.setSimbol("EBAY");
		p2.setNama("eBay");
		p2.setHarga(1157);
		dtProduk.add(p2);
		
		Produk p3 = new Produk();
		p3.setSimbol("GOOG");
		p3.setNama("Google");
		p3.setHarga(38833);
		dtProduk.add(p3);
		
		Produk p4 = new Produk();
		p4.setSimbol("ACR");
		p4.setNama("ACER");
		p4.setHarga(1234);
		dtProduk.add(p4);
		
		Produk p5 = new Produk();
		p5.setSimbol("ASU");
		p5.setNama("ASUS");
		p5.setHarga(5678);
		dtProduk.add(p5);
		
		Produk p6 = new Produk();
		p6.setSimbol("HP");
		p6.setNama("HP");
		p6.setHarga(9876);
		dtProduk.add(p6);
		
		return dtProduk;
	}
}