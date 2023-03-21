package dao;

import java.sql.*;
import model.*;
import java.util.*;

public class SachDaoImpl implements SachDao {

	@Override
	public List<Sach> getList() {
		Connection conn = SQLConnect.getConnection();
		String sql = "Select *From Sach";
		List<Sach> list = new Vector<>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Sach s = new Sach();
				s.setMASACH(rs.getString("MaSach"));
				s.setTENSACH(rs.getString("TENSACH"));
				s.setTOMTAT(rs.getString("TOMTAT"));
				s.setSOTRANG(rs.getInt("SOTRANG"));
				s.setDONGIA(rs.getInt("DONGIA"));
				s.setNAMXUATBAN(rs.getInt("NAMXUATBAN"));
				s.setTACGIA(rs.getString("TACGIA"));
				s.setTHELOAI(rs.getString("THELOAI"));
				s.setNHAXUATBAN(rs.getString("NHAXUATBAN"));
				list.add(s);
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int Update(Sach s) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Update Sach set MaSach=?,TenSach=?,TomTat=?,SoTrang=?,DOnGia=?,NAMXUATBAN=?,"
					+ "TACGIA=?,THELOAI=?,NHAXUATBAN=? where MaSach=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, s.getMASACH());
			ps.setString(2, s.getTENSACH());
			ps.setString(3, s.getTOMTAT());
			ps.setInt(4, s.getSOTRANG());
			ps.setInt(5, s.getDONGIA());
			ps.setInt(6, s.getNAMXUATBAN());
			ps.setString(7, s.getTACGIA());
			ps.setString(8, s.getTHELOAI());
			ps.setString(9, s.getNHAXUATBAN());
			ps.setString(10, s.getMASACH());
			
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int Insert(Sach s) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Insert into Sach values(?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, s.getMASACH());
			ps.setString(2, s.getTENSACH());
			ps.setString(3, s.getTOMTAT());
			ps.setInt(4, s.getSOTRANG());
			ps.setInt(5, s.getDONGIA());
			ps.setInt(6, s.getNAMXUATBAN());
			ps.setString(7, s.getTACGIA());
			ps.setString(8, s.getTHELOAI());
			ps.setString(9, s.getNHAXUATBAN());
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

}
