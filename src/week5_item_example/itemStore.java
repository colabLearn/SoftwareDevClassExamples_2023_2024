package week5_item_example;

import java.util.ArrayList;

public class itemStore {
	private final static ArrayList<cd> itemStore = new ArrayList();
	
	
	public static void addCD(cd newCD) {
		
		itemStore.add(newCD);
		
	}
	
	public static void displayCDInStore() {
		System.out.format("%-10s | %-10s", "Name", "Length");
		System.out.println("==============================");
		itemStore.forEach(i ->{
			int SN = 1;
			System.out.format("%-10s | %d%n", SN, i);
			SN++;
		});
		
	}
	

}
