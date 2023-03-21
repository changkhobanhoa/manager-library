package dao;

import java.util.List;
import java.util.Vector;
import java.sql.*;
import model.ThuThu;

public class ThuThuDAOImpl implements ThuThuDAO {

	@Override
	public List<ThuThu> getList() {
		Connection conn = SQLConnect.getConnection();
		String sql = "Select *from ThuThu";
		List<ThuThu> list = new Vector<ThuThu>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				ThuThu t = new ThuThu();
				t.setMaThuThu(rs.getString("MaThuThu"));
				t.setHoDem(rs.getString("HoDem"));
				t.setTen(rs.getString("Ten"));
				t.setGioiTinh(rs.getBoolean("GioiTinh"));
				t.setDiaChi(rs.getString("DiaChi"));
				t.setMaTk(rs.getString("MaTK"));
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
	public int Update(ThuThu t) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Update ThuThu set MaThuThu=?,HoDem=?,Ten=?,GioiTinh=?,DiaChi=?,MaTk=? where MaThuThu=? or MaTK=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, t.getMaThuThu());
			ps.setString(2, t.getHoDem());
			ps.setString(3, t.getTen());
			ps.setBoolean(4, t.isGioiTinh());
			ps.setString(5, t.getDiaChi());
			ps.setString(6, t.getMaTk());
			ps.setString(7, t.getMaThuThu());
			ps.setString(8, t.getMaTk());
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int Insert(ThuThu t) {
		try {
		Connection conn = SQLConnect.getConnection();
		String sql ="insert into ThuThu values(?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, t.getMaThuThu());
		ps.setString(2, t.getHoDem());
		ps.setString(3, t.getTen());
		ps.setBoolean(4, t.isGioiTinh());
		ps.setString(5, t.getDiaChi());
		ps.setString(6, t.getMaTk());
		ps.executeUpdate();
		ps.close();
		conn.close();
		}catch (Exception e) {

		e.printStackTrace();}
		return 0;
	}

}
