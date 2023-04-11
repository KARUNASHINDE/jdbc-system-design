package com.jsp.student.controller;

import com.jsp.student.dao.TeacherDao;

public class TeacherControllerGetById {
	public static void main(String[] args) {
		TeacherDao teacherdao= new TeacherDao();
		teacherdao.getTeacherById(2);
		teacherdao.getTeacherById(3);
	}

}
