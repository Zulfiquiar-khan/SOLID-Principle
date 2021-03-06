package com.zak.ocp.example.bad;

import java.util.ArrayList;
import java.util.List;



public class ReporterBusinessService {
	
	private EmployeeReportGenerator eReportGenerator=new EmployeeReportGenerator();
	
	List<String> generateReportType(List<Employee> employees,int type){
		List<String> report=new ArrayList<>();
		if(null!=employees && !employees.isEmpty()){
			for(Employee e : employees){
				if(type==1)
					report.add(eReportGenerator.report1(e));
				else if(type==2)
					report.add(eReportGenerator.report2(e));
				else 
					report.add(eReportGenerator.report3(e));
			}
		}
		
		return report;
	}
}
