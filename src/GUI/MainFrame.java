package GUI;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import bean.DanhMucBean;
import view.*;

import java.util.*;
import Controller.ChuyenManHinhController;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	private JLabel lbMain;
	private JPanel pnMain;
	private JPanel pnMuon;
	private JPanel pnTheThuVien;
	private JPanel pnThuThu;
	private JPanel pnTra;
	private JButton btAbout;
	private JButton btLogout;
	private JPanel pnThongKe;
	private JPanel pnSach;
	private JPanel pnView;
	private JPanel pnMenu;
	private JLabel lbTrangChu;
	private JLabel lbDocGia;
	private JLabel lbSach;
	private JLabel lbThuThu;
	private JLabel lbThe;
	private JLabel lbMuon;
	private JLabel lbTra;
	private JLabel lbThongKe;
	private JPanel pnTrangChu;
	private JPanel pnDocGia;

	public MainFrame() {
		setTitle("Quan Ly Thu Vien");

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		pnMenu = new JPanel();
		pnMenu.setBackground(Color.DARK_GRAY);
		pnMenu.setBorder(new LineBorder(new Color(0, 0, 0)));

		pnView = new JPanel();
		pnView.setBorder(new LineBorder(new Color(0, 0, 0)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		layout.setHorizontalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(pnMenu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(pnView, GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(Alignment.LEADING)
				.addComponent(pnView, GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE)
				.addComponent(pnMenu, GroupLayout.DEFAULT_SIZE, 533, Short.MAX_VALUE));

		pnMain = new JPanel();
		pnMain.setBackground(Color.RED);

		pnTrangChu = new JPanel();
		pnTrangChu.setBackground(Color.GREEN);

		pnDocGia = new JPanel();
		pnDocGia.setBackground(Color.GREEN);

		pnSach = new JPanel();
		pnSach.setBackground(Color.GREEN);

		pnThuThu = new JPanel();
		pnThuThu.setBackground(Color.GREEN);

		pnTheThuVien = new JPanel();
		pnTheThuVien.setBackground(Color.GREEN);

		pnMuon = new JPanel();
		pnMuon.setBackground(Color.GREEN);

		pnTra = new JPanel();
		pnTra.setBackground(Color.GREEN);

		pnThongKe = new JPanel();
		pnThongKe.setBackground(Color.GREEN);


		btLogout = new JButton("Logout");
		btLogout.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				DangNhapDia dialog= new DangNhapDia(null, true);
				dialog.setTitle("Ä?Äƒng Nháº­p Há»‡ Thá»‘ng");
				dialog.setResizable(false);
				dialog.setLocationRelativeTo(null);
				dialog.setVisible(true);
			}
		});
		btAbout = new javax.swing.JButton();
		btAbout.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btAbout.setText("Ä?iá»?u Khoáº£n");
		btAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DieuKhoan dk= new DieuKhoan(null,true);
				dk.setTitle("Ä?iá»?u khoáº£n ngÆ°á»?i dÃ¹ng");
				dk.setResizable(false);
				dk.setLocationRelativeTo(null);
				dk.setVisible(true);
			}
		});
		GroupLayout gl_pnMenu = new GroupLayout(pnMenu);
		gl_pnMenu.setHorizontalGroup(
			gl_pnMenu.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnMenu.createSequentialGroup()
					.addComponent(btAbout, GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btLogout, GroupLayout.PREFERRED_SIZE, 88, GroupLayout.PREFERRED_SIZE))
				.addComponent(pnSach, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
				.addComponent(pnDocGia, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
				.addComponent(pnTrangChu, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
				.addComponent(pnMain, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
				.addComponent(pnTra, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
				.addComponent(pnThongKe, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
				.addComponent(pnMuon, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
				.addComponent(pnThuThu, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
				.addComponent(pnTheThuVien, GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
		);
		gl_pnMenu.setVerticalGroup(
			gl_pnMenu.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnMenu.createSequentialGroup()
					.addComponent(pnMain, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnTrangChu, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnDocGia, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnSach, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnThuThu, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnTheThuVien, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnMuon, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnTra, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(pnThongKe, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
					.addGroup(gl_pnMenu.createParallelGroup(Alignment.BASELINE)
						.addComponent(btAbout, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
						.addComponent(btLogout)))
		);
		pnThongKe.setLayout(new BorderLayout(0, 0));

		lbThongKe = new JLabel("TH\u1ED0NG K\u00CA");
		lbThongKe.setBackground(Color.GREEN);
		lbThongKe.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbThongKe.setHorizontalAlignment(SwingConstants.CENTER);
		pnThongKe.add(lbThongKe);
		pnTra.setLayout(new BorderLayout(0, 0));

		lbTra = new JLabel("QU\u1EA2N L\u00DD TR\u1EA2");
		lbTra.setBackground(Color.GREEN);
		lbTra.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbTra.setHorizontalAlignment(SwingConstants.CENTER);
		pnTra.add(lbTra);
		pnMuon.setLayout(new BorderLayout(0, 0));

		lbMuon = new JLabel("QU\u1EA2N L\u00DD M\u01AF\u1EE2N");
		lbMuon.setBackground(Color.GREEN);
		lbMuon.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbMuon.setHorizontalAlignment(SwingConstants.CENTER);
		pnMuon.add(lbMuon);
		pnTheThuVien.setLayout(new BorderLayout(0, 0));

		lbThe = new JLabel("TH\u1EBA TH\u01AF VI\u1EC6N");
		lbThe.setBackground(Color.GREEN);
		lbThe.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbThe.setHorizontalAlignment(SwingConstants.CENTER);
		pnTheThuVien.add(lbThe);
		pnThuThu.setLayout(new BorderLayout(0, 0));

		lbThuThu = new JLabel("TH\u1EE6 TH\u01AF");
		lbThuThu.setBackground(Color.GREEN);
		lbThuThu.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbThuThu.setHorizontalAlignment(SwingConstants.CENTER);
		pnThuThu.add(lbThuThu);
		pnSach.setLayout(new BorderLayout(0, 0));

		lbSach = new JLabel("QU\u1EA2N L\u00DD S\u00C1CH");
		lbSach.setBackground(Color.GREEN);
		lbSach.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbSach.setHorizontalAlignment(SwingConstants.CENTER);
		pnSach.add(lbSach);
		pnDocGia.setLayout(new BorderLayout(0, 0));

		lbDocGia = new JLabel("\u0110\u1ED8C GI\u1EA2");
		lbDocGia.setBackground(Color.GREEN);
		lbDocGia.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbDocGia.setHorizontalAlignment(SwingConstants.CENTER);
		pnDocGia.add(lbDocGia);
		pnTrangChu.setLayout(new BorderLayout(0, 0));

		lbTrangChu = new JLabel("TRANG CH\u1EE6");
		lbTrangChu.setBackground(Color.GREEN);
		lbTrangChu.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lbTrangChu.setHorizontalAlignment(SwingConstants.CENTER);
		pnTrangChu.add(lbTrangChu);
		pnMain.setLayout(new BorderLayout(0, 0));

		lbMain = new JLabel("QU\u1EA2N L\u00DD TH\u01AF VI\u1EC6N");
		lbMain.setIcon(new ImageIcon(MainFrame.class.getResource("/Image/icons8_business_network_40px.png")));
		lbMain.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lbMain.setHorizontalAlignment(SwingConstants.CENTER);
		pnMain.add(lbMain);
		pnMenu.setLayout(gl_pnMenu);
		getContentPane().setLayout(layout);

		pack();
		ChuyenManHinhController controller = new ChuyenManHinhController(pnView);
		controller.setView(pnTrangChu, lbTrangChu);
		List<DanhMucBean> listItem = new ArrayList<>();
		listItem.add(new DanhMucBean("TrangChu", pnTrangChu, lbTrangChu));
		listItem.add(new DanhMucBean("QuanLyThe", pnTheThuVien, lbThe));
		listItem.add(new DanhMucBean("QuanLyMuon", pnMuon, lbMuon));
		listItem.add(new DanhMucBean("QuanLySach", pnSach, lbSach));
		listItem.add(new DanhMucBean("QuanLyThuThu", pnThuThu, lbThuThu));
		listItem.add(new DanhMucBean("ThongKe", pnThongKe, lbThongKe));
		listItem.add(new DanhMucBean("QuanLyTra", pnTra, lbTra));
		listItem.add(new DanhMucBean("QuanLyDocGia", pnDocGia, lbDocGia));
		controller.setEvent(listItem);
	}
}
