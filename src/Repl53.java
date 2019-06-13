import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Repl53 {

	public static int maxYear(int[][] arr) {
		int max = arr[0][0];
		int count = 0;
		int newCount = 0;

		for (int years = 1900; years < 2001; years++) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (arr[i][j] == years)
						count++;
				}
			}
			if(count>newCount) {
				max = years;
				newCount=count;
			}
			count = 0;
		}

		return max;
	}

	public static void main(String[] args) {
		
		System.out.println(maxYear(new int[][] {{1901,1902},{1903,1903},{1902,1905},{1901,1902}}));

	}

}
