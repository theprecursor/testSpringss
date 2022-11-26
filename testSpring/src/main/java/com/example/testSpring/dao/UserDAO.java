package com.example.testSpring.dao;

import java.util.List;

import com.example.testSpring.model.Alumnos;
import com.example.testSpring.model.Asignaturas;
import com.example.testSpring.model.MyUser;

public interface UserDAO {
	public List<MyUser> findAll();
	
	public MyUser findById(int id);
	
	//public void save(MyUser user);
	
	void update(MyUser user);
	
	public void deleteById(int id);

	public void save(Alumnos user);

	public void saveas(Asignaturas user);
}
