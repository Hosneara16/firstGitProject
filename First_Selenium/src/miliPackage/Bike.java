package miliPackage;

public abstract  class Bike {
	
	public void bell() {
		System.out.println("Bike has bell");
	}
	public void wheel() {
		System.out.println("Bike has wheels");
	}
	
	public abstract void seat();
	
	public abstract void handle();

	public static void main(String[] args) {
		Honda obj = new Honda();
		obj.seat();
		
		
		
		
	}

}
