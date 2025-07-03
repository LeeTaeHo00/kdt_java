package ex02_이태호;

import java.util.InputMismatchException;

public class Main {
	public static void main(String[] args) 
	{
		Account account = new Account(0);
		
		account.deposit(5000);
		
		try {
			account.withdraw(500);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (ThrowLowMoney e) {
			e.printStackTrace();
		}
	}
}
