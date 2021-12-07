package Assignment4;

public class AccountOverdrawDemo implements Runnable {
	private static Account account = new Account();

	public static void main(String[] args) throws InterruptedException {
		AccountOverdrawDemo demo = new AccountOverdrawDemo();
		Thread threadOne = new Thread(demo);
		Thread threadTwo = new Thread(demo);

		threadOne.setName("rahul");
		threadTwo.setName("nikhil");
		
		threadOne.start();
		threadTwo.start();

	}

	@Override
	public void run() {
		for (int i = 1; i <= 2; i++) {
			makeWithdrawal(499);
			if (account.getBalance() < 0) {
				System.out.println("Account balance Nil!!!!!!!!!!!");
			}
		}

	}

	private static void makeWithdrawal(int withdrawAmount) {
		if (account.getBalance() >= withdrawAmount) {
			System.out.println(Thread.currentThread().getName() + " is going to withdraw of rupee " + withdrawAmount);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			account.withdraw(withdrawAmount);
			System.out.println(Thread.currentThread().getName() + " completes the withdrawal of rupee " + withdrawAmount);
		} else {
			System.out.println("Not enough Amount for " + Thread.currentThread().getName() + " to withdraw ! Balance Amount " + account.getBalance());
		}
	}
}