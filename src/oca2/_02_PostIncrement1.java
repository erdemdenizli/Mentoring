

package oca2;

public class _02_PostIncrement1 {

	public static void main(String[] args) {

		int variable = 9;

		if (variable++ < 10) {//variable = 9 because it is post incremented, it will update itself when it reaches another variable
			System.out.println(variable + " hello!");//variable is now 10
		} else {
			System.out.println(variable + " goodbye!");
		}

	}

}

