package com.steaartz.web.student;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.steaartz.student.dataaccess.StudentDAOLocal;

@ViewScoped
@ManagedBean
public class StudentMBean {
	
	@EJB
	private StudentDAOLocal studentDAO;
	
	public StudentMBean() {
		
	}
}
