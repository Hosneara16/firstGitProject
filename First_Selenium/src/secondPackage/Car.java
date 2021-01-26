package secondPackage;

public class Car implements Interface1 {
	
	@Override
	public void engine() {
	System.out.println("Car has engine");	
		
	}

	@Override
	public void wheels() {
	System.out.println("Car has wheels");	
	}

	@Override
	public void bell() {
	System.out.println("Car has bell");	
	}

	@Override
	public void seat() {
	System.out.println("Car has seat");	
	
	}
	

	public static void main(String[] args) {
		
		Car objc = new Car();
		objc.bell();
		objc.engine();
		objc.seat();
		objc.wheels();
		
	}

	
	}


