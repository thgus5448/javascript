package jdbc_semi;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.graalvm.compiler.hotspot.meta.DefaultHotSpotLoweringProvider;

import basic_api.decimal;
import sun.swing.DefaultLayoutStyle;

import java.text.DecimalFormat;
import java.util.Vector;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class ProductSearch extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ProductDao dao;
	ProductMain main;
	
	private JTextField find;
	private JButton btnNewButton;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Create the panel.
	 */
	//������
	public ProductSearch(ProductMain main) {
		this();
		this.main = main;
	}
	
	public ProductSearch() {
		setLayout(null);
		add(getFind());
		add(getBtnNewButton());
		add(getScrollPane());

	}
	
	
	//ã��
	public void search() {
		if(dao == null) {
			dao = new ProductDao();
		}
		model.getDataVector().clear();
		DecimalFormat df = new DecimalFormat("###,###");
		//DecimalFormat[]Ŭ���� : �ν��Ͻ��� ������ְ� ������ format �޼ҵ带 ���� ���� ǥ���� �� ����.
		
		Vector<Vector> list = dao.search(find.getText());
		for(Vector<String> v : list) {
			int price = Integer.parseInt(v.get(3));
			int ea = Integer.parseInt(v.get(4));
			int amt = Integer.parseInt(v.get(5));
			
			v.set(3, df.format(price));
			v.set(4, df.format(ea));
			v.set(5, df.format(amt));
			
			model.addRow(v);
		}
		
		table.updateUI();   
	}

	public JTextField getFind() {
		if (find == null) {
			find = new JTextField();
			find.setBounds(32, 27, 316, 21);
			find.setColumns(10);
		}
		return find;
	}
	public JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("\uAC80\uC0C9");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					search();
				}
			});
			btnNewButton.setBounds(349, 26, 76, 23);
		}
		return btnNewButton;
	}
	public JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBounds(32, 77, 391, 200);
			scrollPane.setColumnHeaderView(getTable());
			scrollPane.setViewportView(getTable());
		}
		return scrollPane;
	}
	
	//���̺�
	public JTable getTable() {
		if (table == null) {
			
			table = new JTable();
			Vector<String> columnName = new Vector<String>();
			columnName.add("NO");
			columnName.add("�ڵ�");
			columnName.add("��ǰ��");
			columnName.add("�ܰ�");
			columnName.add("����");
			columnName.add("�ݾ�");
			
			DefaultTableModel tableModel = new DefaultTableModel(columnName,0) {
				
				private static final long serialVersionUID = 1L;
				public boolean cellEditTable(int row, int column) {
					return false;
				}
			};
			
			table = new JTable(tableModel);
			table.addMouseListener(new MouseAdapter() {
				public void mouseClik(MouseEvent e) {
					//����Ŭ��
					if(e.getClickCount()==2) {
						int row = table.getSelectedRow();
						int v = Integer.parseInt( (String)table.getValueAt(row, 0) );
					}
				}
			});
		}
		
		return table;
	}
}
