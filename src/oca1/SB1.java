package oca1;

class SB1 {
	
	int var;

	public static void getDouble(int num) { // int num = 10
		num = num + num;//num = 10+10; num = 20
	}

	public static void getString(StringBuilder sb) {
		sb.append("+" + sb);//we pass "java" and append +java
	}

	public static void main(String[] args) {
		
		SB1 obj1 = new SB1();
		obj1.var = 10;//var: 10
		
		StringBuilder sb = new StringBuilder("java");
		Integer integer = 5;
		
		getDouble(integer);//pass 5 to the method. the outcome is 10
		getString(sb);//java+java
		getDouble(obj1.var);//pass 10 to the method, the outcome is 20
		
		System.out.println(integer + " " + sb + " " + obj1.var);//nothing to do with the outcomes of the methods,
		//
	}
}
