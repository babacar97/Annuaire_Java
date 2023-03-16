package Jiraws_live_youtube;

import java.util.Scanner;

public class PhoneBook {
	
    public static Scanner sc = null;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    sc = new  Scanner(System.in);
		
	    String userLastName = getUserInput("Entrez un nom de famille ");
	    String userFirstName = getUserInput("Entrez un prénom ");
	    String userPhoneNumber = getUserInput("Entrez un numero de telephone ");
		
	    System.out.println(userLastName);
	    System.out.println(userFirstName);
	    System.out.println(userPhoneNumber);
		sc.close();

	}
	
	public static String getUserInput(String userRequest) {
		
		System.out.println(userRequest);
		String userLastName = sc.nextLine();
		
		return userLastName;
		
	}

}
