

package oca2;

public class _04_ContinueKeyword {

	public static void main(String[] args) {
		
		int array2[] = { 1, 2, 3, 4, 5 };

		int var = 4;

		int count = 0;

		for (int i : array2) {//1, 2, 3, 4, 5
			if (i != var) { //1 != 4, 2 != 4,  3 != 4, 4 != 4, 5 != 4
				continue;
				count++;//not reachad at any step
				//in an if statement, if you have any statements after continue, those are unreachable
				//however, it would work fine if we didn't have the curly braces, since count would be
				//out of if statement
			}
		}

		System.out.println(count + "exists");
		
	}

}


