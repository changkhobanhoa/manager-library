package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class DieuKhoan extends JDialog {
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();


	public DieuKhoan(JFrame p,boolean m) {
		super(p,m);
		setBounds(100, 100, 493, 566);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JTextPane txtpniuKhonNgi = new JTextPane();
			txtpniuKhonNgi.setForeground(Color.BLACK);
			txtpniuKhonNgi.setBackground(Color.LIGHT_GRAY);
			txtpniuKhonNgi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
			txtpniuKhonNgi.setText("                                          \u0110I\u1EC0U KHO\u1EA2N NG\u01AF\u1EDCI D\u00D9NG\r\n-\t\u0110\u0103ng nh\u1EADp v\u00E0o h\u1EC7 th\u1ED1ng. M\u1ED7i ng\u01B0\u1EDDi d\u00F9ng \u0111\u1EC1u \u0111\u01B0\u1EE3c c\u1EA5p t\u00E0i kho\u1EA3n g\u1ED3m username v\u00E0 password. Nh\u1EADp \u0111\u00FAng s\u1EBD \u0111\u0103ng nh\u1EADp h\u1EC7 th\u1ED1ng th\u00E0nh c\u00F4ng, v\u00E0 ng\u01B0\u1EE3c l\u1EA1i.\r\n-\tTrong h\u1EC7 th\u1ED1ng s\u1EBD g\u1ED3m c\u00E1c m\u1EE5c qu\u1EA3n l\u00ED sau:\r\n+ Qu\u1EA3n l\u00ED s\u00E1ch: g\u1ED3m c\u00E1c th\u00F4ng tin nh\u01B0 m\u00E3 s\u00E1ch, t\u00EAn s\u00E1ch, th\u1EC3 lo\u1EA1i, t\u00F3m t\u1EAFt, t\u00E1c gi\u1EA3,\u2026.Khi nh\u1EADp, x\u00F3a, ch\u1EC9nh s\u1EEDa c\u00E1c th\u00F4ng tin s\u00E1ch, tr\u1EF1c ti\u1EBFp nh\u1EADp, ch\u1EC9nh s\u1EEDa, x\u00F3a tr\u00EAn b\u1EA3ng s\u00E1ch m\u00E0 kh\u00F4ng c\u1EA7n th\u00F4ng qua b\u01B0\u1EDBc n\u00E0o. C\u00E1c th\u00F4ng tin ch\u1EC9nh s\u1EEDa \u1EDF \u0111\u00E2y \u1EA3nh h\u01B0\u1EDFng l\u00EAn th\u00F4ng tin tr\u00EAn th\u00F4ng tin m\u01B0\u1EE3n, tr\u1EA3, th\u1EBB th\u01B0 vi\u1EC7n\r\n+ Qu\u1EA3n l\u00ED \u0111\u1ED9c gi\u1EA3: g\u1ED3m c\u00E1c th\u00F4ng tin nh\u01B0 m\u00E3 \u0111\u1ED9c gi\u1EA3, t\u00EAn, lo\u1EA1i \u0111\u1ED9c gi\u1EA3.. Khi nh\u1EADp, x\u00F3a, ch\u1EC9nh s\u1EEDa c\u00E1c th\u00F4ng tin s\u00E1ch, tr\u1EF1c ti\u1EBFp nh\u1EADp, ch\u1EC9nh s\u1EEDa, x\u00F3a tr\u00EAn b\u1EA3ng \u0111\u1ED9c gi\u1EA3 m\u00E0 kh\u00F4ng c\u1EA7n th\u00F4ng qua b\u01B0\u1EDBc n\u00E0o. C\u00E1c th\u00F4ng tin ch\u1EC9nh s\u1EEDa \u1EDF \u0111\u00E2y \u1EA3nh h\u01B0\u1EDFng l\u00EAn th\u00F4ng tin tr\u00EAn th\u1EBB th\u01B0 vi\u1EC7n, m\u01B0\u1EE3n, tr\u1EA3.\r\n+ Qu\u1EA3n l\u00ED m\u01B0\u1EE3n, tr\u1EA3: Mu\u1ED1n x\u00F3a, ch\u1EC9nh s\u1EEDa, th\u00EAm th\u00F4ng tin m\u01B0\u1EE3n tr\u1EA3 t  x\u00F3a th\u00F4ng tin th\u1EBB tr\u01B0\u1EDBc. C\u00E1c th\u00F4ng tin ch\u1EC9nh s\u1EEDa \u1EDF \u0111\u00E2y \u1EA3nh h\u01B0\u1EDFng l\u00EAn th\u00F4ng tin tr\u00EAn th\u1EBB th\u01B0 vi\u1EC7n\r\n+Qu\u1EA3n l\u00ED th\u1EBB: Mu\u1ED1n x\u00F3a, ch\u1EC9nh s\u1EEDa, th\u00EAm th\u00F4ng tin th\u1EBB, ph\u1EA3i x\u00F3a th\u00F4ng tin \u0111\u1ED9c gi\u1EA3 tr\u01B0\u1EDBc. C\u00E1c th\u00F4ng tin ch\u1EC9nh s\u1EEDa \u1EDF \u0111\u00E2y \u1EA3nh h\u01B0\u1EDFng l\u00EAn th\u00F4ng tin tr\u00EAn \u0111\u1ED9c gi\u1EA3.\r\n+ Qu\u1EA3n l\u00ED th\u1EE7 th\u01B0: Trong m\u1EE5c n\u00E0y, qu\u1EA3n l\u00ED c\u00E1c th\u00F4ng tin li\u00EAn quan \u0111\u1EBFn th\u1EE7 th\u01B0. Ch\u1EC9nh s\u1EEDa, x\u00F3a, th\u00EAm tr\u1EF1c ti\u1EBFp v\u00E0o b\u1EA3ng th\u1EE7 th\u01B0 m\u00E0 kh\u00F4ng c\u1EA7n th\u00F4ng qua b\u01B0\u1EDBc n\u00E0o. C\u00E1c th\u00F4ng tin ch\u1EC9nh s\u1EEDa \u1EDF \u0111\u00E2y \u1EA3nh h\u01B0\u1EDFng l\u00EAn th\u00F4ng tin tr\u00EAn th\u00F4ng tin m\u01B0\u1EE3n, tr\u1EA3 v\u00EC th\u1EE7 th\u01B0 l\u00E0 ng\u01B0\u1EDDi k\u00ED x\u00E1c nh\u1EADn cho m\u1ED7i l\u1EA7n m\u01B0\u1EE3n, tr\u1EA3.\r\n+ Th\u1ED1ng k\u00EA: D\u1EF1a v\u00E0o s\u1ED1 li\u1EC7u t\u1EEB c\u00E1c b\u1EA3ng m\u00E0 h\u1EC7 th\u1ED1ng c\u00F3 th\u1EC3 th\u1ED1ng k\u00EA c\u00E1c m\u1EE5c sau:\r\n\u2022\tTh\u1EC3 lo\u1EA1i s\u00E1ch\r\n\u2022\tS\u1ED1 s\u00E1ch \u0111\u01B0\u1EE3c m\u01B0\u1EE3n nhi\u1EC1u nh\u1EA5t\r\n\u2022\tTh\u1EBB th\u01B0 vi\u1EC7n m\u01B0\u1EE3n nhi\u1EC1u s\u00E1ch nh\u1EA5t\r\n\r\n");
			txtpniuKhonNgi.setEditable(false);
			contentPanel.add(txtpniuKhonNgi);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setFont(new Font("Times New Roman", Font.BOLD, 14));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}

}
