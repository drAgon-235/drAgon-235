package calc_01;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator_02 implements ActionListener
{
	JFrame frame;
	JTextField textField;
	JButton[] numberButtons = new JButton[10];
	JButton[] functionButtons = new JButton[9];
	JButton addButton, subButton, multButton, divButton;
	JButton decButton, equalsButton, delButton, clrButton, negativeButton;
	JPanel panel;
	
	Font myFont = new Font("CourierNarrow", Font.BOLD,30);
	
	double num1=0, num2 =0, result =0;
	char operator;
	
	Calculator_02()
	{
		frame = new JFrame("MyFirst-Calculator");					//creating the whole thing (frame)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//obligatory
		frame.setSize(420, 550);
		frame.setLayout(null);										//obligatory
		
		textField = new JTextField();								//creation of the "Display"
		textField.setOpaque(true);
		textField.setBackground(Color.CYAN);
		textField.setBounds(50, 25, 300, 50);
		textField.setFont(myFont);
		textField.setEditable(false);
		
		addButton = new JButton("+");								//creating all the functional Buttons: ...
		subButton = new JButton("-");
		multButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equalsButton = new JButton("=");
		delButton = new JButton("Del");
		clrButton = new JButton("Clr");
		negativeButton = new JButton("-");
		
		functionButtons[0] = addButton;								//putting the Buttons into Array: functionButtons[] 
		functionButtons[1] = subButton;
		functionButtons[2] = multButton;
		functionButtons[3] = divButton;
		functionButtons[4] = decButton;
		functionButtons[5] = equalsButton;
		functionButtons[6] = delButton;
		functionButtons[7] = clrButton;
		functionButtons[8] = negativeButton;
		
		
		for(int i = 0; i < 9; i++)								//gives functions to each functionButton
		{
			functionButtons[i].addActionListener(this);
			functionButtons[i].setFont(myFont);
			functionButtons[i].setFocusable(false);
		}
		
		
		for(int i = 0; i < 10; i++)								 //creating all the numberButtons & putting them into Array: numberButtons[]
		{
			numberButtons[i] = new JButton(String.valueOf(i));
			numberButtons[i].addActionListener(this);
			numberButtons[i].setFont(myFont);
			numberButtons[i].setFocusable(false);
		}

																		
		negativeButton.setBounds(50, 430, 100, 50);				//positioning the "Special-Buttons"
		delButton.setBounds(150, 430, 100, 50);
		clrButton.setBounds(250, 430, 100, 50);
		
		panel = new JPanel();									//creating a 'Panel', on which the numberButtons will be posed
		panel.setBounds(50, 100, 300, 300);		
		panel.setLayout(new GridLayout(4, 4, 10, 10));			//creating a grid for the numberButtons
//		panel.setBackground(Color.BLUE);				//Optional, shows position of the GridArray
		
		panel.add(numberButtons[1]);							//posing the numberButtons on the grid
		panel.add(numberButtons[2]);
		panel.add(numberButtons[3]);
		panel.add(addButton);
		panel.add(numberButtons[4]);
		panel.add(numberButtons[5]);
		panel.add(numberButtons[6]);
		panel.add(subButton);
		panel.add(numberButtons[7]);
		panel.add(numberButtons[8]);
		panel.add(numberButtons[9]);
		panel.add(multButton);
		panel.add(decButton);
		panel.add(numberButtons[0]);
		panel.add(equalsButton);
		panel.add(divButton);
		
		frame.add(panel);							//putting all the stuff we created on the panel
		frame.add(negativeButton);
		frame.add(delButton);
		frame.add(clrButton);
		frame.add(textField);
		frame.setVisible(true);						//obligatory
	}

	public static void main(String[] args)
	{
		Calculator_01 calc = new Calculator_01();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e)					//bringing life into the Calculator
	{
		for(int i =0; i <10; i++)								//for each numberButton:
		{
			if(e.getSource() == numberButtons[i])				//depending on the click on an number
			{
				textField.setText(textField.getText().concat(String.valueOf(i)));	//the clicked number is shown on the Display (textField)
			}
		}
		if(e.getSource() == decButton)
		{
			textField.setText(textField.getText().concat("."));
		}
		if(e.getSource() == addButton)
		{
			num1= Double.parseDouble(textField.getText());
			operator = '+';
			textField.setText("");
		}
		if(e.getSource() == subButton)
		{
			num1= Double.parseDouble(textField.getText());
			operator = '-';
			textField.setText("");
		}
		if(e.getSource() == multButton)
		{
			num1= Double.parseDouble(textField.getText());
			operator = '*';
			textField.setText("");
		}
		if(e.getSource() == divButton)
		{
			num1= Double.parseDouble(textField.getText());
			operator = '/';
			textField.setText("");
		}		
		if(e.getSource() == equalsButton)
		{
			num2 = Double.parseDouble(textField.getText());			//The input(a String) is being put on the variable num2
			switch(operator)
			{
				case '+': result = num1 + num2; break;				//which, depending on the case calculates the result
				case '-': result = num1 - num2; break;
				case '*': result = num1 * num2; break;
				case '/': result = num1 / num2; break;
			}
			
			textField.setText(String.valueOf(result));				//and outputs the result on the display
			num1=result;											//and saves the value as num1 for further calculations
			
		}
		
		if(e.getSource() == clrButton)
		{	
			textField.setText("");			
		}	
		
		if(e.getSource() == delButton)
		{	
			String string = textField.getText();
			textField.setText("");			
			for(int i =0; i < string.length()-1; i++)
			{
				textField.setText(textField.getText() + string.charAt(i));
			}
			
		}	
		if(e.getSource() == negativeButton)
		{	
			double temp = Double.parseDouble(textField.getText());
			temp *= -1;
			textField.setText(String.valueOf(temp));
		}		
	}
}
