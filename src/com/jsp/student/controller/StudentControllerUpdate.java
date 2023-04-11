package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.dto.Student;

public class StudentControllerUpdate {
	public static void main(String[] args) {
		Student s1= new Student();
		s1.setName("karushna");
		s1.setEmail("abc.123@@gmail com");
		StudentDao studentDao= new StudentDao();
		boolean flag= studentDao.UpdateStudent(2, s1);
	if	( flag == true){
			System.out.println("Student DATa IS UPADAED");
		}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			
		
		
	}

}
