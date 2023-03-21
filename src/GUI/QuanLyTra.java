package GUI;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.LineBorder;

import Controller.QuanLyTraController;

import java.awt.Color;

public class QuanLyTra extends JPanel {

	private static final long serialVersionUID = 1L;
	 private javax.swing.JButton btAdd;
	    private javax.swing.JButton btInsert;
	    private javax.swing.JButton btDelete;
	    private com.toedter.calendar.JDateChooser txtNgayTra;
	    private javax.swing.JLabel lbFind;
	    private javax.swing.JLabel lbMaSach;
	    private javax.swing.JLabel lbMaThuThu;
	    private javax.swing.JLabel lbMaThe;
	    private javax.swing.JLabel lbNgayTra;
	    private javax.swing.JPanel pnView;
	    private javax.swing.JPanel pnTable;
	    private javax.swing.JTextField txtMaThe;
	    private javax.swing.JTextField txtMaSach;
	    private javax.swing.JTextField txtMaThuThu;
	    private javax.swing.JTextField txtFind;

	public QuanLyTra() {
		pnView = new javax.swing.JPanel();
		pnView.setBackground(UIManager.getColor("Button.shadow"));
        txtFind = new javax.swing.JTextField();
        lbMaThe = new javax.swing.JLabel();
        lbNgayTra = new javax.swing.JLabel();
        txtMaThe = new javax.swing.JTextField();
        lbMaSach = new javax.swing.JLabel();
        lbMaThuThu = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        txtMaThuThu = new javax.swing.JTextField();
        txtNgayTra = new com.toedter.calendar.JDateChooser();
        txtNgayTra.setDateFormatString("dd/MM/yyyy");
        btAdd = new javax.swing.JButton();
        btInsert = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        lbFind = new javax.swing.JLabel();
        pnTable = new javax.swing.JPanel();
        pnTable.setBorder(new LineBorder(new Color(0, 0, 0)));

        txtFind.setText("");

        lbMaThe.setText("Mã Thẻ :");

        lbNgayTra.setText("Ngày Trả :");

        txtMaThe.setText("");

        lbMaSach.setText("    Mã Sách :");

        lbMaThuThu.setText("    Mã Thủ Thư :");

        txtMaSach.setText("");

        txtMaThuThu.setText("");

        btAdd.setText("Thêm");

        btInsert.setText("Sửa");

        btDelete.setText("Xóa");

        lbFind.setText("Chọn ký tự bạn muốn tìm :");

        javax.swing.GroupLayout gl_pnView = new javax.swing.GroupLayout(pnView);
        gl_pnView.setHorizontalGroup(
        	gl_pnView.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnView.createSequentialGroup()
        			.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_pnView.createSequentialGroup()
        					.addGap(56)
        					.addComponent(lbFind, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
        					.addGap(40)
        					.addComponent(txtFind, GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
        					.addGap(120))
        				.addGroup(gl_pnView.createSequentialGroup()
        					.addGap(88)
        					.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
        						.addComponent(lbMaThe, GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
        						.addComponent(lbNgayTra, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtMaThe, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        						.addComponent(txtNgayTra, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
        						.addComponent(lbMaSach, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        						.addComponent(lbMaThuThu, GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE))
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
        						.addComponent(txtMaSach, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
        						.addComponent(txtMaThuThu, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)))
        				.addGroup(gl_pnView.createSequentialGroup()
        					.addGap(140)
        					.addComponent(btAdd, GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        					.addGap(107)
        					.addComponent(btInsert, GroupLayout.PREFERRED_SIZE, 49, Short.MAX_VALUE)
        					.addGap(79)
        					.addComponent(btDelete, GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        					.addGap(100)))
        			.addGap(80))
        );
        gl_pnView.setVerticalGroup(
        	gl_pnView.createParallelGroup(Alignment.LEADING)
        		.addGroup(gl_pnView.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(gl_pnView.createParallelGroup(Alignment.BASELINE)
        				.addComponent(txtFind, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbFind))
        			.addGap(18)
        			.addGroup(gl_pnView.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lbMaThe)
        				.addComponent(txtMaThe, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lbMaSach)
        				.addComponent(txtMaSach, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
        				.addGroup(gl_pnView.createParallelGroup(Alignment.BASELINE)
        					.addComponent(lbNgayTra)
        					.addComponent(lbMaThuThu)
        					.addComponent(txtMaThuThu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        				.addComponent(txtNgayTra, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(30)
        			.addGroup(gl_pnView.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btAdd)
        				.addComponent(btInsert)
        				.addComponent(btDelete))
        			.addContainerGap())
        );
        pnView.setLayout(gl_pnView);

        javax.swing.GroupLayout gl_pnTable = new javax.swing.GroupLayout(pnTable);
        pnTable.setLayout(gl_pnTable);
        gl_pnTable.setHorizontalGroup(
            gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        gl_pnTable.setVerticalGroup(
            gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
     QuanLyTraController controller = new QuanLyTraController(pnTable, txtFind,  txtMaThe, txtMaThuThu,
				txtMaSach, btAdd, btDelete, btInsert, txtNgayTra);
		controller.setDateToTable();
	}
}
