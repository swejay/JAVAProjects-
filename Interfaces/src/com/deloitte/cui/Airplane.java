package com.deloitte.cui;

public class Airplane extends Vehicle implements Flyer {

	@Override
	public void takeOff() {
System.out.println("taking off");
	}

	@Override
	public void land() {
System.out.println("landing");
	}

	@Override
	public void fly() {
System.out.println("flying");
	}

}

