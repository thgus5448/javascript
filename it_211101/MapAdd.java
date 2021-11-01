package Collect;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MapAdd extends JPanel {
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JTextField code;
	private JTextField codeName;
	private JTextField ea;
	private JTextField price;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public MapAdd() {
		setLayout(null);
		add(getLabel_1());
		add(getLblNewLabel_1());
		add(getLblNewLabel_2());
		add(getLblNewLabel_3());
		add(getCode());
		add(getCodeName());
		add(getEa());
		add(getPrice());
		add(getBtnNewButton());

	}
	public JLabel getLabel_1() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uCF54\uB4DC");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(112, 54, 57, 15);
		}
		return lblNewLabel;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uCF54\uB4DC\uBA85");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(112, 89, 57, 15);
		}
		return lblNewLabel_1;
	}
	public JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("\uC218\uB7C9");
			lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_2.setBounds(112, 126, 57, 15);
		}
		return lblNewLabel_2;
	}
	public JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uB2E8\uAC00");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(112, 164, 57, 15);
		}
		return lblNewLabel_3;
	}
	public JTextField getCode() {
		if (code == null) {
			code = new JTextField();
			code.setBounds(176, 51, 116, 21);
			code.setColumns(10);
		}
		return code;
	}
	public JTextField getCodeName() {
		if (codeName == null) {
			codeName = new JTextField();
			codeName.setColumns(10);
			codeName.setBounds(176, 86, 116, 21);
		}
		return codeName;
	}
	public JTextField getEa() {
		if (ea == null) {
			ea = new JTextField();
			ea.setColumns(10);
			ea.setBounds(176, 123, 116, 21);
		}
		return ea;
	}
	public JTextField getPrice() {
		if (price == null) {
			price = new JTextField();
			price.setColumns(10);
			price.setBounds(176, 161, 116, 21);
		}
		return price;
	}
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.setBounds(177, 212, 97, 23);
		}
		return btnNewButton;
	}
}
