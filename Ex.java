import java.sql.*;
class Ex
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("loaded");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC111","IPC111");
System.out.println("Established");
Statement sct = con.createStatement();
String s1 = "create table student_details(int roll,nme varchar(20))";
Statement sc = con.createStatement();
String s2 = "insert into student_details values(71,'venu')";
int rows_effected = sc.executeUpdate(s2);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
