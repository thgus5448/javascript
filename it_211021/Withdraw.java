package gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Withdraw extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1_1;
	private JTextField textField_1;
	private JLabel lblNewLabel_1_2;
	private JTextField textField_2;
	private JButton btnNewButton_1;

	/**
	 * Create the panel.
	 */
	public Withdraw() {
		setLayout(null);
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getTextField());
		add(getBtnNewButton());
		add(getLblNewLabel_1_1());
		add(getTextField_1());
		add(getLblNewLabel_1_2());
		add(getTextField_2());
		add(getBtnNewButton_1());

	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uCD9C\uAE08");
			lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 20));
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
	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(81, 45, 116, 21);
		}
		return textField;
	}
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.setBounds(203, 44, 66, 23);
		}
		return btnNewButton;
	}
	public JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("\uC608\uAE08\uC8FC");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1_1.setBounds(12, 76, 57, 15);
		}
		return lblNewLabel_1_1;
	}
	public JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(81, 73, 116, 21);
		}
		return textField_1;
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
			btnNewButton_1.setBounds(106, 132, 72, 23);
		}
		return btnNewButton_1;
	}
}
