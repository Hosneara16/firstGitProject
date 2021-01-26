package methodOverLoading;

/**
 * @author bafka
 *
 */
public class Inheritance {

	public static void myAge(int a) {
		//int a = 30;
		System.out.println("My age is "+a);
	}
	public static int salary(int money, String month ) {
		money = 500;
		month = "January";
		System.out.println("My salary is "+ money + " in the month of "+month);
		System.out.println(money +", "+month);
		System.out.println("My salary is " + money);
		System.out.println("My month is "+ month);
		return money;
	}
	public static int salary() {
		int a = 10;
		int b = 20;
		int c = a+b;
		//System.out.println(c);
		return c;
		
	}
	public static void registration(int a1, int b1, int c1) {
		int d = a1+b1+c1;
		System.out.println(d);
	}
	public static void registration(int phone) {
		System.out.println("My phone number is "+phone);
		
	}
	public static void registration(int phone, String name) {
		System.out.println("My phone number is "+phone+ " My name is "+name);
	}
	
	
	
	public static void registration(int phone, String name, int age1) {
		System.out.println("My phone number is "+phone+ " My name is "+name+ " My age is "+age1);
		
	}
	
	public static String myName(String name, int age, String address) {
		String city = "Elkhorn";
		System.out.println("My city "+city);
		System.out.println("My name is "+ name);
		System.out.println("My name is "+ age);
		System.out.println("My name is "+ address);
		return city;
		
		
	}
	
	protected static void library(String name) {
		System.out.println("My library name is "+name);
	}
	
	public static void main(String[] args) {
		myAge(30);
		myName("Mili", 25, "1516 N 209th St");
		salary(500,"January");
		//System.out.println(500, "January");
		System.out.println(salary());
		registration(10, 50, 60);
		registration(22233344);
		registration(22233344,"Mili");
		registration(22233344,"Mili", 30);
		Inheritance obj = new Inheritance();
		obj.library("Barnes");
		
	}

}
