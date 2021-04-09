package accessModifier;

public class Sister {
	
	private String phoneName; //private non-Static access modifier
	private static String phoneName1;
	static int age = 10;
	
	private static void phone() {
		Sister sis = new Sister();
		sis.phoneName = "iPhone 11"; //private access modifier accessible in private method
		System.out.println("I am using "+sis.phoneName);
		
	}
	
	private void phone1() {
		phoneName1 = "Samsung 10";  //
		System.out.println("This is "+phoneName1);
	}
	
	
	void roomAccess() {
		phoneName1="Nokia";
		phoneName="Nokia2";
		System.out.println("This room has "+phoneName1);
		System.out.println("This room has "+phoneName);
		
	}
	
	protected static void houseAccess() {
		phoneName1 = "Blackberry";
		System.out.println("My mom use "+phoneName1);
				
		
	}
	
	public static void car() {
		phoneName1 = "Carphone";
		System.out.println("Everyone of this car use "+phoneName1);
		
	}
	

	public static void main(String[] args) {
		
		phone();
		Sister cc = new Sister();
		cc.phone1();
		cc.roomAccess();
		houseAccess();
		car();
		
	}

}
