package service;

import java.util.List;

import dao.TraDAO;
import dao.TraDAOImpl;
import model.Tra;

public class TraServiceImpl implements TraService {
private TraDAO traDao=null;
	@Override
	public List<Tra> getList() {
		return traDao.getList();
	}
	public TraServiceImpl() {
		this.traDao = new TraDAOImpl();
	}
	@Override
	public int Update(Tra t) {
	
		return traDao.Update(t);
	}
	@Override
	public int Insert(Tra t) {
		return traDao.Insert(t);
	}

}
