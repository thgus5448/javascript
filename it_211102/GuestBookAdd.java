package db;

import javax.swing.JPanel;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.awt.event.ActionEvent;

public class GuestBookAdd extends JPanel {
	
	GuestBookDao dao;
	
	private JLabel lblNewLabel;
	private JTextField mid;
	private JLabel lblNewLabel_1;
	private JTextField mdate;
	private JTextArea textArea;
	private JLabel lblNewLabel_3;
	private JTextField textField;
	private JButton btnNewButton;

	/**
	 * Create the panel.
	 */
	public GuestBookAdd() {
		setLayout(null);
		add(getLblNewLabel());
		add(getMid());
		add(getLblNewLabel_1());
		add(getMdate());
		add(getTextArea());
		add(getLblNewLabel_3());
		add(getTextField());
		add(getBtnNewButton());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String now = sdf.format(new Date());
		getMdate().setText(now);
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC791\uC131\uC790");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(12, 10, 57, 15);
		}
		return lblNewLabel;
	}
	public JTextField getMid() {
		if (mid == null) {
			mid = new JTextField();
			mid.setBounds(81, 7, 116, 21);
			mid.setColumns(10);
		}
		return mid;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uB0A0\uC9DC");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_1.setBounds(214, 10, 57, 15);
		}
		return lblNewLabel_1;
	}
	public JTextField getMdate() {
		if (mdate == null) {
			mdate = new JTextField();
			mdate.setColumns(10);
			mdate.setBounds(277, 7, 146, 21);
		}
		return mdate;
	}
	public JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(12, 47, 426, 201);
		}
		return textArea;
	}
	public JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel("\uC554\uD638");
			lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_3.setBounds(12, 264, 57, 15);
		}
		return lblNewLabel_3;
	}
	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(81, 261, 116, 21);
		}
		return textField;
	}
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uC800\uC7A5");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(dao == null) {
						dao = new GuestBookDao();
					}
					GuestBookVo vo = new GuestBookVo();
					vo.setMid(mid.getText());
					vo.setMdate(mdate.getText());
					vo.setDoc(doc.getText());
					vo.setPwd(pwd.getText());
					
					boolean b = dao.insert(vo);
					if(b) {
						GuestBookMain.status.setText("데이터가 추가되었습니다.");
					} else {
						GuestBookMain.status.setText("저장중 오류 발생....");
					}
					
				}
			});
			btnNewButton.setBounds(209, 260, 79, 23);
		}
		return btnNewButton;
	}
}
