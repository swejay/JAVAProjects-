package com.deloitte.cui;

public class Arrays {

	public static void main(String[] args) {
		int num[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		
		
		for(int[] r:num) {
		
			for(int c:r) {
				
				System.out.print(c);
			}
			System.out.println(" ");
		}
		
}
}
