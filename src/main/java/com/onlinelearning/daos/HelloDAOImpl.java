/**
 * 
 */
package com.onlinelearning.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.onlinelearning.models.Student;

/**
 * @author ThucVV
 *
 */
@Repository
@Transactional
public class HelloDAOImpl implements HellDAO{
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<Student> getHell() {
		String sql = "SELECT S FROM Student S";
		Query<Student> query = (Query<Student>) entityManager.createQuery(sql);
		List<Student> result = query.getResultList();
		return result;
	}

	@Override
	public int insertStudent(Student student) {
		System.out.println("this his student: "+student.getAddress()+" "+student.getId());
		 
		 entityManager.persist(student);
		 return 1;
	}
}