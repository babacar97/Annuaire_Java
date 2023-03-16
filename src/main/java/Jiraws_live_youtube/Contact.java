package Jiraws_live_youtube;

public class Contact {
	
	private String lastName;
	private String fistName;
	private String phoneNumber;
	
	
	public Contact (String lastName, String fistName, String phoneNumber) {
		this.lastName= lastName;
		this.fistName = fistName;
		this.phoneNumber = phoneNumber;
	}
 
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFistName() {
		return fistName; 
	}
	public void setFistName(String fistName) {
		this.fistName = fistName;
	}
	public String  getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) { 
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		return this.lastName + " " + this.fistName + " " + this.phoneNumber ;
	}
	

}
