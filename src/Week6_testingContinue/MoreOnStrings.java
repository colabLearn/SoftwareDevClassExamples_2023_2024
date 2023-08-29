package Week6_testingContinue;

public class MoreOnStrings {
	
	public static void main(String[] args) {
		String myName = "Tunji";
		String myName2 = "Tunji";
		String myName3 = new String("Tunji");
		String myName4 = "Tunji";
		myName = "Alex";
	
		System.out.println(myName);
		System.out.println(myName2);
		System.out.println(myName3);
		
		System.out.println((myName==myName2) && (myName4==myName2)&& (myName==myName4));
		System.out.println(myName==myName3);
		System.out.println(myName2==myName3);
		System.out.println(myName4==myName3);
		
		System.out.println(myName.equals(myName2));
		System.out.println(myName.equals(myName3));
		System.out.println(myName2.equals(myName3));
		System.out.println(myName4.equals(myName3));
		System.out.println(myName2.equals(myName4));
	}

}
