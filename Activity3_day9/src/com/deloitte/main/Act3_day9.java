package com.deloitte.main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Act3_day9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	ArrayList<String> al = new ArrayList<String>(); 
	     
	    // Add elements to the array list. 
	    al.add("C"); 
	    al.add("A"); 
	    al.add("E"); 
	    al.add("B"); 
	    al.add("D"); 
	    al.add("F"); 
	 
	    // iterate through the list
	    System.out.print("Original contents of al: "); 

	    Iterator<String> itr = al.iterator(); 
	    while(itr.hasNext()) { 
	      String element = itr.next(); 
	      System.out.print(element + " "); 
	    } 
	    System.out.println(); 
	 
	    // Modify objects being iterated. 
	    ListIterator<String> litr = al.listIterator();  
	    while(litr.hasNext()) { 
	      String element = litr.next(); 
	      litr.set(element + "+"); 
	    } 
	 
	    System.out.print("Modified contents of al: "); 
	    itr = al.iterator();  
	    while(itr.hasNext()) { 
	      String element = itr.next(); 
	      System.out.print(element + " "); 
	    } 
	    System.out.println(); 
	 
	    // Now, display the list backwards. 
	    System.out.print("Modified list backwards: "); 
	    while(litr.hasPrevious()) { 
	      String element = litr.previous(); 
	      System.out.print(element + " "); 
	    } 
	    System.out.println();
	}

}
