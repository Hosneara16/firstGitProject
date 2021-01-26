package miliPackage;

import firstPackage.Sample;

public class SelClass1 extends Sample {  //Inheritance from same and different packages
	int a = 50;
	int b = 40;
	
	public void subtract() {
		System.out.println(a-b);
	}
	
	public void hello() {
		System.out.println("Hello Mili");
	}

	public static void main(String[] args) {
		
		SelClass1 obj1 = new SelClass1();
		//obj1.add();
		obj1.subtract();
		obj1.hello();
		obj1.multiply();
		obj1.multiply1();
		
		Sample objs = new Sample();
		objs.multiply();
		
		
	
	
		
		
		
	}

}
