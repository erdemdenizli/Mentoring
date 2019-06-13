package inheritance2;
import inheritance1.*;


public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat cat1 = new Cat();
		
		System.out.println(cat1.maxLife);//does not compile, maxLife is not visible
		
		//cat1 can't access protected members of Animal class in this class, can access only public members
		//but if you want to access them in this class, you can access the protected members of 
		//Animal class if you create a public method in the Cat class(such as a getter) for that protected field
		
		System.out.println(cat1.getMaxLife());
		
//****************************8		
		
//		System.out.println(Animal.counter);
		
	}

}
