package classBasic;
// 10-2 : Student 클래스의 객체를 만들 클래스
public class StudentMain {

	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1);
		
		Student st2 = new Student();
		System.out.println(st2);
		
		// 객체명.필드명 = 값
		st1.name = "김영선";
		
		st1.korScore = 100;
		st1.engScore = 90;
		st1.mathScore = 100;
		
		// 매개변수 x, 리턴값 o => syso(메소드);
		System.out.println(st1.getTotal());
		st1.avg = st1.getTotal() / 3.0;
		
		System.out.println(st1.avg);
		
		// st2 객체의 국어점수 100점, 영어점수 50점, 수학점수 77점
		// 메소드 호출하여 000님의 평균점수는 소수점하자리까지 출력하기
		st2.setName("투명드래곤");
		st2.setScore(100, 50, 77);
		st2.printInfo();
		
//		System.out.println(st1.name);
//		System.out.println(st1.mathScore);
//		System.out.println(st2.name);
//		System.out.println(st2.avg);
		
	}

}
