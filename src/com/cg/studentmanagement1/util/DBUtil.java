package com.cg.studentmanagement1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * This DBUtil class will perform all the DB related operations.
 * 
 * @author panka
 *
 */
public class DBUtil {

	// 1: Gather the DB information
	private String driverClassName = "org.postgresql.Driver";
	private String url = "jdbc:postgresql://localhost/capgbatch4";
	private String username = "postgres";
	private String password = "1234";
	
	private Connection con=null;
	private PreparedStatement pstmt=null;
	
	private Connection connect() {
		try {
			Class c = Class.forName(driverClassName);
			con = DriverManager.getConnection(url,username,password);
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return con;
	}
	
	public PreparedStatement prepareStatement(String sql) {
		try {
			pstmt = connect().prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}
	
	public void closeConnection(){
		try {
			con.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
	
	public void closePrepareStatement(){
		try {
			pstmt.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
