package oca1;

import java.util.*;

public class ArrayList2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Akbar");//0
		list.add("Guljannat");//1
		list.add("Muhtar");//2
		list.add("Vasyl");//3
		
		if(list.remove("Akbar")) System.out.println(list.remove("Kuzzat"));
		
		System.out.println(list);
		
	}

}
