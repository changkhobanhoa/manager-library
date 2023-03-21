package Controller;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Vector;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import dao.SQLConnect;
import model.ThuThu;
import service.ThuThuService;
import service.ThuThuServiceImpl;
import utility.ClassTableModel;

public class QuanLyThuThuController  implements MouseListener{
private JPanel pnView;
private JTextField txtSearch,txtMaThuThu,txtHodem,txtTen,txtGioiTinh,txtDiaChi,txtMaTK;
private JButton btAdd,btDelete,btInsert;

private ThuThuService thuThuService=null;
private final String []COLUMNS= {"STT","Mã Thủ Thư","Họ Đệm","Tên","Giới Tính","Địa Chỉ","Mã TK"};
public QuanLyThuThuController(JPanel pnView, JTextField txtSearch, JTextField txtMaThuThu, JTextField txtHodem,
		JTextField txtTen, JTextField txtGioiTinh, JTextField txtDiaChi,JTextField txtMaTK, JButton btAdd, JButton btDelete,
		JButton btInsert) {
	super();
	this.pnView = pnView;
	this.txtSearch = txtSearch;
	this.txtMaThuThu = txtMaThuThu;
	this.txtHodem = txtHodem;
	this.txtTen = txtTen;
	this.txtGioiTinh = txtGioiTinh;
	this.txtDiaChi = txtDiaChi;
	this.txtMaTK=txtMaTK;
	this.btAdd = btAdd;
	this.btDelete = btDelete;
	this.btInsert = btInsert;
	this.thuThuService=new ThuThuServiceImpl();
}
private TableRowSorter<TableModel>rowSorter=null;

private ThuThu tt=null;
private Vector<ThuThu>listItem;
private DefaultTableModel model;
private JTable table;
public void setDateToTable() {
	listItem=(Vector<ThuThu>)thuThuService.getList();
	model = new ClassTableModel().setTableThuThu(listItem, COLUMNS);
	table = new JTable(model);
	rowSorter= new TableRowSorter<>(table.getModel());
	table.setRowSorter(rowSorter);
	table.addMouseListener(this);
	txtSearch.getDocument().addDocumentListener(new DocumentListener() {

		@Override
		public void removeUpdate(DocumentEvent e) {
			String text = txtSearch.getText();
			if (text.trim().length() == 0) {
				rowSorter.setRowFilter(null);
			} else {
				rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
			}

		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			String text = txtSearch.getText();
			if (text.trim().length() == 0) {
				rowSorter.setRowFilter(null);
			} else {
				rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
			}
		}

		@Override
		public void changedUpdate(DocumentEvent e) {

		}
	});

	table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
	table.getTableHeader().setPreferredSize(new Dimension(100, 50));
	table.setRowHeight(50);
	table.validate();
	table.repaint();
	btAdd.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(txtMaThuThu.getText().equals("")||txtHodem.getText().equals("")||txtTen.getText().equals("")||txtDiaChi.getText().equals("")||txtGioiTinh.getText().equals("")||txtMaTK.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");
			}else {
			tt = new ThuThu(txtMaThuThu.getText(), txtHodem.getText(), txtTen.getText(), txtDiaChi.getText(), txtGioiTinh.getText().equals("Nam")?true:false, txtMaTK.getText());
			thuThuService.Insert(tt);
			JOptionPane.showMessageDialog(null, "Thêm Thành Công");
			setDateToTable();
		}
		}
	});
	btInsert.addActionListener(new  ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(txtMaThuThu.getText().equals("")||txtHodem.getText().equals("")||txtTen.getText().equals("")||txtDiaChi.getText().equals("")||txtGioiTinh.getText().equals("")||txtMaTK.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn đầy đủ thông tin");
			}else {
			tt = new ThuThu(txtMaThuThu.getText(), txtHodem.getText(), txtTen.getText(), txtDiaChi.getText(), txtGioiTinh.getText().equals("Nam")?true:false, txtMaTK.getText());
			thuThuService.Update(tt);
			JOptionPane.showMessageDialog(null, "Cập Nhật Thành Công");
			setDateToTable();			
		}
		}
	});
	btDelete.addActionListener(new  ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(txtMaThuThu.getText().equals("")||txtHodem.getText().equals("")||txtTen.getText().equals("")||txtDiaChi.getText().equals("")||txtGioiTinh.getText().equals("")||txtMaTK.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn đầy đủ thông tin");
			}else {
			String sql="Delete from ThuThu where MaThuThu=\'"+txtMaThuThu.getText()+"\'";
		try {
			Connection conn= SQLConnect.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Xóa Thành Công");
			setDateToTable();
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
			}
		}
	});
	JScrollPane scollPane = new JScrollPane();
	scollPane.getViewport().add(table);
	scollPane.setPreferredSize(new Dimension(1300, 400));
	pnView.removeAll();
	pnView.setLayout(new BorderLayout());
	pnView.add(scollPane);
	pnView.validate();
	pnView.repaint();

}

@Override
public void mouseClicked(MouseEvent e) {
	int selectedRowIndex = table.getSelectedRow();
	selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
	tt = (ThuThu)listItem.elementAt(selectedRowIndex);
	txtMaThuThu.setText(tt.getMaThuThu());
	txtHodem.setText(tt.getHoDem());
	txtTen.setText(tt.getTen());
	txtGioiTinh.setText(tt.isGioiTinh()==true?"Nam":"Nữ");;
	txtDiaChi.setText(tt.getDiaChi());
	txtMaTK.setText(tt.getMaTk());
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
}
