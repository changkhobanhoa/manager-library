package dao;
import model.*;
import java.util.List;

public interface SachDao {
 public List<Sach> getList();
public int Update(Sach s);
public int Insert(Sach s);
}


