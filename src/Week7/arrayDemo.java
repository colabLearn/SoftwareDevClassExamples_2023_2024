package Week7;

import java.util.Arrays;
import java.util.Random;

public class arrayDemo {
	
	public static void main(String[] args) {
		int [] numbers = new int[20];
		
		//Introducing Random in java.util
		Random rand = new Random();
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rand.nextInt(100)+1;
			/*
			 * To generate random number between a maximum
			 * and minimum value we use: rand.nextInt(max - min) +min;
			 */
		}
		System.out.println("Original array generated: \n" + Arrays.toString(numbers));
		
		//Using stream filter with array 
		int [] numOver40 = Arrays.stream(numbers)
				.filter(num -> num >40)
				.toArray();
		
		System.out.println("Even numbers in the origial array  : \n"+ Arrays.toString(numOver40));
		
		int [] evenNum = Arrays.stream(numbers)
				.filter(num -> num%2==0)
				.toArray();
		
		System.out.println(Arrays.toString(evenNum));
		
		//Using stream .map with array
		int [] doubleNum = Arrays.stream(numbers)
								.map(num -> num*2)
								.toArray();
		
		System.out.println("All number in the original array doubled: \n"+ Arrays.toString(doubleNum));
		
		//Using the reduce function with stream to get the sum of all the numbers
		/*
		 * In the code, num is each number in the array
		 * y
		 */
		//Using stream .reduce with array
		int numSum = Arrays.stream(numbers)
						.reduce(0, (temp, num) -> temp+num);
		
		System.out.println("Summ of all the numbers in the origial array: \n" + numSum);
	}
	
	
}
