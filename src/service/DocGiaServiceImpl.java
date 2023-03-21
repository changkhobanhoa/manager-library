package service;

import java.util.List;

import dao.DocGiaDAO;
import dao.DocGiaDAOImpl;
import model.DocGia;

public class DocGiaServiceImpl  implements DocGiaService{
private DocGiaDAO docGiaDao=null;
	@Override
	public List<DocGia> getList() {
		return docGiaDao.getList();
	}
	public DocGiaServiceImpl() {
		this.docGiaDao = new DocGiaDAOImpl();
	}
	@Override
	public int Update(DocGia dg) {
		return docGiaDao.Update(dg);
	}
	@Override
	public int Insert(DocGia dg) {
		return docGiaDao.Insert(dg);
	}

}
