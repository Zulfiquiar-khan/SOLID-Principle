package com.zak.srp.example.change.bad;

import java.util.ArrayList;
import java.util.List;


public class SalaryBusinessService {


	public List<Double> getPayOfEmployees(List<Employee> employees){
		List<Double> payList=new ArrayList<>();
		if(null!=employees && !employees.isEmpty()){
			for(Employee e: employees){
				payList.add(e.calculatePay());
			}
		}
		return payList;
	}
}
