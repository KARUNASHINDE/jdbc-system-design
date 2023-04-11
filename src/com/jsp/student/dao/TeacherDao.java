package com.jsp.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.jsp.student.dto.Student;
import com.jsp.student.dto.Teacher;
import com.jsp.student.util.HelperClass;

public class TeacherDao {
	HelperClass helpclass = new HelperClass();
	public Teacher Saveteacher(Teacher teacher) {
		Connection connection= helpclass.getConnection();
		String sql = "insert into teacher values(?,?,?)";
	try {
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setInt(1, teacher.getId());
		preparedStatement.setString(2, teacher.getName());
		preparedStatement.setString(3, teacher.getEmail());
		preparedStatement.execute();
		
	} catch (SQLException e) {
		
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return teacher;
	
	}
	public boolean DeleteTeacher(int id) {
	Connection connection =	helpclass.getConnection();
	String sql = "delete from teacher where id = ?";
	try {
		PreparedStatement preparedstatement = connection.prepareStatement(sql);
		preparedstatement.setInt(1, id);
		preparedstatement.execute();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally{
		try{
			connection.close();
		} catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		return true;
	}
	

	public void GetAllTeacher(){
	Connection connection=	helpclass.getConnection();
	String sql = "select * from teacher";
	try {
	PreparedStatement preparedStatement=connection.prepareStatement(sql);
ResultSet resultSet=preparedStatement.executeQuery();
while(resultSet.next()) {
	System.out.println(resultSet.getInt(1));
	System.out.println(resultSet.getString(2));
}	System.out.println(resultSet.getString(3));
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void getTeacherById(int id) {
		Connection connection = helpclass.getConnection();
		String sql = "select* from teacher where id = ?";
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(sql);
			 preparedStatement.setInt(1, id);
			 ResultSet resultSet = preparedStatement.executeQuery();
			 while(resultSet.next()) {
				 System.out.println("id" + resultSet.getInt(1));
				 System.out.println("name= "+resultSet.getString(2));
				 System.out.println("email= "+resultSet.getString(3));
			 }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
		public boolean UpdateTEacher(int id ,Teacher teacher){
			Connection connection=helpclass.getConnection();
			String sql = "update Teacher set name=?,email=? where id=?";
			try {
				PreparedStatement preparedstatement= connection.prepareStatement(sql);
				preparedstatement.setString(1, teacher.getName());
				preparedstatement.setString(2, teacher.getEmail());
				preparedstatement.setInt(3,id);
				preparedstatement.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return true;
				
				}
			
			
			
		
		}
		
	
	

	
	


