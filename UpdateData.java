import java.sql.*;
class UpdateData
{
	public static void main(String args[])
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","MySQL@2021");
		
		PreparedStatement pst = con.prepareStatement("update mydb.student set sname=?,password=? where email=?");
		pst.setString(1,"Rohit Ramtirthe");
		pst.setString(2,"India@11");
		pst.setString(3,"rohit.myrg@gmail.com");
		
		int status = pst.executeUpdate();
		if(status==1)
		{
			System.out.println("1 row Updated successfully");
		}
		}catch(Exception e)
		{
			System.out.print(e); 
		}
	}
}