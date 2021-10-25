package com.MySqlconnection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MySqlconApplication implements CommandLineRunner {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(MySqlconApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String sql = "INSERT INTO board (title, content)VALUES (?,?)";
		int result = jdbcTemplate.update(sql, "kim","1004@gmail.com");

		if (result > 0) {
			System.out.println("A new row has been inserted.");
		}
	}
}
/* todo */