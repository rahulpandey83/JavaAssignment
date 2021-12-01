package Assignment4;

public class Account {
	private int balance = 1000;
	public void withdraw(int amount) {
		balance = balance-amount;
	}
	public int getBalance() {
		return balance;
	}
}
