package Jiraws_live_youtube;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class PhoneBook {
	
    public static Scanner sc = null; 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    sc = new  Scanner(System.in);
		
	    String userLastName = getUserInput("Entrez un nom de famille ");
	    String userFirstName = getUserInput("Entrez un prénom ");
	    String userPhoneNumber = getUserInput("Entrez un numero de telephone ");
		
	    Contact newContact = new Contact(userLastName, userFirstName, userPhoneNumber);
	    
	    System.out.println(newContact.toString() );
	    
	    File phoneBookFile = new File("C:\\Users\\Lenovo-T440\\Desktop\\Projet testeur logicielle\\Contact.txt");
	    
	    if(phoneBookFile.exists()&&phoneBookFile == null) {
	    	System.out.println("le fichier existe a l'emplacement donné");
	    }
	    else {
	    	System.out.println("le fichier n'existe pas");
	    	try {
				phoneBookFile.createNewFile();
				System.out.println("le fichier a été creer");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	    
	    try {
			BufferedWriter fileWriter = new BufferedWriter(new FileWriter(phoneBookFile, true));
		    fileWriter.append(newContact.toString()+ '\n');
		    fileWriter.close();
	    } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    
		sc.close();
 
	}
	
	public static String getUserInput(String userRequest) {
		
		System.out.println(userRequest);
		String userLastName = sc.nextLine();
		
		return userLastName;
		
	}
	
	

}
