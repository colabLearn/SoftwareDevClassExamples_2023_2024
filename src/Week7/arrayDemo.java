package Week7;

import java.util.Arrays;
import java.util.Random;

public class arrayDemo {
	
	public static void main(String[] args) {
		int [] ages = new int[20];
		
		//Introducing Random in java.util
		Random rand = new Random();
		for (int i = 0; i < ages.length; i++) {
			ages[i] = rand.nextInt(100)+1;
			/*
			 * To generate random number between a maximum
			 * and minimum value we use: rand.nextInt(max - min) +min;
			 */
		}
		
		int [] ageOver40 = Arrays.stream(ages).filter(age -> age >40).toArray();
		
		System.out.println(Arrays.toString(ageOver40));
		
	}
	
	
}
