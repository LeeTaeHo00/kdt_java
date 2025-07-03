package booktask;

public class Ex05 {
	public static void main(String[] args) {
		// 5. 다중 반복문을 사용해 다음과 같은 모양의 *를 출력하는 코드를 작성(1/3/5/6 삼각형)
		for (int i = 0; i <= 4; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < (2 * i) + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
