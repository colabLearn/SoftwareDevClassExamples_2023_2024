package week5_Abstract_Interface;

public class animalMain {
	
	public static void main(String[] args) {
		
		//this now throws and error -- "Cannot instantiate the type Animal"
		Dog dog1 = new Dog("Mandi");
		Animal dog2 = new Dog("Bambi");
		Cat cat1  =  new Cat("katkat");
		Animal cat2 = new Cat("foo");
		
		System.out.println(dog1 instanceof Dog);
		System.out.println(dog1 instanceof Animal);
		
		
		//here both the dog and the cat make the same sound....
		dog1.makeSound();
		cat2.makeSound();
		
		//What kind of animal is this?
		//Is it a Dog or a Cat
	}

}
