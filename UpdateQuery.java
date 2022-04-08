import java.sql.*;
class UpdateQuery
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loaded");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC65","IPC65");
			System.out.println("Connection Established");
			Statement st = con.createStatement();
			String upd1="update student_detail set std_name='Sampath Budhavarapu' where rollno=420";
			st.execute(upd1);
			String upd2="update student_detail set std_name='Swetha Mocherla' where rollno=593";
			st.execute(upd2);
			String upd3="update student_detail set std_name='Joel Depuri' where rollno=5413";
			st.execute(upd3);
			String upd4="update student_detail set std_name='Samuel Adirala' where rollno=565";
			st.execute(upd4);
			
			//table consists of student_name(index position=1) ,rollno(index position=2)
			//displaying result using result set
			ResultSet rs=st.executeQuery("select * from student_detail");
			while(rs.next())		 //rs.next()--> returns true
			{
				
				System.out.println(rs.getString(1));
				System.out.println(rs.getInt(2));
				
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
