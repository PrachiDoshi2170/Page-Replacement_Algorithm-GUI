package mywork;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;


public class layout {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					layout window = new layout();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public layout() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	int capacity;
	int len=0;
	int[] array;
	int page_fault = 0;
	int[][] process;
	private JTable table_1;
	JLabel lblNewLabel_4;
	private void initialize() {

		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 196, 222));
		frame.setBounds(100, 100, 909, 737);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Input your windows(with space):");
		lblNewLabel_1.setBounds(10, 156, 353, 29);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 24));
		frame.getContentPane().add(lblNewLabel_1);
	
		JScrollPane scrollPane = new JScrollPane();
		frame.getContentPane().add(scrollPane);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 100, 0));
		panel.setBounds(0, 0, 895, 331);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		JButton btnNewButton = new JButton("Implement");
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				capacity = Integer.parseInt(textField.getText());
				System.out.println(capacity);
				String getInput = textField_1.getText();
				int i=0,ct=0;
				String tempstr="";
				ArrayList<Integer> arrl = new ArrayList<>();
				while(i<getInput.length()) {
					if(!Character.isWhitespace(getInput.charAt(i))) {
						tempstr+=getInput.charAt(i);
					}	
					else {
						arrl.add(ct, Integer.parseInt(tempstr));
						ct++;
						tempstr = "";
					}
					if(i == getInput.length()-1)
						arrl.add(ct, Integer.parseInt(tempstr));
					i++;
				}
				System.out.println(arrl);
				len = arrl.size();
				array = new int[len];
				for(i=0;i<len;i++) {
					array[i]=arrl.get(i);
				}
				int[][] process = new int[capacity][len];
				ArrayList<Integer> temp= new ArrayList<>();
				ct = 0;
				int teaverse=0;
				for(i=0;i<len;i++) {
					if(!temp.contains(array[i])) {
						if(temp.size()==capacity) {
							temp.remove(0);
							temp.add(capacity-1, array[i]);
						}
						else {
							temp.add(ct, array[i]);
						}
						page_fault++;
						ct++;
					}
					else {
						temp.remove((Object)array[i]);
						temp.add(temp.size(), array[i]);
					}
					for(int j=0;j< capacity;j++) {
						if(temp.size()<capacity) {
							if(j==temp.size())
								break;
						}
						process[j][i] = temp.get(j);
					}
				}
				lblNewLabel_4.setText(String.valueOf(page_fault));
				String[][] processstr = new String[capacity][len];
				String[] arraystr = new String[len];
				for(int j=0;j< capacity;j++) {
					for(i=0;i<len;i++) {
						processstr[j][i] = String.valueOf(process[j][i]);
					}
				}
				for(i=0;i<len;i++) {
					arraystr[i] = String.valueOf(array[i]);
				}
				table_1 = new JTable(processstr,arraystr);
				int width = 50*len;
				int height = 50*capacity;
				table_1.setRowHeight(50-(25/capacity));
				scrollPane.setBounds(300, 397, width, height);
				//table_1.setBounds(50, 397, width, height);
				//table_1.setTableHeader(null);
				scrollPane.setViewportView(table_1);
				
			}
			
		});
		btnNewButton.setBounds(356, 230, 198, 37);
		panel.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		JLabel lblNewLabel_2 = new JLabel("Least Recently Used");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(238, 5, 400, 37);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblNewLabel = new JLabel("No. of frames:");
		lblNewLabel.setBounds(212, 108, 153, 29);
		panel.add(lblNewLabel);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 24));
		
		textField = new JTextField();
		textField.setBounds(375, 107, 96, 30);
		panel.add(textField);
		textField.setToolTipText("This text field take the input for the no of the frame that are available to contain the pages. This no. will be converted into number of row.\r\n");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 24));
		textField.setColumns(1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(375, 158, 269, 30);
		panel.add(textField_1);
		textField_1.setColumns(1);
		
		JLabel lblNewLabel_3 = new JLabel("Total Page Faults: ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_3.setBounds(59, 292, 285, 29);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("0");
		lblNewLabel_4.setForeground(Color.white);
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_4.setBounds(356, 292, 198, 29);
		panel.add(lblNewLabel_4);
		
		
		
	}
}