import java.sql.*;
class CreateTable
{
	public static void main(String args[])
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","MySQL@2021");
		Statement pst = con.createStatement();
		boolean status = pst.execute("create table mydb.student(sname varchar(30),password varchar(50),email varchar(30))");
		if(status==false)
		{
			System.out.println("Table created successfully");
		}
		}catch(Exception e)
		{
			System.out.print(e); 
		}
	}
}