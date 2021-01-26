package firstPackage;

public class Sample {
	
	public void multiply() {
		int a=20; int b=30; int c=40;
		int d = a*b*c;
		System.out.println(d);
		}
	protected int a = 200;
	protected int b = 300;
	
	protected void multiply1() {
		System.out.println(a*b);
	}
	
	
	
	public int subtraction() {
		int m = 50;
		int n = 20;
		int subtractresult = m-n;
		return subtractresult;
	}
	
	public int division() {
	int h = 20;
	int i = 5;
	int divideresult = h/i;
	return divideresult;
	}
	
	public void multiplication() {
		int q = 5; int w = 10;
		System.out.println(q*w);
		if (q>w) {
			System.out.println("q is a big number");
			}
			else {
				System.out.println("w is a big number");
			}
	
		
	}
	public static void main(String[] args) {

	int x = 30;
	int y = 40;
	System.out.println("The subtraction of x,y is " +(x-y));
	
	Sample obj =new Sample();
	obj.multiplication();
	
	System.out.println(obj.division());	
	//obj.multiplication();	
		//System.out.println(obj.multiply1());
		//System.out.println(obj.multiply1());
		//obj.addition();
		System.out.println(obj.subtraction());

		for (int m = 11; m>=3; m--) {
			System.out.println(m);
		}
		
		String  [] tool = {"UFT", "ALM", "Selenium"};
		
		System.out.println(tool[0]);
		
		for(String tools: tool) {
			System.out.println("My tools are "+ tools);
		}
		
		String [] name = {"Ramisa", "Tazfia"};
		for(String names: name) {
			System.out.println(names);
		}
		for(int k = 1; k<= 10; k++) {
		System.out.println(k);
		}
		for(int g=10; g> 1; g-- ) {
		System.out.println(g);	
		}
		
		
		for(int i = 1; i<=10; i++) {
			if(i!=6) {
				System.out.println(i);
				
			}
			
		}
	}
	
	
}
