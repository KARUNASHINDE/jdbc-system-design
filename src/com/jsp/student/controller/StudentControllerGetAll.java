package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;

public class StudentControllerGetAll {
	public static void main(String[] args) {
		StudentDao studentDao = new StudentDao();
		 studentDao.GetAllStudent();
	}
	
	
	

}
