package oca1;

import java.util.*;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List animals = new ArrayList();
		animals.add("cat");//0
		animals.add("dog");//1
		animals.add("fish");//
		animals.add("horse");//2
		animals.remove(2);
		animals.add(3, "bird");//3
		
		System.out.println(animals);

	}

}
