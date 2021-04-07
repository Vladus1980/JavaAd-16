package ua.lviv.lgs.lesson16.config;

import org.springframework.context.annotation.Configuration;

import ua.lviv.lgs.lesson16.dao.StudentDao;
import ua.lviv.lgs.lesson16.dao.impl.StudentDaoImpl;

import org.springframework.context.annotation.Bean;

@Configuration
public class StudentDaoConfig {
	@Bean
	StudentDao studentDao() {
		return new StudentDaoImpl();
	}
	
	
	

}
