package inheritance1;

public class Animal {
	
	public String name;//accesible in Cat //null
	protected int maxLife;//accesible in Cat //0
	boolean hasFeather; //false
	private int brain; //0
	
//*************************

//	public static int counter;
//	
//	{
//		counter++;
//	}
	
	
//	public Animal () {
//		System.out.println("no arg cons called");
//	}
	
	//if you create a constuctor with parameters, you either have to create a no-arg constructor
	//so that the sub-class doesn't complain when it implicitly calls the super(), or you have to explicitly call
	//the constructor you created to the sub class constructor
	
	
	public Animal (int brain) { //the compiler won't provide the default constructor anymore
		this.brain = brain;
	}
	
	public void setBrain(int brain) {
		this.brain = brain;
	}
	
	public int getBrain() {
		return brain;
	}

	

	

}
