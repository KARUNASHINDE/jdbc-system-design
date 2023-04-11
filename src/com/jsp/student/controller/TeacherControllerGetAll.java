package com.jsp.student.controller;

import com.jsp.student.dao.StudentDao;
import com.jsp.student.dao.TeacherDao;

public class TeacherControllerGetAll {
	public static void main(String[] args) {
		TeacherDao teacherDao = new TeacherDao();
		teacherDao.GetAllTeacher();
	}

}
