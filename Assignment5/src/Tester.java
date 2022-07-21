import java.util.ArrayList;
import java.util.Scanner;

class Order {
	int  id;
	String[] arr;
	ArrayList<String> arrlst = new ArrayList<>();
	boolean test;
	
	Order(int id,String[] arr,boolean test){
		this.id = id;
		this.arr = arr;
		this.test = test;
	}
		
	void setItems() {
		for(String x: arr) {
			arrlst.add(x);
		}
	}
	
	ArrayList<String> getItems() {
		return arrlst;
	}

}


class Tester {
	public static void main(String[] args) {
		String[] itemsNames;
		ArrayList<String> finalLst = new ArrayList<>();
		
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter no.");
		int input = scan.nextInt();
		int order;
		int n;
		
		Order order1;
		for(int i=0; i< input; i++) {
			System.out.print("Order ID:");
			order = scan.nextInt();
			System.out.print("Enter no. of Items");
			n = scan.nextInt();
			itemsNames = new String[n];
			System.out.print("items Names: ");
			
			for(int j = 0; j < n; j++) {
				itemsNames[j] = scan.next();
			}
			
			order1 = new Order(order,itemsNames,true);
			order1.setItems();
			finalLst.addAll(order1.getItems());
			System.out.println();
		}
		System.out.println(finalLst);		
	}
}