package oca1;

public class Instance2 {
	
	int a, b;
	
	public Instance2(int a, int b) {//10 , 20
		initialize(a, b);// 10, 20
	}
	
	public void initialize(int a, int b) {//10, 20
		this.a = a*a;//obj1.a: 100
		this.b = b*b;//obj1.b: 400
	}

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		
		Instance2 obj1 = new Instance2(a, b);//obj1.a: 100, obj1.b: 400
		
		System.out.println(a + ", " + b);

	}

}
