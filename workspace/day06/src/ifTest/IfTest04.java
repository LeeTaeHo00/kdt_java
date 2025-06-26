package ifTest;
//13번 : if~if문, if~else if문 차이, if문 중첩
public class IfTest04 { // 클래스 시작

	public static void main(String[] args) { // 메인메소드 시작
		// if~if : 위의 조건식이 true라도 아래 if문의 조건식을 확인한다.
		int num = 10, grade = 100;
		
		if(num > 5) { // 조건문 검사
			System.out.println("num은 5보다 큽니다"); // 조건이 만족했을 떄 실행문 실행
		} // 조건문 끝
		
		if(num > 3) { // 조건문 검사
			System.out.println("num은 3보다 큽니다"); // 조건이 만족했을 떄 실행문 실행
		}  // 조건문 끝

		// if~elseif : 위의 조건식이 true면 아래 if문의 조건식은 무시된다.		
		if(num > 5) {// 조건문 검사
			System.out.println("num은 5보다 큽니다");// 조건이 만족했을 떄 실행문 실행
		} else if(num > 3) {// 조건문 검사
			System.out.println("num은 3보다 큽니다");// 다음 조건이 만족했을 떄 실행문 실행
		} // 조건문 끝
		
		
		// if문 중첩
		// 90점 이상은 A, 100점은 만점으로 A 출력
		if(grade == 100) {// 조건문 검사
			System.out.println("A");  // 조건이 만족했을 떄 실행문 실행
		}else if(grade >= 90){// 조건문 검사
			System.out.println("90A"); // 조건이 만족했을 떄 실행문 실행
		}// 조건문 끝
		
		if(grade >= 90) { // 조건문 검사
			if(grade == 100) { // 조건문 검사
				System.out.println("만점!"); // 조건이 만족했을 떄 실행문 실행
			} else { // 조건문 검사가 모두 false일 경우
				System.out.println("A"); // 조건을 모두 만족하지 못했을 때 실행문 실행
			} // 조건문 끝
		} // 조건문 끝
		
	} // 메인 메소드 끝

} // 클래스 끝
