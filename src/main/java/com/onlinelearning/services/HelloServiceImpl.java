/**
 * 
 */
package com.onlinelearning.services;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.onlinelearning.daos.HellDAO;
import com.onlinelearning.models.Student;
import com.onlinelearning.utitils.ApiJsonUtil;

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
	public boolean insertStudent(String json) {
		Student student = new Student(); 
		JsonObject jsonObj = ApiJsonUtil.getJsonObject(json, "data");
		String age = ApiJsonUtil.getJsonString(jsonObj, "age");
		JsonArray jsonArr = ApiJsonUtil.getJsonArray(jsonObj, "people");
		System.out.println("This is age:        "+age);
		System.out.println("Json Array: "+jsonArr.get(0));
		String a = jsonArr.get(0).toString();
		System.out.println("this is a = ================== "+a);
		JsonObject jsonObj2 = ApiJsonUtil.getJsonObject(a);
		String id = ApiJsonUtil.getJsonString(jsonObj2, "id");
		System.out.println("id ===================== "+id);
		return hellDAO.insertStudent(student) > 0;
	}

}
