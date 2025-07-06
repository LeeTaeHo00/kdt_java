package setTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest01 {
	public static void main(String[] args) {
		//HashSet<String> animalSet = new HashSet<>();
		ArrayList<String> animalSet = new ArrayList<String>();
		
		animalSet.add("하마");
		animalSet.add("컬리");
		animalSet.add("치타");
		animalSet.add("호랑이");
		animalSet.add("호랑이");
		animalSet.add("호랑이");
		animalSet.add("호랑이");
		animalSet.add("컬리");
		animalSet.add("컬리");
		animalSet.add("컬리");
		animalSet.add("컬리");
		
		Collections.sort(animalSet);
		//Collections.
		System.out.println(animalSet);
		System.out.println(animalSet.toString());
		
		//Iterator : 반복자
		Iterator<String> animalIter = animalSet.iterator();
		System.out.println(animalIter);

		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.next());
//		System.out.println(animalIter.hasNext());
		
		while(animalIter.hasNext()) 
		{
			System.out.println(animalIter.next());
		}
		
	}
}
