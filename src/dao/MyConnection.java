package dao;
import java.sql.*;

import com.mysql.jdbc.Connection;

public class MyConnection {

private MyConnection() {}
private static Connection conn;
public static Connection getConnection() throws Exception
{
if(conn==null)
{
	Class.forName("com.mysql.jdbc.Driver");
	conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","");
	
}
return conn;

}}



