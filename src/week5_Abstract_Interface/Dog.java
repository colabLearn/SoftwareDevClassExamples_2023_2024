package week5_Abstract_Interface;

public class Dog extends Animal{

	public Dog(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("Woof woof!");
	}

}
