package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.dao.TeacherDao;
import com.jsp.student.dto.Student;
import com.jsp.student.dto.Teacher;

public class TeacherControllerSave {
	public static void main(String[] args) {
		Teacher teacher = new Teacher();
		teacher.setId(5);
		teacher.setName("mohini");
		teacher.setEmail("moh@123@mail.com");
		
		TeacherDao td = new TeacherDao();
		Teacher T1 = td.Saveteacher(teacher);
		if(T1!=null){
			System.out.println("Teacher "+teacher.getName() + teacher.getId()+ teacher.getEmail()+ "added successfully");
			
			
		}
	
	}
	
	}
			
		
		








































