package dao;
import java.sql.*;
import model.User;
public class UserDao {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	public UserDao() throws Exception
	{
		conn=MyConnection.getConnection();
	}
	
	public Boolean validate(User user) throws Exception
	{
		String sql="select * from Login where userName=? and userPassword=?";
				pst=conn.prepareStatement(sql);
		pst.setString(1, user.getUserName());
		pst.setString(2, user.getUserPassword());
		rs=pst.executeQuery();
		if(rs.next())
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
