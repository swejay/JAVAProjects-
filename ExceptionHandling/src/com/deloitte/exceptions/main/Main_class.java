package com.deloitte.exceptions.main;

class IllegalAgeException extends Exception{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return ("The person has to be above 18 for voting");
	}
	
}
class Voter{
	public void register(int age) throws IllegalAgeException{
		if(age<18) {
			throw new IllegalAgeException();
		}
	}
}
public class Main_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Voter voter = new Voter();
try{
	voter.register(16);
	
}catch(IllegalAgeException e) {
	e.printStackTrace();
	
}
	}

}
