package calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class Calculator {

	private JFrame frame;
	private JTextField textDisplay;
	double firstnum,secondnum,result;
	String operations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 375, 599);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 30));
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setBounds(12, 13, 333, 57);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
///////////////////////////  rrrrrrrrrrrrrrraaaaaaaaaaaaaaaaaaawwwwwwwwwwwwwwwww    1111111111111111111
		JButton butBac = new JButton("\uF0E7");
		butBac.setFont(new Font("Dialog", Font.BOLD, 30));

		butBac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(textDisplay.getText().length()>0)
		{
					String backspace=null;
					StringBuilder str8= new StringBuilder(textDisplay.getText());
					str8.deleteCharAt(textDisplay.getText().length()-1);
					backspace = str8.toString();
					textDisplay.setText(backspace);
			
		}
			}
		});
	
		butBac.setBounds(12, 83, 80, 80);
		frame.getContentPane().add(butBac);
		
		JButton butCle = new JButton("C");
		butCle.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
			       textDisplay.setText(null);
				}			
				});
		butCle.setFont(new Font("Tahoma", Font.BOLD, 30));
		butCle.setBounds(96, 83, 80, 80);
		frame.getContentPane().add(butCle);
		
		JButton butMod = new JButton("%");
		butMod.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
			 firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
			 	operations = "%";
			}
		});
		butMod.setFont(new Font("Tahoma", Font.BOLD, 30));
		butMod.setBounds(179, 83, 80, 80);
		frame.getContentPane().add(butMod);
		
		JButton butAdd = new JButton("+");
           butAdd.addActionListener(new ActionListener() {
			
        	   public void actionPerformed(ActionEvent e) {
			 firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
			 	operations = "+";
			}
		});
		butAdd.setFont(new Font("Tahoma", Font.BOLD, 30));
		butAdd.setBounds(265, 83, 80, 80);
		frame.getContentPane().add(butAdd);
///////////////////////////  rrrrrrrrrrrrrrraaaaaaaaaaaaaaaaaaawwwwwwwwwwwwwwwww    22222222222222222222222
		JButton but7 = new JButton("7");
		but7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but7.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but7.setFont(new Font("Tahoma", Font.BOLD, 30));
		but7.setBounds(12, 176, 80, 80);
		frame.getContentPane().add(but7);
		
		JButton but8 = new JButton("8");
		but8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but8.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but8.setFont(new Font("Tahoma", Font.BOLD, 30));
		but8.setBounds(96, 176, 80, 80);
		frame.getContentPane().add(but8);
		
		JButton but9 = new JButton("9");
		but9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but9.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but9.setFont(new Font("Tahoma", Font.BOLD, 30));
		but9.setBounds(179, 176, 80, 80);
		frame.getContentPane().add(but9);
		
		JButton butSub = new JButton("-");
         butSub.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
			 firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
			 	operations = "-";
			}
		});
		butSub.setFont(new Font("Tahoma", Font.BOLD, 30));
		butSub.setBounds(265, 176, 80, 80);
		frame.getContentPane().add(butSub);
////////////////////////////    rrrrrrrrrrrrrrrraaaaaaaaaaaaaaaaawwwwwwwww      33333333333333333333333333333333
		JButton but4 = new JButton("4");
		but4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but4.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but4.setFont(new Font("Tahoma", Font.BOLD, 30));
		but4.setBounds(12, 266, 80, 80);
		frame.getContentPane().add(but4);
		
		JButton but5 = new JButton("5");
		but5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but5.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but5.setFont(new Font("Tahoma", Font.BOLD, 30));
		but5.setBounds(96, 266, 80, 80);
		frame.getContentPane().add(but5);
		
		JButton but6 = new JButton("6");
		but6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but6.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but6.setFont(new Font("Tahoma", Font.BOLD, 30));
		but6.setBounds(179, 266, 80, 80);
		frame.getContentPane().add(but6);
		
		JButton butMul = new JButton("X");
            butMul.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
			 firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
			 	operations = "X";
			}
		});
		butMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		butMul.setFont(new Font("Tahoma", Font.BOLD, 30));
		butMul.setBounds(265, 266, 80, 80);
		frame.getContentPane().add(butMul);
////////////////////////////////////////     rrrrrrrrrrrrrrrrrrrrrrrrrrr     444444444444444444444444444444
		JButton but1 = new JButton("1");
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but1.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but1.setFont(new Font("Tahoma", Font.BOLD, 30));
		but1.setBounds(12, 359, 80, 80);
		frame.getContentPane().add(but1);
		
		JButton but2 = new JButton("2");
		but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but2.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but2.setFont(new Font("Tahoma", Font.BOLD, 30));
		but2.setBounds(96, 359, 80, 80);
		frame.getContentPane().add(but2);
		
		JButton but3 = new JButton("3");
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but3.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but3.setFont(new Font("Tahoma", Font.BOLD, 30));
		but3.setBounds(179, 359, 80, 80);
		frame.getContentPane().add(but3);
		
		JButton butDiv = new JButton("/");
           butDiv.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
			 firstnum = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
			 	operations = "/";
			}
		});
		butDiv.setFont(new Font("Tahoma", Font.BOLD, 30));
		butDiv.setBounds(265, 359, 80, 80);
		frame.getContentPane().add(butDiv);
/////////////////////////////////////   rrrrrrrrrrrrrrrraaaaaaaaaaaaaaaaaaaaaaawwwwwwwwwwwwwwwwwwww   55555555555555555555555
		JButton but0 = new JButton("0");
		but0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + but0.getText();
				textDisplay.setText(EnterValue);
			}
		});
		but0.setFont(new Font("Tahoma", Font.BOLD, 30));
		but0.setBounds(12, 452, 80, 80);
		frame.getContentPane().add(but0);
		
		JButton butDot = new JButton(".");
		butDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterValue = textDisplay.getText() + butDot.getText();
				textDisplay.setText(EnterValue);
			}
		});
		butDot.setFont(new Font("Tahoma", Font.BOLD, 30));
		butDot.setBounds(96, 452, 80, 80);
		frame.getContentPane().add(butDot);
		
		JButton butplu = new JButton("\u00B1");
		butplu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 double plusminus=0.0;
				 plusminus = Double.parseDouble(String.valueOf(textDisplay.getText()));
				plusminus= plusminus* (-1);
				textDisplay.setText(String.valueOf(plusminus));
			}
		});
		butplu.setFont(new Font("Tahoma", Font.BOLD, 30));
		butplu.setBounds(179, 452, 80, 80);
		frame.getContentPane().add(butplu);
		
		JButton butEqa = new JButton("=");
            butEqa.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
			 String answer;
			double  secondnum = Double.parseDouble(textDisplay.getText());
			 
			 if(operations == "+") {
				 result= firstnum + secondnum;
				 answer = String.format("%.2f", result);
				 textDisplay.setText(answer);
				 
			 }
			 
			 else if(operations == "-") {
				 result= firstnum - secondnum;
				 answer = String.format("%.2f", result);
				 textDisplay.setText(answer);
				 
			 }
			 
			 else if(operations == "X") {
				 result= firstnum * secondnum;
				 answer = String.format("%.2f", result);
				 textDisplay.setText(answer);
				 
			 }
			 
			 else if(operations == "/") {
				 result= (firstnum / secondnum);
				 answer = String.format("%.2f", result);
				 textDisplay.setText(answer);
				 
			 }
			 
			 else if(operations == "%") {
				 result= firstnum % secondnum;
				 answer = String.format("%.2f", result);
				 textDisplay.setText(answer);
				 
			 }
			}
		});
		butEqa.setFont(new Font("Tahoma", Font.BOLD, 30));
		butEqa.setBounds(265, 452, 80, 80);
		frame.getContentPane().add(butEqa);
	}
}
