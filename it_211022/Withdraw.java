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

public class Withdraw extends JPanel {
	
	private Account account;
	
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField ano;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1_1;
	private JTextField owner;
	private JLabel lblNewLabel_1_2;
	private JTextField textField_2;
	private JButton btnNewButton_1;
	private JLabel result;
	private JButton search;
	
	
	/**
	 * Create the panel.
	 */
	public Withdraw() {
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getAno());
		add(getLblNewLabel_1_1());
		add(getOwner());
		add(getLblNewLabel_1_2());
		add(getTextField_2());
		add(getBtnNewButton_1());
		add(getResult());
		add(getSearch());

	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uCD9C\uAE08");
			lblNewLabel.setFont(new Font("����", Font.BOLD, 20));
			lblNewLabel.setBounds(12, 10, 80, 24);
		}
		return lblNewLabel;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uACC4\uC88C\uBC88\uD638");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setBounds(12, 48, 57, 15);
		}
		return lblNewLabel_1;
	}
	public JTextField getAno() {
		if (ano == null) {
			ano = new JTextField();
			ano.setColumns(10);
			ano.setBounds(81, 45, 116, 21);
		}
		return ano;
	}
	public JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("\uC608\uAE08\uC8FC");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1_1.setBounds(12, 76, 57, 15);
		}
		return lblNewLabel_1_1;
	}
	public JTextField getOwner() {
		if (owner == null) {
			owner = new JTextField();
			owner.setColumns(10);
			owner.setBounds(81, 73, 116, 21);
		}
		return owner;
	}
	public JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("\uC608\uAE08\uC561");
			lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1_2.setBounds(12, 104, 57, 15);
		}
		return lblNewLabel_1_2;
	}
	public JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setColumns(10);
			textField_2.setBounds(81, 101, 116, 21);
		}
		return textField_2;
	}
	public JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uCD9C\uAE08");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton_1.setBounds(106, 132, 72, 23);
		}
		return btnNewButton_1;
	}
	public JLabel getResult() {
		if (result == null) {
			result = new JLabel("\uACC4\uC88C\uBC88\uD638\uB97C \uB2E4\uC2DC \uD655\uC778\uD574\uC8FC\uC138\uC694.");
			result.setForeground(Color.RED);
			result.setFont(new Font("����", Font.PLAIN, 14));
			result.setHorizontalAlignment(SwingConstants.CENTER);
			result.setBounds(32, 193, 234, 15);
		}
		return result;
	}
	
	//�˻���ư
	public JButton getSearch() {
		if (search == null) {
			search = new JButton("\uAC80\uC0C9");
			search.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//�˻���ư Ŭ������ ��
					String find = ano.getText(); //�Է��� ���¹�ȣ ��������
					boolean check = true; //�˻������ ã���������� : true
		
					//accountArray�迭�ȿ��� �Է��� ���¹�ȣ ã��
					for(Account ac : BankApplication.accountArray) {
						
						//���¹�ȣ�� �������� �ʴ´ٸ�
						if(ac == null) {
							result.setText("�������� �ʴ� ���¹�ȣ�Դϴ�.");
						}
						
						//�´� ���¹�ȣ�� ã�Ҵٸ�
						if( find.equals(ac.getAno()) ) {
							check = false;
							owner.setText( ac.getOwner() );	 //������ �̸��� ��������
							account = ac;
						}
					}
					//���¹�ȣ�� ǥ�õ��������� �ؽ�Ʈ
					if(check = true) {
						reseult.setText("���¹�ȣ�� �Է����ּ���.");
					}
					
				}
			});
			search.setBounds(206, 44, 97, 23);
		}
		return search;
	}
}
