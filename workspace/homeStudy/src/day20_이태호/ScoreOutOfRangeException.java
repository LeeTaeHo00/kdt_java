package day20_이태호;

public class ScoreOutOfRangeException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public ScoreOutOfRangeException() {
		toString();
	}

	@Override
	public String toString() {
		String errorMessage = "점수가 범위를 벗어났습니다.\n" + super.toString();
		return errorMessage;
	}
	
}
