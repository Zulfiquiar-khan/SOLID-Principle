package com.zak.ocp.example.good;

import java.util.Date;
import java.util.Map;

public class Employee {
	
	private String name;
	private Long empId;
	private Map<Date,Integer> workingHours;
	private Double hourlyPay;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public Map<Date, Integer> getWorkingHours() {
		return workingHours;
	}
	
	
	public void setWorkingHours(Map<Date, Integer> workingHours) {
		this.workingHours = workingHours;
	}

	public Double getHourlyPay() {
		return hourlyPay;
	}

	public void setHourlyPay(Double hourlyPay) {
		this.hourlyPay = hourlyPay;
	}	
}
