import java.sql.*;
class JavaMySQL
{
	public static void main(String args[])
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","MySQL@2021");
		System.out.println("\nconnection successfully...\n");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from mydb.student");
		System.out.println("\n NAME \t\tPASSWORD \t\tEMAIL");
		System.out.println("--------------------------------------------------------------");
		while(rs.next())
		{
			System.out.println("\n "+rs.getString("sname")+"\t  "+rs.getString("password")+"\t\t"+rs.getString("email"));
		}
		}catch(Exception e)
		{
			System.out.print(e); 
		}
	}
}