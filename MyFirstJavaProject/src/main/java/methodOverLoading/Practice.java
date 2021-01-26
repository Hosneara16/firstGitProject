package methodOverLoading;

public class Practice extends Inheritance{
	
//	public void m1() {
//		System.out.println("I am m1 with 0 argument");
//		
//	}
	
	public void m1(int age) {
		int age1 = 10;
		int totalage = age + age1;
		System.out.println("This is Mili "+ "and I am " +totalage + " years of age");
		m1(20, 200);
	}
	public void m1(int age, int money) {
		System.out.println("I am m1 with two int arguments that are: "+ age + " and "+ money);
		m1("Belal");
	}
	
	public void m1(String name) {
		System.out.println("I am " + name);
	}
	
	
//	public static void m2() {
//		System.out.println("I am m1 with ");
//		Practice obj1 = new Practice();
//		obj1.m1();
//		
//	}

	public static void main(String[] args) {
		
		Practice obj = new Practice();
		//obj.m1();
		obj.m1(10);
		//obj.m1(10, 500);
		//obj.m1("Mili");
		
		
	}

}
