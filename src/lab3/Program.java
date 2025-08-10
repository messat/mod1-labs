package lab3;

import java.util.Scanner;

public class Program {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Utils util = new Utils();
		int getPounds = util.getInt("Enter the total weight to convert to stones and pounds");
		convertInputToStonesPounds(getPounds);
		int getKg = util.getInt("\nEnter kilos to convert to Stones and pounds");
		convertInputToStonesPounds(getKg);
		String myLunch = theLunchQueue();
		System.out.println(myLunch);
	}
	
	public static String theLunchQueue() {
		Utils util = new Utils();
		String mainCourse = util.getString("\nWhat main dish would you like(Fish, Burgers, or Veg)? ");
		int roastPotatoes = util.getInt("How many roast potatoes would you like? ");
		int brusselSprouts = util.getInt("How many Brussel Sprouts would you like? ");
		
		return String.format("Hello, your lunch is %s with %d roast potatoes and %d Brussel sprouts.", mainCourse, roastPotatoes, brusselSprouts);
	}
	
	
	
	public static void convertInputToStonesPounds(int pounds) {
		int stones = pounds / 14;
		int remainingPounds = pounds % 14;
		System.out.printf("The stone(s): %d, and pound(s): %d", stones, remainingPounds);
	}
	
	public static void convertKgsToStonesPounds(int kg) {
		int kilosToPounds = (int)(kg * 2.20462);
		convertInputToStonesPounds(kilosToPounds);
		
	}

}
