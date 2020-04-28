package com.semanticbits.springhibernateapp.dbconnection;

import java.sql.Connection;

public class DBTest {

	public static void main(String[] args) throws Exception{
		Connection con = null;
		con = DBConnection.getConnection();
		System.out.println("connection :: "+con);
		
	}

}
