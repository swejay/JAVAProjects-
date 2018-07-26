package com.deloitte.payroll;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import javax.xml.crypto.Data;

class DBAccess{
	
	public Collection<String> getResult(){
		
		HashSet<String> result=new HashSet<String>();
		result.add("B");
		result.add("E");
		result.add("A");
		result.add("D");
		result.add("A");
		
		return result;
	}
	
	
}


public class MainClass {

	public static void main(String[] args) {
		
		DBAccess dba=new DBAccess();
		Collection<String> dbResult=dba.getResult();
		
		for(String element:dbResult) {
			System.out.println(element);
		}
Iterator<String> iterator= dbResult.iterator();
String str;
while(iterator.hasNext()) {
	str=iterator.next();
	System.out.println(str);
	
}
	//	LinkedList<String> list = new LinkedList<String>();
		
		//list.add("B");
	//	list.addAll(c);
		
	//	list.("B");
	//	.add("B");
	//	list.(c);list.add("B");
		
		//list.c);
		
		//for(Linked.in.list  ) {
		
		

		//	list.add(c);
		
		
	}

}
 //class 7El {
//	 Data base acess- nwbomsn'
//	 xing specific;
	 
// }