package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.dto.Student;

public class studentController {
	public static void main(String[] args) {
	
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("harry");
		s1.setEmail("harry@123.com");
	
		
		StudentDao sd = new StudentDao();
		Student student = sd.saveStudent(s1);
		if(student!=null) {
			System.out.println("Student " +student.getName()+" added successfully");
			
			
		}
		
		                                                                                         
		
		
	
		

}
}