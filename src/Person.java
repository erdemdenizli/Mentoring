
public class Person {
	
	//static blocks run first
	//and then main method runs (sleep method runs after static blocks)
	//once an object is created, instance blocks run first, and then constructor runs
	
	//if there is a final field, it has to be initialized
	//there are 3 places for final instance fields to be initialized;
			//1.same line
			//2.instance block
			//3.constructor
	
	//there are 2 places for final static fields to be initialized;
			//1.same line
			//2.static block
	
	//side not: you cannot initialize a final static variable in an instance block, because final static
	//variable has to be initialized even if not object is created, yani isini sansa birakmiyor
	
	String name;
	static String race;
	int phoneNumber;
	
	public Person() {
		System.out.println("constructor is used");
	}
	
	static {
		System.out.println("first static block runs");
	}
	
	{
		System.out.println("INSTANCE block runs");
	}
	
	//instance block runs when an object is created
	//static block runs when the class is used
	
	public static void main(String[] args) {
		
		sleep();
		
		Person p1 = new Person();
		
		System.out.println("my name is " + p1.name);
		
	}
	
	static void sleep() {
		System.out.println("sleeping");
	}
	
	static {
		System.out.println("second static block runs");
	}
	
}
