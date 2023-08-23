package week5_item_example;

public class ItemMain {
	
	public static void main(String[] args) {
		cd myCD1 = new cd("Bla bla", 2, "Kyle", "1997", "not nice");
		cd myCD2 = new cd("Voo Voo", 4, "Felix", "2000", "ok");
		cd myCD3 = new cd("liu liu", 5, "Asake", "2023", "good");
		
		video myVD1 = new video("kkk", 60, "John", "2003", "not bad");
		video myVD2 = new video("ggg", 75, "Ryno", "2013", "fine");
		
		
		//Add myCD1 to itemStore
		itemStore.addCD(myCD1);
		
		//Try to add myVD1 to itemStore
		/*
		 * This throws a compile-time error:
		 * "The method addCD(cd) in the type itemStore is not applicable for the arguments (video)"
		 * 
		 */
		itemStore.addCD(myVD1);
		
	}

}
