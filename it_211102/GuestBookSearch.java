package db;

import javax.swing.*;
import java.awt.event.*;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class GuestBookSearch extends JPanel {
	GuestBookDao dao;
	
	AbstractTableModel model;
	
	private JTextField textField;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Create the panel.
	 */
	public GuestBookSearch() {
		setLayout(null);
		add(getTextField());
		add(getBtnNewButton());
		add(getTable());
		add(getScrollPane_1());
		
	}

	public JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(12, 10, 317, 21);
			textField.setColumns(10);
		}
		return textField;
	}
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("검색");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnNewButton.setBounds(341, 9, 97, 23);
		}
		return btnNewButton;
	}
	public JScrollPane getScrollPane_1() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(22, 65, 317, 197);
			scrollPane.setColumnHeaderView(getTable());
		}
		return scrollPane;
	}
	public JTable getTable() {
		if (table == null) {
			//String[] colName = {"NO","작성자","작성일","내용"};
			//String[][] data = {{"","",""}};
			Vector colName = new Vector();
			
			colName.add("NO");
			colName.add("작성자");
			colName.add("작성일");
			colName.add("내용");
			
			/*
			Vector data = new Vector();
			
			Vector r1 = new Vector();
			r1.add("1");
			r1.add("hong");
			r1.add("2021-11-02");
			r1.add("방가...");
			
			data.add(r1);
			*/
			//table = new JTable(data, colName);
			
			model = new DefaultTableModel(colName,0);
			table = new JTable(model);
			
			Vector r1 = new Vector();
			r1.add("1");
			r1.add("hong");
			r1.add("2021-11-02");
			r1.add("방가...");
			model.addRow(r1);
			
			// model을 통해 각 컬럼의 넓이를 조절
			TableColumnModel tModel = table.getColumnModel();
			tModel.getColumn(0).setPreferredWidth(10);
			tModel.getColumn(0).setPreferredWidth(60);
			tModel.getColumn(1).setPreferredWidth(60);
			tModel.getColumn(2).setPreferredWidth(300);
		}
		return table;
	}
}
