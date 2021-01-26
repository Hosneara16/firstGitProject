package methodOverLoading;

public class Arrays {
	
//public static void myArray() {
//	int [] myVal = {1,2,3,4,5}; //to print all the array elements
//	for(int i = 0; i < myVal.length; i++) {
//		System.out.println(myVal[i]);
//	}
//}
//
//public static void myArray1() {
//	int [] myVal = {1,2,3,4,5,6}; 
//	
//	int sum = 0;
//	for(int i=0; i<myVal.length; i++) { //to sum total the array values
		//sum = sum + myVal [i];
//	}
//	System.out.println(sum);	
//}
//
//public static void myArray2() {
//	String [] name = {"Mili", "Ramisa", "Tazfia", "Karim"};
//	
//	for(int i = 0; i < name.length; i++) {
//		System.out.println(name[i]);
//	}
//}
//
//public static void myArray3() {
//	int [] myVal = {1,2,3,4,5};
//	int total = myVal [0] + myVal [1]+myVal [2]+myVal [3]+myVal [4];
//	System.out.println(total);
//}
	public static void appleBasket() {
		 int [] myApples = {1,2,3,4,5};
		 for(int i = 0; i<myApples.length; i++) {
			 System.out.println(myApples[i]);
		 }

		
	}
	public static void myArray() {
		int [] myApples = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0; i<myApples.length; i++) {
			 sum = sum + myApples[i];					
		}
		System.out.println(sum);
		
	}
public static void myColors() {
	String [] color = {"Red", "White", "Blue"};
	
	for(String colors:color) {
		System.out.println(colors);	
	}
}

			
		
	public static void main(String[] args) {
//		int a [] = {1,2,3};
//		a[0]=1;
//		System.out.println(a[2]);
//		System.out.println(a[1]);
		
//		myArray();
//		myArray1();
//		myArray2();
//		myArray3();
		myColors();
		appleBasket();
		myArray();

	}
	
	

	
}