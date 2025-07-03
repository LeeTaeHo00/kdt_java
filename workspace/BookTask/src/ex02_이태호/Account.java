package ex02_이태호;

public class Account {
	// 필드
	private int balance;
	
	// 생성자
	public Account(int balance) {
		this.balance = balance;
	}
	
	// 메소드
	void withdraw(int amount) throws NumberFormatException, java.util.InputMismatchException, ThrowLowMoney
	{
		if(amount > balance) 
		{
			System.out.println("출금 금액이 " + (amount - balance) + "만큼 부족하여 출금할 수 없습니다.");
			throw new ThrowLowMoney();
		}
		
		balance -= amount;
		System.out.println("현재 잔액은 " + balance + " 입니다.");
	}
	

	void deposit(int amount) 
	{
		balance += amount;
		System.out.println("잔액에 입금된 금액은 " + amount + "원 입니다. 현재 잔고는 " + balance + "원 입니다.");
	}
}
