package jdbc_semi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JSeparator;

//입력화면
public class ProductAdd extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ProductVo vo = new ProductVo();
	ProductDao dao = new ProductDao();
	
	private JLabel lblNewLabel;
	private JTextField code;
	private JLabel lblNewLabel_1;
	private JTextField codeName;
	private JLabel lblNewLabel_1_1;
	private JTextField price;
	private JLabel lblNewLabel_1_1_1;
	private JSeparator separator;
	private JLabel lblNewLabel_1_1_2;
	private JTextField mDate;
	private JLabel lblNewLabel_1_1_2_1;
	private JTextField ea;
	private JLabel lblNewLabel_1_1_1_1;
	private JButton okBtn;
	private JButton searchBtn;

	/**
	 * Create the panel.
	 */
	public ProductAdd() {
		setLayout(null);
		add(getLblNewLabel());
		add(getCode());
		add(getLblNewLabel_1());
		add(getCodeName());
		add(getLblNewLabel_1_1());
		add(getPrice());
		add(getLblNewLabel_1_1_1());
		add(getSeparator());
		add(getLblNewLabel_1_1_2());
		add(getMDate());
		add(getLblNewLabel_1_1_2_1());
		add(getEa());
		add(getLblNewLabel_1_1_1_1());
		add(getOkBtn());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String now = sdf.format(new Date());
		getMDate().setText(now);
		add(getSearchBtn());
		
		
		
		ProductMain.status.setText("자료를 입력해주세요.");
		
	}

	public JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uCF54\uB4DC");
			lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel.setBounds(50, 30, 57, 15);
		}
		return lblNewLabel;
	}
	public JTextField getCode() {
		if (code == null) {
			code = new JTextField();
			code.setBounds(119, 27, 173, 21);
			code.setColumns(10);
		}
		return code;
	}
	public JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uC81C\uD488\uBA85");
			lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1.setBounds(50, 68, 57, 15);
		}
		return lblNewLabel_1;
	}
	public JTextField getCodeName() {
		if (codeName == null) {
			codeName = new JTextField();
			codeName.setColumns(10);
			codeName.setBounds(119, 65, 258, 21);
		}
		return codeName;
	}
	public JLabel getLblNewLabel_1_1() {
		if (lblNewLabel_1_1 == null) {
			lblNewLabel_1_1 = new JLabel("\uB2E8\uAC00");
			lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1_1.setBounds(50, 111, 57, 15);
		}
		return lblNewLabel_1_1;
	}
	public JTextField getPrice() {
		if (price == null) {
			price = new JTextField();
			price.setColumns(10);
			price.setBounds(119, 108, 173, 21);
		}
		return price;
	}
	public JLabel getLblNewLabel_1_1_1() {
		if (lblNewLabel_1_1_1 == null) {
			lblNewLabel_1_1_1 = new JLabel("\uC6D0");
			lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1_1_1.setBounds(296, 111, 57, 15);
		}
		return lblNewLabel_1_1_1;
	}
	
	public JSeparator getSeparator() {
		if (separator == null) {
			separator = new JSeparator();
			separator.setBounds(26, 156, 397, 2);
		}
		return separator;
	}
	
	public JLabel getLblNewLabel_1_1_2() {
		if (lblNewLabel_1_1_2 == null) {
			lblNewLabel_1_1_2 = new JLabel("\uC785\uB825\uB0A0\uC9DC");
			lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1_1_2.setBounds(50, 177, 57, 15);
		}
		return lblNewLabel_1_1_2;
	}
	
	public JTextField getMDate() {
		if (mDate == null) {
			mDate = new JTextField();
			mDate.setColumns(10);
			mDate.setBounds(119, 174, 173, 21);
		}
		return mDate;
	}
	public JLabel getLblNewLabel_1_1_2_1() {
		if (lblNewLabel_1_1_2_1 == null) {
			lblNewLabel_1_1_2_1 = new JLabel("\uC0DD\uC0B0\uB7C9");
			lblNewLabel_1_1_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_1_1_2_1.setBounds(50, 212, 57, 15);
		}
		return lblNewLabel_1_1_2_1;
	}
	public JTextField getEa() {
		if (ea == null) {
			ea = new JTextField();
			ea.setColumns(10);
			ea.setBounds(119, 209, 173, 21);
		}
		return ea;
	}
	public JLabel getLblNewLabel_1_1_1_1() {
		if (lblNewLabel_1_1_1_1 == null) {
			lblNewLabel_1_1_1_1 = new JLabel("\uAC1C");
			lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
			lblNewLabel_1_1_1_1.setBounds(296, 212, 57, 15);
		}
		return lblNewLabel_1_1_1_1;
	}
	
	//확인버튼
	public JButton getOkBtn() {
		if (okBtn == null) {
			okBtn = new JButton("\uD655\uC778");
			okBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					boolean r = false;
					
					vo.setCode(code.getText());
					vo.setEa(Integer.parseInt( ea.getText() )); //입력받은 ea텍스트를 숫자로 변환
					vo.setMdate(mDate.getText());
					r = dao.insert(vo);
					
					if(r) { 
						ProductMain.status.setText("조회결과");
					} else {
						ProductMain.status.setText("존재하지않는 데이터입니다.");
					}
				}
			});
			okBtn.setBounds(185, 252, 81, 23);
		}
		return okBtn;
	}
	
	//조회버튼
	public JButton getSearchBtn() {
		if (searchBtn == null) {
			searchBtn = new JButton("\uC870\uD68C");
			searchBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					vo = dao.select(code.getText()); //입력받은code텍스트를 vo에 저장
					codeName.setText(vo.getCodeName()); 
					price.setText(vo.getPrice() + "");
				}
			});
			searchBtn.setBounds(304, 26, 81, 23);
		}
		return searchBtn;
	}
}
