package lab5OOP;

public class Program {

	public static void main(String[] args) {
//		Account acc1 = new Account("Jai", 10);
//		Account acc2 = new Account("Fred", 100);
//		
//		processAccount(acc2);
//		
//		Account partnerAccount = acc2;
//		partnerAccount.addInterest();
//		Account acc3 = new Account("Alex", 600);
//	
//		Account[] friendsAcc = {acc1, acc2, partnerAccount, acc3};
//		
//		for(Account eachAccount: friendsAcc) {
//			System.out.println(eachAccount.getDetails());
//		}
//		
//		int k = 100;
//		incInt(k);
		
		Bank jpMorgan = new Bank();
		Account account1 = jpMorgan.addAccount("Muhammad", 25);
		Account account2 = jpMorgan.addAccount("Steven", 100);
		account2.addInterest();
		account2.withdraw(50);
		Account account3 = jpMorgan.addAccount("Hayden", 10);
		Account account4 = jpMorgan.addAccount("Matthew", 5);
		System.out.println(account4);
		
		System.out.println(jpMorgan.getAccount("Steven").getDetails());
		System.out.println(jpMorgan.addAccount("Nick", 15));
		
		
		

	}
	
	static void processAccount(Account accType) {
		accType.addInterest();
	}
	
	private static void incInt(int x) {
		x++;
	}

}
