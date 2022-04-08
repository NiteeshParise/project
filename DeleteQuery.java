import java.sql.*;
class DeleteQuery
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC65","IPC65");
			System.out.println("Connection Established");
			Statement st = con.createStatement();
			String del="drop table student";
			st.execute(del);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}