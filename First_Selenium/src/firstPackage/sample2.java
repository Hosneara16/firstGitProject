package firstPackage;

public class sample2 extends Sample{
	
	static int k = 30;
	int h = 12;
	
	
	public static int multiply(int a, int b) {
		//int cres = a*b;
		return  a*b;
		
	}
	
	public void added() {
		System.out.println(k+h);
	}
	
	public void subtract() {
		int a3=10;
		int b3=20;
		System.out.println(b3-a3);
	}
	
	public static void division(int a1, int b1) {
		int c= a1/b1;
		System.out.println(c);
	}
	
	
	
	public void  addition() {
		int a3=11;
		int b3=20;
		System.out.println(a3+b3); //17
		System.out.println(a3); //8
	}
	
	

	public static void main(String[] args) {
		sample2 obja = new sample2();
		obja.addition();
		obja.multiply1();
		
		
		//Sample obj1=new Sample();
		//obj1.subtraction();
		//System.out.println(obj1.subtraction());
		 
		 //Sample_2 obj2= new Sample_2();
		 //obj2.addition2();
		
		//System.out.println(sample2.k);//30
		
		
		
		//sample2 .division(20, 10);//2
		
		
		//int x = sample2.multiply(9, 6);
		//System.out.println(x);
		
		
//		sample1 def = new sample1();
//		int x = def.multiply(5, 4, 3);
//		System.out.println(x);
//		
//		sample1.add(10, 20, 30);
		

	}

}
