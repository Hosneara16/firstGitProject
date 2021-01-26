package firstPackage;

public class ConditionalFlow{


	public static void main(String[] args) {
	
		int a = 100, b = 50, c = 200, d = 10;
		if (a>b) {
			if(c<a) {
				if(a>d) {
					System.out.println("A is a big number");
				}
				else {
					System.out.println("d is a big number");
				}
			}
			else {
				System.out.println("c is a big number");
			}
		}
		else {
			System.out.println("b is big");
		}
		

	}
}	
		