package firstPackage;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		String s1 = scan.nextLine();
		String s2 = scan.nextLine();
		System.out.println(s1+s2);
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		System.out.println(a+b);
		scan.close();
		
		
		try {
			int [] x = new int[3];
			x[4]= 10;
			System.out.println(x[4]);
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Array Exceptions handled");
			
			System.out.println("mili");
		}
		
		
		
		
		
//		int [] i = new int [2];
//		i [0]=10;
//		i [1]=12;
//		//i [2]=15;
//		//i [3] =20;
//		 System.out.println(i[0]);
//		 //System.out.println(i[3]);
		
		
			
//				try {
//					int a=0;
//					int b=20;
//					
//					System.out.println(b/a);
//				} catch (ArithmeticException e) {
//					
//					System.out.println("Arithmetic Exception handled");	
//				}
//			
//
//				
//			
//					
//		
//			System.out.println("Hi");
//		System.out.println(10+20);
	
	try {
		String s = null;
		System.out.println(s.length());
	} catch (NullPointerException e) {
		
		
	}
//		
		System.out.println("Hi");
	System.out.println(10+20);	
	}

}
