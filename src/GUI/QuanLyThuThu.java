package GUI;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.UIManager;

import Controller.QuanLyThuThuController;

import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class QuanLyThuThu extends JPanel {
	private static final long serialVersionUID = 1L;
	private javax.swing.JButton btAdd;
	private javax.swing.JButton btInsert;
	private javax.swing.JButton btDelete;
	private javax.swing.JLabel lbMaThuThu;
	private javax.swing.JLabel lbHoDem;
	private javax.swing.JLabel lbTen;
	private javax.swing.JLabel lbGioiTinh;
	private javax.swing.JLabel lbDiaChi;
	private javax.swing.JLabel lbMaTK;
	private javax.swing.JPanel pnTable;
	private javax.swing.JPanel pnQuery;
	private javax.swing.JTextField txtFind;
	private javax.swing.JTextField txtMaThuThu;
	private javax.swing.JTextField txtHoDem;
	private javax.swing.JTextField txtTen;
	private javax.swing.JTextField txtGioiTinh;
	private javax.swing.JTextField txtDiaChi;
	private javax.swing.JTextField txtMaTK;
	private JLabel lblNewLabel;

	public QuanLyThuThu() {
		pnTable = new javax.swing.JPanel();
		pnTable.setBackground(UIManager.getColor("Button.background"));
		pnQuery = new javax.swing.JPanel();
		pnQuery.setBackground(UIManager.getColor("Button.shadow"));
		txtFind = new javax.swing.JTextField();
		lbMaThuThu = new javax.swing.JLabel();
		lbMaThuThu.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbHoDem = new javax.swing.JLabel();
		lbHoDem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbTen = new javax.swing.JLabel();
		lbTen.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtMaThuThu = new javax.swing.JTextField();
		txtMaThuThu.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtHoDem = new javax.swing.JTextField();
		txtHoDem.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtTen = new javax.swing.JTextField();
		txtTen.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lbGioiTinh = new javax.swing.JLabel();
		lbGioiTinh.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbDiaChi = new javax.swing.JLabel();
		lbDiaChi.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbMaTK = new javax.swing.JLabel();
		lbMaTK.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtGioiTinh = new javax.swing.JTextField();
		txtGioiTinh.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtDiaChi = new javax.swing.JTextField();
		txtDiaChi.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtMaTK = new javax.swing.JTextField();
		txtMaTK.setFont(new Font("Times New Roman", Font.PLAIN, 13));
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
		gl_pnTable.setVerticalGroup(gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
				298, Short.MAX_VALUE));

		txtFind.setText("");

		lbMaThuThu.setText("Mã Thủ Thư : ");

		lbHoDem.setText("Họ Đệm :");

		lbTen.setText("Tên :");

		txtMaThuThu.setText("");

		txtHoDem.setText("");

		txtTen.setText("");

		lbGioiTinh.setText("Giới Tính :");

		lbDiaChi.setText("Địa Chỉ :");

		lbMaTK.setText("Mã TK :");

		txtGioiTinh.setText("");

		txtDiaChi.setText("");

		txtMaTK.setText("");

		btAdd.setText("Thêm");

		btInsert.setText("Sửa ");

		btDelete.setText("Xóa ");

		lblNewLabel = new JLabel("Nhập kí tự mà bạn muốn tìm : ");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));

		javax.swing.GroupLayout gl_pnQuery = new javax.swing.GroupLayout(pnQuery);
		gl_pnQuery.setHorizontalGroup(
			gl_pnQuery.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnQuery.createSequentialGroup()
					.addGap(0)
					.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGap(85)
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 321, Short.MAX_VALUE)
							.addGap(30)
							.addComponent(txtFind, GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
							.addGap(177))
						.addGroup(gl_pnQuery.createSequentialGroup()
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGap(58)
									.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
										.addComponent(lbMaThuThu, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
										.addComponent(lbHoDem, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
										.addComponent(lbTen, GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE))
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
										.addComponent(txtMaThuThu, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
										.addGroup(gl_pnQuery.createSequentialGroup()
											.addGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
												.addComponent(txtTen, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
												.addComponent(txtHoDem, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
											.addGap(2)))
									.addGap(26)
									.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
										.addComponent(lbGioiTinh, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
										.addComponent(lbDiaChi, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
										.addComponent(lbMaTK, GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)))
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGap(113)
									.addComponent(btAdd, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
									.addGap(123)
									.addComponent(btInsert, GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
									.addGap(125)))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addComponent(btDelete, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
									.addGap(77))
								.addComponent(txtGioiTinh, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
								.addComponent(txtDiaChi, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
								.addComponent(txtMaTK, GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE))))
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
									.addComponent(lbMaThuThu, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(txtMaThuThu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbGioiTinh)
								.addComponent(txtGioiTinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
								.addGroup(gl_pnQuery.createSequentialGroup()
									.addGap(6)
									.addComponent(lbHoDem, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(txtHoDem, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lbDiaChi)
								.addComponent(txtDiaChi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addComponent(lbTen, GroupLayout.PREFERRED_SIZE, 13, Short.MAX_VALUE))
						.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE)
							.addComponent(txtTen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addComponent(lbMaTK)
							.addComponent(txtMaTK, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(55)
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
QuanLyThuThuController controller = new QuanLyThuThuController(pnTable, txtFind, txtMaThuThu, txtHoDem, txtTen, txtGioiTinh, txtDiaChi, txtMaTK, btAdd, btDelete, btInsert);
controller.setDateToTable();
	}

}
