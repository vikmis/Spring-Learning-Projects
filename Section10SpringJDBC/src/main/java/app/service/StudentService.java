package app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import app.Dao.StudentRepo;
import app.model.Student;

@Service
public class StudentService {
	
	private final StudentRepo studentRepo;
	
	@Autowired
	public StudentService(StudentRepo studentRepo) {
		this.studentRepo =studentRepo;
	}
	
	public void addStudents(Student s) {
		StudentRepo.save(s);
	}


	public List<JDBCTemplate.app.Model.Student> getStudents() {
		
		return studentRepo.findAll();
	}

}
