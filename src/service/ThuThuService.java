package service;

import java.util.List;

import model.ThuThu;

public interface ThuThuService {
public List<ThuThu>  getList();
	
public int Update(ThuThu tt);
public int Insert(ThuThu tt);
}
