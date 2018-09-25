import java.util.*;



public class AddressBook {
	List<BuddyInfo> contents = new ArrayList<BuddyInfo>();

	public List<BuddyInfo> getContents() {
		return contents;
		
	}

	public void setContents(List<BuddyInfo> contents) {
		this.contents = contents;
	}
	public void addBuddy(String name, String address, String num){
		BuddyInfo bud = new BuddyInfo();
		bud.name = name;
		bud.address = address;
		bud.number = num;
		this.contents.add(bud);
		System.out.println(this.contents.toString());	
	}
	
	public void removeBuddy(int i){
		this.contents.remove(i);
		System.out.println(this.contents.toString());
	}
	public void wipeBook(){
		for (int i = 0; i < contents.size(); i++){
			contents.remove(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook book = new AddressBook();
		
		//Test addBuddy method
		book.addBuddy("Keon", "16 Powell", "6131234567" );
		
		//Test removeBuddy method
		book.removeBuddy(0);
	}
		
	
}
