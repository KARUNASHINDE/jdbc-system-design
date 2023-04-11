package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;

public class StudentControllerDelete {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		boolean flag = studentDao.DeleteStudentById(1);
		if(flag ==true) {
			System.out.println("Student Delete");
			}
		else {
			System.out.println("not done");
		}
	}

}
