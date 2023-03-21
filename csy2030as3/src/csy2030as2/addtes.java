package csy2030as2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class addtes extends JFrame {

	JFrame test = new JFrame();
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JTable table;
	private JTable j = new JTable();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addtes frame = new addtes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		  
		   private DefaultTableModel model;
		   private Object[][] data;
		   private String[] columnNames;
		   private JButton button;
	/**
	 * Create the frame.
	 */
	public addtes() {

		
		      setTitle("RemoveSelectedRow Test");
		      data = new Object[][] {{"test1", "test1","test1", "test1"}, {"test2", "test2","test2", "test2"}};
		      columnNames = new String[] {"Make", "Model", "Top Speed", "Reg Number", "Dailyhire Rate"};
		      model = new DefaultTableModel(data, columnNames);
		      table = new JTable(model);
		      table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
		      button = new JButton("Remove");

		      add(new JScrollPane(table), BorderLayout.CENTER);
		      add(button, BorderLayout.SOUTH);
		      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		      setSize(400, 300);
		      setLocationRelativeTo(null);
		      setVisible(true);
	}
}







columnNames = new String[] {"Make", "Model", "Top Speed", "Reg Number", "Dailyhire Rate"};
fmodel = new DefaultTableModel(data, columnNames);



//for(vehicle vcar : vehicle_list){
//
// fmodel.addRow(new Object[]{vcar.getMake(), vcar.getModel(), vcar.getTopSpeed(), vcar.getRegNum(), vcar.getDailyHireRate()});
//  System.out.println(vcar.getTopSpeed() + "test");
//}
//jTable1.setModel(fmodel);
jScrollPane1.setViewportView(jTable1);
