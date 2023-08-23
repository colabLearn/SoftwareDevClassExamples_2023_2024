package week5_item_example;

import java.util.ArrayList;

public class itemStore {
	private final static ArrayList<cd> CDStore = new ArrayList();
	private final static ArrayList<video> VideoStore = new ArrayList();
	
	
	public static void addCD(cd newCD) {
		
		CDStore.add(newCD);
		
	}
	
public static void addVideo(video newVD) {
		
		VideoStore.add(newVD);
		
	}
	
	public static void displayCDInStore() {
		System.out.printf("%-12s | %-8s | %-12s | %-8s \n", "Item Type", "Title", "Artist/Director", "Year");
		System.out.println("================================================");
		for(cd i: CDStore) {
			System.out.printf("%-12s |%-8s | %-12s | %-8s \n","CD", i.getTitle(), i.getArtist(), i.getDate());
		}
		for(video j: VideoStore) {
			System.out.printf("%-12s |%-8s | %-12s | %-8s \n","Video", j.getTitle(), j.getDirector(), j.getDate());
		}
		
	}
	

}
