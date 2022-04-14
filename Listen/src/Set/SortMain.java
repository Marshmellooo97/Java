package Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import Übung.*;

public class SortMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list1 = new ArrayList<String>();
		
		list1.add("Peter");
		list1.add("Adrian");
		list1.add("Michi");
		list1.add("Peter");
		list1.add("Benrt");
		
		for (String namenListe : list1) {
			System.out.println(namenListe);
		}
		
		Collections.sort(list1);
		System.out.println("\n");
		
		for (String namenListe : list1) {
			System.out.println(namenListe);
		}
		
		
		List<Kontakt> listeKontakte = new ArrayList<Kontakt>();
		listeKontakte.add(new Kontakt("Peter", "1111"));
		listeKontakte.add(new Kontakt("Adrian", "2222"));
		listeKontakte.add(new Kontakt("Michi", "3333"));
		listeKontakte.add(new Kontakt("Bernt", "4444"));
		
		
	}

}
