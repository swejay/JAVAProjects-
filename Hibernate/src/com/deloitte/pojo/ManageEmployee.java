package com.deloitte.pojo;

import java.util.Iterator;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

import java.util.List;

public class ManageEmployee {
private static SessionFactory factory;
private static SharedSessionContract session;

public static void main(String[] args) {
    
    try {
       factory = new Configuration().configure().buildSessionFactory();
    } catch (Throwable ex) { 
       System.err.println("Failed to create sessionFactory object." + ex);
       throw new ExceptionInInitializerError(ex); 
    }
    
   ManageEmployee ME=new ManageEmployee();
    /* Add few employee records in database */
   
    Integer empID1 = ME.addEmployee("Zara", "Ali", 1000);
    Integer empID2 = ME.addEmployee("Daisy", "Das", 5000);
    Integer empID3 = ME.addEmployee("John", "Paul", 10000);

/* List down all the employees */
    ME.listEmployees();
    ME.updateEmployee(empID1, 5000);
    /* Delete an employee from the database */
    ME.deleteEmployee(empID2);

    /* List down new list of the employees */
    ME.listEmployees();
    ME.countEmployee();
    ME.totalSalary();
//String hql="FROM Employee E WHERE E.id = :employee_id";
//Query query= session.createQuery(hql) ;
//query.setParameter("employee_id", 10);
//List results=query.list();

//ME.listEmployeesEntityBest2();
}

 
 /* Method to CREATE an employee in the database */
 public Integer addEmployee(String fname, String lname, int salary){
   Session session = factory.openSession();//session is to establish a conn.
    Transaction tx = null;
    Integer employeeID = null;
    
    try {
      tx= session.beginTransaction();
       Employee employee = new Employee(fname, lname, salary);
       employeeID = (Integer) session.save(employee); 
       tx.commit();
    } catch (HibernateException e) {
       if (tx!=null) tx.rollback();
       e.printStackTrace(); 
    } finally {
       session.close(); 
    }
    return employeeID;
 }
 
 /* Method to  READ all the employees */
 public void listEmployees( ){
	 Session session = null;
	 session = factory.openSession();
     Transaction tx = null;
   List employees;
    try {
       tx = session.beginTransaction();
       employees =  session.createQuery("FROM Employee").list(); 
       for (Iterator iterator = employees.iterator(); iterator.hasNext();){
          Employee employee = (Employee) iterator.next(); 
          System.out.print("First Name: " + employee.getFirstName()); 
          System.out.print("Last Name: " + employee.getLastName()); 
          System.out.println("Salary: " + employee.getSalary()); 
       }
       tx.commit();
    } catch (HibernateException e) {
       if (tx!=null) tx.rollback();
       e.printStackTrace(); 
    } finally {
       session.close(); 
    }
 }
 
 public void listEmployeesEntityNS( ){
	
	 Session session = factory.openSession();
     Transaction tx = null;
  
    try {
       tx = session.beginTransaction();
       String sql="SELECT * FROM EMPLOYEE";
       SQLQuery query= (SQLQuery) session.createQuery(sql);
        query.addEntity(Employee.class);
       List employees=query.list();
       for (Iterator iterator = employees.iterator(); iterator.hasNext();){
          Employee employee = (Employee) iterator.next(); 
          System.out.print("First Name: " + employee.getFirstName()); 
          System.out.print("Last Name: " + employee.getLastName()); 
          System.out.println("Salary: " + employee.getSalary()); 
       }
       tx.commit();
    } catch (HibernateException e) {
       if (tx!=null) tx.rollback();
       e.printStackTrace(); 
    } finally {
       session.close(); 
    }
 }
 
 
 public void updateEmployee(Integer EmployeeID, int salary ){
     Session session = factory.openSession();
     Transaction tx = null;
     
     try {
        tx = session.beginTransaction();
        Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
        employee.setSalary( salary );
    session.update(employee); 
        tx.commit();
     } catch (HibernateException e) {
        if (tx!=null) tx.rollback();
        e.printStackTrace(); 
     } finally {
        session.close(); 
     }
  }

 /* Method to DELETE an employee from the records */
 public void deleteEmployee(Integer EmployeeID){
    Session session = factory.openSession();
    Transaction tx = null;
    
    try {
       tx = session.beginTransaction();
       Employee employee = (Employee)session.get(Employee.class, EmployeeID); 
       session.delete(employee); 
       tx.commit();
    } catch (HibernateException e) {
       if (tx!=null) tx.rollback();
       e.printStackTrace(); 
    } finally {
       session.close(); 
    }
 }
 public void listEmployeesEntityBest2( ){
		
	 Session session = factory.openSession();
     Transaction tx = null;
  
    try {
       tx = session.beginTransaction();
       String sql="SELECT * FROM EMPLOYEE";
       SQLQuery query= (SQLQuery) session.createQuery(sql);
        query.addEntity(Employee.class);
       List employees=query.list();
       for (Iterator iterator = employees.iterator(); iterator.hasNext();){
          Employee employee = (Employee) iterator.next(); 
          System.out.print("First Name: " + employee.getFirstName()); 
          System.out.print("Last Name: " + employee.getLastName()); 
          System.out.println("Salary: " + employee.getSalary()); 
       }
       tx.commit();
    } catch (HibernateException e) {
       if (tx!=null) tx.rollback();
       e.printStackTrace(); 
    } finally {
       session.close(); 
    }
 }
 
 public void countEmployee(){
     Session session = factory.openSession();
     Transaction tx = null;
     
     try {
        tx = session.beginTransaction();
        Criteria cr = session.createCriteria(Employee.class);

        // To get total row count.
        cr.setProjection(Projections.rowCount());
        List rowCount = cr.list();

        System.out.println("Total Coint: " + rowCount.get(0) );
        tx.commit();
     } catch (HibernateException e) {
        if (tx!=null) tx.rollback();
        e.printStackTrace(); 
     } finally {
        session.close(); 
     }
  }
 
 /* Method to print sum of salaries */
 public void totalSalary(){
    Session session = factory.openSession();
    Transaction tx = null;
    
    try {
       tx = session.beginTransaction();
       Criteria cr = session.createCriteria(Employee.class);

       // To get total salary.
       cr.setProjection(Projections.sum("salary"));
       List totalSalary = cr.list();

       System.out.println("Total Salary: " + totalSalary.get(0) );
       tx.commit();
    } catch (HibernateException e) {
       if (tx!=null) tx.rollback();
       e.printStackTrace(); 
    } finally {
       session.close(); 
    }
 }
//String hql="FROM EMPLOYEES E ORDER BY E.SALARY DESC";
//Query query=session.createQuery(hql)
//query.setFirstResult();
//query.setMaxResults();
//List results=


//cr.criteria


}
