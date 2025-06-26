package switchTest;
// 14번 : switch
public class SwitchTest01 { // 클래스 시작

	public static void main(String[] args) { // main 메소드 시작
		String animal = "댕댕이"; // 문자열 변수 선언 및 초기화
		
		switch(animal) { // switch문 시작 검사할 변수는 animal
		case "고양이": // 검사할 변수와 케이스 검사
			System.out.println("선택한 동물은 댕댕이 입니다.");// 조건에 맞는 실행문 출력
			break; // switch문 탈출
			
		case "댕댕이":// 검사할 변수와 케이스 검사
			System.out.println("선택한 동물은 댕댕이 입니다."); // 조건에 맞는 실행문 출력
			break; // switch문 탈출
			
		case "땡컨":// 검사할 변수와 케이스 검사
			System.out.println("선택한 동물은 땡컨 입니다."); // 조건에 맞는 실행문 출력
			break; // switch문 탈출
			
		default: // 모든 케이스에 해당하지 않을 경우
			System.out.println("선택한 동물이 없습니다."); // 조건에 맞는 실행문 출력
			break; // switch문 탈출
		}
		
		switch(70) // switch 문 선언 검사할 수는 70
		{
		case 1: // 검사할 수에 적합하는 case인지 확인
			System.out.println("1 입니다."); // 해당 케이스의 실행문 출력
			break; // switch 문 빠져나가기
		case 7:// 검사할 수에 적합하는 case인지 확인
			System.out.println("7 입니다.");// 해당 케이스의 실행문 출력
			break;// switch 문 빠져나가기
			
		case 8:// 검사할 수에 적합하는 case인지 확인
			System.out.println("8 입니다.");// 해당 케이스의 실행문 출력
			break;// switch 문 빠져나가기
			
		default:// 검사할 수에 적합하는 case인지 확인
			System.out.println("case 외 숫자입니다.");// 해당 케이스의 실행문 출력
			break;// switch 문 빠져나가기
		}
			
	} // 메인 메소드 끝

} // 클래스 끝
