//program to retrive employee password and information 

import java.sql.*;
import java.util.*;
class Retrive_emp 
{
public static void main(String args[])
{
try
{
//load driver
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("loaded");
//create connection
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC111","IPC111");
System.out.println("Established");
//read empno from the user
Scanner s = new Scanner(System.in);
System.out.println("enter your employee id");
int empno = s.nextInt();
//get the data from the table and compare with the input
Statement sct = con.createStatement();
String sql = "select * from emp";
ResultSet rs = sct.executeQuery(sql);
boolean result = false;

while(rs.next())
{
//chech the rows line by line until all the records are completed
//verify input with empno with first column of your table
if(empno==rs.getInt(1))
{
System.out.println("you are valid user");
System.out.println("hello"+rs.getString(2));
result = true;
break;
}
}//while-closing
if(result==false)
System.out.println("invalid user");
}//try
catch(Exception e)
{
System.out.println(e);
}//catch
}//main
}//class

