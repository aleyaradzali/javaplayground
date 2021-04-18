package labweek3;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {

	public static void main(String[] args) {
		
		// Declaration of source storage
		//String sourceStorage = "demo1.dat";
		String file1 = "Exercise3_64.dat";
		String file2 = "Exercise3_65.dat";

		FileInputStream fileInputStream;
		
		System.out.println("Read binary data");

		try {

			fileInputStream = new FileInputStream(file1);
			
			int data1 = fileInputStream.read();
			while (data1 != -1) {
				
				System.out.println(data1);
	
				data1 = fileInputStream.read();
				
			}
			
			fileInputStream.close();  
			
			fileInputStream = new FileInputStream(file2);
			int data2 = fileInputStream.read();
			while (data2 != -1) {
				
				System.out.println(data2);
				
				data2 = fileInputStream.read();
				
			}
			
			System.out.println("\n");
			
			fileInputStream.close();  

		} catch (IOException e) {

			System.out.println("Durian Tunggal... we got problem");

			e.printStackTrace();
		}  

		System.out.println("End of program.");

	}

}
