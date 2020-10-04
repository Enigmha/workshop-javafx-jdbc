package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll() {
		List<Department> list = new ArrayList<>();
		list.add(new Department(01,"tecnologia"));
		list.add(new Department(02, "Book"));
		list.add(new Department(03, "Computer"));
		list.add(new Department(04, "Eletronic"));
		
		return list;
	}

}
