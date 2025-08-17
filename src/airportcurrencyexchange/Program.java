package airportcurrencyexchange;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean nextExchange = true;
		while(nextExchange == true) {
			
		
		System.out.println("Enter the amount you would like to exchange");
		double customerExchangeGBP = sc.nextDouble();
		
		//service fee charge at airport
		double serviceCharge = serviceFee(customerExchangeGBP);
		
		//customer type with added airport tax
		System.out.println("Enter the customer type: R = Regular, V = VIP, S = Staff");
		char customerType = sc.next(".").charAt(0);
		double taxStatus = airportTax(customerType, serviceCharge);
		
		System.out.println("Enter the currency you would like to exchange. USD - 1, EUR - 2, JPY - 3");
		int currencyType = sc.nextInt();
		String currencyRequest = identifyCurrencyType(currencyType);
		double finalAmount = currencyExchange(taxStatus, currencyType);
		System.out.printf("Amount after service fee: %.2f, Amount after airport tax: %.2f, final amount in %s%d", serviceCharge, taxStatus, currencyRequest, (int)finalAmount);
		System.out.println("\nWould you like to exchange again? Y = yes, N = No");
		char exchangeTry = sc.next(".").charAt(0);
		if(exchangeTry == 'Y') {
			nextExchange = true;
		} else {
			nextExchange = false;
		}
		}
	}

	public static double serviceFee(double amount) {
		DecimalFormat money = new DecimalFormat("#.##");
		return amount < 100 ? Double.valueOf(money.format(amount * 1.05)) : Double.valueOf(money.format(amount)) * 1.025;
	}
	
	
	public static double currencyExchange(double amount, int typeCurrency) {
		
		double exchange;
		switch (typeCurrency) {
		case 1:
			exchange = amount * 1.25;
			break;
		case 2:
			exchange = amount * 1.15;
			break;
		case 3:
			exchange = amount * 180.5;
			break;
		default:
			exchange = amount * 1;
		}

		DecimalFormat dec = new DecimalFormat("#.##");
		return Double.valueOf(dec.format(exchange));
	}


	public static double airportTax(char typeOfCustomer, double amount) {
		DecimalFormat dec = new DecimalFormat("#.##");
		if (typeOfCustomer == 'R') {
			return Double.valueOf(dec.format(amount * 1.1));
		} else if (typeOfCustomer == 'V') {
			return Double.valueOf(dec.format(amount * 1.05));
		} else {
			return amount;
		}
	}
	
	public static String identifyCurrencyType(int typeCur) {
		if(typeCur == 1) {
			return "USD $";
		} else if(typeCur == 2) {
			return "EUR €";
		} else {
			return "JPY ¥";
		}
	}
	
	

}
