package staticTest;

public class EnumTest {
	// enum
	enum Day
	{
		// 열겨형 상수
		MONDAY(0, false), TUESDAY(1), WEDESDAY(2),THURSDAY(3),FRIDAY(4),SATURDAY(5),SUNDAY(6);
		// 필드
		boolean week;
		
		int temp;
		
		// 생성자
		private Day(boolean week)
		{
			this.week = week;
		}
		
		private Day(int temp) 
		{
			this.temp = temp;
		}
		
		private Day(int temp, boolean week) 
		{
			this.temp = temp;
			this.week = week;
		}
		
		int week() {return this.temp;}
		boolean weekDay() { return this.week; }
	}
	
	
	public EnumTest(boolean week) {
		//this.week = week;
	}
	
	
	
	
	// 메소드
	
	// 메인메소드	
	public static void main(String[] args) {
		Day today = Day.THURSDAY;
		//today = Day.FRIDAY;
		
		String result = "";
		
		System.out.println("오늘은 " + today + "입니다.");
		
		// switch문을 사용하여 열거형 상수 처리
		switch(today) 
		{
		case MONDAY:
			System.out.println("월요일 입니다");
			result = "월요일";
			break;
			
		case TUESDAY:
			System.out.println("화요일 입니다");
			result = "화요일";
			break;
			
		case WEDESDAY:
			System.out.println("수요일 입니다");
			result = "수요일";
			break;
			
		case THURSDAY :
			System.out.println("목요일 입니다");
			result = "목요일";
			break;
		}
		
		System.out.println("오늘은 " + result + " 입니다.");
		
		// 조건문 오늘이
//		if(today.weekDay())
		if(today != Day.SATURDAY && today != Day.SUNDAY)
		{
			System.out.println("오늘은 평일입니다");
		}
		
		else 
		{
			System.out.println("오늘은 주말입니다");
		}
		
		// 모든 열거형 값을 배열로 가져오는 메소드
		Day[] days = Day.values();
		System.out.println(days);
		
		for(Day day : days) 
		{
			System.out.println(day);
		}
	}

}
