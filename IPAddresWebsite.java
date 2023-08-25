package JavaProgramm;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPAddresWebsite {

	public static void main(String[] args) throws UnknownHostException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Website URL");	//https://www.flipkart.com/
		String Website = sc.nextLine();
	
		sc.close();
		
		//now finding the IP Address of the given Website URL
		
		try {
		InetAddress ip = InetAddress.getByName(Website);
		System.out.println("IP Address of the given URL is:" +ip);
		}
		catch(UnknownHostException e)
		{
			System.out.println("User has inputed invalid website URL Address");
			
			}
		}

}
