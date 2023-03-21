package model;

import java.io.Serializable;

public class Sach implements Serializable {
	private static final long serialVersionUID = 1L;
	private String MASACH;
	private String TENSACH;
	private String TOMTAT;
	private int SOTRANG;
	private int DONGIA;
	private int NAMXUATBAN;
	private String TACGIA, THELOAI, NHAXUATBAN;

	public Sach() {
	}

	public Sach(String mASACH, String tENSACH, String tOMTAT, int sOTRANG, int dONGIA, int nAMXUATBAN, String tACGIA,
			String tHELOAI, String nHAXUATBAN) {
		super();
		MASACH = mASACH;
		TENSACH = tENSACH;
		TOMTAT = tOMTAT;
		SOTRANG = sOTRANG;
		DONGIA = dONGIA;
		NAMXUATBAN = nAMXUATBAN;
		TACGIA = tACGIA;
		THELOAI = tHELOAI;
		NHAXUATBAN = nHAXUATBAN;
	}

	public String getMASACH() {
		return MASACH;
	}

	public void setMASACH(String mASACH) {
		MASACH = mASACH;
	}

	public String getTENSACH() {
		return TENSACH;
	}

	public void setTENSACH(String tENSACH) {
		TENSACH = tENSACH;
	}

	public String getTOMTAT() {
		return TOMTAT;
	}

	public void setTOMTAT(String tOMTAT) {
		TOMTAT = tOMTAT;
	}

	public int getSOTRANG() {
		return SOTRANG;
	}

	public void setSOTRANG(int sOTRANG) {
		SOTRANG = sOTRANG;
	}

	public int getDONGIA() {
		return DONGIA;
	}

	public void setDONGIA(int dONGIA) {
		DONGIA = dONGIA;
	}

	public int getNAMXUATBAN() {
		return NAMXUATBAN;
	}

	public void setNAMXUATBAN(int nAMXUATBAN) {
		NAMXUATBAN = nAMXUATBAN;
	}

	public String getTACGIA() {
		return TACGIA;
	}

	public void setTACGIA(String tACGIA) {
		TACGIA = tACGIA;
	}

	public String getTHELOAI() {
		return THELOAI;
	}

	public void setTHELOAI(String tHELOAI) {
		THELOAI = tHELOAI;
	}

	public String getNHAXUATBAN() {
		return NHAXUATBAN;
	}

	public void setNHAXUATBAN(String nHAXUATBAN) {
		NHAXUATBAN = nHAXUATBAN;
	}

}