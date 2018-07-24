package com.deloitte.cui;

public class Human extends Mammals{
public HumanEye leftEye,rightEye; //fields(they are variables and not objects0

public Human(){
	leftEye=new HumanEye();
	rightEye=new HumanEye();

}
class HumanEye extends Eye{    //nested class because only humans have human eye,
							   //so we don't need to declare it outside the class
	
	}

}
