import java.sql.*;
class CreateInsert
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC65","IPC65");
			System.out.println("Connection Established");
			Statement st = con.createStatement();
			String s= "create table student_detail(std_name varchar(100), rollno int)";
			st.execute(s);
			String s1 = "insert into student_detail values('samuel',565)";
			st.execute(s1);
			String s2 = "insert into student_detail values('Joel',5413)";
			st.execute(s2);
			String s3 = "insert into student_detail values('swetha',593)";
			st.execute(s3);
			String s4 = "insert into student_detail values('sampath',420)";
			st.execute(s4);
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}
