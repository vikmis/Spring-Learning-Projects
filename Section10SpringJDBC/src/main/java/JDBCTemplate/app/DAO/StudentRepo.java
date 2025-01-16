package JDBCTemplate.app.DAO;

import java.util.ArrayList;
import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import JDBCTemplate.app.Model.Student;

@Repository
public class StudentRepo {
	
	private final  JdbcTemplate jdbc;
	
	@Autowired
	public StudentRepo(JdbcTemplate jdbc) {
		this.jdbc =jdbc;
	}

	public  void save( Student s) {
		
		String sql = "insert into student(name,rollnum,marks) values(?, ?, ?)";
		
		int rows = jdbc.update(sql,s.getName(),s.getRollnum(),s.getMarks());
		System.out.println(rows +"affected");
		
	}

	public List<Student> findAll() {
		String sql ="select * from student";
		
		 RowMapper<Student> rowMapper = new RowMapper<Student>() {
	            @Override
	            public Student mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
	                Student student = new Student();
	                student.setName(rs.getString("name"));
	                student.setRollnum(rs.getInt("rollnum"));
	                student.setMarks(rs.getInt("marks"));
	                return student;
	            }
	        };

	        return jdbc.query(sql, rowMapper);
			
		
	}
	
	

}
