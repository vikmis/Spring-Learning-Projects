package app.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import app.model.Student;

@Repository
public class StudentRepo {

	public static void save(JDBCTemplate.app.Model.Student s) {
		System.out.println("Saved Students");
		
	}

	public List<JDBCTemplate.app.Model.Student> findAll() {
		List<JDBCTemplate.app.Model.Student> students=new ArrayList<>();
		return students;
	}
	
	

}
