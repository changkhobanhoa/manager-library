package dao;
import java.util.List;

import model.TheThuVien;
public interface TheThuVienDAO {
public List<TheThuVien> getList();
public int Update(TheThuVien ttt);
public int Insert(TheThuVien ttt);
}
