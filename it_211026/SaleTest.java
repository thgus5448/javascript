package basic_api;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class SaleTest extends JFrame {

	Sale[] array = new Sale[10];
	int cnt = 0; //저장된 배열의 건수
	
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private TextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SaleTest frame = new SaleTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	//저장버튼
	public void store() {
		/* 저장버튼이 클릭되면 해야되는 일
		 * 1)제품코드,금액을 사용해 sale객체 생성
		 * 2)생성된 sale객체는 객체형 배열에 저장
		 * 3)객체가 저장되었다는 메세지 출력
		 */
		int amt = Integer.parseInt( pAmt.getText() ); 
			// Integer.parseInt - 문자열을 정수형으로 바꿔줄 때 
		Sale s = new Sale(pCode.getText(), amt);
		if(cnt == 10) {
			JOptionPane.showMessageDialog(SaleTest.this, "이미 데이터가 모두 찼습니다..");
		}else {
			array[cnt] = s; //array배열의 cnt번째에 저장
			cnt++;
			JOptionPane.showMessageDialog(SaleTest.this, "데이터가 저장되었습니다.");
		}
	}
	
	//오름차버튼
	public void asc() {
		//실제 데이터만 복사
		Sale[] tempSale = Arrays.copyOfRange(array, 0, cnt);
		Arrays.sort(tempSale);
		textArea.setText(""); //기존에 표시된 내용을 모두 삭제
		textArea.append("오름차 정렬된 목록\n");
		
		for(Sale s : tempSale) {
			textArea.append( s.getPcode() + " : " + s.getAmt() );
			textArea.append("\n");
		}
	}
	
	//내림차
	public void desc() {
		  Sale [] tempSale=Arrays.copyOfRange(array, 0, cnt);
	      Arrays.sort(tempSale);
	      textArea.setText("");//기존에 표시된 내용을 모두 지움.
	      textArea.append("내림차 정렬된 목록\n");
	      for(int i=tempSale.length-1; i>=0; i-- ) {
	         textArea.append(tempSale[i].getPcode()+" : "+tempSale[i].getAmt());
	         textArea.append("\n");
	      }

	}
	/**
	 * Create the frame.
	 */
	public SaleTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLabel_1());
		contentPane.add(getLabel_2());
		contentPane.add(getTextField());
		contentPane.add(getTextField_1());
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
		contentPane.add(getTextArea());
	}
	public JLabel getLabel_1() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("\uC81C\uD488\uCF54\uB4DC");
			lblNewLabel.setBounds(55, 14, 57, 15);
		}
		return lblNewLabel;
	}
	public JLabel getLabel_2() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("\uAE08\uC561");
			lblNewLabel_1.setBounds(55, 44, 57, 15);
		}
		return lblNewLabel_1;
	}
	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(118, 11, 252, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	public JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(118, 41, 252, 21);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("저장");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					store();
				}
			});
			btnNewButton.setBounds(55, 72, 97, 23);
		}
		return btnNewButton;
	}
	public JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("오름차");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					asc();
				}
			});
			btnNewButton_1.setBounds(164, 72, 97, 23);
		}
		return btnNewButton_1;
	}
	public JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("내림차");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dㄷsc;
				}
			});
			btnNewButton_2.setBounds(273, 72, 97, 23);
		}
		return btnNewButton_2;
	}
	public TextArea getTextArea() {
		if (textArea == null) {
			textArea = new TextArea();
			textArea.setBounds(10, 101, 414, 274);
		}
		return textArea;
	}
}
