package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CreateAccount extends JPanel {
	private JLabel lblNewLabel;
	private JTextField ano;
	private JLabel lblNewLabel_1;
	private JTextField owner;
	private JLabel lblNewLabel_1_1;
	private JTextField ballence;
	private JButton btnNewButton;
	private JLabel lblNewLabel_2;

	/**
	 * Create the panel.
	 */
	public CreateAccount() {
		setLayout(null);
		add(getLabel_1());
		add(getAno());
		add(getLblNewLabel_1());
		add(getOwner());
		add(getLblNewLabel_1_1());
		add(getBallence());
		add(getBtnNewButton());
		add(getLblNewLabel_2());

	}
	public JLabel getLabel_1() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uACC4\uC88C\uBC88\uD638");
			lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel.setBounds(35, 66, 64, 15);
		}
		return lblNewLabel;
	}
	public JTextField getAno() {
		if (ano == null) {
			ano = new JTextField();
			ano.setBounds(111, 63, 116, 21);
			ano.setColumns(10);
		}
		return ano;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("계좌 생성");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setBounds(35, 93, 64, 15);
		}
		return lblNewLabel_1;
	}
	public JTextField getOwner() {
		if (owner == null) {
			owner = new JTextField();
			owner.setColumns(10);
			owner.setBounds(111, 90, 116, 21);
		}
		return owner;
	}
	public JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("\uCD08\uAE30\uAE08\uC785\uB825");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1_1.setBounds(35, 121, 64, 15);
		}
		return lblNewLabel_1_1;
	}
	public JTextField getBallence() {
		if (ballence == null) {
			ballence = new JTextField();
			ballence.setColumns(10);
			ballence.setBounds(111, 118, 116, 21);
		}
		return ballence;
	}
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("생성");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//1)Account 생성
					//2)accountArray 추가
					//3)cnt증가
					String a = ano.getText();
					String o = owner.getText();
					long b = Long.parseLong( balance.getText() );
					Account ac = new Account(a, o, b);
					int cnt = (int)BankApplication.cnt;
						//BankApplication은 8바이트(long)인데 int는 4바이트이므로 형변환을 해주어야함.
					BankApplication.accountArray[cnt] = ac;
					BankApplication.cnt++;
					
					BankApplication.accountArray[cnt] = ac;
				}
			});
			btnNewButton.setBounds(99, 161, 64, 32);
		}
		return btnNewButton;
	}
	public JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uACC4\uC88C \uC0DD\uC131");
			lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 20));
			lblNewLabel_2.setBounds(12, 10, 98, 24);
		}
		return lblNewLabel_2;
	}
}
