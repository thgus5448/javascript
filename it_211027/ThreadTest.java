package thread;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThreadTest extends JFrame {
	
	long sum = 0;
	
	private JPanel contentPane;
	private JPanel panel;
	private JScrollPane scrollPane;
	private TextArea textArea;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThreadTest frame = new ThreadTest();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ThreadTest() {
		setTitle("\uC4F0\uB808\uB4DC \uD14C\uC2A4\uD2B8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getPanel(), BorderLayout.WEST);
		contentPane.add(getScrollPane(), BorderLayout.CENTER);
	}

	public JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setPreferredSize(new Dimension(120, 10));
			panel.add(getBtnNewButton());
			panel.add(getBtnNewButton_2());
			panel.add(getBtnNewButton_1());
		}
		return panel;
	}
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	public TextArea getTextArea() {
		if (textArea == null) {
			textArea = new TextArea();
		}
		return textArea;
	}
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Tread Test");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					thread job = new Thread(new Runnable() {
						
						@Override
						public void run() {
							// TODO Auto-generated method stub
							
						}
					})
					for(int i=0 ; i<3333 ; i++) {
						sum = i;
						Thread t = new Thread();
						
						try {
							t.sleep(1); //버튼 다시 튀어나오는데 시간 줌
						}catch(InterruptedException e1) {
							e1.printStackTrace();
						}
					}
					
					textArea.append("sum=" + sum);
				}
			});
		}
		job.start;
	}
	public JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("우선순위");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//1)쓰레드를 2개 생성
					//2)우선순위를 서로 다르게
					MyThread r1 = new MyThread(getTextArea() ,"김철수");
					MyThread r2 = new MyThread(getTextArea(), "이영희");
					
					Thread t1 = new Thread(r1);
					Thread t2 = new Thread(r2);
					
					t1.setPriority(1);
					t2.setPriority(10);
					t1.start();
					t2.start();
				}
			});
		}
		return btnNewButton_1;
	}
	public JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("\uC4F0\uB808\uB4DC \uD14C\uC2A4\uD2B8");
		}
		return btnNewButton_2;
	}
}
