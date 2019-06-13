package methodHiding;

public class Parent {
	
	static void run() {//inherited
		System.out.println("run");
	}
	
	public static void main(String[] args) {
		Parent c = new Child();
		c.run();
	}

}
