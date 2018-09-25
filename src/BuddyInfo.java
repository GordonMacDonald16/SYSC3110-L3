
public class BuddyInfo {
	
	public String name;
	public String address;
	public String number;
	
	/** FOR TESTING PURPOSES 
	 * public static void main(String[] args) {
		 TODO Auto-generated method stub
		AddressBook book = new AddressBook();
		
		Test addBuddy method
		book.addBuddy("Keon", "16 Powell", "6131234567" );
		
		Test removeBuddy method
		book.removeBuddy(0);
	}
	*/
	
	public String toString(){
		return("name : " + this.name + " ...Address : " + this.address +" ...Number : " + this.number );
	}

	public String getName() {
		String name = this.name;
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
