import java.util.*;

public class ValueOf_ParseInt {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Tell me about yourself");
		String s = scan.nextLine();

		int age = 0;
		int i = 0;
		OUTER: for (; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				String newS = s.substring(i);
				i = 0;
				for (; i < newS.length(); i++) {
					if (!Character.isDigit(newS.charAt(i))) {
						age = Integer.parseInt(newS.substring(0, i));
						break OUTER;
					}
				}

			}
		}

		System.out.println(age);

	}
}