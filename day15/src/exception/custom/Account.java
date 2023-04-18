package exception.custom;

public class Account {
	private long balance;
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) {
		if (money < 0) {
			throw new DepositMinusMoneyException("0원 보다 적게 입금");
		}
		this.balance += money;
	}
	
	public void withdraw(int money) throws BalanceInsufficienException {
		if (this.balance < money) {
			throw new BalanceInsufficienException(new StringBuffer("잔고부족").toString());
		}
		this.balance -= money;
	}
	
}
