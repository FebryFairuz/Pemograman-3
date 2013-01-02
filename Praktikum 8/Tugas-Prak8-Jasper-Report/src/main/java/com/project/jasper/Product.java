package com.project.jasper;

import java.math.BigDecimal;

public class Product {
	private String kode_barang;
	private String nama;
	private BigDecimal harga;

	public String getKode_barang(){
		return npm;
	}

	public void setKode_barang(String kode_barang){
		this.kode_barang = kode_barang;
	}

	public String getNama(){
		return nama;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public BigDecimal getHarga(){
		return harga;
	}

	public void setHarga(BigDecimal harga){
		this.harga = harga;
	}
}