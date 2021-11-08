package jdbc_semi;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//수정,삭제 화면
public class ProductModify extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	ProductVo vo = new ProductVo();
	ProductDao dao = new ProductDao();
	
	private JTextField code;
	private JTextField codeName;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JTextField price;
	private JLabel lblNewLabel_1_1_1;
	private JLabel lblNu;
	private JTextField num;
	private JSeparator separator;
	private JLabel lblNewLabel_1_1_2;
	private JTextField mDate;
	private JLabel lblNewLabel_1_1_2_1;
	private JTextField ea;
	private JLabel lblNewLabel_1_1_1_1;
	private JButton deleteBtn;
	private JButton changeBtn;

	/**
	 * Create the panel.
	 */
	public ProductModify() {
		setLayout(null);
		add(getCode());
		add(getCodeName());
		add(getLblNewLabel());
		add(getLblNewLabel_1());
		add(getLblNewLabel_1_1());
		add(getPrice());
		add(getLblNewLabel_1_1_1());
		add(getLblNu());
		add(getNum());
		add(getSeparator());
		add(getLblNewLabel_1_1_2());
		add(getMDate());
		add(getLblNewLabel_1_1_2_1());
		add(getEa());
		add(getLblNewLabel_1_1_1_1());
		add(getDeleteBtn());
		add(getChangeBtn());

	}
	public JTextField getCode() {
		if (code == null) {
			code = new JTextField();
			code.setColumns(10);
			code.setBounds(140, 62, 173, 21);
		}
		return code;
	}
	public JTextField getCodeName() {
		if (codeName == null) {
			codeName = new JTextField();
			codeName.setColumns(10);
			codeName.setBounds(140, 100, 173, 21);
		}
		return codeName;
	}
	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uCF54\uB4DC");
			lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel.setBounds(71, 65, 57, 15);
		}
		return lblNewLabel;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC81C\uD488\uBA85");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setBounds(71, 103, 57, 15);
		}
		return lblNewLabel_1;
	}
	public JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("\uB2E8\uAC00");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1_1.setBounds(71, 146, 57, 15);
		}
		return lblNewLabel_1_1;
	}
	public JTextField getPrice() {
		if (price == null) {
			price = new JTextField();
			price.setColumns(10);
			price.setBounds(140, 143, 173, 21);
		}
		return price;
	}
	public JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("\uC6D0");
			lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1_1_1.setBounds(317, 146, 57, 15);
		}
		return lblNewLabel_1_1_1;
	}
	public JLabel getLblNu() {
		if (lblNu == null) {
			lblNu = new JLabel("No");
			lblNu.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNu.setBounds(71, 30, 57, 15);
		}
		return lblNu;
	}
	public JTextField getNum() {
		if (num == null) {
			num = new JTextField();
			num.setColumns(10);
			num.setBounds(140, 27, 173, 21);
		}
		return num;
	}
	public JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(28, 202, 397, 2);
		}
		return separator;
	}
	public JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("\uC785\uB825\uB0A0\uC9DC");
			lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1_1_2.setBounds(68, 223, 57, 15);
		}
		return lblNewLabel_1_1_2;
	}
	public JTextField getMDate() {
		if (mDate == null) {
			mDate = new JTextField();
			mDate.setColumns(10);
			mDate.setBounds(137, 220, 173, 21);
		}
		return mDate;
	}
	public JLabel getLblNewLabel_1_1_2_1() {
		if (lblNewLabel_1_1_2_1 == null) {
			lblNewLabel_1_1_2_1 = new JLabel("\uC0DD\uC0B0\uB7C9");
			lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1_1_2_1.setBounds(68, 258, 57, 15);
		}
		return lblNewLabel_1_1_2_1;
	}
	public JTextField getEa() {
		if (ea == null) {
			ea = new JTextField();
			ea.setColumns(10);
			ea.setBounds(137, 255, 173, 21);
		}
		return ea;
	}
	public JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("\uAC1C");
			lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1_1_1_1.setBounds(314, 258, 57, 15);
		}
		return lblNewLabel_1_1_1_1;
	}
	
	//삭제버튼
	public JButton getDeleteBtn() {
		if (deleteBtn == null) {
			deleteBtn = new JButton("삭제");
			deleteBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int yn = JOptionPane.showConfirmDialog
							(ProductModify.this, "정말 삭제하시겠습니까?","삭제",JOptionPane.OK_OPTION);
					//showConfirmDialog(null, "경고메세지", "제목표시", JOptionPane.OK_OPTION) : 확인을 요함
					
					
					//ok버튼 눌렀을때
					if(yn == JOptionPane.OK_OPTION) {
						boolean r = dao.delete(vo);
						
						num.setText("");
						code.setText("");
						codeName.setText("");
						price.setText("");
						mDate.setText("");
						ea.setText("");
						
						if(r) {
							ProductMain.status.setText("삭제완료");
						}else {
							ProductMain.status.setText("삭제실패");
						}
					} else {
						ProductMain.status.setText("삭제취소");
					}
				}
			});
			deleteBtn.setBounds(232, 310, 81, 23);
		}
		return deleteBtn;
	}
	
	//수정버튼
	public JButton getChangeBtn() {
		if (changeBtn == null) {
			changeBtn = new JButton("수정");
			changeBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					vo.setMdate(mDate.getText());
					vo.setEa(Integer.parseInt(ea.getText()));
			
					boolean r = dao.update(vo);
					if(r) {
						ProductMain.status.setText("수정완료");
					} else {
						ProductMain.status.setText("수정불가");
					}
				}
			});
			changeBtn.setBounds(139, 310, 81, 23);
		}
		return changeBtn;
	}
}
