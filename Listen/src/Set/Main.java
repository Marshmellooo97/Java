package Set;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> list1 = new ArrayList<String>();
		Set<String> set1 = new TreeSet<String>();
		Set<String> set2 = new HashSet<String>();
		Set<String> set3 = new LinkedHashSet<String>();
		
		// Liste Objekte können häufiger drin vorkommen
		// Set Objekte können nur einmal drin vorkommen
		// TreeSet Sotiert nach ABC/123
		// HashSet Sortiert nicht kann immer anders sein
		// LinkedHashSet Sotiert so wie hinzugefügt
		
		list1.add("Peter");
		list1.add("Adrian");
		list1.add("Michi");
		list1.add("Peter");
		
		set1.add("Peter");
		set1.add("Adrian");
		set1.add("Michi");
		set1.add("Peter");
		
		set2.add("Peter");
		set2.add("Adrian");
		set2.add("Michi");
		set2.add("Peter");
		
		set3.add("Peter");
		set3.add("Adrian");
		set3.add("Michi");
		set3.add("Peter");
		
		System.out.println("ArrayList");
		Main.getElement(list1);
		System.out.println("\nTreeSet");
		Main.getElement(set1);
		System.out.println("\nHashSet");
		Main.getElement(set2);
		System.out.println("\nLinkedHashSet");
		Main.getElement(set3);
	}

	public static void getElement(Collection<String> collection) {
		for (String string : collection) {
			System.out.println(string);
		}
	}
	
	
}
