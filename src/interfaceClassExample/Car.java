package interfaceClassExample;

public class Car implements Viechle {
		
	public Car() {
		
	}
	
	@Override
	public void move() {
		// Car to move
		System.out.println("Check engine oil \n"
				+ "Check break oil \n"
				+ "Use seat belt \n"
				+ "Put key in the ignition, apply break and "
				+ "start the car \n"
				+ "check your blind spots, change gear to drive \n"
				+ "release the hand break, release the leg break \n"
				+ "press accelerator slowly and gradually to move");
		
	}

	@Override
	public void applyBreak() {
		// Car applying break
		System.out.println("Remove leg from the accelerator \n"
				+ "press down the break gradually and slow down \n"
				+ "according to the need to apply the break");
		
		
	}

	@Override
	public void increaseSpeed() {
		// Car increasing speed
		System.out.println("Apply more presssure the press down"
				+ "the accelerator to release more gas \n");
		
	}

}
