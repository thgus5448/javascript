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
	int cnt = 0; //����� �迭�� �Ǽ�
	
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

	//�����ư
	public void store() {
		/* �����ư�� Ŭ���Ǹ� �ؾߵǴ� ��
		 * 1)��ǰ�ڵ�,�ݾ��� ����� sale��ü ����
		 * 2)������ sale��ü�� ��ü�� �迭�� ����
		 * 3)��ü�� ����Ǿ��ٴ� �޼��� ���
		 */
		int amt = Integer.parseInt( pAmt.getText() ); 
			// Integer.parseInt - ���ڿ��� ���������� �ٲ��� �� 
		Sale s = new Sale(pCode.getText(), amt);
		if(cnt == 10) {
			JOptionPane.showMessageDialog(SaleTest.this, "�̹� �����Ͱ� ��� á���ϴ�..");
		}else {
			array[cnt] = s; //array�迭�� cnt��°�� ����
			cnt++;
			JOptionPane.showMessageDialog(SaleTest.this, "�����Ͱ� ����Ǿ����ϴ�.");
		}
	}
	
	//��������ư
	public void asc() {
		//���� �����͸� ����
		Sale[] tempSale = Arrays.copyOfRange(array, 0, cnt);
		Arrays.sort(tempSale);
		textArea.setText(""); //������ ǥ�õ� ������ ��� ����
		textArea.append("������ ���ĵ� ���\n");
		
		for(Sale s : tempSale) {
			textArea.append( s.getPcode() + " : " + s.getAmt() );
			textArea.append("\n");
		}
	}
	
	//������
	public void desc() {
		  Sale [] tempSale=Arrays.copyOfRange(array, 0, cnt);
	      Arrays.sort(tempSale);
	      textArea.setText("");//������ ǥ�õ� ������ ��� ����.
	      textArea.append("������ ���ĵ� ���\n");
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
			btnNewButton = new JButton("����");
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
			btnNewButton_1 = new JButton("������");
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
			btnNewButton_2 = new JButton("������");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					d��sc;
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
