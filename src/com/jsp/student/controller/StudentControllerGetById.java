package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;

public class StudentControllerGetById {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		studentDao.getStudentBtId(2);
		studentDao.getStudentBtId(3);
		
		
	}

}
