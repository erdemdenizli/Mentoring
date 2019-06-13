import java.util.Scanner;

public class CybertekBurger {

	public static void main(String[] args) {
		
		String meal, chips, drinks;
		int amountOfChips;
		double price = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Select meal:");
		meal = input.next();
		
		switch(meal.toLowerCase()) {
		
			case "burger":
				price += 10;
				break;
			case "chicken":
				price += 8;
				break;
			case "veggie":
				price += 6;
				break;
		}
		
		System.out.println("Chips?");
		chips = input.next();
		
		if(chips.equalsIgnoreCase("yes")) {
			System.out.println("How many?");
			amountOfChips = input.nextInt();
			price += amountOfChips*0.5;
		}
		
		System.out.println("Select drinks:");
		drinks = input.next();
		
		switch(drinks.toLowerCase()) {
		case "fountain":
			price += 1;
			break;
		case "bottled":
			price += 2;
			break;
		}
		
		System.out.println("You will have a wonderful meal only for $" + price);
		
	}

}
