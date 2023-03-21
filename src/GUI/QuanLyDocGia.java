package GUI;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import Controller.QuanLyDocGiaController;

import java.awt.Font;

import com.toedter.calendar.JDateChooser;

public class QuanLyDocGia extends JPanel {
	private static final long serialVersionUID = 1L;
	private javax.swing.JButton btAdd;
	private javax.swing.JButton btInsert;
	private javax.swing.JButton btDelete;
	private javax.swing.JLabel lbMaDocGia;
	private javax.swing.JLabel lbHoDem;
	private javax.swing.JLabel lbTen;
	private javax.swing.JLabel lbNgaySinh;
	private javax.swing.JLabel lbGioiTinh;
	private javax.swing.JLabel lbSDT;
	private javax.swing.JLabel lbDiaChi;
	private javax.swing.JLabel lbMaLoaiDocGia;
	private javax.swing.JPanel pnTable;
	private javax.swing.JPanel pnQuery;
	private javax.swing.JTextField txtFind;
	private javax.swing.JTextField txtMaDocGia;
	private javax.swing.JTextField txtHoDem;
	private javax.swing.JTextField txtTen;
	private javax.swing.JTextField txtGioiTinh;
	private javax.swing.JTextField txtSDT;
	private javax.swing.JTextField txtDiaChi;
	private javax.swing.JTextField txtMaLoaiDocGia;
	private JLabel lblNewLabel;

	public QuanLyDocGia() {
		pnTable = new javax.swing.JPanel();
		pnTable.setBackground(UIManager.getColor("Button.background"));
		pnQuery = new javax.swing.JPanel();
		pnQuery.setBackground(UIManager.getColor("Button.shadow"));
		txtFind = new javax.swing.JTextField();
		lbMaDocGia = new javax.swing.JLabel();
		lbMaDocGia.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbHoDem = new javax.swing.JLabel();
		lbHoDem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbTen = new javax.swing.JLabel();
		lbTen.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbNgaySinh = new javax.swing.JLabel();
		lbNgaySinh.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtMaDocGia = new javax.swing.JTextField();
		txtMaDocGia.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtHoDem = new javax.swing.JTextField();
		txtHoDem.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtTen = new javax.swing.JTextField();
		txtTen.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbGioiTinh = new javax.swing.JLabel();
		lbGioiTinh.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbSDT = new javax.swing.JLabel();
		lbSDT.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbDiaChi = new javax.swing.JLabel();
		lbDiaChi.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbMaLoaiDocGia = new javax.swing.JLabel();
		lbMaLoaiDocGia.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtGioiTinh = new javax.swing.JTextField();
		txtGioiTinh.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtSDT = new javax.swing.JTextField();
		txtSDT.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtDiaChi = new javax.swing.JTextField();
		txtDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtMaLoaiDocGia = new javax.swing.JTextField();
		txtMaLoaiDocGia.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btAdd = new javax.swing.JButton();
		btAdd.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btInsert = new javax.swing.JButton();
		btInsert.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btDelete = new javax.swing.JButton();
		btDelete.setFont(new Font("Times New Roman", Font.BOLD, 14));

		pnTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout gl_pnTable = new javax.swing.GroupLayout(pnTable);
		pnTable.setLayout(gl_pnTable);
		gl_pnTable.setHorizontalGroup(gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 734, Short.MAX_VALUE));
		gl_pnTable.setVerticalGroup(gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 298, Short.MAX_VALUE));

		txtFind.setText("");

		lbMaDocGia.setText("Mã Độc Giả");

		lbHoDem.setText("Họ Đệm");

		lbTen.setText("Tên :");

		lbNgaySinh.setText("Ngày Sinh :");

		txtMaDocGia.setText("");

		txtHoDem.setText("");

		txtTen.setText("");

		lbGioiTinh.setText("Giới Tính");

		lbSDT.setText("SĐT");

		lbDiaChi.setText("Địa Chỉ");

		lbMaLoaiDocGia.setText("Mã Loại Độc Giả");

		txtGioiTinh.setText("");

		txtSDT.setText("");

		txtDiaChi.setText("");

		txtMaLoaiDocGia.setText("");

		btAdd.setText("Thêm");

		btInsert.setText("Sửa ");

		btDelete.setText("Xóa ");
		
		lblNewLabel = new JLabel("Nhập ký tự mà bạn muốn tìm : ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JDateChooser txtNgaySinh =  new com.toedter.calendar.JDateChooser();
		txtNgaySinh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		 txtNgaySinh.setDateFormatString("dd/MM/yyyy");

		javax.swing.GroupLayout gl_pnQuery = new javax.swing.GroupLayout(pnQuery);
		gl_pnQuery.setHorizontalGroup(
			gl_pnQuery.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnQuery.createSequentialGroup()
					.addGap(0)
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGap(58)
							.addComponent(lblNewLabel)
							.addGap(24)
							.addComponent(txtFind, GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
							.addGap(217))
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGap(58)
									.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
										.addComponent(lbMaDocGia, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
										.addComponent(lbHoDem, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
										.addComponent(lbTen, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
										.addComponent(lbNgaySinh, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtMaDocGia, GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
										.addGroup(gl_pnQuery.createSequentialGroup()
											.addComponent(txtHoDem, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
											.addGap(2))
										.addGroup(gl_pnQuery.createSequentialGroup()
											.addGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
												.addComponent(txtNgaySinh, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
												.addComponent(txtTen, GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
											.addGap(2)))
									.addGap(26)
									.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
										.addComponent(lbGioiTinh, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
										.addComponent(lbSDT, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
										.addComponent(lbDiaChi, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
										.addComponent(lbMaLoaiDocGia, GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)))
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGap(113)
									.addComponent(btAdd, GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
									.addGap(123)
									.addComponent(btInsert, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
									.addGap(125)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addComponent(btDelete, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
									.addGap(77))
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtMaLoaiDocGia, Alignment.LEADING)
										.addComponent(txtDiaChi, Alignment.LEADING)
										.addComponent(txtSDT, Alignment.LEADING)
										.addComponent(txtGioiTinh, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
									.addGap(19)))))
					.addGap(29))
		);
		gl_pnQuery.setVerticalGroup(
			gl_pnQuery.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnQuery.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addComponent(txtFind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel))
							.addGap(18)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGap(6)
									.addComponent(lbMaDocGia, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(txtMaDocGia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbGioiTinh)
								.addComponent(txtGioiTinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGap(6)
									.addComponent(lbHoDem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(txtHoDem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbSDT)
								.addComponent(txtSDT, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(lbTen, GroupLayout.PREFERRED_SIZE, 13, Short.MAX_VALUE))
						.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lbDiaChi)
							.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGap(6)
									.addComponent(lbNgaySinh, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(lbMaLoaiDocGia)
								.addComponent(txtMaLoaiDocGia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
						.addComponent(btAdd)
						.addComponent(btInsert)
						.addComponent(btDelete))
					.addGap(20))
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
	QuanLyDocGiaController controller = new QuanLyDocGiaController(pnTable, txtFind, txtMaDocGia, txtHoDem, txtTen, txtDiaChi, txtSDT, txtMaLoaiDocGia, txtGioiTinh, txtNgaySinh, btAdd, btDelete, btInsert);
	controller.setDateToTabel();
	
	}
}