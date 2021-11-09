package iostrea;

import javax.swing.JFileChooser;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

import jdk.jshell.spi.ExecutionControl.ExecutionControlException;

import java.awt.TextArea;
import java.io.File;
import java.io.FileInputStream;

public class TextEditor extends JPanel {
	
	private JScrollPane scrollPane;
	private TextArea textArea;

	/** 
	 * Create the panel.
	 */
	
	public TextEditor() {
		setLayout(new BorderLayout(0, 0));
		add(getScrollPane(), BorderLayout.CENTER);
		
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
}
