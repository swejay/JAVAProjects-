package com.deloitte.pojo;

public class Main {

	private static SessionFactory factory; 
	   public static void main(String[] args) {
	      
	      try {
	         factory = new AnnotationConfiguration()
	        .configure()
	        .addPackage("com.deloitte.pojos")
	        .addAnnotatedClass(Employee.class)
	        .buildSessionFactory();
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
}
	   
