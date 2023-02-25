# AddressBook.java
package AddressBook;
import java.util.Scanner;
import java.util.jar.Attributes.Name;
import java.util.ArrayList;
import java.util.List;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Entries>addressbook=new ArrayList<>();
		Scanner userInput= new Scanner(System.in);
		Scanner scanner= new Scanner(System.in);
		System.out.println("1) Add an Entry");
		System.out.println("2) Remove an Entry");
		System.out.println("3) Search for a specific entry"); 
		System.out.println("4)Print Address Book");
		System.out.println("5) Delete Book");
		System.out.println("6) Quit"); 
		while(true) {
			System.out.println("Please choose what you'd like to do with the database (Enter a number 1-6):");
			Integer WheretoGo=userInput.nextInt();
			switch(WheretoGo) {
				case 1:
					System.out.println("First Name:");
					Scanner Entry= new Scanner(System.in);
					String FirstName=Entry.nextLine();
					System.out.println("Last Name:");
					String LastName=Entry.nextLine();
					System.out.println("Phone Number:");
					String PhoneNumber=Entry.nextLine();
					System.out.println("Email Address:");
					String EmailAddress=Entry.nextLine();
					//Create object 
					Entries p1=new Entries(FirstName, LastName, PhoneNumber, EmailAddress);
					addressbook.add(p1);
					System.out.println("Added new entry!");
					for (int i=0; i<addressbook.size();i++) {
							if(addressbook.get(i).getFirstName().equals(FirstName)) {
								System.out.println("Entry First Name: "+ addressbook.get(i).getFirstName());
								System.out.println("Entry Last Name: "+ addressbook.get(i).getLastName());
								System.out.println("Entry Phone Number: "+ addressbook.get(i).getPhoneNumber());		
								System.out.println("Entry Email: "+ addressbook.get(i).getEmailAddress());
								
			}
			}
					
					break;
				case 2:
					System.out.println("Enter an entry's email to remove:");
					Scanner Remove=new Scanner(System.in);
					String EmailAddressRemove=Remove.nextLine();
					break;
				case 3:
					System.out.println("Choose which way you want to search the addressbook");
					System.out.println("1) First Name");
					System.out.println("2)Last Name");
					System.out.println("3)Phone Number");
					System.out.println("4) Email Address");
					Integer WheretoGo2=userInput.nextInt();
					Scanner Entry2= new Scanner(System.in);
						switch(WheretoGo2) {
						case 1: 
							System.out.println("Enter First Name:");
							String FirstName2=Entry2.nextLine();
								for (int i=0; i<addressbook.size();i++) {
									if(addressbook.get(i).getFirstName().equals(FirstName2)) {
										System.out.println("First Name: "+ addressbook.get(i).getFirstName());
										System.out.println("Last Name: "+ addressbook.get(i).getLastName());
										System.out.println("Phone Number: "+ addressbook.get(i).getPhoneNumber());		
										System.out.println("Email: "+ addressbook.get(i).getEmailAddress());
							}
							}
							break;
						case 2:
							System.out.println("Enter Last Name");
							String LastName2=Entry2.nextLine();
							for (int i=0; i<addressbook.size();i++) {
								if(addressbook.get(i).getLastName().equals(LastName2)) {
									System.out.println("First Name: "+ addressbook.get(i).getFirstName());
									System.out.println("Last Name: "+ addressbook.get(i).getLastName());
									System.out.println("Phone Number: "+ addressbook.get(i).getPhoneNumber());		
									System.out.println("Email: "+ addressbook.get(i).getEmailAddress());
						}
						}
							break;
						case 3:
							System.out.println("Enter Phone Number");
							String PhoneNumber2=Entry2.nextLine();
							for (int i=0; i<addressbook.size();i++) {
								if(addressbook.get(i).getPhoneNumber().equals(PhoneNumber2)) {
									System.out.println("First Name: "+ addressbook.get(i).getFirstName());
									System.out.println("Last Name: "+ addressbook.get(i).getLastName());
									System.out.println("Phone Number: "+ addressbook.get(i).getPhoneNumber());		
									System.out.println("Email: "+ addressbook.get(i).getEmailAddress());
						}
						}
							break;
						case 4: 
							System.out.println("Enter Email Address");
							String EmailAddress2=Entry2.nextLine();
							for (int i=0; i<addressbook.size();i++) {
								if(addressbook.get(i).getEmailAddress().equals(EmailAddress2)) {
									System.out.println("First Name: "+ addressbook.get(i).getFirstName());
									System.out.println("Last Name: "+ addressbook.get(i).getLastName());
									System.out.println("Phone Number: "+ addressbook.get(i).getPhoneNumber());		
									System.out.println("Email: "+ addressbook.get(i).getEmailAddress());
						}
						}
							break;
						default:
							System.out.println("Invalid Search Entry");
							break;
						}
					break;
				case 4: //Prints Address Book:
					for (int i=0; i<addressbook.size();i++) {
						System.out.println("First Name: "+ addressbook.get(i).getFirstName());
						System.out.println("Last Name: " + addressbook.get(i).getLastName());
						System.out.println("Phone Number:" + addressbook.get(i).getPhoneNumber());		
						System.out.println("Email: "+ addressbook.get(i).getEmailAddress());
						break;
}
	}
}
}
}
package AddressBook;

public class Entries {
	String FirstName;
	String LastName; 
	String PhoneNumber;
	String EmailAddress;
	String FirstName2;
	Integer index1;
	
	public Entries() {
		
	}
	
	public Entries(String FirstName, String LastName, String PhoneNumber, String EmailAddress) {
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.PhoneNumber=PhoneNumber;
		this.EmailAddress=EmailAddress;
	}
	
	
	public String getFirstName() {
		return FirstName;
	}
	public String getFirstName2() {
		return FirstName2;
	}
	public String getLastName() {
		return LastName;
	}
	
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	
	public String getEmailAddress() {
		return EmailAddress;
	}
	
	public void setFirstName(String FirstName) {
		this.FirstName=FirstName;
	}
	
	
	public void setLastName(String LastName) {
		this.LastName=LastName;
	}
	
	public void setPhoneNumber(String PhoneNumber) {
		this.PhoneNumber=PhoneNumber;
	}
	
	public void setEmailAddress(String EmailAddress) {
		this.EmailAddress=EmailAddress;
	}
	
	@Override 
	public String toString() {
		return "[" + this.index1+ "," + this.FirstName2+ "]";
	}
	
	@Override 
	public boolean equals(Object obj) {
		Entries e=(Entries)obj;
		return this.index1==e.index1 && this.FirstName2.equalsIgnoreCase(e.FirstName2);
	}
	
	}
