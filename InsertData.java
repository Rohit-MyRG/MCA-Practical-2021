import java.sql.*;
class InsertData
{
	public static void main(String args[])
	{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","MySQL@2021");
		
		PreparedStatement pst = con.prepareStatement("insert into mydb.student(sname,password,email) values(?,?,?)");
		pst.setString(1,"Shubham");
		pst.setString(2,"sam99");
		pst.setString(3,"shubhamloharkar@gmail.com");
		
		int status = pst.executeUpdate();
		if(status==1)
		{
			System.out.println("1 row inserted successfully");
		} 
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