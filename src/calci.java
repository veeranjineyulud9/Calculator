import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.text.JTextComponent;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calci {

	protected static final JTextComponent btnNewButtonDot = null;
	private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
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
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 268, 421);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(10, 26, 222, 83);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButtonBackspace = new JButton("\uF0E7");
		btnNewButtonBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnNewButtonBackspace.setFont(new Font("Windings", Font.BOLD, 18));
		btnNewButtonBackspace.setBounds(10, 120, 57, 50);
		frame.getContentPane().add(btnNewButtonBackspace);
		
		JButton btnNewButton_1 = new JButton("7");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1.setBounds(10, 164, 57, 50);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("4");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_1.getText();
				textField.setText(number);
	
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1.setBounds(10, 214, 57, 50);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("1");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_1_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1_1.setBounds(10, 261, 57, 50);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_1_1 = new JButton("0");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_1_1_1_1.getText();
				textField.setText(number);

			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_1_1_1_1.setBounds(10, 306, 57, 50);
		frame.getContentPane().add(btnNewButton_1_1_1_1);
		
		JButton btnNewButtonClear = new JButton("C");
		btnNewButtonClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButtonClear.getText();
				textField.setText(number);
				
			}
		});
		btnNewButtonClear.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButtonClear.setBounds(67, 120, 57, 50);
		frame.getContentPane().add(btnNewButtonClear);
		
		JButton btnNewButton_2_1 = new JButton("8");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_2_1.getText();
				textField.setText(number);

			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_1.setBounds(67, 164, 57, 50);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("5");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_2_1_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_1_1.setBounds(67, 214, 57, 50);
		frame.getContentPane().add(btnNewButton_2_1_1);
		
		JButton btnNewButton_2_1_1_1 = new JButton("2");
		btnNewButton_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_2_1_1_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_1_1_1.setBounds(67, 261, 57, 50);
		frame.getContentPane().add(btnNewButton_2_1_1_1);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
	     		public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);

			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDot.setBounds(67, 306, 57, 50);
		frame.getContentPane().add(btnDot);
		
		JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn00.setBounds(121, 120, 57, 50);
		frame.getContentPane().add(btn00);
		
		JButton btnNewButton_2_2_1 = new JButton("9");
		btnNewButton_2_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_2_2_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_2_1.setBounds(121, 164, 57, 50);
		frame.getContentPane().add(btnNewButton_2_2_1);
		
		JButton btnNewButton_2_2_1_1 = new JButton("6");
		btnNewButton_2_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_2_2_1_1.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_2_1_1.setBounds(121, 214, 57, 50);
		frame.getContentPane().add(btnNewButton_2_2_1_1);
		
		JButton btnNewButton_2_2_1_2 = new JButton("3");
		btnNewButton_2_2_1_2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnNewButton_2_2_1_2.getText();
				textField.setText(number);
			}
		});
		btnNewButton_2_2_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2_2_1_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_2_1_2.setBounds(121, 261, 57, 50);
		frame.getContentPane().add(btnNewButton_2_2_1_2);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnEqual.setBounds(121, 306, 57, 50);
		frame.getContentPane().add(btnEqual);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPlus.setBounds(176, 120, 57, 50);
		frame.getContentPane().add(btnPlus);
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnSub.setBounds(176, 164, 57, 50);
		frame.getContentPane().add(btnSub);
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";

			}
		});
		btnMul.setHorizontalAlignment(SwingConstants.LEFT);
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnMul.setBounds(176, 214, 57, 50);
		frame.getContentPane().add(btnMul);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";

			}
		});
		btnDivide.setHorizontalAlignment(SwingConstants.LEFT);
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDivide.setBounds(176, 261, 57, 50);
		frame.getContentPane().add(btnDivide);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";

			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnPercent.setBounds(176, 306, 57, 50);
		frame.getContentPane().add(btnPercent);
	}
}
