package client;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

import ItemProduct.ItemProduct;


public class ClientApp {


	public static void main(String[] args) throws ClassNotFoundException {
		
		
		System.out.println("ClientApp: Demo of Object Stream\n");
		
		// Request data

		//ItemProduct itemproduct = new ItemProduct();
		
		//String item = input.nextLine();
		//itemproduct.setName(item);
		
		try {
			//Scanner input = new Scanner(System.in);
			ItemProduct itemproduct = new ItemProduct();
			
			// Data to establish connection to server
			int portNo = 4228;
			InetAddress serverAddress = InetAddress.getLocalHost();

			// Connect to the server at localhost, port 4228
			Socket socket = new Socket(serverAddress, portNo);
			
			//System.out.println("Please enter product name :- ");
			//String item = input.nextLine();
			itemproduct.setName("Gardenia White Bread");
			
			
			// Open stream to send object
			ObjectOutputStream objectOS = new ObjectOutputStream(socket.getOutputStream());

			// Send request to server
			System.out.println("Send object to server: " + itemproduct);
			objectOS.writeObject(itemproduct);
			objectOS.flush();
			
			// Open stream to receive object
			ObjectInputStream objectIS = new ObjectInputStream(socket.getInputStream());
			
			// Get object from stream and display details
			itemproduct = (ItemProduct) objectIS.readObject();
			System.out.println ("\n ID  |       Product Name       |  Price") ;
			System.out.println ("--------------------------------------------");
			System.out.println ( " " + itemproduct.getItemProductId() + "     " +
								itemproduct.getName() + "        RM" + itemproduct.getPrice());
			
			// Close all closeable objects
			objectOS.close();
			objectIS.close();
			socket.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\nClientApp: End of application.\n");

	}

}