package com.deloitte.main;

public class MainClass {

	public static void main(String[] args) {
		UserDao udao =new UserDao();
		User user= new User(2,"Swathi","Sridhar","swathi@teamdb","hello","I");
		udao.save(user);
		
	}
}
