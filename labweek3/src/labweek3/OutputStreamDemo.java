package labweek3;


import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {

	public static void main(String[] args) {
		
		
		// Declaration of target storage
		String file1 = "Exercise3_64.dat";
		String file2 = "Exercise3_65.dat";
		
		// Declaration of output stream object
		FileOutputStream fileOutputStream;
		
		System.out.println("Generate binary data");
		
		try {
			
			fileOutputStream = new FileOutputStream(file1);
			fileOutputStream.write(64);
			fileOutputStream.flush();
			fileOutputStream.close();  
			
			fileOutputStream = new FileOutputStream(file2);
			fileOutputStream.write(65);
			fileOutputStream.flush();
			fileOutputStream.close();  
			//exercise 2
//			String text = "65";
//			byte textInBytes[] = text.getBytes();
//			fileOutputStream.write(textInBytes);
//			fileOutputStream.flush();

			// Close the stream
			
	         
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		// Indicate end of program - Could be succcessful
		System.out.println("End of program.");
		System.out.println("Right click on labWeek3. Select Refresh.");
		System.out.println(file1 + " and " + file2 + " should be there. Check it out!");   
	}

}
