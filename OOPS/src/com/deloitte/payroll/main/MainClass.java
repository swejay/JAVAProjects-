package com.deloitte.payroll.main;

import com.deloitte.payroll.Interns;



import com.deloitte.payroll.Accounts;
import com.deloitte.payroll.ConfirmedEmployee;
import com.deloitte.payroll.ContractEmployee;
import com.deloitte.payroll.Employee;
import com.deloitte.payroll.HR;


public class MainClass {

			
	public static void main(String[] args) {
		
		HR hr=new HR();
		Accounts accounts=new Accounts();
		Employee employee;
		
		employee= hr.recruit('P');
		accounts.processSalary(employee);
		employee= hr.recruit('I');
		accounts.processSalary(employee);
		employee= hr.recruit('C');
		accounts.processSalary(employee);
		
		

}
}