package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import config.Connect;

public class DAO {
	protected static Connection conn = null;
	protected static PreparedStatement ps = null;
	protected static ResultSet rs = null;
}
