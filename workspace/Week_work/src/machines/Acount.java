package machines;

public class Acount{
	// 필드
	private String userName;
	private int money;
	
	// 생성자
	public Acount() 
	{
		this("이름없음", 0);
	}

	public Acount(String userName, int money) {
		this.userName = userName;
		this.money = money;
	}

	// 메소드
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) throws NumberFormatException
	{
		this.money = money;
		if(this.money < 0) this.money = 0;
	}

	public String getUserName() {
		return userName;
	}
}
