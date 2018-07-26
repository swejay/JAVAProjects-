package com.deloitte.cui;

public class ArrayEx {

	public static void main(String[] args) {
			
	int[] arr1= {1,2,3,4,5};
	int[] arr2=new int[10];
	
		System.arraycopy( arr1,
	            0,
	            arr2,
	            0,
	            5); 
	for(int i:arr2) {
	System.out.println("The array element is "+ i);
	}
	}

}

