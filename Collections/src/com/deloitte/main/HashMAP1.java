package com.deloitte.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMAP1 {
	public static void main(String[] args) {
HashMap<Integer,String> result=new HashMap<Integer,String>();

	result.put(123,"ABC");
	result.put(345,"EFG");
	result.put(123,"ABC");
	result.put(123,"HHH");

	System.out.println(result.size());
	System.out.println(result.get(345));
	
	Set<Integer> keys =result.keySet();
	
for(Integer key:keys) {
	System.out.println(key+"-"+result.get(key));
	}
Iterator<Integer> iterator=keys.iterator();
Integer key;
while(iterator.hasNext()) {
	key=iterator.next();
	System.out.println(key+"-"+result.get(key));
}
}
}
