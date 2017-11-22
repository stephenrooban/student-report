package com.steaartz.web.student;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.steaartz.student.dataaccess.StudentDAOLocal;
import com.steaartz.student.dataaccess.StudentDO;

@ViewScoped
@ManagedBean(name = "studentMBean")
public class StudentMBean {
	
	@EJB
	private StudentDAOLocal studentDAO;
	
	private int id;
	
	private String studentId;
	
	private String firstName;
	
	private String lastName;
	
	private int standard;
	
	private int age;
	
	private String branch;
	
	private Double percent;
	
	private Date joinedDate;
	
	private Boolean isPassed;
	
	public StudentMBean() {
		
	}
	
	public void createStudent(){
		StudentDO student = new StudentDO();
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setStandard(standard);
		student.setAge(age);
		student.setBranch(branch);
		student.setPercent(percent);
		student.setJoinedDate(joinedDate);
		student.setIsPassed(isPassed);
		student.setStudentId(studentId);
		studentDAO.create(student);
	}
	
	public void updateStudent(){
		StudentDO student = new StudentDO();
		student.setStudentId(studentId);
		student.setId(id);
		student.setFirstName(firstName);
		student.setLastName(lastName);
		student.setStandard(standard);
		student.setAge(age);
		student.setBranch(branch);
		student.setPercent(percent);
		student.setJoinedDate(joinedDate);
		student.setIsPassed(isPassed);
		studentDAO.update(student);
	}
	
	public void getStudent(int id){
		StudentDO student = studentDAO.getStudent(id);
		this.id = student.getId();
		student.setStudentId(studentId);
		firstName = student.getFirstName();
		lastName = student.getLastName();
		standard = student.getStandard();
		age = student.getAge();
		branch = student.getBranch();
		percent = student.getPercent();
		joinedDate = student.getJoinedDate();
		isPassed = student.getIsPassed();
	}
	
	public void deleteStudent(int id){
		studentDAO.remove(id);
	}
	
	public List<StudentDO> getAllStudents(){
		return studentDAO.getAllStudents();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getStandard() {
		return standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public Double getPercent() {
		return percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public Boolean getIsPassed() {
		return isPassed;
	}

	public void setIsPassed(Boolean isPassed) {
		this.isPassed = isPassed;
	}
}
