package com.deloitte.exceptions.main;

public class MainClass {
 public static void main(String[] param) {
	 try {

		 System.out.println(param[0]+param[1]); // this will concatenate the 2 

		 System.out.println(Integer.parseInt(param[0])+ Integer.parseInt(param[1]));
	 //    this adds the two values since we are converting string type to integer
	 
	 try {
	 System.out.println(5/0);
	  }
	 catch(ArithmeticException e) {
		 System.out.println("cannot / by 0");
	 }
	 }
	 catch(ArrayIndexOutOfBoundsException e ) {
		 System.out.println("Please enter 2 values");

	 }
	 finally {
	 System.out.println("end");
}
 } 
 }
