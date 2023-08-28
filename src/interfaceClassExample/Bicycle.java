package interfaceClassExample;

public class Bicycle implements Viechle{
	
	

	public Bicycle() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// Bicycle move
		System.out.println("Just pedal...");
		
	}

	@Override
	public void applyBreak() {
		// Apply Bicycle brake
		System.out.println("Press break with hands on the handle...");
		
	}

	@Override
	public void increaseSpeed() {
		// Increase bicycle speed..
		System.out.println("Pedal faster...");
		
	}

}
