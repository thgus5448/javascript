package db;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuestModify extends JPanel {
	private JLabel lblNewLabel;
	private JTextField num;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_2;
	private JTextField textField_1;
	private JTextArea textArea;
	private JButton btnNewButton;
	private JButton btnNewButton_1;

	/**
	 * Create the panel.
	 */
	public GuestModify() {
		setLayout(null);
		add(getLblNewLabel());
		add(getNum());
		add(getLblNewLabel_1());
		add(getTextField());
		add(getLblNewLabel_1_1());
		add(getLblNewLabel_1_2());
		add(getTextField_1());
		add(getTextArea());
		add(getBtnNewButton());
		add(getBtnNewButton_1());

	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC21C\uBC88");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(23, 10, 57, 15);
		}
		return lblNewLabel;
	}
	public JTextField getNum() {
		if (num == null) {
			num = new JTextField();
			num.setBounds(92, 7, 273, 21);
			num.setColumns(10);
		}
		return num;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC791\uC131\uC790");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(23, 44, 57, 15);
		}
		return lblNewLabel_1;
	}
	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(92, 41, 273, 21);
		}
		return textField;
	}
	public JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("\uB0A0\uC9DC");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_1.setBounds(23, 77, 57, 15);
		}
		return lblNewLabel_1_1;
	}
	public JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("\uB0B4\uC6A9");
			lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1_2.setBounds(23, 114, 57, 15);
		}
		return lblNewLabel_1_2;
	}
	public JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(92, 74, 273, 21);
		}
		return textField_1;
	}
	public JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(92, 115, 280, 142);
		}
		return textArea;
	}
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("수정");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(dao == null) {
						dao = new GuestBookVo();
					}
						GuestBookVo vo = new GuestBookVo();
						vo.setNum( Integer.paseInt(num.getText()) ); 
						vo.setMid( mid.getText() );
						vo.setMdate( mdate.getText() );
						vo.setDoc( doc.getText() );
						vo.setPwd( pwd.getText() );
						
						boolean r = dao.update(vo);
						if(r) {
							GuestBookMain.status.setText("자료가 정상적으로 수정됨");
						} else {
							GuestBookMain.status.setText("수정중 오류 발생");
						}
						
			
				}
			});
			btnNewButton.setBounds(124, 267, 97, 23);
		}
		return btnNewButton;
	}
	public JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("\uC0AD\uC81C");
			btnNewButton_1.setBounds(233, 267, 97, 23);
		}
		return btnNewButton_1;
	}
}
