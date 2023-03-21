package dao;

import java.sql.*;
import java.sql.Date;
import java.util.*;
import model.*;

public class TraDAOImpl implements TraDAO {

	@Override
	public List<Tra> getList() {
		Connection conn = SQLConnect.getConnection();
		String sql = "Select *From Tra";
		List<Tra> list = new Vector<Tra>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Tra t = new Tra();
				t.setNgaytra(rs.getDate("NgayTra"));
				t.setMathe(rs.getString("MaThe"));
				t.setMathuthu(rs.getString("MaThuThu"));
				t.setMasach(rs.getString("MaSach"));
				list.add(t);
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int Update(Tra t) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Update Tra set mathe=?,MaThuTHu=?,MaSach=?,Ngaytra=?where MaThe=? and MaSach=? and MaThuThu=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getMathe());
			ps.setString(2, t.getMathuthu());
			ps.setString(3, t.getMasach());
			ps.setDate(4, (Date) t.getNgaytra());
			ps.setString(5, t.getMathe());
			ps.setString(6, t.getMasach());
			ps.setString(7, t.getMathuthu());
			ps.executeUpdate();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int Insert(Tra t) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Insert into Tra values(?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getMathe());
			ps.setString(2, t.getMathuthu());
			ps.setString(3, t.getMasach());
			ps.setDate(4, (Date) t.getNgaytra());
			ps.executeUpdate();
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return 0;
	}

	public int tinhToan(String t, String t1,String t2) {
		int result = 0;
		try {

			Connection conn = SQLConnect.getConnection();
			String sql = "select dbo.tinhtoan(?,?,?) ";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, t);
			ps.setString(2, t1);
			ps.setString(3, t2);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
			result=(rs.getInt(""));
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
