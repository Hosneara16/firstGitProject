package firstPackage;

public class Javamethods {
	
	public void studentranking(int marks) {
		if(marks>=1000) {
			System.out.println("Star marks");
		}
		else if(marks>=500) {
			System.out.println("First division");
		}
		else {
			System.out.println("Fail");
		}
	}
	
	public void division() {
		
	}
	
	
	public static int multiply(int i, int j, int k) {
		int result = i*j*k;
		return result;
	}
//	public  int multiply (int a, int b, int c) {
//		int result = a* b* c;
//		return result;
//		
//	}

	public static void main(String[] args) {
		Javamethods mark = new	Javamethods();
		mark.studentranking(900);
		//System.out.println();
		
		int h = mark.multiply(10, 20, 30);
		System.out.println(h);
		
//		Javamethods abc = new Javamethods();
//		int y = abc.multiply(10, 2, 3);
//		System.out.println(y);
		
		int x = multiply(5, 6, 3);
		System.out.println(x);
		
		
		

	}

}
