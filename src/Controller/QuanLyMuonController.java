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

public class QuanLyMuonController implements ActionListener, MouseListener {
	private JPanel pnView;
	private JTextField txtSearch, txtMaThe, txtMaThuThu, txtMaSach;
	private JButton btAdd, btDelete, btInsert;
	private JDateChooser txtNgayMuon;
	private final String[] COLUMNS = { "STT", "Mã Thẻ", "Mã Thủ Thư", "Mã sách", "Ngày Mượn" };
	private TableRowSorter<TableModel> rowSorter = null;
	private MuonService muonservice = null;

	public QuanLyMuonController(JPanel pnView, JTextField txtSearch, JTextField txtMaThe, JTextField txtMaThuThu,
			JTextField txtMaSach, JButton btAdd, JButton btDelete, JButton btInsert, JDateChooser txtNgayMuon) {
		this.pnView = pnView;
		this.txtSearch = txtSearch;
		this.txtMaThe = txtMaThe;
		this.txtMaThuThu = txtMaThuThu;
		this.txtMaSach = txtMaSach;
		this.btAdd = btAdd;
		this.btDelete = btDelete;
		this.btInsert = btInsert;
		this.txtNgayMuon = txtNgayMuon;
		this.muonservice = new MuonServiceImpl();

	}

	public QuanLyMuonController() {

	}

	private Muon m = null;
	private Vector<Muon> listItem;
	private DefaultTableModel model;
	private JTable table;
	private MuonDAOImpl muondao = new MuonDAOImpl();

	public void setDateToTable() {
		listItem = (Vector<Muon>) muonservice.getList();
		model = new ClassTableModel().setTableMuon(listItem, COLUMNS);
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
				// TODO Auto-generated method stub

			}
		});
		table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
		table.getTableHeader().setPreferredSize(new Dimension(100, 50));
		table.setRowHeight(50);
		table.validate();
		table.repaint();
		btAdd.addActionListener(this);
		btInsert.addActionListener(this);
		btDelete.addActionListener(this);

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
		m = (Muon) listItem.elementAt(selectedRowIndex);
		txtMaThe.setText(m.getMathe());
		txtMaThuThu.setText(m.getMathuthu());
		txtMaSach.setText(m.getMaSach());
		txtNgayMuon.setDate(m.getNgayMuon());
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

		if (e.getSource() == btAdd) {
			if (txtMaThe.getText().equals("") || txtMaSach.getText().equals("") || txtMaThuThu.getText().equals("")
					|| txtNgayMuon.getDate() == null) {
				JOptionPane.showMessageDialog(null, "Vui lòng nhập đầy đủ giá trị");
			} else if (ktrXoa(txtMaThe.getText(), txtMaSach.getText(), txtMaThuThu.getText()) == 0) {
				m = new Muon(txtMaThe.getText(), txtMaThuThu.getText(), txtMaSach.getText(),
						covertDateToDateSql(txtNgayMuon.getDate()));
				muonservice.Insert(m);
				JOptionPane.showMessageDialog(null, "Thêm Thành Công");
				setDateToTable();
			} else {
				JOptionPane.showMessageDialog(null, "Vui lòng xóa dữ liệu đã có");
			}
		} else if (e.getSource() == btDelete) {
			if (txtMaThe.getText().equals("") || txtMaSach.getText().equals("") || txtMaThuThu.getText().equals("")
					|| txtNgayMuon.getDate() == null) {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn đầy đủ giá trị");
			} else if (muondao.tinhToan(txtMaThe.getText(), txtMaSach.getText(), txtMaThuThu.getText()) == 0) {
				String sql = "Delete from Muon where MaThe=\'" + txtMaThe.getText() + "\' and NgayMuon=\'"
						+ covertDateToDateSql(txtNgayMuon.getDate()) + "\' and MaSach=\'" + txtMaSach.getText() + "\'";
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
						+ muondao.tinhToan(txtMaThe.getText(), txtMaSach.getText(), txtMaThuThu.getText()) + " cuốn");

			}

		} else if (e.getSource() == btInsert) {
			if (txtMaThe.getText().equals("") || txtMaSach.getText().equals("") || txtMaThuThu.getText().equals("")
					|| txtNgayMuon.getDate() == null) {
				JOptionPane.showMessageDialog(null, "Vui lòng chọn đầy đủ giá trị");
			} else {
				m = new Muon(txtMaThe.getText(), txtMaThuThu.getText(), txtMaSach.getText(),
						covertDateToDateSql((Date) txtNgayMuon.getDate()));
				muonservice.Update(m);
				JOptionPane.showMessageDialog(null, "Cập Nhật Thành Công");
				setDateToTable();
			}
		}
	}

	public java.sql.Date covertDateToDateSql(Date d) {
		return new java.sql.Date(d.getTime());
	}

	public int ktrXoa(String t, String t1, String t2) {
		int result = 0;
		try {

			Connection conn = SQLConnect.getConnection();
			String sql = "select dbo.ktrmuon(?,?,?) ";
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
