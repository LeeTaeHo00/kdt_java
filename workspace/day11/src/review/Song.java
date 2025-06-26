package review;

public class Song {
	// 필드	
	String title;
	String artist;
	String album;
	
	// 메소드
	// 정보출력 메소드
	void displayInfo() 
	{
		System.out.println("노래 제목 : " + title);
		System.out.println("가수명 : " + artist);
		System.out.println("앨벌발매일 : " + album);
	}
	
	
	// 메인메소드
	public static void main(String[] args) {
		// 객체화
		Song song = new Song();
		song.title = "HAPPY";
		song.artist = "Day6";
		song.album = "2025년 6월 25일";
		
		// 매개변수 x, 리턴 값 x
		song.displayInfo();
	}

}
