package lab5OOP;

public class Account {
	private static int counter = 0;
	private int id;
	private String owner;
	private double balance;
	
	public Account(String owner, double balance) {
		this.id = ++counter;
		this.owner = owner;
		this.balance = balance;
	}
	
	void deposit(double amount) {
		if(amount < 0) {
			System.out.printf("You cannot deposit negative amount of money %.2f\n", amount);
		} else {
			this.balance += amount;
		}
	}
	
	void withdraw(double amount) {
		if(amount > this.balance) {
			System.out.printf("Amount %.2f is too high. You do not have the sufficient funds to withdraw this amount.\n", amount);
		} else {
			this.balance -= amount;
		}
	}
	
	public void addInterest() {
		this.balance += (this.balance * 0.025);
	}
	
	public String getDetails() {
		return String.format("Account info: { id: %d, owner: %s, balance: %.2f }\n", id, owner, balance);
	}
	
	
	
	
}
