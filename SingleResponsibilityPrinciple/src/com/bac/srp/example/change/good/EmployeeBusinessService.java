package com.bac.srp.example.change.good;

import java.util.List;

public class EmployeeBusinessService {
	 
	private EmployeeDataAccess eDataAccess=new EmployeeDataAccess();
	
	public void updateEmployeesName(Employee employee){
				if(null!=employee){
					Employee dbEmp=eDataAccess.findById(employee.getEmpId());
					dbEmp.setName(employee.getName());
					eDataAccess.saveEmployee(dbEmp);
				}

	}
	
	public void updateEmployeePenalty(Employee employee){
		List<Employee> empList=eDataAccess.findByTotalWorkingHour(50L);
		if(null!=empList && !empList.isEmpty()){
			for(Employee e: empList){
				if(null!=e){
					e.setHourlyPay(e.getHourlyPay()-10);
					eDataAccess.saveEmployee(e);
				}
			}
		}
	}
}
