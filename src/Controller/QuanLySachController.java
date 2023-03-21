package Controller;

import model.*;
import service.*;
import utility.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.event.*;

import java.util.Vector;
import java.util.Date;
import javax.swing.table.*;

import dao.SQLConnect;

public class QuanLySachController extends JFrame implements ActionListener, MouseListener {

	private static final long serialVersionUID = 1L;
	private JPanel jpnView;
	private JTextField jtfSearch;
	private JButton btAdd;
	private JButton brInsert;
	private JButton btDelete;
	private JTextField txtTacGia;
	private JTextField txtTheLoai;
	private JTextField txtNhaXuatBan;
	private JTextField txtMaSach;
	private JTextField txtTenSach;
	private JTextField txtTomTat;
	private JTextField txtSoTrang;
	private JTextField txtDonGia;
	private JTextField txtNamXB;
	private final String[] COLUMNS = { "Mã Sách", "STT", "Tên Sách", "Tóm Tắt", "Số Trang", "Đơn Giá", "Năm Xuất Bản",
			"Tác Giả", "Thể Loại", "Nhà Xuất Bản" };
	private SachService sachservice = null;
	private TableRowSorter<TableModel> rowSorter = null;

	public QuanLySachController(JPanel jpnView, JTextField jtfSearch, JButton btAdd, JButton brInsert, JButton btDelete,
			JTextField txtTacGia, JTextField txtTheLoai, JTextField txtNhaXuatBan, JTextField txtMaSach,
			JTextField txtTenSach, JTextField txtTomTat, JTextField txtSoTrang, JTextField txtDonGia,
			JTextField txtNamXB) {
		this.jpnView = jpnView;
		this.jtfSearch = jtfSearch;
		this.btAdd = btAdd;
		this.brInsert = brInsert;
		this.btDelete = btDelete;
		this.txtTacGia = txtTacGia;
		this.txtTheLoai = txtTheLoai;
		this.txtNhaXuatBan = txtNhaXuatBan;
		this.txtMaSach = txtMaSach;
		this.txtTenSach = txtTenSach;
		this.txtTomTat = txtTomTat;
		this.txtSoTrang = txtSoTrang;
		this.txtDonGia = txtDonGia;
		this.txtNamXB = txtNamXB;
		this.sachservice = new SachServiceImpl();
	}

	private Sach s = null;
	private DefaultTableModel model;
	private JTable table;
	JScrollPane scollPane;
	Vector<Sach> listItem = null;

	public void setDateToTabel() {
		listItem = (Vector<Sach>) sachservice.getList();

		model = new ClassTableModel().setTableSach(listItem, COLUMNS);
		table = new JTable(model);
		rowSorter = new TableRowSorter<>(table.getModel());
		table.setRowSorter(rowSorter);
		scollPane = new JScrollPane();
		jtfSearch.getDocument().addDocumentListener(new DocumentListener() {

			@Override
			public void removeUpdate(DocumentEvent e) {
				String text = jtfSearch.getText();
				if (text.trim().length() == 0) {
					rowSorter.setRowFilter(null);
				} else {
					rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
				}
			}

			@Override
			public void insertUpdate(DocumentEvent e) {
				String text = jtfSearch.getText();
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
		model.fireTableDataChanged();
		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
		table.getTableHeader().setPreferredSize(new Dimension(100, 50));
		table.setRowHeight(50);
		table.validate();
		table.repaint();

		scollPane.getViewport().add(table);
		scollPane.setPreferredSize(new Dimension(1300, 400));
		jpnView.removeAll();
		jpnView.setLayout(new BorderLayout());
		jpnView.add(scollPane);
		jpnView.validate();
		jpnView.repaint();
		table.addMouseListener(this);

		btAdd.addActionListener(this);
		brInsert.addActionListener(this);
		btDelete.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btAdd) {
			if (txtMaSach.getText().equals("") || txtTenSach.getText().equals("") || txtTomTat.getText().equals("")
					|| txtSoTrang.getText().equals("") || txtDonGia.getText().equals("")
					|| txtNamXB.getText().equals("") || txtTacGia.getText().equals("")
					|| txtTheLoai.getText().equals("") || txtNhaXuatBan.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");

			} else if (kTra(txtMaSach.getText()) == 0) {
				s = new Sach(txtMaSach.getText(), txtTenSach.getText(), txtTomTat.getText(),
						Integer.parseInt(txtSoTrang.getText()), Integer.parseInt(txtDonGia.getText()),
						Integer.parseInt(txtNamXB.getText()), txtTacGia.getText(), txtTheLoai.getText(),
						txtNhaXuatBan.getText());
				sachservice.Insert(s);
				JOptionPane.showMessageDialog(null, "Thêm Thành Công");
				setDateToTabel();
			} else {
				JOptionPane.showMessageDialog(null,
						"Vui lòng nhập mã sách khác! Bạn hãy đọc lại điều khoản! Xin cảm ơn!");
			}
		} else if (e.getSource() == brInsert) {
			if (txtMaSach.getText().equals("") || txtTenSach.getText().equals("") || txtTomTat.getText().equals("")
					|| txtSoTrang.getText().equals("") || txtDonGia.getText().equals("")
					|| txtNamXB.getText().equals("") || txtTacGia.getText().equals("")
					|| txtTheLoai.getText().equals("") || txtNhaXuatBan.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn đầy đủ thông tin");

			} else {
				s = new Sach(txtMaSach.getText(), txtTenSach.getText(), txtTomTat.getText(),
						Integer.parseInt(txtSoTrang.getText()), Integer.parseInt(txtDonGia.getText()),
						Integer.parseInt(txtNamXB.getText()), txtTacGia.getText(), txtTheLoai.getText(),
						txtNhaXuatBan.getText());
				sachservice.Update(s);
				JOptionPane.showMessageDialog(null, "Cập Nhật Thành Công");
				setDateToTabel();
			}
		} else if (e.getSource() == btDelete) {
			if (txtMaSach.getText().equals("") || txtTenSach.getText().equals("") || txtTomTat.getText().equals("")
					|| txtSoTrang.getText().equals("") || txtDonGia.getText().equals("")
					|| txtNamXB.getText().equals("") || txtTacGia.getText().equals("")
					|| txtTheLoai.getText().equals("") || txtNhaXuatBan.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn đầy đủ thông tin");

			} else if (xoa(txtMaSach.getText()) == 0) {
				String sql = "Delete from Sach where MaSach=\'" + txtMaSach.getText() + "\'";
				try {
					Connection conn = SQLConnect.getConnection();
					PreparedStatement prs = conn.prepareStatement(sql);
					prs.executeUpdate();
					JOptionPane.showMessageDialog(null, "Xóa Thành Công");
					setDateToTabel();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(null, "Vui lòng xóa ở phần Mượn và Trả trước");
			}

		}
	}

	public java.sql.Date covertDateToDateSql(Date d) {
		return new java.sql.Date(d.getTime());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int selectedRowIndex = table.getSelectedRow();
		selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
		Sach st = (Sach) listItem.elementAt(selectedRowIndex);
		txtMaSach.setText(st.getMASACH());
		txtTenSach.setText(st.getTENSACH());
		txtTomTat.setText(st.getTOMTAT());
		txtSoTrang.setText(String.valueOf(st.getSOTRANG()));
		txtDonGia.setText(String.valueOf(st.getDONGIA()));
		txtNamXB.setText(String.valueOf(st.getNAMXUATBAN()));
		txtTacGia.setText(st.getTACGIA());
		txtTheLoai.setText(st.getTHELOAI());
		txtNhaXuatBan.setText(st.getNHAXUATBAN());
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

	public int kTra(String t) {
		int result = 0;
		try {

			Connection conn = SQLConnect.getConnection();
			String sql = "select dbo.ktrsach(?) ";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, t);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = (rs.getInt(""));
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public int xoa(String t) {
		int result = 0;
		try {

			Connection conn = SQLConnect.getConnection();
			String sql = "select dbo.xoasach(?) ";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, t);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				result = (rs.getInt(""));
			}
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}
