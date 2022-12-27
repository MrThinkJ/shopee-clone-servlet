package service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.Connect;
import dao.DAO;
import entity.User;

public class UserService extends DAO{
	public static List<User> getUsers()
	{
		List<User> users = new ArrayList<User>();
		String query = "select * from user order by id asc";
		try
		{
			conn = Connect.openConnect();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next())
				users.add(new User(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return users;
	}
	
	public static void addUser(User user)
	{
		String query = "insert into user (Id, Fullname, Age, Gender, Address) value(?,?,?,?,?)";
		
		try
		{
			conn = Connect.openConnect();
			ps = conn.prepareStatement(query);
			ps.setInt(1, user.getId());
			ps.setString(2, user.getFullName());
			ps.setInt(3, user.getAge());
			ps.setString(4, user.getGender());
			ps.setString(5, user.getAddress());
			ps.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
	
	public static List<User> getUserByKeyword(String keyword)
	{
		List<User> users = new ArrayList<User>();
		String query = "SELECT * FROM user WHERE address LIKE '%"+keyword+"%'";
		try
		{
			conn = Connect.openConnect();
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next())
				users.add(new User(rs.getInt(1),rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5)));
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		return users;
	}
}
