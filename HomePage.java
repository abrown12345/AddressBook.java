package AddressBook;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Entries>addressbook=new ArrayList<>();
		List<String>emails2= new ArrayList<>();
		Scanner userInput= new Scanner(System.in);
		Scanner scanner= new Scanner(System.in);
		while(true) {
			System.out.println("Please choose what you'd like to do with the database (Enter a number 1-6):");
			System.out.println("1) Add an Entry");
			System.out.println("2) Remove an Entry");
			System.out.println("3) Search for a specific entry"); 
			System.out.println("4) Print Address Book");
			System.out.println("5) Delete Book");
			System.out.println("6) Quit"); 
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
					if(emails2.contains(EmailAddress)) {
						System.out.println("Email Address already in addressbook");
					}
					else {
					String emails= new String(EmailAddress);
					Entries p1=new Entries(FirstName, LastName, PhoneNumber, EmailAddress);
					addressbook.add(p1);
					emails2.add(emails); 
					System.out.println("Added new entry!");
					}
					break;
				case 2:
					System.out.println("Enter an entry's email to remove:");
					Scanner Remove=new Scanner(System.in);
					String EmailAddressRemove=Remove.nextLine();
					System.out.println("You have removed the following entry:");
					for (int i=0; i<addressbook.size();i++) {
						if(addressbook.get(i).getEmailAddress().equals(EmailAddressRemove)) {
							System.out.println(i);
							System.out.println("First Name: "+ addressbook.get(i).getFirstName());
							System.out.println("Last Name: "+ addressbook.get(i).getLastName());
							System.out.println("Phone Number: "+ addressbook.get(i).getPhoneNumber());		
							System.out.println("Email: "+ addressbook.get(i).getEmailAddress());
							addressbook.remove(i);
							break;
						}}
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
									if(addressbook.get(i).getFirstName().contains(FirstName2)) {
										System.out.println("First Name: "+ addressbook.get(i).getFirstName());
										System.out.println("Last Name: "+ addressbook.get(i).getLastName());
										System.out.println("Phone Number: "+ addressbook.get(i).getPhoneNumber());		
										System.out.println("Email: "+ addressbook.get(i).getEmailAddress());
										System.out.println("------------------------------------------------");

							}
									else {
										System.out.println("No search found");
									}
							}
							break;
						case 2:
							System.out.println("Enter Last Name");
							String LastName2=Entry2.nextLine();
							for (int i=0; i<addressbook.size();i++) {
								if(addressbook.get(i).getLastName().contains(LastName2)) {
									System.out.println("First Name: "+ addressbook.get(i).getFirstName());
									System.out.println("Last Name: "+ addressbook.get(i).getLastName());
									System.out.println("Phone Number: "+ addressbook.get(i).getPhoneNumber());		
									System.out.println("Email: "+ addressbook.get(i).getEmailAddress());
									System.out.println("------------------------------------------------");

						}
								else {
									System.out.println("No search found");
								}
						}
							break;
						case 3:
							System.out.println("Enter Phone Number");
							String PhoneNumber2=Entry2.nextLine();
							for (int i=0; i<addressbook.size();i++) {
								if(addressbook.get(i).getPhoneNumber().contains(PhoneNumber2)) {
									System.out.println("First Name: "+ addressbook.get(i).getFirstName());
									System.out.println("Last Name: "+ addressbook.get(i).getLastName());
									System.out.println("Phone Number: "+ addressbook.get(i).getPhoneNumber());		
									System.out.println("Email: "+ addressbook.get(i).getEmailAddress());
									System.out.println("------------------------------------------------");

						}
								else {
									System.out.println("No search found");
								}
						}
							break;
						case 4: 
							System.out.println("Enter Email Address");
							String EmailAddress2=Entry2.nextLine();
							for (int i=0; i<addressbook.size();i++) {
								if(addressbook.get(i).getEmailAddress().contains(EmailAddress2)) {
									System.out.println("First Name: "+ addressbook.get(i).getFirstName());
									System.out.println("Last Name: "+ addressbook.get(i).getLastName());
									System.out.println("Phone Number: "+ addressbook.get(i).getPhoneNumber());		
									System.out.println("Email: "+ addressbook.get(i).getEmailAddress());
									System.out.println("------------------------------------------------");
						}
								else {
									System.out.println("No search found");
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
						System.out.println("------------------------------------------------");
					}
				for(int i=0;i>=addressbook.size();i--) {
				System.out.println("Address Book is empty");
				}
				break;
				case 5: //Clears address book
					addressbook.clear();
					System.out.println("Address book cleared!");
				
				break;
				case 6: //Stops running application, successful termination
					System.exit(0);
			}
}
}
}

