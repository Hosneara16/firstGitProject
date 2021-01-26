package miliPackage;

public class Honda extends Bike {
	
	
	@Override
	public void seat() {
		System.out.println("Seat");
		
	}
	@Override
	public void handle() {
	System.out.println("Handle");	
		
	}
	public static void main(String[] args) {
		
		Honda objh = new Honda();
		objh.bell();
		objh.handle();
	
	}
	
	}


