package GUI;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import Controller.QuanLyTheController;

import java.awt.Font;
import com.toedter.calendar.JDateChooser;



public class QuanLyThe extends JPanel {
	private static final long serialVersionUID = 1L;
    private javax.swing.JButton btAdd;
    private javax.swing.JButton btInsert;
    private javax.swing.JButton btDelete;
    private javax.swing.JLabel lbMaDocGia;
    private javax.swing.JLabel lbGhiChu;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel lbMaThe;
    private javax.swing.JLabel lbNgayBatDau;
    private javax.swing.JLabel lbNgayKetThuc;
    private javax.swing.JPanel pnTable;
    private javax.swing.JPanel pnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtMaDocGia;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtMaThe;
	    private JLabel lbFind;
	public QuanLyThe() {

	     pnView = new javax.swing.JPanel();
	     pnView.setBackground(UIManager.getColor("Button.shadow"));
	        txtFind = new javax.swing.JTextField();
	        txtFind.setFont(new Font("Times New Roman", Font.PLAIN, 13));
	        lbMaThe = new javax.swing.JLabel();
	        lbMaThe.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        lbNgayBatDau = new javax.swing.JLabel();
	        lbNgayBatDau.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        lbNgayKetThuc = new javax.swing.JLabel();
	        lbNgayKetThuc.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        txtMaThe = new javax.swing.JTextField();
	        txtMaThe.setFont(new Font("Times New Roman", Font.PLAIN, 13));
	        lbMaDocGia = new javax.swing.JLabel();
	        lbMaDocGia.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        lbGhiChu = new javax.swing.JLabel();
	        lbGhiChu.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        jLabel12 = new javax.swing.JLabel();
	        txtMaDocGia = new javax.swing.JTextField();
	        txtMaDocGia.setFont(new Font("Times New Roman", Font.PLAIN, 13));
	        jScrollPane1 = new javax.swing.JScrollPane();
	        txtGhiChu = new javax.swing.JTextArea();
	        btAdd = new javax.swing.JButton();
	        btAdd.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        btInsert = new javax.swing.JButton();
	        btInsert.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        btDelete = new javax.swing.JButton();
	        btDelete.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        pnTable = new javax.swing.JPanel();

	        txtFind.setText("");

	        lbMaThe.setText("Mã Thẻ :");

	        lbNgayBatDau.setText("Ngày Bắt Đầu :");

	        lbNgayKetThuc.setText("Ngày Kết Thúc :");

	        txtMaThe.setText("");

	        lbMaDocGia.setText("         Mã  Độc Giả :");

	        lbGhiChu.setText("         Ghi Chú :");

	        jLabel12.setText("");

	        txtMaDocGia.setText("");

	        txtGhiChu.setColumns(20);
	        txtGhiChu.setRows(5);
	        jScrollPane1.setViewportView(txtGhiChu);

	        btAdd.setText("Thêm");

	        btInsert.setText("Sửa");

	        btDelete.setText("Xóa");
	        
	        lbFind = new JLabel("Nhập ký tự muốn tìm :");
	        lbFind.setFont(new Font("Times New Roman", Font.BOLD, 14));
	        
	        
	        JDateChooser txtNgayBatDau =  new com.toedter.calendar.JDateChooser();
	        txtNgayBatDau.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
	        txtNgayBatDau.setDateFormatString("dd/MM/yyyy");
	        
	        JDateChooser txtNgayKetThuc =  new com.toedter.calendar.JDateChooser();
	        txtNgayKetThuc.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
	        txtNgayKetThuc.setDateFormatString("dd/MM/yyyy");

	        javax.swing.GroupLayout gl_pnView = new javax.swing.GroupLayout(pnView);
	        gl_pnView.setHorizontalGroup(
	        	gl_pnView.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_pnView.createSequentialGroup()
	        			.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
	        				.addGroup(gl_pnView.createSequentialGroup()
	        					.addGap(68)
	        					.addGroup(gl_pnView.createParallelGroup(Alignment.TRAILING)
	        						.addGroup(gl_pnView.createSequentialGroup()
	        							.addGap(13)
	        							.addComponent(lbFind, GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
	        							.addGap(40)
	        							.addComponent(txtFind, GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE))
	        						.addGroup(gl_pnView.createSequentialGroup()
	        							.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING, false)
	        								.addComponent(lbMaThe, GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
	        								.addComponent(lbNgayBatDau, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        								.addComponent(lbNgayKetThuc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        							.addPreferredGap(ComponentPlacement.UNRELATED)
	        							.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
	        								.addComponent(txtNgayKetThuc, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
	        								.addComponent(txtMaThe, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
	        								.addComponent(txtNgayBatDau, GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
	        							.addPreferredGap(ComponentPlacement.UNRELATED)
	        							.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
	        								.addComponent(lbMaDocGia, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
	        								.addComponent(lbGhiChu, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
	        								.addComponent(jLabel12, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))))
	        					.addPreferredGap(ComponentPlacement.RELATED)
	        					.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
	        						.addComponent(jScrollPane1)
	        						.addComponent(txtMaDocGia, GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)))
	        				.addGroup(gl_pnView.createSequentialGroup()
	        					.addGap(165)
	        					.addComponent(btAdd, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
	        					.addGap(91)
	        					.addComponent(btInsert, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
	        					.addGap(94)
	        					.addComponent(btDelete, GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
	        					.addGap(148)))
	        			.addGap(149))
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
	        				.addComponent(lbMaDocGia)
	        				.addComponent(txtMaDocGia, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(18)
	        			.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
	        				.addGroup(gl_pnView.createSequentialGroup()
	        					.addGroup(gl_pnView.createParallelGroup(Alignment.TRAILING)
	        						.addGroup(gl_pnView.createParallelGroup(Alignment.BASELINE)
	        							.addComponent(lbNgayBatDau)
	        							.addComponent(lbGhiChu))
	        						.addComponent(txtNgayBatDau, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        					.addGap(18)
	        					.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
	        						.addComponent(txtNgayKetThuc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        						.addGroup(gl_pnView.createParallelGroup(Alignment.BASELINE)
	        							.addComponent(lbNgayKetThuc)
	        							.addComponent(jLabel12))))
	        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 100, GroupLayout.PREFERRED_SIZE))
	        			.addGroup(gl_pnView.createParallelGroup(Alignment.LEADING)
	        				.addGroup(gl_pnView.createSequentialGroup()
	        					.addGap(17)
	        					.addGroup(gl_pnView.createParallelGroup(Alignment.BASELINE)
	        						.addComponent(btAdd)
	        						.addComponent(btInsert)))
	        				.addGroup(gl_pnView.createSequentialGroup()
	        					.addGap(18)
	        					.addComponent(btDelete)))
	        			.addGap(30))
	        );
	        pnView.setLayout(gl_pnView);

	        pnTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

	        javax.swing.GroupLayout gl_pnTable = new javax.swing.GroupLayout(pnTable);
	        pnTable.setLayout(gl_pnTable);
	        gl_pnTable.setHorizontalGroup(
	            gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 0, Short.MAX_VALUE)
	        );
	        gl_pnTable.setVerticalGroup(
	            gl_pnTable.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGap(0, 366, Short.MAX_VALUE)
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
	        
	        QuanLyTheController controller = new QuanLyTheController(pnTable, txtFind, txtMaThe, txtMaDocGia, txtGhiChu, btAdd, btDelete, btInsert, txtNgayBatDau, txtNgayKetThuc);
	        controller.setDateToTable();
	    }
	}
	