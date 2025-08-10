package lab3;

import java.util.Scanner;

public class Utils {
	
	Scanner sc = new Scanner(System.in);
	
	public int getInt(String prompt) {
		System.out.println(prompt);
		int inputInt = sc.nextInt();
		sc.nextLine();
		return inputInt;
	}
	
	public String getString(String prompt) {
		System.out.println(prompt);
		String userTxt = sc.nextLine();
		return userTxt;
	}
}
