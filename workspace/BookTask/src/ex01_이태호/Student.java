package ex01_이태호;

public class Student extends Person implements ScoreInter{

	private int myScore = 0;
	
	public Student(String name, int age, int myScore) {
		super(name, age);
		this.myScore = myScore;
	}

	@Override
	public void score() {
		System.out.println("이름은 : " + getName() + "이며 점수는 " + this.myScore + " 입니다");
		
	}
}
