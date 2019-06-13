package oca1;

public class Package1 {
	
	private String a;//not accessible
	String b;//default and accessible only in the same pack
	protected String c;//makes sense only if creating an obj of subclass or if you are in the same package
	public String d;

}

/*

package oca2;
import oca1.Package1;

public class Package2 extends Package1 {

	public static void main(String[] args) {
	
	Package2 obj1 = new Package2();
	Package1 obj2 = new Package1();
	
	//Which fields are accessible by obj1 //c and d are accessible
	//Which fields are accessible by obj2 //d are accessible
	
	}

}


*/