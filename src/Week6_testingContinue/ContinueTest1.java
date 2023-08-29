package Week6_testingContinue;

import java.util.Iterator;

public class ContinueTest1 {
	
	public static void main(String[] args) {
		for (int i =0; i<=20; i++) {
			
			/*
			 * If i is not an even number
			 * ignore the statement following an continue with the
			 * for loop.
			 */
			if(i%2!=0) {
				continue;
			}
			System.out.println(i + " is an Even  Number");
		}
	}

}
