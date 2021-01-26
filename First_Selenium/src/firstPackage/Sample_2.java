package firstPackage;

//import secondPackage.Sample3;

public class Sample_2 {

	public int addition1() {
	int a = 10;
	int b = 20;
	int c = 30;
	int addResult = a+b+c;
	return addResult;
	
	
	}
	
	public void addition2() {
	int x = 15;
	int y = 20;
	 
	System.out.println(x+y);
	
	if (x>y) {
	System.out.println("x is a big number");
	}
	else {
		System.out.println("y is a big number");
	}
		
	
	}
	
	public int subtraction() {
		int a = 50;
		int b = 40;
		int subresult = a-b;
		return subresult;
		
		
	}
	
	
	public static void main(String[] args) {
		
		//Sample3 obj4 = new Sample3();
		//obj4.addition12();
	
		Sample_2 obj = new Sample_2();
		System.out.println(obj.addition1());
		
		obj.addition2();
		
		for(int i = 10; i>=1; i--) {
		System.out.println(i);	
		}
	
		int r = 20;
		System.out.println(r);
	r = 10;
	System.out.println(r);
	System.out.println(obj.subtraction());
	
	}

}
