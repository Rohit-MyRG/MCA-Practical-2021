import java.awt.*;
import java.awt.event.*;

class AWTCalculator extends Frame implements ActionListener 
{
	TextField tfInput;
	Panel panel;
	
	String btnString[] = {"7", "8", "9", "+",
						"4", "5", "6", "-",
						"1", "2", "3", "*",
						"C", "0", "=", "/"};
	Button btn[] = new Button[16];   
	int num1 = 0, num2 = 0, result = 0;
	char op;
 
	public AWTCalculator() 
	{
 
		Font f = new Font("Cambria", Font.BOLD, 18);
  
		tfInput = new TextField(10);
		tfInput.setFont(f);
  
		panel = new Panel();
  
		add(tfInput, "North");
		add(panel, "Center");
	
		panel.setLayout(new GridLayout(4,4));
  
		for(int i=0; i < 16; i++) 
		{
			btn[i] = new Button(btnString[i]);
			btn[i].setFont(f);
			btn[i].addActionListener(this);
			panel.add(btn[i]);
		}
  
		addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent we) 
			{
				System.exit(0);
			}
		});
	}
 
	public void actionPerformed(ActionEvent ae) 
	{
		String str = ae.getActionCommand();  
		switch(str)
		{
			case "+": op = '+';
				num1 = Integer.parseInt(tfInput.getText());
				tfInput.setText("");
				break;
				
			case "-": op = '-';
				num1 = Integer.parseInt(tfInput.getText());
				tfInput.setText("");
				break;
				
			case "*": op = '*';
				num1 = Integer.parseInt(tfInput.getText());
				tfInput.setText("");
				break;
			
			case "/": op = '/';
				num1 = Integer.parseInt(tfInput.getText());
				tfInput.setText("");
				break;
				
			case "=": 
				num2 = Integer.parseInt(tfInput.getText());
				switch(op) 
				{
					case '+' : result = num1 + num2;
						break;
					case '-' : result = num1 - num2;
						break;
					case '*' : result = num1 * num2;
						break;
					case '/' : result = num1 / num2;
						break;
				}
				tfInput.setText(result + "");
				result = 0;
				break;
				
			case "C": tfInput.setText("");
				num1 = num2 = result = 0;
				break;
				
			default: tfInput.setText(tfInput.getText() + str);
		}
	}
	
	public static void main(String args[]) 
	{
		AWTCalculator awtc = new AWTCalculator();
		awtc.setTitle("AWT Calculator");
		awtc.setSize(300,350);
		awtc.setVisible(true);
	}
}