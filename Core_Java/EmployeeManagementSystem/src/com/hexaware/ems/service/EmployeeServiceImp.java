package com.hexaware.ems.service;

import java.util.List;

import com.hexaware.ems.dao.EmployeeDaoImp;
import com.hexaware.ems.dao.IEmployeeDao;
import com.hexaware.ems.entity.Employee;

public class EmployeeServiceImp implements IEmployeeService {

	private IEmployeeDao dao;

	public EmployeeServiceImp() {

		dao = new EmployeeDaoImp();

	}

	@Override
	public int addEmp(Employee emp) {

		return dao.addEmp(emp);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return  dao.getAllEmployees();
	}

	@Override
	public int updateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static boolean validateEmp(Employee emp) {

		boolean flag = false;

		if (emp.getEid() > 99 && emp.getEname().length() > 4 && emp.getSalary() > 10000) {

			flag = true;

		}

		return flag;

	}

	@Override
	public int deleteByEid(int eid) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee getByEid(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

}
