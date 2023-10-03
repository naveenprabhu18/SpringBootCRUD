package com.August.bookstore.project1book.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long DepartmentId;
	private String DepartmentName;
	private int DepartmentFloor;
	
 
	@Override
	public String toString() {
		return "Department [DepartmentId=" + DepartmentId + ", DepartmentName=" + DepartmentName + ", DepartmentFloor="
				+ DepartmentFloor + "]";
	}
	public Department() {
		super();
	}
	public Department(long departmentId, String departmentName, int departmentFloor) {
		super();
		
		
		DepartmentId = departmentId;
		DepartmentName = departmentName;
		DepartmentFloor = departmentFloor;
	}
	public long getDepartmentId() {
		return DepartmentId;
	}
	public void setDepartmentId(long departmentId) {
		DepartmentId = departmentId;
	}
	public String getDepartmentName() {
		return DepartmentName;
	}
	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}
	public int getDepartmentFloor() {
		return DepartmentFloor;
	}
	public void setDepartmentFloor(int departmentFloor) {
		DepartmentFloor = departmentFloor;
	}
	
	
}
