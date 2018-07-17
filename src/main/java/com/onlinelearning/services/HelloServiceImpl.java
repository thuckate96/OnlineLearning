/**
 * 
 */
package com.onlinelearning.services;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onlinelearning.daos.HellDAO;
import com.onlinelearning.models.Student;

/**
 * @author ThucVV
 *
 */
@Service
public class HelloServiceImpl implements HelloService{
	@Autowired
	private HellDAO hellDAO;
	@Override
	public List<Student> getHello() {
	
		return hellDAO.getHell();
	}
	
	@SuppressWarnings("unused")
	@Override
	public boolean insertStudent(Student student) {
		 
		 
		
		
		return hellDAO.insertStudent(student) > 0;
	}

}
