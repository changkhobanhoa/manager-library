package Controller;

import javax.swing.*;

import GUI.MainFrame;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import service.*;
import model.*;

public class DangNhapController  {
	private JDialog dialog;
	private JButton login;
	private JTextField txtuser;
	private JPasswordField txtpass;
	private JLabel lberror;

	private TaiKhoanService taikhoanService = null;

	public DangNhapController(JDialog dialog, JButton login, JTextField txtuser, JPasswordField txtpass,
			JLabel lbrror) {
		this.dialog = dialog;
		this.login = login;
		this.txtuser = txtuser;
		this.txtpass = txtpass;
		this.lberror = lbrror;

		taikhoanService = new TaiKhoanServiceImpl();
	}

	
	public void setEvent() {
		
		login.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (txtuser.getText().length() == 0 || String.valueOf(txtpass.getPassword()).length() == 0) {
					lberror.setText("Vui lòng nhập dữ liệu bắt buộc!");
				} else {
					TaiKhoan tk = taikhoanService.login(txtuser.getText(), String.valueOf(txtpass.getPassword()));
					if (tk == null) {
						lberror.setText("Tên Đăng Nhập hoặc Mật Khẩu không đúng");

					} else {
						dialog.dispose();
						MainFrame frame = new MainFrame();
						frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
						frame.setVisible(true);
					}
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				login.setBackground(new Color(0, 200, 83));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				login.setBackground(new Color(100, 221, 23));
			}

		});
		txtpass.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				  if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					  if (txtuser.getText().length() == 0 || String.valueOf(txtpass.getPassword()).length() == 0) {
							lberror.setText("Vui lòng nhập dữ liệu bắt buộc!");
						} else {
							TaiKhoan tk = taikhoanService.login(txtuser.getText(), String.valueOf(txtpass.getPassword()));
							if (tk == null) {
								lberror.setText("Tên Đăng Nhập hoặc Mật Khẩu không đúng");

							} else {
								dialog.dispose();
								MainFrame frame = new MainFrame();
								frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
								frame.setVisible(true);
							}
						}
			}
			}
		});
	}
	
}
