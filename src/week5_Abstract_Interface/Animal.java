package week5_Abstract_Interface;

//add abstract to class animal means that Animal class can no longer be instantiated
abstract public class Animal {
	private String name;
	
	
	public Animal(String name) {
		this.name = name;
	}
	
	/*
	 * This will force any class that extends this
	 * abstract class must override this method and 
	 * they define their own implementation of makeSound	
	 */
	public abstract void makeSound();

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
