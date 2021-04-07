package ua.lviv.lgs.lesson16;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import ua.lviv.lgs.lesson16.dao.StudentDao;
import ua.lviv.lgs.lesson16.domain.Student;

@SpringBootApplication
public class Lesson16Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Lesson16Application.class, args);
		
		StudentDao studentDao = context.getBean(StudentDao.class);
		
		studentDao.create(new Student(1, "Mykola", 18));
		studentDao.create(new Student(2, "Roman", 19));
		studentDao.create(new Student(3, "Tolian", 22));
		studentDao.readAll().stream().forEach(System.out::println);
		studentDao.update(new Student(2, "Zina", 17));
		studentDao.delete(3);
		studentDao.readAll().stream().forEach(System.out::println);
	}

}
