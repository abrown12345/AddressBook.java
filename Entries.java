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
