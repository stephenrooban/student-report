package com.steaartz.student.dataaccess;

import java.io.Serializable;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "STUDENT")
@NamedQuery(name = StudentDO.FIND_ALL_STUDENT, query="SELECT s FROM StudentDO s")
public class StudentDO implements Serializable {

	private static final long serialVersionUID = -7263912702114994562L;
	
	public static final String FIND_ALL_STUDENT = "StudentDO.getAll";

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private int id;
	
	@Column(name = "STUDENT_ID")
	private String studentId;
	
	@Column(name = "FIRST_NAME")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Column(name = "STANDARD")
	private int standard;
	
	@Column(name = "AGE")
	private int age;
	
	@Column(name = "BRANCH")
	private String branch;
	
	@Column(name = "PERCENT")
	private Double percent;
	
	@Column(name = "JOINED_DATE")
	private Date joinedDate;
	
	@Convert(converter = BooleanToStringConverter.class)
	@Column(name = "IS_PASSED")
	private Boolean isPassed;

	public StudentDO() {
		super();
	}
	
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getStudentId() {
		return this.studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getStandard() {
		return this.standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}
	
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public Double getPercent() {
		return this.percent;
	}

	public void setPercent(Double percent) {
		this.percent = percent;
	}
	
	public Date getJoinedDate() {
		return this.joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	
	public Boolean getIsPassed() {
		return this.isPassed;
	}

	public void setIsPassed(Boolean isPassed) {
		this.isPassed = isPassed;
	}
   
}
