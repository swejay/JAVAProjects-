package com.deloitte.cui;

class M1{
public int x;
public int y;
}
 class Point(int x,int y){
	
	this.x= x;
	this.y=y;
	
	@Override
	public boolean equals(Object target) {
		
		if(target!=null) {
			if(target instanceof Point) {
				Point p3=(Point)target;
				if(x==Point.x && y==Point.y) {
					return true;
				}
			}
	}
		return false;
}
}

public class MClass {

	public static void main(String[] args) {
Point p1=new Point(1,2);
Point p2=new Point(1,2);

System.out.println(p1.equals(p2));
	}
}

