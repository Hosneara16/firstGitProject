package firstPackage;

import java.io.File;
import java.io.IOException;

public class CreateFolder {

	public static void main(String[] args) throws IOException {
		/*
		 * File f = new File("C:/Users/bafka/Desktop/Ramisa"); f.mkdir(); boolean m =
		 * f.exists(); System.out.println(m);
		 * 
		 * f.delete();
		 * 
		 * boolean m1 = f.exists(); System.out.println(m1); System.out.println(c);
		 */
		
		File f = new File("C:/Users/bafka/Desktop/Mili_Karim"); //folder/dir path
		f.mkdir(); //creating directory
		
		boolean f1 = f.exists(); //checking file existance
		
		if(f1==true){
			System.out.println("Folder exists"); 
		}
		else {
			System.out.println("Folder not exists");
		}
		
		f.delete();  //file folder deleting
		
		boolean f2 = f.exists();
		
		if(f2==true){
			System.out.println("Folder exists");
		}
		else {
			System.out.println("Folder not exists");
			
			
		}
		
		File f3 = new File("C:/Users/bafka/Desktop/Mili2.xlsx");
		f3.createNewFile();	
	}

}
