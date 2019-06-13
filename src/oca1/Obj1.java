package oca1;

public class Obj1 {
	
	String name;
	int var;
	
	

	public Obj1(String name, int var) {
		this.name = name;
		this.var = var;
	}


	public static void main(String[] args) {
		
		Obj1 o1 = new Obj1("Ali", 50);//o1 - name: Ali, var: 50
		Obj1 o2 = new Obj1("Ali", 50);//02 - name: Ali, var: 50
		Obj1 o3 = o1;//o3 is pointed to o1
		
		boolean b1 = o1 == o2;//false
		boolean b2 = o1.name.equals(o2.name);//"Ali".equals("Ali") true
		
		System.out.println(b1 + " and " + b2);//false and true

	}

}
