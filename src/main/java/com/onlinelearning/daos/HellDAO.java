/**
 * 
 */
package com.onlinelearning.daos;

import java.util.List;

import com.onlinelearning.models.Student;

/**
 * @author ThucVV
 *
 */
public interface HellDAO {
	public List<Student> getHell();
	public int insertStudent(Student student);
}
