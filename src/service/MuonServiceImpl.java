package service;

import java.util.List;

import dao.MuonDAO;
import dao.MuonDAOImpl;
import model.Muon;

public class MuonServiceImpl implements MuonService {
	private MuonDAO muonDao = null;

	@Override
	public List<Muon> getList() {
		return muonDao.getList();
	}

	public MuonServiceImpl() {
		this.muonDao = new MuonDAOImpl();
	}

	@Override
	public int Update(Muon m) {
		return muonDao.Update(m);
	}

	@Override
	public int Insert(Muon m) {
		return muonDao.Insert(m);
	}

}
