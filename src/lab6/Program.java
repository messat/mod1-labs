package lab6;

public class Program {

	public static void main(String[] args) {
		System.out.println(account());

	}

	public static int account() {
		
		double currentMoney = 100;
		int year = 0;
		int interestRate = 5;

		while (currentMoney < 200) {
			year++;
			currentMoney *= (1 + ((double)interestRate / 100));
		}
		return year;
	}

}
