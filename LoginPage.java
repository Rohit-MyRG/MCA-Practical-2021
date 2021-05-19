import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.*;
import java.io.*;

class LoginPage implements ActionListener
{
	JFrame f;
	JTextField txt1,lbl1,lbl2;
	JPasswordField txt2;
	Connection con;
	PreparedStatement pst;		
	ResultSet rs;
	JButton btn1,btn2;
	LoginPage()
	{	
	try{	
		f=new JFrame("LoginPage...");	
		
		lbl1=new JTextField("User Name :"); 		
		lbl1.setBounds(60,60,100,20);	
		lbl1.setEditable(false);
		
		lbl2=new JTextField(" Password :");	
		lbl2.setBounds(60,110,100,20);	
		lbl2.setEditable(false);
			
		txt1=new JTextField();		
		txt1.setBounds(170,60,120,20);	
		
		txt2=new JPasswordField();	
		txt2.setBounds(170,110,120,20);
			
		btn1=new JButton("Sign In");	
		btn1.setBounds(60,160,95,20);	
		btn1.setForeground(Color.blue);	
		btn1.setBackground(Color.GREEN.brighter());
		
		btn2=new JButton("Cancel");	
		btn2.setBounds(180,160,110,20);	
		btn2.setForeground(Color.red);
			
		f.add(lbl1);	
		f.add(txt1);	
		f.add(lbl2);	
		f.add(txt2);	
		f.add(btn1);	 
		f.add(btn2);
	
		f.setBounds(300,200,360,320);	
		f.setLayout(null);	
		f.setVisible(true);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		txt1.requestFocus();
		
		}catch(Exception ex)
		 { 
			JOptionPane.showMessageDialog(null,"Frame design error :"+ex); 
		 }
	}
	public void actionPerformed(ActionEvent e)
	{
	try{
		if (e.getSource()==btn1)	//SIGN IN BUTTON
		{
			String s1=txt1.getText();
			String s2=txt2.getText();
			conn1();
			pst = con.prepareStatement("select * from login2 where usename=? and password=?");
			pst.setString(1,s1);
			pst.setString(2,s2);
			rs = pst.executeQuery();
			
			if(rs.next())
			{
				JOptionPane.showMessageDialog(null,"Login Successfully...");
				f.dispose();
			}else
			{
				JOptionPane.showMessageDialog(null,"Invalid UserName and password : Login Fail...");
			}
			try{	
				rs.close();	pst.close();	con.close();	
			} catch(Exception ex){ }
		}
		if (e.getSource()==btn2)	//CANCEL BUTTON
		{ System.exit(0); }
		
	    }catch(Exception ex)
		 { 
			JOptionPane.showMessageDialog(null,"Click event error :"+ex); 
		 }
	}
	private void conn1()
	{	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","System");	
		}catch(Exception ex)
			{ JOptionPane.showMessageDialog(null,"Connection Not Success error :"+ex); }
	}
	public static void main(String args[])throws Exception
	{	
		new LoginPage();
	}
}