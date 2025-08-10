package lab4;

public class Program {

	public static void main(String[] args) {
		int[ ] numbers = { 1, 3, -5, 7, 0, 4, 6, 8 };
		
		int total = 0;
		int minimum = numbers[0];
		int maximum = numbers[0];
		int indexOfZero = 0;
		for(int i =0; i< numbers.length; i++) {
			total+= numbers[i];
			if(minimum > numbers[i]) {
			 	minimum = numbers[i];
			}
			
			if(maximum < numbers[i]) {
				maximum = numbers[i];
			}
			
			if(numbers[i] == 0) {
				indexOfZero = i;
			}
			
		}
		int average = total / numbers.length;
		System.out.printf("Total: %d, average: %d, minimum: %d, maximum %d, indexOfZero %d", total, average, minimum, maximum, indexOfZero);

	}

}
