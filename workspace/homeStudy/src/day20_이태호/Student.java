package day20_이태호;

public class Student {
	private String name;
	private int age;
	private int mathScore;
	private int engScore;
	private int korScore;
	
	public Student(String name, int age) 
	{
		this.name = name;
		this.age = age;
	}
	
	public int total() 
	{
		return mathScore + engScore + korScore;
	}
	
	public void printAvg() 
	{
		System.out.printf("평균 : %.2f", (double)(total() / 3.0));
	}
	
	public int addScore(int value) throws ScoreOutOfRangeException, NumberFormatException
	{
		if(value > 100 || value < 0) 
		{
			throw new ScoreOutOfRangeException();
		}
		
		return value;
	}
	
	
	
	
	// 오버라이드
	@Override
	public int hashCode() {
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Student)) return false;
		
		return ((Student)obj).name.equals(this.name) ? true : false;
	}

	// setter getter
	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	
	
	
}
