package service;
import dao.*;
import model.TaiKhoan;

public class TaiKhoanServiceImpl implements TaiKhoanService {
	 public TaiKhoanDAO taikhoanDao=null;
	 public TaiKhoanServiceImpl() {
		 taikhoanDao= new TaiKhoanDAOImpl(); 
	 }
	@Override
	public TaiKhoan login(String tenDangNhap, String matKhau) {
	
		return taikhoanDao.login(tenDangNhap, matKhau);
	}
	
}
