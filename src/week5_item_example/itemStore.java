package week5_item_example;

import java.util.ArrayList;

public class itemStore {
	private final static ArrayList<cd> itemStore = new ArrayList();
	
	
	public static void addCD(cd newCD) {
		
		itemStore.add(newCD);
		
	}
	
	public static void displayCDInStore() {
		System.out.printf("%-8s | %-12s | %-8s \n", "Title", "Artist Name", "Year");
		System.out.println("==============================");
		for(cd i: itemStore) {
			System.out.printf("%-8s | %-12s | %-8s \n", i.getTitle(), i.getArtist(), i.getDate());
		}
		
		
	}
	

}
