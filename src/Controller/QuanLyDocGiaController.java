package Controller;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.SimpleDateFormat;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import com.toedter.calendar.JDateChooser;

import dao.DocGiaDAOImpl;
import dao.SQLConnect;
import model.DocGia;

import java.util.Vector;
import java.util.Date;

import service.*;
import utility.ClassTableModel;

public class QuanLyDocGiaController implements ActionListener, MouseListener {
	private JPanel pnView;
	private JTextField txtSearch, txtMaDocGia, txtHodem, txtTen, txtDiaChi, txtSDT, txtMaloaidocgia, txtGioitinh;
	private JDateChooser txtNgaySinh;
	private JButton btAdd, btDelete, btInsert;

	private final String[] COLUMNS = { "Mã Độc Giả", "STT", "Họ Đệm", "Tên", "SĐT", "Ngày Sinh", "Giới Tính", "Địa Chỉ",
			"Mã Loại Độc Giả" };
	private DocGiaService docgiaservice = null;
	private TableRowSorter<TableModel> rowSorter = null;

	public QuanLyDocGiaController(JPanel pnView, JTextField txtSearch, JTextField txtMaDocGia, JTextField txtHodem,
			JTextField txtTen, JTextField txtDiaChi, JTextField txtSDT, JTextField txtMaloaidocgia,
			JTextField txtGioitinh, JDateChooser txtNgaySinh, JButton btAdd, JButton btDelete, JButton btInsert) {
		this.pnView = pnView;
		this.txtSearch = txtSearch;
		this.txtMaDocGia = txtMaDocGia;
		this.txtHodem = txtHodem;
		this.txtTen = txtTen;
		this.txtDiaChi = txtDiaChi;
		this.txtSDT = txtSDT;
		this.txtMaloaidocgia = txtMaloaidocgia;
		this.txtGioitinh = txtGioitinh;
		this.txtNgaySinh = txtNgaySinh;
		this.btAdd = btAdd;
		this.btDelete = btDelete;
		this.btInsert = btInsert;

		this.docgiaservice = new DocGiaServiceImpl();

	}

	private DocGiaDAOImpl docgiadao = new DocGiaDAOImpl();
	private DocGia dg = null;
	private Vector<DocGia> listItem;
	private DefaultTableModel model;
	private JTable table;
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	public void setDateToTabel() {
		listItem = (Vector<DocGia>) docgiaservice.getList();
		model = new ClassTableModel().setTableDocGia(listItem, COLUMNS);
		table = new JTable(model);
		rowSorter = new TableRowSorter<>(table.getModel());
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
			public void actionPerformed(ActionEvent e) {
				if (txtMaDocGia.getText().equals("") || txtHodem.getText().equals("") || txtTen.getText().equals("")
						|| txtNgaySinh.getDate() == null || txtDiaChi.getText().equals("")
						|| txtMaloaidocgia.getText().equals("") || txtSDT.getText().equals("")
						|| txtGioitinh.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");
				} else if (docgiadao.kTra(txtMaDocGia.getText()) == 0) {

					dg = new DocGia(txtMaDocGia.getText(), txtHodem.getText(), txtTen.getText(),
							covertDateToDateSql((Date) txtNgaySinh.getDate()),
							txtGioitinh.getText().equals("Nam") ? true : false, txtSDT.getText(), txtDiaChi.getText(),
							txtMaloaidocgia.getText());
					docgiaservice.Insert(dg);
					JOptionPane.showMessageDialog(null, "Thêm Thành Công");
					setDateToTabel();
				} else {
					JOptionPane.showMessageDialog(null,
							"Vui lòng nhập mã độc giả khác! Bạn hãy đọc lại điều khoản! Xin cảm ơn!");
				}
			}
		});
		btInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMaDocGia.getText().equals("") || txtHodem.getText().equals("") || txtTen.getText().equals("")
						|| txtNgaySinh.getDate() == null || txtDiaChi.getText().equals("")
						|| txtMaloaidocgia.getText().equals("") || txtSDT.getText().equals("")
						|| txtGioitinh.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Vui lòng Chọn đầy đủ thông tin");
				} else {

					dg = new DocGia(txtMaDocGia.getText(), txtHodem.getText(), txtTen.getText(),
							covertDateToDateSql((Date) txtNgaySinh.getDate()),
							txtGioitinh.getText().equals("Nam") ? true : false, txtSDT.getText(), txtDiaChi.getText(),
							txtMaloaidocgia.getText());
					docgiaservice.Update(dg);
					JOptionPane.showMessageDialog(null, "Cập Nhật Thành Công");
					setDateToTabel();
				}
			}
		});
		btDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtMaDocGia.getText().equals("") || txtHodem.getText().equals("") || txtTen.getText().equals("")
						|| txtNgaySinh.getDate() == null || txtDiaChi.getText().equals("")
						|| txtMaloaidocgia.getText().equals("") || txtSDT.getText().equals("")
						|| txtGioitinh.getText().equals("")) {
					JOptionPane.showMessageDialog(pnView, "Vui lòng Chọn đầy đủ thông tin");
				} else if (docgiadao.xoa(txtMaDocGia.getText()) == 0) {

					String sql = "Delete from DocGia where MaDocGia=\'" + txtMaDocGia.getText() + "\'";
					try {
						Connection conn = SQLConnect.getConnection();
						PreparedStatement ps = conn.prepareStatement(sql);
						ps.executeUpdate();
						JOptionPane.showMessageDialog(null, "Xóa Thành Công");
						setDateToTabel();
					} catch (Exception e2) {
						e2.printStackTrace();
					}
				} else {
					JOptionPane.showMessageDialog(null, "Vui lòng xóa ở phần Mượn,Trả và Thẻ");
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
		dg = (DocGia) listItem.elementAt(selectedRowIndex);
		txtMaDocGia.setText(dg.getMaDocGia());
		txtHodem.setText(dg.getHodem());
		txtTen.setText(dg.getTen());

		txtNgaySinh.setDate(dg.getNgaysinh());
		txtDiaChi.setText(dg.getDiachi());
		txtSDT.setText(String.valueOf(dg.getSdt()));
		txtMaloaidocgia.setText(dg.getMaloaidocgia());
		txtGioitinh.setText(dg.isGioitinh() == true ? "Nam" : "Nữ");

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

	@Override
	public void actionPerformed(ActionEvent e) {

	}

	public java.sql.Date covertDateToDateSql(Date d) {
		return new java.sql.Date(d.getTime());
	}
}
