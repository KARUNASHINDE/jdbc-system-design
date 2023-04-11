package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.dao.TeacherDao;

public class TeacherControllerDelete {
	public static void main(String[] args) {
		TeacherDao teacherDao = new TeacherDao();
		boolean flag= teacherDao.DeleteTeacher(6);
		if(flag==true) {
		System.out.println("Student delete");
		}
		else {
			System.out.println("not done");
		}
		
	}

}
