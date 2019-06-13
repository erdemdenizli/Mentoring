package oca2;

public class _05_StringEquality {

	public static void main(String[] args) {
		
		String a = "String";//this is in SCP

		String[] array = { "S", "t", "r", "i", "n", "g" };

		String str2 = "";

		for (String str1 : array) {
			str2 = str2 + str1;
		}
		//str2 = "String";//this is in heap memory

		boolean result1 = (a == str2);//there is no object equality
		boolean result2 = (a.equals(str2));

		System.out.println(result1 + " " + result2);
		
	}

}
