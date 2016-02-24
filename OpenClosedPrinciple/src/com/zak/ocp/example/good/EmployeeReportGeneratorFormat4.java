package com.zak.ocp.example.good;

public class EmployeeReportGeneratorFormat4 implements EmployeeReporteGenerator{

	private PaymentCalculator ePaymentCalculator=new ManagerPaymentCalculator();

	@Override
	public String report(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

}
