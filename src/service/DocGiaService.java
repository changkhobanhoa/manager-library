package service;
import java.util.*;
import model.*;
public interface DocGiaService {
public List<DocGia> getList();
public int Update(DocGia dg);
public int Insert(DocGia dg);
}
