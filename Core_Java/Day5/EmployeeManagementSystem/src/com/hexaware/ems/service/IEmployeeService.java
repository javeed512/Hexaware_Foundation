package com.hexaware.ems.service;

import java.util.List;

import com.hexaware.ems.entity.Employee;

public interface IEmployeeService {
	
		
			int  addEmp(Employee emp);
			
			int updateEmployee(Employee emp);
			
			int  deleteByEid(int eid);
			
			Employee      getByEid(int eid);
			
			List<Employee>     getAllEmployees();
	
	

}
