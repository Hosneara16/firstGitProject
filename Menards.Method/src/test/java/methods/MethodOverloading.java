package methods;

public class MethodOverloading {
	
	public void Mili(String name) {
		System.out.println("My name is " +name); //Dynamic because I am using String name in a parameter.
													//so I can pass the different name during calling.
	}
	
	public void Mili1() {
		String name="Belal";
		System.out.println("My name is " +name); //name is local variable. Local variable must be declar
	}											//and this is not dynamic because I can"t change the name during
												//calling, even though i change it will show Belal
												//because local variable is precedence and it is static coding
		
	public void Mili1(String name) {
		System.out.println("My name is " +name );
	}
	
	
	public void Mili1(String name, int age) {
		System.out.println("My name is " +name + " and my age is "+age);
	}  // Method overloading: same method name but the arguments are different

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.Mili("Mili");
		obj.Mili1("Ramisa");
		obj.Mili1("Tazfia", 9);
		

	}

}
