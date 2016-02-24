package com.bac.srp.example.good;


public class EmployeeBusinessService {
	 
	private EmployeeDataAccess eDataAccess=new EmployeeDataAccess();
	
	public void updateEmployeesName(Employee employee){
				if(null!=employee){
					Employee dbEmp=eDataAccess.findById(employee.getEmpId());
					dbEmp.setName(employee.getName());
					eDataAccess.saveEmployee(dbEmp);
				}

	}
}
