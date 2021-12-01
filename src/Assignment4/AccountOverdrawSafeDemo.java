package Assignment4;

public class AccountOverdrawSafeDemo implements Runnable {
	private static Account account = new Account();

	public static void main(String[] args) {
		AccountOverdrawSafeDemo safeDemo = new AccountOverdrawSafeDemo();
		Thread threadOne = new Thread(safeDemo);
		Thread threadTwo = new Thread(safeDemo);
		
		threadOne.setName("Rahul");
		threadTwo.setName("Nikhil");
		threadOne.start();
		threadTwo.start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 2; i++) {
			makeWithdrawal(499);
			if (account.getBalance() < 0) {
				System.out.println("Account balance Nil!!!!!!!!!!!!");
			}
		}
	}

	private synchronized static void makeWithdrawal(int withdrawAmount) {
		if (account.getBalance() >= withdrawAmount) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw of rupee " + withdrawAmount);
			account.withdraw(withdrawAmount);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal of rupee " + withdrawAmount);
		} else {
			System.out.println("Not enough Amount for " + Thread.currentThread().getName() + " to withdraw !  Available Amount = " + account.getBalance());
		}
	}
}
