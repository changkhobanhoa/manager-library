package GUI;

import javax.swing.*;

import Controller.QuanLyThongKeController;

import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class ThongKe extends JPanel {
	private static final long serialVersionUID = 1L;
	private QuanLyThongKeController controller;
	private javax.swing.JButton btFind;
	private javax.swing.JComboBox<String> cb;
	private javax.swing.JLabel lbFind;
	private javax.swing.JPanel pnQuery;
	private javax.swing.JPanel pnView;

	public ThongKe() {
		pnQuery = new javax.swing.JPanel();
		pnQuery.setBackground(UIManager.getColor("Button.shadow"));
		btFind = new javax.swing.JButton();
		btFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (cb.getSelectedIndex() == 0) {
					controller = new QuanLyThongKeController();
					controller.setDateToChart2(pnView);
				} else if (cb.getSelectedIndex() == 1) {
					controller = new QuanLyThongKeController();
					controller.setDateToChart1(pnView);
				} else if (cb.getSelectedIndex() == 2) {
					controller = new QuanLyThongKeController();
					controller.setDateToChart3(pnView);
				} else if (cb.getSelectedIndex() == 3) {
					controller = new QuanLyThongKeController();
					controller.setDateToChart4(pnView);
				}
			}
		});
		lbFind = new javax.swing.JLabel();
		cb = new javax.swing.JComboBox<>();
		pnView = new javax.swing.JPanel();

		btFind.setText("Xác Nhận");

		lbFind.setText("Chọn dữ liệu để thống kê :");

		cb.setModel(new DefaultComboBoxModel<String>(new String[] {"Sách", "Mượn ", "Trả", "Chưa Trả"}));

		javax.swing.GroupLayout gl_pnQuery = new javax.swing.GroupLayout(pnQuery);
		gl_pnQuery.setHorizontalGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnQuery.createSequentialGroup().addGap(18)
						.addComponent(lbFind, GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(cb, 0, 171, Short.MAX_VALUE)
						.addGap(18).addComponent(btFind, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE).addGap(30)));
		gl_pnQuery.setVerticalGroup(gl_pnQuery.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_pnQuery.createSequentialGroup().addGap(15)
						.addGroup(gl_pnQuery.createParallelGroup(Alignment.BASELINE).addComponent(btFind)
								.addComponent(lbFind).addComponent(cb, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addContainerGap()));
		pnQuery.setLayout(gl_pnQuery);

		pnView.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

		javax.swing.GroupLayout gl_pnView = new javax.swing.GroupLayout(pnView);
		pnView.setLayout(gl_pnView);
		gl_pnView.setHorizontalGroup(
				gl_pnView.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 0, Short.MAX_VALUE));
		gl_pnView.setVerticalGroup(gl_pnView.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGap(0,
				238, Short.MAX_VALUE));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(pnQuery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(pnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(pnQuery, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, 0).addComponent(pnView, javax.swing.GroupLayout.DEFAULT_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
	}

}
