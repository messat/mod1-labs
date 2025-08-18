package lab5OOP;

public class Bank {
	Account[] lloydsBank = new Account[3];
	
	
	public Account addAccount(String owner, double balance) {
		Account eachAccount = new Account(owner, balance);
		for(int i = 0; i < lloydsBank.length; i++) {
			if(lloydsBank[i] == null) {
				lloydsBank[i] =  eachAccount;
				return eachAccount;
			} 
		}
		return null;
	}
	
	public Account getAccount(String owner) {
		for (Account indivdAccount : lloydsBank) {
			if(indivdAccount.getDetails().contains(owner)) {
				return indivdAccount;
			}
		}
		return null;
	}
}
