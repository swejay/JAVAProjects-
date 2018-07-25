package com.deloitte.cui;

public class Superman extends Kryptonian implements Flyer {

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

	public void leapBuilding() {
		System.out.println("leaping");
	}
	public void stopBullet() {
		System.out.println("stopping bullet");
	}
	
}
