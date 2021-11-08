package jdbc_semi;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;

public class ProductMain extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenuItem add;
	private JMenuItem seach;
	private JMenuItem Modify;
	private JMenuItem mntmNewMenuItem_1;
	private JMenu mnNewMenu;
	private JMenuItem Month;
	private JMenuItem parts;
	private JMenu mnNewMenu_1;
	static JLabel status;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProductMain frame = new ProductMain();
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
	public ProductMain() {
		setTitle("\uC0DD\uC0B0\uAD00\uB9AC \uD504\uB85C\uADF8\uB7A8");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		contentPane.add(getStatus(), BorderLayout.SOUTH);
	}

	public JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu_1());
			menuBar.add(getMnNewMenu());
			menuBar.add(getMntmNewMenuItem_1());
		}
		return menuBar;
	}
	public JMenuItem getAdd() {
		if (add == null) {
			add = new JMenuItem("입력");
			add.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.removeAll();
					contentPane.add(new ProductAdd());
					contentPane.updateUI();
				}
			});
		}
		return add;
	}
	public JMenuItem getSeach() {
		if (seach == null) {
			seach = new JMenuItem("조회");
			seach.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.removeAll();
					contentPane.add(new ProductSearch());
					contentPane.updateUI();
				}
			});
		}
		return seach;
	}
	public JMenuItem getModify() {
		if (Modify == null) {
			Modify = new JMenuItem("수정 / 삭제");
			Modify.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.removeAll();
					contentPane.add(new ProductModify());
					contentPane.updateUI();
				}
			});
		}
		return Modify;
	}
	public JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("");
		}
		return mntmNewMenuItem_1;
	}
	public JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("\uC0DD\uC0B0\uB7C9");
			mnNewMenu.add(getMonth());
			mnNewMenu.add(getParts());
		}
		return mnNewMenu;
	}
	public JMenuItem getMonth() {
		if (Month == null) {
			Month = new JMenuItem("\uC6D4\uBCC4 \uC0DD\uC0B0\uB7C9");
		}
		return Month;
	}
	public JMenuItem getParts() {
		if (parts == null) {
			parts = new JMenuItem("\uC81C\uD488\uBCC4 \uC0DD\uC0B0\uB7C9");
		}
		return parts;
	}
	public JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("\uAD00\uB9AC");
			mnNewMenu_1.add(getAdd());
			mnNewMenu_1.add(getModify());
			mnNewMenu_1.add(getSeach());
		}
		return mnNewMenu_1;
	}
	public JLabel getStatus() {
		if (status == null) {
			status = new JLabel("반갑습니다.");
			status.setBackground(Color.WHITE);
			status.setHorizontalAlignment(SwingConstants.CENTER);
			status.setFont(new Font("굴림", Font.PLAIN, 17));
			status.setBackground(Color.white);
			status.setForeground(Color.black);
		}
		return status;
	}
}
