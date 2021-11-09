package iostrea;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import jdk.jfr.events.FileWriteEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class FIleExam extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	TextEditor te;
	File file;
	

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmNewMenuItem_2;
	private JMenuItem mntmNewMenuItem_3;
	private JMenuItem mntmNewMenuItem_4;
	
	//파일열기창 -> 파일을 읽어옴.
	public void load() {
		char[] readByte = new char[4096]; //4kb
		int readSize = -1;
		
		try {
			JFileChooser fc = new JFileChooser();
			
			int yn = fc.showOpenDialog(this);
			if(yn == JFileChooser.APPROVE_OPTION) {
				System.out.println("OK.........");
				file = fc.getSelectedFile();
				setTitle(file.getPath());
				
				FileReader fis = new FileReader(file);
				te.getTextArea().setText("");
				
				while( (readSize = fis.read(readByte)) != -1){
					String str = new String(readByte, 0, readSize);
					te.getTextArea().append(str);
				}
				fis.close();
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		}
		
	public void save() {
		boolean b = false;
		try {
			if( file == null) {
				b = saveAs();
			}
			if(b) {
				FileWriter fw = new FileWriter(file);
				fw.write(te.getTextArea().getText());
				fw.flush();
				fw.close();
			}
 		} catch(Exception ex) {
 			ex.printStackTrace();
 		}
	}
	
	public boolean saveAs() {
		boolean b = false;
		try {
			JFileChooser fc = new JFileChooser(file);
			int yn = fc.showSaveDialog(this);
			
			if(yn == JFileChooser.APPROVE_OPTION) {
				file = fc.getSelectedFile();
				setTitle(file.getPath());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return b;
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FIleExam frame = new FIleExam();
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
	public FIleExam() {
		setTitle("File Example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

	public JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}
	public JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("File");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_4());
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getMntmNewMenuItem_2());
			mnNewMenu.add(getMntmNewMenuItem_3());
		}
		return mnNewMenu;
	}
	public JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("File Info");
			mntmNewMenuItem.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					contentPane.removeAll();
					contentPane.add( new FileInfo() );
					contentPane.updateUI();
					te = null;
				}
			});
		}
		return mntmNewMenuItem;
	}
	public JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("가져오기");
			mntmNewMenuItem_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(te == null) { //te한번 만들어졌을 때 또 만들어지지 않도록
						te = new TextEditor();
						contentPane.removeAll();
						contentPane.add(te);
						contentPane.updateUI();
					}
					load();
				}
			});
		}
		return mntmNewMenuItem_1;
	}
	public JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("저장");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					save();
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	public JMenuItem getMntmNewMenuItem_3() {
		if (mntmNewMenuItem_3 == null) {
			mntmNewMenuItem_3 = new JMenuItem("새이름으로 저장");
			mntmNewMenuItem_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(saveAs()) {
						if( file != null ) save();
					}
				}
			});
		}
		return mntmNewMenuItem_3;
	}
	public JMenuItem getMntmNewMenuItem_4() {
		if (mntmNewMenuItem_4 == null) {
			mntmNewMenuItem_4 = new JMenuItem("새로 만들기");
			mntmNewMenuItem_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//기존내용이 수정되었는지 체크
					file = null;
					contentPane.removeAll();
					te = new TextEditor();
					contentPane.add(te);
					contentPane.updateUI();
					setTitle("파일명 없음");
				}
			});
		}
		return mntmNewMenuItem_4;
	}
}
