package Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class MainIterator {

	public static void bef�llen(ArrayList<Integer> arr, ArrayList<Integer> arr2) {
		Iterator<Integer> it2 = arr2.iterator();
		for(Iterator<Integer> it = arr.iterator(); it.hasNext() == true; ) {
			if(it.next() == it2.next()) {
				System.out.println("Gleich");
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(4);
		ArrayList<Integer> arr2 = arr;
		arr.add(3);
		bef�llen(arr, arr2);
		
		
	}
}
