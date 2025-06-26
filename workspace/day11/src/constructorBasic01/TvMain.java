package constructorBasic01;

public class TvMain {

	public static void main(String[] args) {
		Tv[] tv1 = new Tv[1];
		
		Tv tv = new Tv(10, 5, "black", "Lg");
		tv.brand = "LG";
		tv.color = "black";
		tv.ch = 100;
		tv.vol = 100;
		
		Tv tv2 = new Tv();
		tv2.brand = "SAMSUNG";
		tv2.color = "orange";
		tv2.ch = 10;
		tv2.vol = 30;
		
		tv.powerOnOff();

		tv.increaseCh();
		tv.increaseVolum();
		
		tv.decreaseCh();
		tv.decreaseVolume();

		tv2.powerOnOff();
		
		tv2.increaseCh();
		tv2.increaseVolum();
		
		tv2.decreaseCh();
		tv2.decreaseVolume();
		
	}

}
