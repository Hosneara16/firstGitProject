package firstPackage;

public class Stringhandling {

	public static void main(String[] args) {
		
		
		
		
		try {
			int [] abc= {10,20,30,40,50,60};
			int []xyz = abc;
			//abc[0]= 10;
			//System.out.println(xyz[2]);
			

//		}
			for(int i=5; i<xyz.length; i--) {
				System.out.println(xyz[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
		
		}
		
		String x = "Hello";
		System.out.println(x);
		
		String [] name = {"Ramisa", "Tazfia"};
		for(String names:name) {
			System.out.println(names);
				
		}
		
		String [] cityname = {"Dhaka", "Elkhorn", "Omaha", "Maple"};
		//cityname[1]="Elkhorn";
		for(String citynames:cityname) {
			System.out.println("I live in "+citynames);
		}
		
		//System.out.println(cityname[0]);
		
		String str1 = "SELENIUM";
		String str2 = "selenium";
		String str3 = "SELENIUM";
		String str4 = "SELENIUMA";
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.concat(str2));
	
		String str5 = "        selenium      ";
		
		System.out.println(str5.trim());
	
		String str = "I love selenium";
		System.out.println(str.substring(7));
		System.out.println(str.length());
		
	}

}
