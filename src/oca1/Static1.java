package oca1;

public class Static1 {
	
	static int var = 0;//20
	int num = 0;//obj1: 10, obj2: 10

	public static void main(String[] args) {
		
		Static1 obj1 = new Static1();//obj1.var:0, obj1.num: 0
		Static1 obj2 = new Static1();//obj2.var:0, obj2.num: 0
		obj1.modify();
		obj2.modify();
		
		System.out.println(obj1.num + " and " + obj2.var);

	}
	
	public void modify() {
		while (num<10) {//10<10
			var++;//10++
			num++;//0++
		}
	}

}
