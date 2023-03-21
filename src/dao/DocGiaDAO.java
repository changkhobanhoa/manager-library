package dao;
import java.util.List;

import model.*;
public interface DocGiaDAO {
public List<DocGia> getList();
public int Update(DocGia dg);
public int Insert(DocGia dg);
}
