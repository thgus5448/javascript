package Collect;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class MapModify extends JPanel {
	private JLabel lblNewLabel;
	private JTextField code;
	private JLabel lblNewLabel_1;
	private JTextField codeName;
	private JLabel lblNewLabel_2;
	private JTextField ea;
	private JTextField price;
	private JLabel lblNewLabel_3;
	private JSeparator separator;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_1_1;

	/**
	 * Create the panel.
	 */
	public MapModify() {
		setLayout(null);
		add(getLblNewLabel());
		add(getCode());
		add(getLblNewLabel_1());
		add(getCodeName());
		add(getLblNewLabel_2());
		add(getEa());
		add(getPrice());
		add(getLblNewLabel_3());
		add(getSeparator());
		add(getBtnNewButton());
		add(getBtnNewButton_1());
		add(getBtnNewButton_1_1());

	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uCF54\uB4DC");
			lblNewLabel.setBounds(133, 39, 24, 15);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		}
		return lblNewLabel;
	}
	public JTextField getCode() {
		if (code == null) {
			code = new JTextField();
			code.setBounds(180, 36, 116, 21);
			code.setColumns(10);
		}
		return code;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uCF54\uB4DC\uBA85");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(116, 98, 57, 15);
		}
		return lblNewLabel_1;
	}
	public JTextField getCodeName() {
		if (codeName == null) {
			codeName = new JTextField();
			codeName.setColumns(10);
			codeName.setBounds(180, 95, 116, 21);
		}
		return codeName;
	}
	public JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC218\uB7C9");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(116, 141, 57, 15);
		}
		return lblNewLabel_2;
	}
	public JTextField getEa() {
		if (ea == null) {
			ea = new JTextField();
			ea.setColumns(10);
			ea.setBounds(180, 138, 116, 21);
		}
		return ea;
	}
	public JTextField getPrice() {
		if (price == null) {
			price = new JTextField();
			price.setColumns(10);
			price.setBounds(180, 179, 116, 21);
		}
		return price;
	}
	public JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uB2E8\uAC00");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(116, 182, 57, 15);
		}
		return lblNewLabel_3;
	}
	public JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(12, 68, 426, 2);
		}
		return separator;
	}
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.setBounds(308, 35, 97, 23);
		}
		return btnNewButton;
	}
	public JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC218\uC815");
			btnNewButton_1.setBounds(130, 236, 97, 23);
		}
		return btnNewButton_1;
	}
	public JButton getBtnNewButton_1_1() {
		if (btnNewButton_1_1 == null) {
			btnNewButton_1_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1_1.setBounds(239, 236, 97, 23);
		}
		return btnNewButton_1_1;
	}
}
