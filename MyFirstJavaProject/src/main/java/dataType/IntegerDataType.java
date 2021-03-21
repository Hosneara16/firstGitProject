package dataType;

public class IntegerDataType {
	private int money = 4000;
	private static int  age = 30;
	
	private static void device() {
		String cell = "iPhone 8";

	}
	
	protected void standered() {
		//System.out.println(money);
		String name ="Mili";
		System.out.println(name);
	}
	public static void multiply(int a, int b, int c) {
		int x = a*b*c;
		System.out.println(x);
	}
	
	public  int add() {
		int n = 10;
		int o = 20;
		int m = n+o;
		//System.out.println(m);
		return m;
	}
	
	
	

	public static void main(String[] args) {
		IntegerDataType obj = new IntegerDataType();
		obj.device();
//		multiply(1, 3, 5);
//		System.out.println("The age is " +age);
//		IntegerDataType obj = new IntegerDataType();
//		System.out.println(obj.add());
//		System.out.println("Total money is "+obj.money);
//		//int m = obj.multiply(2, 3, 5);
//		//System.out.println(m);
//		obj.standered();
//		
	}

}
