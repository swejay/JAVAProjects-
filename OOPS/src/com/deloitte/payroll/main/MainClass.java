package com.deloitte.payroll.main;

import com.deloitte.payroll.Interns;
import com.deloitte.payroll.Accounts;
import com.deloitte.payroll.ConfirmedEmployee;
import com.deloitte.payroll.ContractEmployee;


public class MainClass {

			
	public static void main(String[] args) {
		ConfirmedEmployee confirmedEmployee=new ConfirmedEmployee();
		Accounts accounts=new Accounts();
		accounts.processSalary(confirmedEmployee);
		Interns intern=new Interns();
		accounts.processSalary(intern);
		ContractEmployee contractEmployee=new ContractEmployee();
		accounts.processSalary(contractEmployee);

	
}
}