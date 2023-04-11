package com.jsp.student.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.jsp.student.dto.Student;
import com.jsp.student.util.HelperClass;

public class StudentDao{
	
	
			HelperClass helperClass = new HelperClass();
			
			public  Student saveStudent(Student student) {
			Connection connection =  helperClass.getConnection();
			String sql = "insert into Student values(?, ?, ?)";
			
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				preparedStatement.setInt(1, student.getId());
				preparedStatement.setString(2, student.getName());
				preparedStatement.setString(3, student.getEmail());
				
				preparedStatement.execute();
				
			} 
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally {
				try {
					System.out.println("connection closed");
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return student;
		
	}
			
			public  boolean DeleteStudentById(int id){
				Connection connection =  helperClass.getConnection();
				String sql = "DELETE FROM Student Where Id = ?";
				try {
					PreparedStatement preparedStatement= connection.prepareStatement(sql);
					preparedStatement.setInt(1, id);
					preparedStatement.execute();		
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			finally { 
				try {
				connection.close();
				} 
				catch(SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return true;
			
			
		}
			public void GetAllStudent() {
				Connection connection = helperClass.getConnection();
	String sql = "select * from Student";
	
	try {
		PreparedStatement preparedStatement =connection.prepareStatement(sql);
		ResultSet resultSet =  preparedStatement.executeQuery();
		while(resultSet.next()){
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
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


			public void getStudentBtId(int id) {
				Connection connection = helperClass.getConnection();
				String sql = "select * from student where id = ?";
				try {
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
				
					preparedStatement.setInt(1, id);
					ResultSet resultSet =  preparedStatement.executeQuery();
					while(resultSet.next()) {
						System.out.println("id" +resultSet.getInt(1));
						System.out.println("name = "+resultSet.getString(2));
						System.out.println("email="+resultSet.getString(3));
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
				
			public boolean UpdateStudent(int id ,Student student){
				Connection connection=helperClass.getConnection();
				String sql = "update student set name=?,email=? where id=?";
				try {
					PreparedStatement preparedstatement= connection.prepareStatement(sql);
					preparedstatement.setString(1, student.getName());
					preparedstatement.setString(2, student.getEmail());
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

			
				
	
				
			
			
