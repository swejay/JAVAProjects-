package com.deloitte.main;

import java.util.LinkedList;

class Addr{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	Addr(String n, String s, String c, String st, String cd){
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
	}
		
		public String toString() {
			return name + "\n" + street + "\n" + city + " " + state + " " + code + "\n";
		}
}

public class Address{
public static void main(String[] args) {
	LinkedList<Addr> m1 = new LinkedList<Addr>();
	
	//add elements to the linked list
	m1.add(new Addr("J.W.West","11 Oak Ave","Urbana","IL", "60801"));
	m1.add(new Addr("Ralph Baker","1142 Maple lane","Mahome","IL", "61853"));
	m1.add(new Addr("Tom Carlton","687 Elm St","Champaign","IL", "61820"));
	
	//display this list
	for(Addr result : m1) {
	System.out.println("address:" + result);}
	
	
}
}
