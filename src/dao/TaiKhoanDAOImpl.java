package dao;
import java.sql.*;
import model.*;
public class TaiKhoanDAOImpl implements TaiKhoanDAO{

	@Override
	public TaiKhoan login(String tenDangNhap, String matKhau) {
		Connection cons= SQLConnect.getConnection();
		String sql = "Select * from TAIKHOAN where USERNAME like ? and PASSWORD like ?";
		TaiKhoan tk= null;
		try {
			PreparedStatement ps = (PreparedStatement)cons.prepareStatement(sql);
			ps.setString(1, tenDangNhap);
			ps.setString(2, matKhau);
			 ResultSet rs = ps.executeQuery();
			 if(rs.next()) {
				 tk = new TaiKhoan();
				 tk.setMatk(rs.getString("MATK"));
				 tk.setUsername(rs.getString("USERNAME"));
				 tk.setPassword(rs.getString("PASSWORD"));
			 }
			 ps.close();
			 cons.close();
			 return tk;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
