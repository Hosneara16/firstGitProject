package methods;

public class BasicMethods {
	
	//static method
	public static void add() {
		int a = 10;
		int b = 20;
		int total = a+b;
		System.out.println(total);
	}
	
	//Instance method
	public void subtract() {
		int b = 20;
		int a = 5;
		int subs = b-a;
		System.out.println(subs);
	}

	public static void main(String[] args) {
		
		add();
		BasicMethods bm = new BasicMethods();
		bm.subtract();
		m1();
		bm.m2();

	}
	
	public static void m1() {
		System.out.println("Thia is m1");
		m3();
		BasicMethods bm1 = new BasicMethods();
		bm1.m2();
	}
	
	public void m2() {
		System.out.println("Thia is m2");
		m4();
		m3();
	}
	public static void m3() {
		System.out.println("Thia is m3");
	}
	
	public void m4() {
		System.out.println("Thia is m4");	
	}

}
