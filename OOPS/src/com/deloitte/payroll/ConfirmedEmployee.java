package com.deloitte.payroll;

public class ConfirmedEmployee extends Employee {

	@Override
	public void netSalary() {
		System.out.println("Confirmed employees salary");
	}
public void transportFacility() {     //specific to the derived class
	System.out.println("transportation");
}	
}
