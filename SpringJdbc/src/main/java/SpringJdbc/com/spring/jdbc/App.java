package SpringJdbc.com.spring.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

public class App {
	public static void main(String[] args) {
		System.out.println("Spring jdbc started...");
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringJdbc/com/spring/jdbc/config.xml");
		JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
		
		//To insert the data use update() method of jdbcTemplate used for insert/update/delete the data
		//String query="insert into student values(101,'Hira Singh','Pune','Ies college','Bihar')";
		//int result=jdbcTemplate.update(query);
		//System.out.println("Record inserted "+result);
		
		//Updating record
		//String query="update student set name='Hiralal' where id=101";
		//int result=jdbcTemplate.update(query);
		//System.out.println(result);
		
		//Deleting record
		//String query="delete from student where id=101";
		//int Delete = jdbcTemplate.update(query);
		//System.out.println(Delete);
		
	}
}