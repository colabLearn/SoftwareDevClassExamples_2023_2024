package interfaceClassExample;

public class Main_Interface {
	public static void main(String[] args) {
		Viechle [] myViechles;
		
		Viechle myCar1 = new Car();
		Viechle myBic1 = new Bicycle();
		Viechle myScooter = new Scooter();
		
		Car myCar2 = new Car();
		Bicycle myBic2 = new Bicycle();
		Scooter myScooter2 = new Scooter();
		
		myViechles = new Viechle[] {
			myCar1,
			myBic1,
			myScooter2,
			myCar2,
			myBic2,
			myScooter
		};
		
		
		for (Viechle viechle : myViechles) {
			if (viechle instanceof Car) {
				System.out.println("It is a Car \n");
				System.out.println("To move: \n");
				viechle.move();
				System.out.println("To apply break: \n");
				viechle.applyBreak();
				System.out.println("To apply Increase speed: \n");
				viechle.increaseSpeed();
				
				System.out.println("=========================");
			
			}
			if (viechle instanceof Bicycle) {
				System.out.println("It is a Bicycle");
				System.out.println("To move: \n");
				viechle.move();
				System.out.println("To apply break: \n");
				viechle.applyBreak();
				System.out.println("To apply Increase speed: \n");
				viechle.increaseSpeed();
				
				System.out.println("=========================");
			
			}
			if (viechle instanceof Scooter) {
				System.out.println("It is a Scooter");
				System.out.println("To move: \n");
				viechle.move();
				System.out.println("To apply break: \n");
				viechle.applyBreak();
				System.out.println("To apply Increase speed: \n");
				viechle.increaseSpeed();
				
				System.out.println("=========================");
			
			}
		}
	}

}
