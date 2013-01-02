package com.project.jasper;

import java.io.InputStream;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.xml.JRXmlLoader;

public class ReportDaftarProduct{
	private static String templateReport
		= "/Daftar-Product.jrxml";

	public static void main(String[] xx) throws Exception {
		// 1. Load template
		InputStream template = 
			ReportDaftarProduct.class
			.getResourceAsStream(templateReport);

		JasperDesign jd = JRXmlLoader.load(template);

		// 2. Compile
		JasperReport report 
			= JasperCompileManager.compileReport(jd);

		// 3. Isi data
		List<Product> daftarProduct = buatSampleData();
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("tahun", 2012);

		JasperPrint jrprint = 
				JasperFillManager.fillReport(report,
                params, 
                new JRBeanCollectionDataSource(
                	daftarProduct));

		// 4. Export
		JRPdfExporter exporter = new JRPdfExporter();
				
		exporter.setParameter(
			JRExporterParameter.JASPER_PRINT, 
			jrprint);

		exporter.setParameter(
			JRExporterParameter.OUTPUT_FILE_NAME, 
			"target/Daftar-Product-pdf");
		
		exporter.exportReport();
	}

	private static List<Product> buatSampleData(){
		// nantinya ini query dari database
		List<Product> hasil = new ArrayList<Product>();

		Product p1 = new Product();
		p1.setKode_barang("NPM-001");
		p1.setNama("Product 001");
		p1.setHarga(new BigDecimal("3.1"));
		hasil.add(p1);

		Product p2 = new Product();
		p2.setKode_barang("NPM-002");
		p2.setNama("Product 002");
		p2.setHarga(new BigDecimal("3.2"));
		hasil.add(p2);

		Product p3 = new Product();
		p3.setKode_barang("NPM-003");
		p3.setNama("Product 003");
		p3.setHarga(new BigDecimal("3.3"));
		hasil.add(p3);

		Product p4 = new Product();
		p4.setKode_barang("NPM-004");
		p4.setNama("Product 004");
		p4.setHarga(new BigDecimal("3.4"));
		hasil.add(p4);

		Product p5 = new Product();
		p5.setKode_barang("NPM-005");
		p5.setNama("Product 005");
		p5.setHarga(new BigDecimal("3.5"));
		hasil.add(p5);

		return hasil;

	}
}