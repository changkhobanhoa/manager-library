package service;

import java.util.List;

import dao.*;
import model.ThuThu;

public class ThuThuServiceImpl implements ThuThuService {
private ThuThuDAO thuThuDao = null;
	@Override
	public List<ThuThu> getList() {
		return thuThuDao.getList();
	}
	public ThuThuServiceImpl() {
		this.thuThuDao= new ThuThuDAOImpl();
	}

	@Override
	public int Update(ThuThu tt) {
		return thuThuDao.Update(tt);
	}

	@Override
	public int Insert(ThuThu tt) {
		return thuThuDao.Insert(tt);
	}

}
