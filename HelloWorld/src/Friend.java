
public class Friend {
	
	String name;
	static int numberofFriends;
	
	Friend(String name){
			this.name = name;
			numberofFriends++;
	}
	
	/*static method*/
	
	static void displayFriends() {
		System.out.println("You have " +  numberofFriends + "friends");
	}
	
	
}
