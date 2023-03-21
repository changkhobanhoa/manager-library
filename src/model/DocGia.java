package model;

import java.io.Serializable;
import java.sql.Date;

public class DocGia implements Serializable {

	private static final long serialVersionUID = 1L;
	private String MaDocGia;
	private String hodem, ten;
	private Date ngaysinh;
	private boolean gioitinh;
	private String sdt;
	private String diachi;
	private String maloaidocgia;

	public DocGia() {

	}

	public DocGia(String maDocGia, String hodem, String ten, Date ngaysinh, boolean gioitinh, String sdt, String diachi,
			String maloaidocgia) {
		MaDocGia = maDocGia;
		this.hodem = hodem;
		this.ten = ten;
		this.ngaysinh = ngaysinh;
		this.gioitinh = gioitinh;
		this.sdt = sdt;
		this.diachi = diachi;
		this.maloaidocgia = maloaidocgia;
	}

	public String getMaDocGia() {
		return MaDocGia;
	}

	public void setMaDocGia(String maDocGia) {
		MaDocGia = maDocGia;
	}

	public String getHodem() {
		return hodem;
	}

	public void setHodem(String hodem) {
		this.hodem = hodem;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public Date getNgaysinh() {
		return ngaysinh;
	}

	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}

	public boolean isGioitinh() {
		return gioitinh;
	}

	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getMaloaidocgia() {
		return maloaidocgia;
	}

	public void setMaloaidocgia(String maloaidocgia) {
		this.maloaidocgia = maloaidocgia;
	}

}
