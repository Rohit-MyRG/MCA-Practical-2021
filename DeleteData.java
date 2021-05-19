import java.sql.*;
class DeleteData
{
	public static void main(String args[])
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","MySQL@2021");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from mydb.student");
		System.out.println("\nDisplay Data:\n NAME \t\tPASSWORD \t\tEMAIL");
		System.out.println("--------------------------------------------------------------");
		while(rs.next())
		{
			System.out.println("\n "+rs.getString("sname")+"\t    "+rs.getString("password")+"\t\t"+rs.getString("email"));
		}
		
		PreparedStatement pst = con.prepareStatement("delete from mydb.student where email=?");
		pst.setString(1,"rohit.myrg@gmail.com");
		
		int status = pst.executeUpdate();
		if(status==1)
		{
			System.out.println("1 row deleted successfully");
		}
		st = con.createStatement();
		rs = st.executeQuery("select * from mydb.student");
		System.out.println("\nDisplay Table:\n NAME \t\tPASSWORD \t\tEMAIL");
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