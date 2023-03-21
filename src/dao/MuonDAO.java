package dao;

import java.util.List;

import model.Muon;

public interface MuonDAO {
public List<Muon>getList();
public int Update(Muon m);
public int Insert(Muon m);
}
