package ua.lviv.lgs.lesson16.dao;

import java.util.List;

import ua.lviv.lgs.lesson16.domain.Student;

public interface StudentDao {
	
	Student create(Student student);
	Student readById(int id);
	List<Student> readAll();
	Student update(Student student);
	void delete(int id);
	

}
