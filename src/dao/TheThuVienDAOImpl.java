package dao;

import java.sql.*;
import java.sql.Date;
import java.util.*;

import model.*;

public class TheThuVienDAOImpl implements TheThuVienDAO {

	@Override
	public List<TheThuVien> getList() {
		Connection conn = SQLConnect.getConnection();
		String sql = "Select *from TheThuVien";
		List<TheThuVien> list = new Vector<TheThuVien>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				TheThuVien ttt = new TheThuVien();
				ttt.setMathe(rs.getString("MaThe"));
				ttt.setNgaybatdau(rs.getDate("NgayBatDau"));
				ttt.setNgaykethuc(rs.getDate("NgayKetThuc"));
				ttt.setGhichu(rs.getString("GhiChu"));
				ttt.setMadocgia(rs.getString("MaDocGia"));
				list.add(ttt);
			}
			ps.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
return list;
		
	}

	@Override
	public int Insert(TheThuVien ttt) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Insert into TheThuVien values(?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ttt.getMathe());
			ps.setDate(2,  (Date) ttt.getNgaybatdau());
			ps.setDate(3, (Date) ttt.getNgaykethuc());
			ps.setString(4, ttt.getGhichu());
			ps.setString(5, ttt.getMadocgia());
			ps.executeUpdate();
			ps.close();
			conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		return 0;
	}

	@Override
	public int Update(TheThuVien ttt) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Update TheThuVien set MaThe=?,NgayBatDau=?,NgayKetThuc=?,GhiCHu=?,MaDocGia=? where mathe=? and Madocgia=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, ttt.getMathe());
			ps.setDate(2, (Date) ttt.getNgaybatdau());
			ps.setDate(3, (Date)ttt.getNgaykethuc());
			ps.setString(4, ttt.getGhichu());
			ps.setString(5, ttt.getMadocgia());
			ps.setString(6, ttt.getMathe());
			ps.setString(7, ttt.getMadocgia());
			ps.executeUpdate();
			ps.close();
			conn.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		return 0;
	}
	

}
