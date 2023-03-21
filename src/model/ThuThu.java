package model;

public class ThuThu {
private String MaThuThu;
private String HoDem;
private String Ten;
private String DiaChi;
private boolean GioiTinh;
private String MaTk;
public ThuThu() {
	
}
public ThuThu(String maThuThu, String hoDem, String ten, String diaChi, boolean gioiTinh, String maTk) {
	MaThuThu = maThuThu;
	HoDem = hoDem;
	Ten = ten;
	DiaChi = diaChi;
	GioiTinh = gioiTinh;
	MaTk = maTk;
}
public String getMaThuThu() {
	return MaThuThu;
}
public void setMaThuThu(String maThuThu) {
	MaThuThu = maThuThu;
}
public String getHoDem() {
	return HoDem;
}
public void setHoDem(String hoDem) {
	HoDem = hoDem;
}
public String getTen() {
	return Ten;
}
public void setTen(String ten) {
	Ten = ten;
}
public String getDiaChi() {
	return DiaChi;
}
public void setDiaChi(String diaChi) {
	DiaChi = diaChi;
}
public boolean isGioiTinh() {
	return GioiTinh;
}
public void setGioiTinh(boolean gioiTinh) {
	GioiTinh = gioiTinh;
}
public String getMaTk() {
	return MaTk;
}
public void setMaTk(String maTk) {
	MaTk = maTk;
}


}
