package com.steaartz.student.dataaccess;

import java.util.List;

import javax.ejb.Local;

@Local
public interface StudentDAOLocal {
	
	public StudentDO create(StudentDO student);
	public StudentDO update(StudentDO student);
	public void remove(int id);
	public StudentDO getStudent(int id);
	public List<StudentDO> getAllStudents();

}
