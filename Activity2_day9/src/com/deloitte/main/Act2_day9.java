package com.deloitte.main;

import java.util.ArrayDeque;

public class Act2_day9 {

	public static void main(String[] args) {

		ArrayDeque<String>adq=new ArrayDeque<String>();
				
		//Use the collection like a stack.
		
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		System.out.println("Popping the stack: ");
		
	
		while(adq.peek()!=null)
			System.out.print(adq.pop()+ " ");
		System.out.println();
	}

}
