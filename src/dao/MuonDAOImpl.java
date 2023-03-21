package dao;

import java.sql.*;
import java.sql.Date;
import java.util.*;
import model.Muon;

public class MuonDAOImpl implements MuonDAO {
	@Override
	public List<Muon> getList() {
		Connection conn = (Connection) SQLConnect.getConnection();
		String sql = "Select*from Muon";
		List<Muon> list = new Vector<Muon>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Muon m = new Muon();
				m.setMaSach(rs.getString("MaSach"));
				m.setMathe(rs.getString("MaThe"));
				m.setMathuthu(rs.getString("MaThuThu"));
				m.setNgayMuon(rs.getDate("NgayMuon"));
				list.add(m);

			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int Update(Muon m) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Update Muon set MaThe=?,MaThuTHu=?,MaSach=?,NgayMuon=? where MaThe=? and MaThuThu=? and MaSach=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, m.getMathe());
			ps.setString(2, m.getMathuthu());
			ps.setString(3, m.getMaSach());
			ps.setDate(4, (Date) m.getNgayMuon());
			ps.setString(5, m.getMathe());
			ps.setString(6, m.getMathuthu());
			ps.setString(7, m.getMaSach());
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int Insert(Muon m) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Insert into Muon values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, m.getMathe());
			ps.setString(2, m.getMathuthu());
			ps.setString(3, m.getMaSach());
			ps.setDate(4, (Date) m.getNgayMuon());
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int tinhToan(String t, String t1, String t2) {
		int result = 0;
		try {

			Connection conn = SQLConnect.getConnection();
			String sql = "select dbo.tinhtoan(?,?,?) ";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, t);
			ps.setString(2, t1);
			ps.setString(3, t2);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = (rs.getInt(""));
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
