package Controller;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;

import com.toedter.calendar.JDateChooser;

import dao.*;
import model.*;

import java.util.Vector;
import java.util.Date;

import service.*;
import utility.ClassTableModel;

public class QuanLyTraController extends JFrame implements MouseListener, ActionListener {
	private static final long serialVersionUID = 1L;
	private JPanel pnView;
	private JTextField txtSearch, txtMaThe, txtMaThuThu, txtMaSach;
	private JButton btAdd, btDelete, btInsert;
	private JDateChooser txtNgayTra;

	private final String[] COLUMNS = { "STT", "Mã Thẻ", "Mã Thủ Thư", "Mã Sách", "Ngày Trả" };
	private TraService traservice = null;
	private TableRowSorter<TableModel> rowSorter = null;

	public QuanLyTraController(JPanel pnView, JTextField txtSearch, JTextField txtMaThe, JTextField txtMaThuThu,
			JTextField txtMaSach, JButton btAdd, JButton btDelete, JButton btInsert, JDateChooser txtNgayTra)
			throws HeadlessException {
		this.pnView = pnView;
		this.txtSearch = txtSearch;
		this.txtMaThe = txtMaThe;
		this.txtMaThuThu = txtMaThuThu;
		this.txtMaSach = txtMaSach;
		this.btAdd = btAdd;
		this.btDelete = btDelete;
		this.btInsert = btInsert;
		this.txtNgayTra = txtNgayTra;

		this.traservice = new TraServiceImpl();
	}

	private Tra t = null;
	private DefaultTableModel model;
	private JTable table;
	private Vector<Tra> listItem = null;
	private TraDAOImpl trdao = new TraDAOImpl();

	public void setDateToTable() {
		listItem = (Vector<Tra>) traservice.getList();
		model = new ClassTableModel().setTableTra(listItem, COLUMNS);
		table = new JTable(model);
		rowSorter = new TableRowSorter<>(table.getModel());
		table.setRowSorter(rowSorter);
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
				// TODO Auto-generated method stub

			}
		});
		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
		table.getTableHeader().setPreferredSize(new Dimension(100, 50));
		table.setRowHeight(50);
		table.validate();
		table.repaint();
		table.addMouseListener(this);
		btAdd.addActionListener(this);
		btDelete.addActionListener(this);
		btInsert.addActionListener(this);
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
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btAdd) {
			if (txtMaThuThu.getText().equals("") || txtMaSach.getText().equals("") || txtNgayTra.getDate() == null
					|| txtMaSach.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ thông tin");
			} else if (ktrTra(txtMaThe.getText(), txtMaSach.getText(), txtMaThuThu.getText()) == 0) {
				t = new Tra(txtMaThe.getText(), txtMaThuThu.getText(), txtMaSach.getText(),
						covertDateToDateSql((Date) txtNgayTra.getDate()));
				traservice.Insert(t);
				JOptionPane.showMessageDialog(null, "Thêm Thành Công");
				setDateToTable();
			} else {
				JOptionPane.showMessageDialog(null, "Sách này đã được trả! Vui xóa để thêm lại");
			}
		} else if (e.getSource() == btInsert) {
			if (txtMaThuThu.getText().equals("") || txtMaSach.getText().equals("") || txtNgayTra.getDate() == null
					|| txtMaSach.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn đầy đủ thông tin");
			} else {
				t = new Tra(txtMaThe.getText(), txtMaThuThu.getText(), txtMaSach.getText(),
						covertDateToDateSql((Date) txtNgayTra.getDate()));

				traservice.Update(t);
				JOptionPane.showMessageDialog(null, "Cập Nhật Thành Công");
				setDateToTable();
			}

		} else if (e.getSource() == btDelete) {

			if (txtMaThuThu.getText().equals("") || txtMaSach.getText().equals("") || txtNgayTra.getDate() == null
					|| txtMaSach.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn đầy đủ thông tin");
			}

			else if (trdao.tinhToan(txtMaThe.getText(), txtMaSach.getText(), txtMaThuThu.getText()) == 0) {

				String sql = "Delete from Tra where NgayTra=\'" + covertDateToDateSql(txtNgayTra.getDate())
						+ "\' and MaThe=\'" + txtMaThe.getText() + "\' and MaSach=\'" + txtMaSach.getText() + "\'";
				try {
					Connection conn = SQLConnect.getConnection();
					PreparedStatement ps = conn.prepareStatement(sql);
					ps.executeUpdate();
					JOptionPane.showMessageDialog(null, "Xóa Thành Công");
					setDateToTable();

				} catch (Exception e2) {
					e2.printStackTrace();
				}
			} else {
				JOptionPane.showMessageDialog(null, "Người này vẫn đang thiếu thư viện "
						+ trdao.tinhToan(txtMaThe.getText(), txtMaSach.getText(), txtMaThuThu.getText()) + " cuốn");
			}

		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int selectedRowIndex = table.getSelectedRow();
		selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);
		Tra t = (Tra) listItem.elementAt(selectedRowIndex);
		txtNgayTra.setDate(t.getNgaytra());
		txtMaThe.setText(t.getMathe());
		txtMaThuThu.setText(t.getMathuthu());
		txtMaSach.setText(t.getMasach());

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

	public java.sql.Date covertDateToDateSql(Date d) {
		return new java.sql.Date(d.getTime());
	}

	public int ktrTra(String t, String t1, String t2) {
		int result = 0;
		try {

			Connection conn = SQLConnect.getConnection();
			String sql = "select dbo.ktrtra(?,?,?) ";
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, t);
			ps.setString(2, t1);
			ps.setString(3, t2);
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