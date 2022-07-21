package com.example;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import lombok.extern.java.Log;

@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:beans.xml")
@Log
class CityTest {

	@Autowired
	private DataSource dataSource;
	
	@Test
	void test() {
		try {
			
		} catch(Exception ex) {
			try {
				Connection conn = this.dataSource.getConnection();
				log.info(conn.toString());
			} catch(Exception ex) {
				log.warning(ex.getMessage());				
			}
		}
		//assertNotNull("this.dataSource");
		log.info("Hello, World");
	}

}
