package inheritance2;
import inheritance1.*;

public class Cat extends Animal {
	
	int eyes;
	
//	************************	
	
//	public static void main(String[] args) {
//	System.out.println(Animal.counter);
//}
	
	public Cat() {
		this(5);
	}
	
	public Cat(int eyes) {
		super(5);
		this.eyes = eyes;
	}
	
//	public Cat(int eyes) {
//		//super() is implicitly called all the time if you don't explicitly call a super constructor 
//		this(); //you can't call both this() and super() explicitly in the same constructor
//		
//		this.eyes = eyes;
//	}
	
//	public Cat() {
//		super(); //this will give error if you don't have a no-arg constructor in super class
//	}

	public static void main(String[] args) {
		Cat c1 = new Cat();
		
		//c1 can access both public and protected members because Cat class is a subclass of Animal
		
		System.out.println(c1.maxLife);
		System.out.println(c1.getBrain());
		c1.setBrain(4);
		System.out.println(c1.getBrain());
		
				
		
	}
	

	public boolean getHasFeather() {
		return hasFeather;//can't access hasFeather because it is package private
	}
	
	public int getMaxLife() {//this method can be used to access protected maxLife even in the Runner class
		return maxLife;//can access maxLife because it is protected
	}
	

	
}
