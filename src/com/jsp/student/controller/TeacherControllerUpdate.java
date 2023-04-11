package com.jsp.student.controller;

import com.jsp.student.dao.TeacherDao;
import com.jsp.student.dto.Teacher;

public class TeacherControllerUpdate {
	public static void main(String[] args) {

		Teacher T1 = new Teacher();
		T1.setName("kajal");
		T1.setEmail("BVC@234gmail.com");
		TeacherDao teacherDao = new TeacherDao();
		boolean flag = teacherDao.UpdateTEacher(1, T1);
		if (flag == true) {
			System.out.println("TeCHER dATA IS updated");
		}

	}

}
