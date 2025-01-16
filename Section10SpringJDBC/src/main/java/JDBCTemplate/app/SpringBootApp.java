package JDBCTemplate.app;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

import JDBCTemplate.app.Model.Student;
import JDBCTemplate.app.Service.StudentService;


@SpringBootApplication
public class SpringBootApp {
	
	public static void main(String[] args) {
		 
		ApplicationContext context =SpringApplication.run(SpringBootApp.class, args);
		Student s = context.getBean(Student.class);
		s.setName("Vikash Mishra");
		s.setRollnum(95);
		s.setMarks(100);
		
		
		StudentService service = context.getBean(StudentService.class);
		service.addStudents(s);
		
		List<Student> students = service.getStudents();
		System.out.println(students);
	}

}
