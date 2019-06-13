package oca1;

public class Instance1 {
	
	int a;
	int b;

	public static void main(String[] args) {
		
		Instance1 obj1 = new Instance1();
		obj1.a = 100;//obj1.a: 100
		obj1.b = 200;//obj1.b: 200
		Instance1 obj2 = new Instance1();//obj2.a: 0, obj2.b: 0
		obj2.assign(obj1.a, obj1.b);//obj2.a: 100, obj2.b: 0
		
		obj1.show();//obj1.a and obj1.b --- 100 and 200
		obj2.show();//obj2.a and obj2.b --- 100 and 0

	}
	
	public void assign(int a, int b) {//when we call this method by using obj2
		this.a = a;//updates a variable of obj2: obj2.a=100
		b = this.b;//local variable b is assigned 0
	}
	
	public void show() {
		System.out.println(a + ", " + b + "!");
	}

}
