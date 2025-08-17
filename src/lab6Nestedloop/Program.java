package lab6Nestedloop;

public class Program {

	public static void main(String[] args) {
		multiplicationTable();

	}

	public static void multiplicationTable() {

		for (int i = 1; i < 11; i++) {
			for (int j = 1; j < 11; j++) {
				System.out.printf("%6d", i * j);
			}
			System.out.println();
		}
	}

}
