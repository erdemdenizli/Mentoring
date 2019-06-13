package oca1;

public class NewKeyword {
	
	String str;

	public static void main(String[] args) {
		
		NewKeyword obj1 = new NewKeyword();
		NewKeyword obj2 = obj1;
		NewKeyword obj3 = null;
		obj2.str = "OCA";
		addStr(obj2);
		
		//how many new objects are created?
		//this means how many times you are using the new keyword
		//1
		
	}
	
	public static void addStr(NewKeyword obj4) {
		
		obj4.str += "Java";
		
	}

}
