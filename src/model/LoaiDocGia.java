package model;

public class LoaiDocGia {
private String maloaidocgia;
private String tenloai;
private int gioihansachmuon;
public LoaiDocGia() {
	
}
public LoaiDocGia(String maloaidocgia, String tenloai, int gioihansachmuon) {
	super();
	this.maloaidocgia = maloaidocgia;
	this.tenloai = tenloai;
	this.gioihansachmuon = gioihansachmuon;
}
public String getMaloaidocgia() {
	return maloaidocgia;
}
public void setMaloaidocgia(String maloaidocgia) {
	this.maloaidocgia = maloaidocgia;
}
public String getTenloai() {
	return tenloai;
}
public void setTenloai(String tenloai) {
	this.tenloai = tenloai;
}
public int getGioihansachmuon() {
	return gioihansachmuon;
}
public void setGioihansachmuon(int gioihansachmuon) {
	this.gioihansachmuon = gioihansachmuon;
}

}
