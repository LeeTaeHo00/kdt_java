package booktask;

public class Ex04 {
	public static void main(String[] args) {
		// 4. 다중 반복문을 사용해 다음과 같은 모양의 *를 출력하는 코드를 작성(1/2/3/4 삼각형)
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < (4 - i); j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < (i + 1); j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
