package com.August.bookstore.project1book.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.August.bookstore.project1book.Entity.Department;
import com.August.bookstore.project1book.ServiceClas.ServiceC;
import com.August.bookstore.project1book.ServiceClas.ServiceImp;

@RestController
public class ControllerClass {
	@Autowired
	private ServiceImp service;
	
	@PostMapping("/hida")
	public Department Hello(@RequestBody Department department) {
	return service.saving(department)	;
	}
	
	@GetMapping("/getValues")
	public List<Department> Fetch(){
		return service.fetch();
		
	}
	@GetMapping("/getValueByID/{id}")
	public Department FindbyId(@PathVariable("id") Long departmentId ) {
		return service.fetchbyID(departmentId);

}
	@DeleteMapping("/ValuebyID/{id}")
	public String Deletebyid(@PathVariable("id") Long departmentId) {
		service.Deletebyid(departmentId);
		return "done";
	}
	@PutMapping("/Valuesfetch/{id}")
	public Department UpdateIt(@PathVariable("id")Long departmentId,@RequestBody Department department) {
		return service.UpdateIt(departmentId,department);
	}
	
	
	
	}
	

