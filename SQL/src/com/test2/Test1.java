/**
 * show the usage of JDBC
 */

package com.test2;

import java.sql.*;

import com.microsoft.sqlserver.jdbc.*;
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		PreparedStatement ps=null;
		Connection ct=null;
		ResultSet rs=null;
		
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			ct=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;" +  
			        "databaseName=Ball_Collision;user=sa;password=Lcy990808");
			
			//ps=ct.prepareStatement("insert into Interface values (4,GETDATE(),0) ");
			
			//int i=ps.executeUpdate();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			
			if(ps!=null)
			{
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(ct!=null)
			{
				try {
					ct.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		

	}

}
