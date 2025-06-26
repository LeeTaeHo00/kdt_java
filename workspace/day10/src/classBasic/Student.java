package classBasic;
// 10-1번 
public class Student {
	// 필드 (속성, 특징)
	String name;
	int mathScore;
	int engScore;
	int korScore;
	double avg;
	
	
	// 메소드(행동, 행위, 기능)
	// 10-3 번 : 연관성 있는 저장공간과 기능을 한곳에 모아 관리할 수 있따.
	
	// 총합을 반환하는 메소드
	int getTotal() 
	{
		return mathScore + engScore + korScore;
	}
	
	void setName(String name) 
	{
		this.name = name;
	}
	
	void setScore(int mathScoreFromElse, int engScoreFromElse, int korScoreFromElse) 
	{
		mathScore = mathScoreFromElse;
		engScore = engScoreFromElse;
		korScore = korScoreFromElse;
		
		this.avg = getTotal() / 3.0;
	}
	
	void printInfo() 
	{
		System.out.printf("%s님의 평균 점수는 %.1f 입니다", name, avg);
	}
}
