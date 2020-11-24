package mywork;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;



import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Rectangle;


import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Dimension;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class OPR_Algo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1285024360231087931L;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					lru window = new lru();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 
	 */
	
	public OPR_Algo() {

		setMinimumSize(new Dimension(1080, 1080));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(19, 40, 60));
		panel.setAlignmentY(0.0f);
		panel.setAlignmentX(0.0f);
		
		JLabel label = new JLabel();
		label.setIcon(new ImageIcon(lru.class.getResource("/images/simulator.png")));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_1 = new JLabel();
		label_1.setIcon(new ImageIcon(lru.class.getResource("/images/algorithm.png")));
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel label_2 = new JLabel();
		label_2.setIcon(new ImageIcon(lru.class.getResource("/images/home.png")));
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(null);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		scrollPane_1.setBounds(new Rectangle(500, 400, 150, 200));
		scrollPane_1.setBorder(null);
		
		JLabel lblNewLabel_7 = new JLabel("\"1\" \r\n Page fault");
		lblNewLabel_7.setFocusable(false);
		lblNewLabel_7.setFocusTraversalKeysEnabled(false);
		lblNewLabel_7.setInheritsPopupMenu(false);
		lblNewLabel_7.setRequestFocusEnabled(false);
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		
		JLabel lblPageHit = new JLabel("\"0\" \r\n Page Hit");
		lblPageHit.setVerifyInputWhenFocusTarget(false);
		lblPageHit.setFocusable(false);
		lblPageHit.setFocusTraversalKeysEnabled(false);
		lblPageHit.setInheritsPopupMenu(false);
		lblPageHit.setHorizontalAlignment(SwingConstants.CENTER);
		lblPageHit.setFont(new Font("Century Schoolbook", Font.BOLD, 20));
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(55)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 854, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(61, Short.MAX_VALUE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(111)
							.addComponent(lblNewLabel_7, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 389, Short.MAX_VALUE)
							.addComponent(lblPageHit, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)
							.addGap(160))
						.addGroup(groupLayout.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 954, Short.MAX_VALUE)
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel, GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 256, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(lblPageHit, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_7))))
					.addGap(198))
		);
		
		JLabel lblNewLabel = new JLabel("Optimal Page Replacement Algorithm");
		lblNewLabel.setFont(new Font("Century Schoolbook", Font.BOLD, 36));
		
		JLabel lblNewLabel_1 = new JLabel("No.of Frame:");
		lblNewLabel_1.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		JLabel lblNewLabel_2 = new JLabel("Input Page No.:");
		lblNewLabel_2.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		JLabel lblNewLabel_3 = new JLabel("Total Page Fault:");
		lblNewLabel_3.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		textField = new JTextField();
		textField.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Century Schoolbook", Font.PLAIN, 20));
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("0");
		lblNewLabel_4.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		
		
		JLabel lblNewLabel_5 = new JLabel("Hit Rate:");
		lblNewLabel_5.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		JLabel lblNewLabel_6 = new JLabel("0%");
		lblNewLabel_6.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		
		JButton btnNewButton = new JButton("Implement");
		btnNewButton.addMouseListener(new MouseAdapter() {
			

			@Override
			public void mouseClicked(MouseEvent e) {
				frames = Integer.parseInt(textField.getText()); // no. of frames
				//int n = frames + 1;
				String getInput = textField_1.getText();
				ref_len = getInput.length();
				reference = new int[ref_len];
		        mem_layout = new int[ref_len][frames];
		        buffer = new int[frames];
		        hit = new boolean[ref_len];
		        fault = new int[ref_len];
		        for(int j = 0; j < frames; j++)
		        {
		            buffer[j] = -1;
		        }
		        for(int i = 0; i < ref_len; i++)
		        {
		        	if(!Character.isWhitespace(getInput.charAt(i)))
		        	{ reference[i] = getInput.charAt(i);}
		        	else
		        	{
		        		
		        		i++;
		        	}
		        }
		        for(int i = 0; i < ref_len; i++)
		        {
		            int search = -1;
		            for(int j = 0; j < frames; j++)
		            {
		                if(buffer[j] == reference[i])
		                {
		                    search = j;
		                    hit[i] = true;
		                    fault[i] = numFault;
		                    break;
		                }
		            }

		            if(search == -1)
		            {
		                if(isFull)
		                {
		                    int index[] = new int[frames];
		                    boolean index_flag[] = new boolean[frames];
		                    for(int j = i + 1; j < ref_len; j++)
		                    {
		                        for(int k = 0; k < frames; k++)
		                        {
		                            if((reference[j] == buffer[k]) && (index_flag[k] == false))
		                            {
		                                index[k] = j;
		                                index_flag[k] = true;
		                                break;
		                            }
		                        }
		                    }
		                    int max = index[0];
		                    pointer = 0;
		                    if(max == 0)
		                    {
		                        max = 200;
		                    }

		                    for(int j = 0; j < frames; j++)
		                    {
		                        if(index[j] == 0)
		                        {
		                            index[j] = 200;
		                        }

		                        if(index[j] > max)
		                        {
		                            max = index[j];
		                            pointer = j;
		                        }
		                    }
		                }
		                buffer[pointer] = reference[i];
		                numFault++;
		                fault[i] = numFault;
		                if(!isFull)
		                {
		                    pointer++;
		                    if(pointer == frames)
		                    {
		                        pointer = 0;
		                        isFull = true;
		                    }
		                }
		            }

		            for(int j = 0; j < frames; j++)
		            {
		                mem_layout[i][j] = buffer[j];
		            }
		        }

		        for(int i = 0; i < ref_len; i++)
		        {
		            System.out.print(reference[i] + ": Memory is: ");
		            for(int j = 0; j < frames; j++)
		            {
		                if (mem_layout[i][j] == -1)
		                {
		                    System.out.printf("%3s ", "*");
		                } else
		                {
		                    System.out.printf("%3d ", mem_layout[i][j]);
		                }
		            }
		            System.out.print(": ");
		            if (hit[i]) {
		                System.out.print("Hit");
		            } else
		            {
		                System.out.print("Page Fault");
		            }
		            System.out.print(": (Number of Page Faults: " + fault[i] + ")");
		            System.out.println();
		        }
		        System.out.println("Total Number of Page Faults: " + numFault);
				
				
			}
				
		});
		
		
	
	
		
		btnNewButton.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText("0");
				textField_1.setText("0");
				lblNewLabel_4.setText("0");
				lblNewLabel_6.setText("0%");
				table_1.setVisible(false);
				table_1.setTableHeader(null);
				
			}
		});
		btnNewButton_1.setFont(new Font("Century Schoolbook", Font.BOLD, 30));
		
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(281)
					.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField, GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
					.addGap(537))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(242)
					.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 288, Short.MAX_VALUE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
					.addGap(324))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGap(361)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_3)
									.addGap(43))
								.addGroup(gl_panel_1.createSequentialGroup()
									.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 124, GroupLayout.PREFERRED_SIZE)))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
							.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 182, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
					.addGap(402))
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(161)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(389))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(35)
					.addComponent(lblNewLabel)
					.addGap(49)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 51, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
					.addGap(21)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(lblNewLabel_4))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_6)
						.addComponent(lblNewLabel_5))
					.addGap(22))
		);
		panel_1.setLayout(gl_panel_1);
		GroupLayout groupLayout_1 = new GroupLayout(panel);
		groupLayout_1.setHorizontalGroup(
			groupLayout_1.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGap(10)
					.addGroup(groupLayout_1.createParallelGroup(Alignment.LEADING)
						.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)
						.addComponent(label, GroupLayout.PREFERRED_SIZE, 74, GroupLayout.PREFERRED_SIZE)))
		);
		groupLayout_1.setVerticalGroup(
			groupLayout_1.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout_1.createSequentialGroup()
					.addGap(106)
					.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE)
					.addGap(34)
					.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
					.addGap(36)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
		);
		panel.setLayout(groupLayout_1);
		getContentPane().setLayout(groupLayout);
		
	}


	/**
	 * Initialize the contents of the frame.
	 */
	int frames = 0;
    int pointer = 0;
    int numFault = 0;
    int ref_len;
    boolean isFull = false;
    int buffer[];
    boolean hit[];
    int fault[];
    int reference[];
    int mem_layout[][];

	private JTextField textField;
	private JTextField textField_1;
	private JTable table_1;
}
