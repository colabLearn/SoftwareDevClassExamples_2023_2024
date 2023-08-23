package week5_Abstract_Interface;

public class Animal {
	private String name;
	
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void makeSound() {
		System.out.println("Making Sound...");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + "]";
	}
	



	

}
