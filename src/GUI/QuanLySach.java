package GUI;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import Controller.QuanLySachController;

import java.awt.Color;
import java.awt.Font;

public class QuanLySach extends JPanel {
	private static final long serialVersionUID = 1L;
	private javax.swing.JButton btAdd;
	private javax.swing.JButton brInsert;
	private javax.swing.JButton btDelete;
	private javax.swing.JLabel lbMaSach;
	private javax.swing.JLabel lbTenSach;
	private javax.swing.JLabel lbTomTat;
	private javax.swing.JLabel lbSoTrang;
	private javax.swing.JLabel lbDonGia;
	private javax.swing.JLabel lbNamXB;
	private javax.swing.JLabel lbNhaXuatBan;
	private javax.swing.JLabel lbTacGia;
	private javax.swing.JLabel lbTheLoai;
	private javax.swing.JPanel pnQuery;
	private javax.swing.JPanel pnTable;
	private javax.swing.JTextField txtTacGia;
	private javax.swing.JTextField txtTheLoai;
	private javax.swing.JTextField txtFind;
	private javax.swing.JTextField txtMaSach;
	private javax.swing.JTextField txtTenSach;
	private javax.swing.JTextField txtTomTat;
	private javax.swing.JTextField txtSoTrang;
	private javax.swing.JTextField txtDonGia;
	private javax.swing.JTextField txtNamXB;
	private javax.swing.JTextField txtNhaXuatBan;

	public QuanLySach() {

		pnTable = new javax.swing.JPanel();
		
		pnTable.setBackground(UIManager.getColor("Button.background"));
		pnTable.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnQuery = new javax.swing.JPanel();
		pnQuery.setBackground(UIManager.getColor("Button.shadow"));
		txtFind = new javax.swing.JTextField();
		lbMaSach = new javax.swing.JLabel();
		lbMaSach.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbTenSach = new javax.swing.JLabel();
		lbTenSach.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbTomTat = new javax.swing.JLabel();
		lbTomTat.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbSoTrang = new javax.swing.JLabel();
		lbSoTrang.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbDonGia = new javax.swing.JLabel();
		lbDonGia.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtMaSach = new javax.swing.JTextField();
		txtMaSach.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtTenSach = new javax.swing.JTextField();
		txtTenSach.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtTomTat = new javax.swing.JTextField();
		txtTomTat.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtSoTrang = new javax.swing.JTextField();
		txtSoTrang.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtDonGia = new javax.swing.JTextField();
		txtDonGia.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbNamXB = new javax.swing.JLabel();
		lbNamXB.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbNhaXuatBan = new javax.swing.JLabel();
		lbNhaXuatBan.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbTacGia = new javax.swing.JLabel();
		lbTacGia.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbTheLoai = new javax.swing.JLabel();
		lbTheLoai.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtNamXB = new javax.swing.JTextField();
		txtNamXB.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtNhaXuatBan = new javax.swing.JTextField();
		txtNhaXuatBan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtTacGia = new javax.swing.JTextField();
		txtTacGia.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtTheLoai = new javax.swing.JTextField();
		txtTheLoai.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btAdd = new javax.swing.JButton();
		btAdd.setFont(new Font("Times New Roman", Font.BOLD, 14));
		brInsert = new javax.swing.JButton();
		brInsert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btDelete = new javax.swing.JButton();
		btDelete.setFont(new Font("Times New Roman", Font.BOLD, 14));

		javax.swing.GroupLayout gl_pnTable = new javax.swing.GroupLayout(pnTable);
		pnTable.setLayout(gl_pnTable);
		gl_pnTable.setHorizontalGroup(gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 0, Short.MAX_VALUE));
		gl_pnTable.setVerticalGroup(gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
				292, Short.MAX_VALUE));

		txtFind.setText("");

		lbMaSach.setText("Mã Sách :");

		lbTenSach.setText("Tên Sách :");

		lbTomTat.setText("Tóm Tắt :");

		lbSoTrang.setText("Số Trang :");

		lbDonGia.setText("Đơn Giá :");

		txtMaSach.setText("");

		txtTenSach.setText("");

		txtTomTat.setText("");

		txtSoTrang.setText("0");

		txtDonGia.setText("0");

		lbNamXB.setText("Năm Xuất Bản :");

		lbNhaXuatBan.setText("Nhà Xuất Bản :");

		lbTacGia.setText("Tác Giả :");

		lbTheLoai.setText("Thể Loại :");

		txtNamXB.setText("0");

		txtNhaXuatBan.setText("");

		txtTacGia.setText("");

		txtTheLoai.setText("");

		btAdd.setText("Thêm");

		brInsert.setText("Sửa");

		btDelete.setText("Xóa");
		
		JLabel lblNewLabel = new JLabel("Nhập kí tự mà bạn muốn tìm :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));

		javax.swing.GroupLayout gl_pnQuery = new javax.swing.GroupLayout(pnQuery);
		gl_pnQuery.setHorizontalGroup(
			gl_pnQuery.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnQuery.createSequentialGroup()
					.addGap(39)
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGap(88)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 194, Short.MAX_VALUE)
							.addGap(43)
							.addComponent(txtFind, GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
								.addComponent(lbMaSach, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addComponent(lbTenSach, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addComponent(lbTomTat, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addComponent(lbSoTrang, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
								.addComponent(lbDonGia, GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
								.addComponent(txtMaSach, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
								.addComponent(txtTenSach, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
								.addComponent(txtTomTat, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
								.addComponent(txtSoTrang, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
								.addComponent(txtDonGia, GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
							.addGap(30)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
								.addComponent(lbNamXB, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
								.addComponent(lbNhaXuatBan, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
								.addComponent(lbTacGia, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
								.addComponent(lbTheLoai, GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE))))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNamXB, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
						.addComponent(txtNhaXuatBan, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
						.addComponent(txtTacGia, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
						.addComponent(txtTheLoai, GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
					.addGap(27)
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
						.addComponent(btAdd)
						.addComponent(brInsert)
						.addComponent(btDelete))
					.addGap(24))
		);
		gl_pnQuery.setVerticalGroup(
			gl_pnQuery.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnQuery.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtFind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE, false)
								.addComponent(lbMaSach)
								.addComponent(txtMaSach, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbNamXB)
								.addComponent(txtNamXB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGap(6)
									.addComponent(lbTenSach, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(txtTenSach, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbNhaXuatBan)
								.addComponent(txtNhaXuatBan, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGap(35)
							.addComponent(btAdd)))
					.addGap(18)
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
						.addComponent(lbTomTat)
						.addComponent(txtTomTat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lbTacGia)
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGap(2)
							.addComponent(txtTacGia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addComponent(brInsert, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbSoTrang)
								.addComponent(txtSoTrang, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbTheLoai)
								.addComponent(txtTheLoai, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addComponent(lbDonGia)
								.addComponent(txtDonGia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGap(38)
							.addComponent(btDelete)))
					.addGap(50))
		);
		pnQuery.setLayout(gl_pnQuery);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(pnQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(pnQuery, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, 0).addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
	QuanLySachController controller= new QuanLySachController(pnTable, txtFind, btAdd, brInsert, btDelete, txtTacGia, txtTheLoai, txtNhaXuatBan, txtMaSach, txtTenSach, txtTomTat, txtSoTrang, txtDonGia, txtNamXB);
	controller.setDateToTabel();
	
	
	}
}