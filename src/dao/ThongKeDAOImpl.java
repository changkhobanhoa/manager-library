package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Vector;

import model.Muon;
import model.Sach;
import model.Tra;

public class ThongKeDAOImpl implements ThongKeDAO {

	@Override
	public List<Muon> getListByMuon() {
		Connection conn = SQLConnect.getConnection();
		String sql = "select ngaymuon ,count(muon.masach) as SOLUONG from Muon group by ngaymuon ";

		List<Muon> list = new Vector<Muon>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Muon m = new Muon();
				m.setNgayMuon(rs.getDate("ngaymuon"));
				m.setMaSach(rs.getString("SOLUONG"));
				list.add(m);
			}
			ps.close();
			conn.close();
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Tra> getListByTra() {
		Connection conn = SQLConnect.getConnection();
		String sql = "select ngaytra, count(masach) as SOLUONG from tra group by ngaytra";
		List<Tra> list = new Vector<Tra>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Tra t = new Tra();
				t.setNgaytra(rs.getDate("ngaytra"));
				t.setMasach(rs.getString("SOLUONG"));
				list.add(t);
			}
			ps.close();
			conn.close();
			return list;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Sach> getListBySach() {
		Connection conn = SQLConnect.getConnection();
		String sql = "select theloai, count(tensach) as SOSACH from sach group by theloai";
		List<Sach> list = new Vector<Sach>();
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Sach s = new Sach();
				s.setTHELOAI(rs.getString("theloai"));
				s.setTENSACH(rs.getString("SOSACH"));
				list.add(s);

			}
			ps.close();
			conn.close();
			return list;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;
	}




}
