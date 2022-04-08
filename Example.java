import java.sql.*;
class Example
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
String s2 = "insert into student values(71,'venu')";
int rows_effected = sct.executeUpdate(s2);
}
catch(Exception e)
{
System.out.println(e);
}
}
}
