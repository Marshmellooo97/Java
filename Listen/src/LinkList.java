import java.util.*;


public class LinkList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<Integer> liste = new ArrayList<Integer>();
		
		
		for(int i = 0; i<10000000; i++) {
			liste.add(i);
		}
		
		final long timeStart = System.currentTimeMillis();
		LinkList.getZahl(4999999, liste);
		final long timeEnd = System.currentTimeMillis();
		System.out.println("Suchen hat gedauert " + (timeEnd-timeStart));
		
		
	}
		
		public static void getZahl(int index, List<Integer> liste) {
			System.out.println(liste.get(index));
		
		}

}
