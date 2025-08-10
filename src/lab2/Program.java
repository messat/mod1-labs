package lab2;

import java.util.Scanner;

public class Program {

//	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String[] students = { "Muhammad", "Abdul", "Matt", "Jai", "Steven"};
		int[] marks = {79, 81, 49, 71, 55};
		
		for(int i =0; i<students.length; i++) {
			System.out.printf("Student Name: %s, Mark: %d, Grade: %s\n", students[i], marks[i], getGrade(marks[i]));
		}
		
//		System.out.println("Enter the mark achieved in apprenticeship");
//		int mark = sc.nextInt();
//		sc.close();

	}
	
	public static String getGrade(int mark) {
		if(mark > 70 && mark < 101) {
			return "Distinction";
		} else if(mark > 60) {
			return "Merit";
		} else if(mark >= 50) {
			return "Pass";
		} else if(mark >= 1 && mark < 50) {
			return "Fail";
		} else {
			return "Enter a valid number between 1-100";
		}
		
		
	}

}
