/*
 * 
 * !!!!! IT HAS ALREADY BE REMOVED
 * 
 * show how to use JDBC-ODBC to control the database
 * Collision-Interface,balls
 * Java>>>JDBC-ODBC>>>ODBC>>>SQL Server
 */
package com.Chengyang;

import java.sql.*;
//import java.io.*;


public class Test1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Connection ct=null;
		Statement sm=null;
		PreparedStatement ps=null;
		ResultSet resultset=null;
		
		//控制面板\系统和安全\管理工具\ODBC数据源
		try {

			//add necessary driver
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

			//get connection
			ct=DriverManager.getConnection("jdbc:odbc:mytest1");
			//Connection ct=DriverManager.getConnection("", user, password)
			
			//send statements to database
			sm=ct.createStatement();
			
			ps=ct.prepareStatement("insert into Interface values (?,GETDATE(),?) ");
			ps.setInt(1, 4);
			ps.setInt(2, 0);
			
			resultset=ps.executeQuery();
			while(resultset.next())
			{
				System.out.println(resultset.getInt(1)+" "+resultset.getString(2)+" "+resultset.getInt(3));
			} 
			
			
			
			//do CRUD
			
			//demo of add to Interface
			
			int i=sm.executeUpdate("insert into Interface values (4,GETDATE(),0) ");
			//this order can do cud
			//i can return a value
			System.out.println("!");
			
			if(i==1)
			{
				System.out.println("Interface 4 added");
			}	
			else {
				System.out.println("error");
			}
			
			
			
			//show the result
			
			//ResultSet is a table returned
			ResultSet rs=sm.executeQuery("Select * from Balls");
			
			rs.next();
			int a=rs.getInt(1);
			System.out.println(a);
			
			while(rs.next())
			{
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			
			//in the opposite way of opening to close
			
			try {
				
				if(sm!=null)
				{
					sm.close();

				}
				if(ct!=null)
				{
					ct.close();

				}
				
			} catch (Exception e2) {
				// TODO: handle exception
				e2.printStackTrace();
			}
			
			
		}
		

	}

}
