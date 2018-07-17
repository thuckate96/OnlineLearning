/**
 * 
 */
package com.onlinelearning.services;

import java.util.List;

import com.onlinelearning.models.Student;

/**
 * @author ThucVV
 *
 */
public interface HelloService {
	public List<Student> getHello();
	public boolean insertStudent(Student student);
}
