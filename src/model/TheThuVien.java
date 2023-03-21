package model;

import java.io.Serializable;
import java.sql.*;

public class TheThuVien implements Serializable {
	private static final long serialVersionUID = 1L;
	private String mathe;
	private Date ngaybatdau;
	private Date ngaykethuc;
	private String ghichu;
	private String madocgia;

	public TheThuVien() {

	}

	public TheThuVien(String mathe, Date ngaybatdau, Date ngaykethuc, String ghichu, String madocgia) {
		this.mathe = mathe;
		this.ngaybatdau = ngaybatdau;
		this.ngaykethuc = ngaykethuc;
		this.ghichu = ghichu;
		this.madocgia = madocgia;
	}

	public String getMathe() {
		return mathe;
	}

	public void setMathe(String mathe) {
		this.mathe = mathe;
	}

	public Date getNgaybatdau() {
		return ngaybatdau;
	}

	public void setNgaybatdau(Date ngaybatdau) {
		this.ngaybatdau = ngaybatdau;
	}

	public Date getNgaykethuc() {
		return ngaykethuc;
	}

	public void setNgaykethuc(Date ngaykethuc) {
		this.ngaykethuc = ngaykethuc;
	}

	public String getGhichu() {
		return ghichu;
	}

	public void setGhichu(String ghichu) {
		this.ghichu = ghichu;
	}

	public String getMadocgia() {
		return madocgia;
	}

	public void setMadocgia(String madocgia) {
		this.madocgia = madocgia;
	}

}
