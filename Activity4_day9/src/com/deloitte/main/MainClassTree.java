package com.deloitte.main;

import java.util.TreeSet;
//import java.util.LinkedList;

class AddressTree{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	AddressTree(String n, String s, String c, String st, String cd){
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

public class MainClassTree {
public static void main(String[] args) {
	TreeSet<AddressTree> m2 = new TreeSet<AddressTree>();
	
	//add elements to the linked list
	m2.add(new AddressTree("J.W.West","11 Oak Ave","Urbana","IL", "60801"));
	m2.add(new AddressTree("Ralph Baker","1142 Maple lane","Mahome","IL", "61853"));
	m2.add(new AddressTree("Tom Carlton","687 Elm St","Champaign","IL", "61820"));
	m2.add(new AddressTree("J.W.West","11 Oak Ave","Urbana","IL", "60801"));
	
	//display this list
	for(AddressTree result1 : m2) {
	System.out.println("address:" + result1);}
	
	
}
}
