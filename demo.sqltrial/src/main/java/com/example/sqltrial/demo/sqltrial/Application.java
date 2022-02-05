package com.example.sqltrial.demo.sqltrial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
//	@Autowired
//	private JdbcTemplate jdbcTemplate;




//	public void run(String... args) throws Exception {
//		String sql = "INSERT INTO users (id, name, password) VALUES (?, ?, ?)";
//
//		int result = jdbcTemplate.update(sql, 3,"Ravi Kumar", "ravi2021");
//
//		if (result > 0) {
//			System.out.println("A new row has been inserted.");
//		}
//
//	}
}
