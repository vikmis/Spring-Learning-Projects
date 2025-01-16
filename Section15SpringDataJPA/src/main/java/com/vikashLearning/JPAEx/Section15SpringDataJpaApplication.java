package com.vikashLearning.JPAEx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.vikashLearning.JPAEx.Model.Student;

@SpringBootApplication
public class Section15SpringDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(Section15SpringDataJpaApplication.class, args);
		
		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);
		
		StudentRepo repo =context.getBean(StudentRepo.class);
		
//		s1.setRollNo(101);
//		s1.setName("Vikash Mishra");
//		s1.setMarks(66);
//		
		s2.setRollNo(102);
		s2.setName("Vandana Mishra");
		s2.setMarks(89);
//		
//		s3.setRollNo(103);
//		s3.setName("Akash Mishra");
//		s3.setMarks(60);
//		
//		repo.save(s2);
		repo.delete(s2);
		
	//	System.out.println(repo.findByName("Vikash Mishra"));
		//System.out.println(repo.findByMarks(89));
		//System.out.println(repo.findByMarksGreaterThan(72));
		
		
	}

}
