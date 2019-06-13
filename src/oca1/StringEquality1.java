package oca1;

public class StringEquality1 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Java");
		String s1 = sb1.toString();//you have to use toString method to convert StringBuilder to String
		//s1 goes to heap memory
		
		//what should be inserted above
		
		//String s2 = "Java";//here s2 is created SCP so both s1 and s2 point different locations in memory
		//so no object equality, and s1 == s2 will give false, s1.equals(s2) will give true though
		
		String s2 = s1;
		
		System.out.println(s1 == s2);

	}

}
