package iostrea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File; //info() File
import java.net.URI;
import java.text.SimpleDateFormat;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class FileInfo extends JPanel {
	private static final long serialVersionUID = 1L;
	
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton_1;

	public void info() throws Exception{
		File dir = new File("c:/temp/dir");
		File file1 = new File("C:/temp/file1.text");
		File file2 = new File("C:/temp/file2.text");
		File file3 = new File(new URI("file:///C:/Temp/file3.txt"));
		
		if( ! dir.exists() ) dir.mkdirs();
		if( ! file1.exists() ) file1.createNewFile();
		if( ! file2.exists() ) file2.createNewFile();
		if( ! file2.exists() ) file3.createNewFile();
		
		File temp = new File("C:/temp");
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM a HH:mm");
		
		File[] files = temp.listFiles();
		StringBuffer sb = new StringBuffer();
		String title = String.format("%-25s%-7s%-10s%-10d%-50s\n", 
									"날짜", "시간", "형태", "크기", "이름");
		
		for(File f: files) {
			if(f.isDirectory()) {
				title = String.format("%-25s%-7s%-10s%-10d%-50s\n",
						sdf.format( f.lastModified() ), "<dir>", "", f.getName() );
			} else {
				title = String.format("%-25s%-7s%-10s%-10d%-50s\n",
						sdf.format( f.lastModified() ), "", f.length(), f.getName() );
				sb.append(title);
			}
		}
		
		sb.append(title);
		textArea.setText(sb.toString());
	}
	
	public FileInfo() {
		setLayout(null);
		add(getTextField());
		add(getScrollPane());
		add(getBtnNewButton_1());

	}
	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(12, 10, 320, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 41, 426, 249);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	public JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
		}
		return textArea;
	}
	public JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("New button");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try{
						info();
					} catch (Exception ex){
						ex.printStackTrace();
					}
				}
			});
			btnNewButton_1.setBounds(341, 9, 97, 23);
		}
		return btnNewButton_1;
	}
}
