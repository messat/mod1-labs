package lab2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the mark achieved in apprenticeship");
		int mark = sc.nextInt();
		if(mark > 70 && mark < 101) {
			System.out.println("Distinction");
		} else if(mark > 60) {
			System.out.println("Merit");
		} else if(mark >= 50) {
			System.out.println("Pass");
		} else if(mark >= 1 && mark < 50) {
			System.out.println("Fail");
		} else {
			System.out.println("Enter a valid number between 1-100");
		}
		sc.close();
		

	}

}
