package com.August.bookstore.project1book.ServiceClas;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.August.bookstore.project1book.Entity.Department;
import com.August.bookstore.project1book.Repo.Reposi;

@Service
public class ServiceC implements ServiceImp{

	@Autowired
	private Reposi repo;

	@Override
	public Department saving(Department department) {
		// TODO Auto-generated method stub
		return repo.save(department);
	}

	@Override
	public List<Department> fetch() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Department fetchbyID(Long departmentId) {
		
		return repo.findById(departmentId).get();
	}

	
	@Override
	public void Deletebyid(Long departmentId) {
		// TODO Auto-generated method stub
		repo.deleteById(departmentId);
	}

	@Override
	public Department UpdateIt(Long departmentId, Department department) {
		// TODO Auto-generated method stub
		Department db=repo.findById(departmentId).get();
		if(Objects.nonNull(department.getDepartmentName())&&
				!"".equalsIgnoreCase(department.getDepartmentName())) {
			db.setDepartmentName(department.getDepartmentName());
		}
		if(Objects.nonNull(department.getDepartmentFloor())&&
				0<(department.getDepartmentFloor())) {
			db.setDepartmentFloor(department.getDepartmentFloor());
		}
		
		return repo.save(db);

	}
	

	
	
	
	
	
		
		
	
	

}
