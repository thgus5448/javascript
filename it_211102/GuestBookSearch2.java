package db;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GuestBookSearch2 extends JPanel {
	private JTextField textField;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public GuestBookSearch2() {
		setLayout(null);
		add(getTextField());
		add(getBtnNewButton());
		add(getScrollPane());

	}

	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(12, 5, 317, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("°Ë»ö");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if(dao == null) {
						dao = new GuestBookDao();
					}
					
					model.getDataVector().clear();
					
					Vector<Vector> list = dao.search(find.getText());
					for(Vector v : list) {
						
					}
				}
			});
			btnNewButton.setBounds(341, 4, 97, 23);
		}
		return btnNewButton;
	}
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(12, 40, 426, 250);
			scrollPane.setColumnHeaderView(getTable());
		}
		return scrollPane;
	}
	public JTable getTable() {
		if (table == null) {
			table = new JTable();
		}
		return table;
	}
}
