package Collect;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.Iterator;
import java.awt.event.ActionEvent;

public class MapSearch extends JPanel {
	private JTextField textField;
	private JButton btnNewButton;
	private JTextArea textArea;

	/**
	 * Create the panel.
	 */
	public MapSearch() {
		setLayout(null);
		add(getTextField());
		add(getBtnNewButton());
		add(getTextArea());

	}

	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(12, 20, 322, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Collection<Product> collect = CollectMain.map.values();
					Iterator<E> iter = collect.iterator();
					textArea.setText("");
					String f = find.getText().trim();
					
					while(iter.hasNext()) {
						Product P = (product)iter.next();
						
						//검색 비교
						if( p.getCode().equals(f) || p.getCOdeName().indexOf(f) > -1 ) {
							textArea.append( p.toString() + "\n" );
						}
						textArea.append( p.toString() + "\n" );
					}
				}
			});
			btnNewButton.setBounds(341, 19, 97, 23);
		}
		return btnNewButton;
	}
	public JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setBounds(12, 61, 426, 218);
		}
		return textArea;
	}
}
