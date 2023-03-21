package model;

import java.io.Serializable;
import java.sql.Date;

public class Muon implements Serializable {
	private static final long serialVersionUID = 1L;
	private String Mathe;
	private String mathuthu;
	private String maSach;
	private Date NgayMuon;

	public Muon() {
	}

	public Muon(String mathe, String mathuthu, String maSach, Date ngayMuon) {
		Mathe = mathe;
		this.mathuthu = mathuthu;
		this.maSach = maSach;
		NgayMuon = ngayMuon;
	}

	public String getMathe() {
		return Mathe;
	}

	public void setMathe(String mathe) {
		Mathe = mathe;
	}

	public String getMathuthu() {
		return mathuthu;
	}

	public void setMathuthu(String mathuthu) {
		this.mathuthu = mathuthu;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public Date getNgayMuon() {
		return NgayMuon;
	}

	public void setNgayMuon(Date ngayMuon) {
		NgayMuon = ngayMuon;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
	
