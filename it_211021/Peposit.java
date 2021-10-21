package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Peposit extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField ano;
	private JLabel lblNewLabel_1_1;
	private JTextField owner;
	private JLabel lblNewLabel_1_2;
	private JTextField balance;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JLabel status;

	/**
	 * Create the panel.
	 */
	public Peposit() {
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getAno());
		add(getLblNewLabel_1_1());
		add(getOwner());
		add(getLblNewLabel_1_2());
		add(getBalance());
		add(getBtnNewButton());
		add(getBtnNewButton_1());
		add(getStatus());

	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC608\uAE08");
			lblNewLabel.setBounds(12, 10, 80, 24);
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		}
		return lblNewLabel;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uACC4\uC88C\uBC88\uD638");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setBounds(12, 44, 57, 15);
		}
		return lblNewLabel_1;
	}
	public JTextField getAno() {
		if (ano == null) {
			ano = new JTextField();
			ano.setBounds(81, 41, 116, 21);
			ano.setColumns(10);
		}
		return ano;
	}
	public JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("\uC608\uAE08\uC8FC");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1_1.setBounds(12, 72, 57, 15);
		}
		return lblNewLabel_1_1;
	}
	public JTextField getOwner() {
		if (owner == null) {
			owner = new JTextField();
			owner.setColumns(10);
			owner.setBounds(81, 69, 116, 21);
		}
		return owner;
	}
	public JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("\uC608\uAE08\uC561");
			lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1_2.setBounds(12, 100, 57, 15);
		}
		return lblNewLabel_1_2;
	}
	public JTextField getBalance() {
		if (balance == null) {
			balance = new JTextField();
			balance.setColumns(10);
			balance.setBounds(81, 97, 116, 21);
		}
		return balance;
	}
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("검색");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String find = ano.getText();
					boolean b = true;
					for(Account ac : BankApplication.accountArray) {
						if(ac == null) break;
						if(find.equals( ac.getAno() ) ) {
							b = false; //데이터를 찾은경우
							owner.setText( ac.getOwner() );
						}
					}
					if(b == true) {
						status.setText("계좌번호를 확인하세요.");
						ano.requestFocus();
					}
				}
			});
			btnNewButton.setBounds(203, 40, 73, 23);
		}
		return btnNewButton;
	}
	public JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("예금");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
				}
			});
			btnNewButton_1.setBounds(106, 128, 73, 23);
		}
		return btnNewButton_1;
	}
	public JLabel getStatus() {
		if (status == null) {
			status = new JLabel("\uACC4\uC88C\uBC88\uD638\uB97C \uC785\uB825\uD55C \uD6C4 \uAC80\uC0C9\uD558\uC138\uC694.");
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setForeground(Color.RED);
			status.setBounds(23, 184, 253, 32);
		}
		return status;
	}
}
