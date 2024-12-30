package com.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Connection.DBConnection;

public class StudentData {

	DBConnection db=new DBConnection();
	
	public void insertstudent(StudentDTO s) {
		
		Connection con=db.getconnection();
		
		try {
			
			PreparedStatement ps=con.prepareStatement("insert into project1 values(?,?,?)");
			
			ps.setInt(1, s.getSno());
			
			ps.setString(2, s.getSname());
			
			ps.setInt(3, s.getSage());
			
			int n=ps.executeUpdate();
			
			if(n>0) {
				
				System.out.println(n +"row(s) inserted");
				
			} else {
				
				System.out.println("Something went wrong ");
			}
			
		} catch (Exception e) {

          System.out.println(e);	
       }
	}
	
	public void updateStudent(StudentDTO s1) {
		
		Connection con=db.getconnection();
		
		try {
			
			PreparedStatement ps1=con.prepareStatement("update project1 set sno=?,sname=?,sage=?");
			
			ps1.setInt(1, s1.getSno());
			
			ps1.setString(2, s1.getSname());
			
			ps1.setInt(3, s1.getSage());
			
			int n=ps1.executeUpdate();
			
			if(n>0) {
				
				System.out.println(n+"row(s) updated");
				
			} else {
				
				System.out.println("Something went wrong ");
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public void deleteStudent(StudentDTO s2) {
		
		Connection con=db.getconnection();
		
		try {
			
			PreparedStatement ps2=con.prepareStatement("Delete from project1 where sno=?");
			
			ps2.setInt(1,s2.getSno() );
			
//			ps2.setString(2,s2.getSname() );
//			
//			ps2.setInt(2, s2.getSage());
			
			int n=ps2.executeUpdate();
			
			if(n>0) {
				
				System.out.println(n +"row(s) deleted");
				
			} else {
				 
				System.out.println("Something went wrong ");
			}
			
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
	
	public void selectStudent(StudentDTO s3) {
		
		Connection con=db.getconnection();
		
		try {
			
			PreparedStatement ps3=con.prepareStatement("select * from project1 where sno=?");
			
			ps3.setInt(1,s3.getSno());
			
			ResultSet rs=ps3.executeQuery();
			
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3));
			}
			
			if(ps3.executeQuery()!=null) {
				
				System.out.println("Your data is fetched");
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}