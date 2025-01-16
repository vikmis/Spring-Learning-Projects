package JDBCTemplate.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import JDBCTemplate.app.DAO.StudentRepo;
import JDBCTemplate.app.Model.Student;


@Service
public class StudentService {
	
	private final StudentRepo studentRepo;
	
	@Autowired
	public StudentService(StudentRepo studentRepo) {
		this.studentRepo =studentRepo;
	}
	
	public void addStudents(Student s) {
		studentRepo.save(s);;
	}


	public List<Student> getStudents() {
		
		return studentRepo.findAll();
	}

}
