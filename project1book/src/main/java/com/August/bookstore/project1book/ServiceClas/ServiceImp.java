package com.August.bookstore.project1book.ServiceClas;

import java.util.List;

import com.August.bookstore.project1book.Entity.Department;

public interface ServiceImp {

	public Department saving(Department department);

	public List<Department> fetch();


	public Department fetchbyID(Long departmentId);

	
	public void Deletebyid(Long departmentId);

	public Department UpdateIt(Long departmentId, Department department);

	
	
	}


