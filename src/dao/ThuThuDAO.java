package dao;

import java.util.List;

import model.ThuThu;

public interface ThuThuDAO {
	public List<ThuThu> getList();
	public int Update(ThuThu dg);
	public int Insert(ThuThu dg);
}
