package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AccountList extends JPanel {
	private JLabel lblNewLabel;
	private JTextField textField;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JLabel lblNewLabel_1;

	/**
	 * Create the panel.
	 */
	public AccountList() {
		setLayout(null);
		add(getLblNewLabel());
		add(getTextField());
		add(getBtnNewButton());
		add(getScrollPane());
	}
	
	public void list(String find) {
		// accountArray의 모든 값을 textarea에 표시
		textArea.setText("");
		for(Account ac : BankApplication.accountArray) {
			if(ac == null) break;
			
			/* 미션)계좌번호 또는 예금주를 기준으로 accountArray를 조회하여 
			 * 조건에 맞는 데이터만 출력
			 */
			if( find.equals( ac.getAno() ) || find.equals( ac.getOwner() ) ) { 
				String temp = String.format( "%s [ %s ] : %d \n", 
												ac.getAno(), 
												ac.getOwner(), 
												ac.getBalance() );
				textArea.append(temp);
		    }else if(find.equals("")) {
		    	String temp = String.format("%s [ %s ] : %d \n", ac.getAno(), ac.getOwner(), ac.getBalance());
		        textArea.append(temp);
		    	}

		}
	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uACC4\uC88C\uC870\uD68C");
			lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
			lblNewLabel.setBounds(12, 10, 98, 24);
		}
		return lblNewLabel;
	}
	
	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(12, 64, 226, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("검색");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String find = textField.getText();
					list(find);
				}
			});
			btnNewButton.setBounds(250, 63, 60, 23);
		}
		return btnNewButton;
	}
	
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 95, 299, 170);
			scrollPane.setViewportView(getTextArea());
			scrollPane.setColumnHeaderView(getLblNewLabel_1());
		}
		return scrollPane;
	}
	
	public JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uACC4\uC88C \uBAA9\uB85D");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel_1;
	}
}
