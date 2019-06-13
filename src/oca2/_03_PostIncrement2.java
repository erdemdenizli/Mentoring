

package oca2;

public class _03_PostIncrement2 {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		
		if(num1++>++num2) {//1>1
			System.out.println("hello ");
		} else {
			System.out.println("welcome ");
		}
		
		System.out.println(num1 + ", " + num2);//2, 1
		
	}

}

