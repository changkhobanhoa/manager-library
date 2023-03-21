package dao;

import java.sql.*;
import java.sql.Date;
import java.util.*;
import model.DocGia;

public class DocGiaDAOImpl implements DocGiaDAO {

	@Override
	public List<DocGia> getList() {
		Connection conn = SQLConnect.getConnection();
		String sql = "Select * from DocGia";
		List<DocGia> list = new Vector<DocGia>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				DocGia dg = new DocGia();
				dg.setMaDocGia(rs.getString("MaDocGia"));
				dg.setHodem(rs.getString("Hodem"));
				dg.setTen(rs.getString("Ten"));
				dg.setNgaysinh(rs.getDate("NgaySinh"));
				dg.setDiachi(rs.getString("DiaChi"));
				dg.setSdt(rs.getString("SDT"));
				dg.setMaloaidocgia(rs.getString("Maloaidocgia"));
				dg.setGioitinh(rs.getBoolean("GioiTinh"));
				list.add(dg);
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public int Update(DocGia dg) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "Update DocGia set MaDocGia=?,HoDem= ?,Ten=?,GioiTinh=?,NgaySinh=?,SDT=?,DiaCHi=?,MaLoaiDocGia=? where MADOCGIA=?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dg.getMaDocGia());
			ps.setString(2, dg.getHodem());
			ps.setString(3, dg.getTen());
			ps.setBoolean(4, dg.isGioitinh());
			ps.setDate(5, (Date) dg.getNgaysinh());
			ps.setString(6, dg.getSdt());
			ps.setString(7, dg.getDiachi());
			ps.setString(8, dg.getMaloaidocgia());
			ps.setString(9, dg.getMaDocGia());
			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int Insert(DocGia dg) {
		try {
			Connection conn = SQLConnect.getConnection();
			String sql = "insert into DocGia values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, dg.getMaDocGia());
			ps.setString(2, dg.getHodem());
			ps.setString(3, dg.getTen());
			ps.setBoolean(4, dg.isGioitinh());
			ps.setDate(5, (Date) dg.getNgaysinh());
			ps.setString(6, dg.getSdt());
			ps.setString(7, dg.getDiachi());
			ps.setString(8, dg.getMaloaidocgia());

			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return 0;
	}

	public int kTra(String t) {
		int result = 0;
		try {

			Connection conn = SQLConnect.getConnection();
			String sql = "select dbo.ktr(?) ";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, t);
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
	public int xoa(String t) {
		int result = 0;
		try {

			Connection conn = SQLConnect.getConnection();
			String sql = "select dbo.docgiaxoa(?) ";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, t);
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
