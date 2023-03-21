package utility;

import java.util.List;
import javax.swing.table.DefaultTableModel;

import model.*;

public class ClassTableModel {
	public DefaultTableModel setTableSach(List<Sach> listitem, String[] listColumn) {
		int columns = listColumn.length;
		DefaultTableModel dtm = new DefaultTableModel() {
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int rowIndex, int colIdenx) {
				return false;
			}

		};
		dtm.setColumnIdentifiers(listColumn);
		Object[] obj = null;
		int num = listitem.size();
		for (int i = 0; i < num; i++) {
			Sach s = listitem.get(i);
			obj = new Object[columns];
			obj[0] = s.getMASACH();
			obj[1] = (i + 1);
			obj[2] = s.getTENSACH();
			obj[3] = s.getTOMTAT();
			obj[4] = s.getSOTRANG();
			obj[5] = s.getDONGIA();
			obj[6] = s.getNAMXUATBAN();
			obj[7] = s.getTACGIA();
			obj[8] = s.getTHELOAI();
			obj[9] = s.getNHAXUATBAN();
			dtm.addRow(obj);
		}
		return dtm;
	}

	public DefaultTableModel setTableThuThu(List<ThuThu> listitem, String[] listColumn) {
		int columns = listColumn.length;
		DefaultTableModel dtm = new DefaultTableModel() {
			private static final long serialVersionUID = 1L;
			@Override
			public boolean isCellEditable(int rowIndex, int colIdenx) {
				return false;
			}
		};
		dtm.setColumnIdentifiers(listColumn);
		Object[] obj = null;
		int num = listitem.size();
		ThuThu tt = null;
		for (int i = 0; i < num; i++) {
			tt = listitem.get(i);
			obj = new Object[columns];
			obj[0] = tt.getMaThuThu();
			obj[1] = i + 1;
			
			obj[2] = tt.getHoDem();
			obj[3] = tt.getTen();
			obj[4]=tt.isGioiTinh()==true?"Nam":"Nữ";
			obj[5] = tt.getDiaChi();
			obj[6] = tt.getMaTk();
			dtm.addRow(obj);
		}
		return dtm;
	}

	public DefaultTableModel setTableMuon(List<Muon> listitem, String[] listColumn) {
		int columns = listColumn.length;
		DefaultTableModel dtm = new DefaultTableModel() {
			private static final long serialVersionUID = 1L;
			@Override
			public boolean isCellEditable(int rowIndenx, int colIdenx) {
				return false;
			}
		};
		dtm.setColumnIdentifiers(listColumn);
		Object[] obj = null;
		int num = listitem.size();
		if(num>0) {
		for (int i = 0; i < num; i++) {
			 Muon m = listitem.get(i);
			obj = new Object[columns];
			obj[0]=i+1;
			obj[1] = m.getMathe();
			obj[2] = m.getMathuthu();
			obj[3] = m.getMaSach();
			obj[4] = m.getNgayMuon();
			dtm.addRow(obj);
		}
		}
		return dtm;
	}

	public DefaultTableModel setTableTra(List<Tra> listitem, String[] listColumn) {
		int columns = listColumn.length;
		DefaultTableModel dtm = new DefaultTableModel() {
			private static final long serialVersionUID = 1L;

			@Override
			public boolean isCellEditable(int rowIndenx, int colIdenx) {
				return false;
			}
		};
		dtm.setColumnIdentifiers(listColumn);
		Object[] obj = null;
		int num = listitem.size();
		if(num>0) {
		for (int i = 0; i < num; i++) {
			Tra t = listitem.get(i);
			obj = new Object[columns];
			obj[0]=i+1;
			obj[1] = t.getMathe();
			obj[2]=t.getMathuthu();
			obj[3] = t.getMasach();
			obj[4] = t.getNgaytra();
	
			
			dtm.addRow(obj);
		}
		}
		return dtm;
	}
public DefaultTableModel setTableDocGia(List<DocGia>listitem,String[] listColumn) {
	int columns = listColumn.length;
	DefaultTableModel dtm = new DefaultTableModel() {
		private static final long serialVersionUID = 1L;

		@Override
		public boolean isCellEditable(int rowIndenx, int colIdenx) {
			return false;
		}
		 
	};
	dtm.setColumnIdentifiers(listColumn);
	Object[] obj =null;
	int num = listitem.size();
	DocGia dg=null;
	if(num>0) {
	for (int i = 0; i <num; i++) {
		dg= listitem.get(i);
		obj = new Object[columns];
		obj[0]=dg.getMaDocGia();
		obj[1]=i+1;
		obj[2]=dg.getHodem();
		obj[3]=dg.getTen();
		obj[4]=dg.getSdt();
		obj[5]=dg.getNgaysinh();
		obj[7]=dg.getDiachi();
		obj[6]=dg.isGioitinh()==true?"Nam":"Nữ";
		obj[8]=dg.getMaloaidocgia();
			dtm.addRow(obj);
	}}
	return dtm;
}
public DefaultTableModel setTableThe(List<TheThuVien>listitem,String []listColumn) {
	int columns = listColumn.length;
	DefaultTableModel dtm = new DefaultTableModel() {
		private static final long serialVersionUID = 1L;

		@Override
		public boolean isCellEditable(int rowIndenx, int colIdenx) {
			return false;
		}
	};
	dtm.setColumnIdentifiers(listColumn);
	Object[] obj = null;
	int num = listitem.size();
	TheThuVien ttt= null;
	if(num>0) {
	for (int i = 0; i <num; i++) {
		ttt=listitem.get(i);
		obj= new Object[columns];
		obj[0]=ttt.getMathe();
		obj[1]=i+1;
		obj[2]=ttt.getNgaybatdau();
		obj[3]=ttt.getNgaykethuc();
		obj[4]=ttt.getGhichu();
		obj[5]=ttt.getMadocgia();
		dtm.addRow(obj);
	}}
	return dtm;
}
}