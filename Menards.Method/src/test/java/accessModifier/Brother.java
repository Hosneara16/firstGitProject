package accessModifier;

public class Brother{

	public static void main(String[] args) {
		Sister sis = new Sister();
		sis.roomAccess();
		
		//houseAccess(); //Since this method is protected and I didn't extend the class it will not come here
		


	}

}
