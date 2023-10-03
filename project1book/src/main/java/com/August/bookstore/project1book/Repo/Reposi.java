package com.August.bookstore.project1book.Repo;

import java.util.List;
import java.util.Optional;

import javax.persistence.NamedNativeQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.August.bookstore.project1book.Entity.Department;
@Repository
public interface Reposi extends JpaRepository<Department,Long>{

  
	public Department save(Department department);


	


	


	

}
