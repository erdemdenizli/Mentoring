package methodHiding;

public interface Horse extends Animal {
	
	static void eat() {
		System.out.println("Horse");
	}
	
}
