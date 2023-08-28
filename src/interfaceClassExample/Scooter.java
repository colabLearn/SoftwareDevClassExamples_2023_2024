package interfaceClassExample;

public class Scooter implements Viechle {
	
	
	
	public Scooter() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("Stand on the side of the scooter, ensuring it is stable and balanced.\n"
				+ "Hold the handlebars with both hands");
		System.out.println("If the scooter has a kick-start, place your foot on the kick-start lever and give it a firm kick downward.\n"
				+ "If the scooter has an electric start, turn the key to the \"ON\" position, pull in the brake lever (if applicable), "
				+ "and press the electric start button.");
	}

	@Override
	public void applyBreak() {
		// TODO Auto-generated method stub
		System.out.println("To slow down or stop, gently squeeze the brake lever on the left handlebar. "
				+ "Use both brakes (front and rear) for more effective braking.");
		
	}

	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub
		System.out.println("To increase speed, twist the throttle further.");
		
	}

}
