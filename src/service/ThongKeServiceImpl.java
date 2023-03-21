package service;

import java.util.*;

import dao.*;
import model.*;

public class ThongKeServiceImpl implements ThongKeService {
private ThongKeDAO thongkedao=null;

	public ThongKeServiceImpl() {
	this.thongkedao = new ThongKeDAOImpl();
}

	@Override
	public List<Muon> getListByMuon() {
		
		return thongkedao.getListByMuon();
	}

	@Override
	public List<Tra> getListByTra() {
		
		return thongkedao.getListByTra();
	}

	@Override
	public List<Sach> getListBySach() {
		
		return thongkedao.getListBySach();
	}


}
