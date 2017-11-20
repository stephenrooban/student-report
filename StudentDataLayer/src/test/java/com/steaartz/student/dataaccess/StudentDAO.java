package com.steaartz.student.dataaccess;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
@LocalBean
public class StudentDAO implements StudentDAOLocal {
	
	@PersistenceContext
	private EntityManager em;

    public StudentDAO() {
    	
    }

	@Override
	public StudentDO create(StudentDO student) {
		em.persist(student);
		return student;
	}

	@Override
	public StudentDO update(StudentDO student) {
		em.merge(student);
		return student;
	}

	@Override
	public void remove(int id) {
		em.remove(getStudent(id));
	}

	@Override
	public StudentDO getStudent(int id) {
		return em.find(StudentDO.class, id);
	}

	@Override
	public List<StudentDO> getAllStudents() {
		return em.createNamedQuery("StudentDO.getAll", StudentDO.class).getResultList();
	}

}
