package AllesLernen;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;



public class Lerninhalt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Variablen Deklarieren
		int test = 2;
		boolean xBool = true;
		System.out.println("das ist die Zahl : " + test);
		// Grundlagen vergleichen
		boolean vara = true;
		boolean varb = true;
		if(vara && varb) {
			System.out.println("geht");
		}	
		int iEingabe = 1;
		// IF
		if(iEingabe == 0) {
			System.out.println("0");
		}
		else if(iEingabe > 0) {
			System.out.println("größer 0");
		}
		// Case
		switch (iEingabe) {
			case 0: {
				System.out.println("0");
				}break;
			case 1: {
				System.out.println("1");
			}break;
			default:{
				System.out.println("keine Ahnung");
			}
		}		
		// For 
		for(int i = 0; i<3; i++) {
			System.out.println(i);
		}
		System.out.println("While");
		// While
		int iCount = 1;
		while(iCount != 3) {
			System.out.println(iCount);
			iCount++;
		}		
		// Strings vergleichen mit equals
		String name = "Christian";
		String name2 = "Peter";
		if(name.equals(name2)) {
			System.out.println("Passt");
		}else {
			System.out.println("Passt nicht");
		}
		
		
		// Array 
		int [] nameArray = new int[2]; // 2 gibt die Anzahl der Felder
		String [] nameArrayStr = {"platz0","platz1","platz2"};		
		System.out.println(nameArray.length);
		// length = länge des Arrays
		for (int i = 0; i < nameArrayStr.length; i++) {
			System.out.println(nameArrayStr[i]);
		}
		
		
		// LinkList bei Neu Hinzufügen, Löschen, Ka welche größe
		// ArrayList wenn man suchen möchte, Größe bekannt. 
		// collection = Erstllen einer Liste/ Set oder Map. Allgemeingültig
		
		// ArrayList
		// Array erstellen Arraygröße ist fest
		int [] zahlen = new int[2];
		//Werte geben
		zahlen[0] = 0;
		zahlen[1] = 1;		
		// .add = Hinzufügen
		// .get(x) = Element an stelle x Bekommen
		// .size = Länge der Arraylist
		// Listen Sotieren mit .sort(nameDerListe);
		
		// LinkList erstellen
		LinkedList<Integer> listeLinkedList = new LinkedList<Integer>();
		// .add = Hinzufügen
		// .get(x) = Element an stelle x Bekommen
		// .size = Länge der Arraylist
		// Listen Sotieren mit .sort(nameDerListe);
		
		
		
		// Set
		// Listen Objekte können häufiger drin vorkommen
		// Set Objekte können nur einmal drin vorkommen
		// TreeSet Sotiert nach ABC/123
		// HashSet Sortiert nicht kann immer anders sein
		// LinkedHashSet Sotiert so wie hinzugefügt
		// .add = Hinzufügen		
		// .sort = Sotieren
		List<String> list1 = new ArrayList<String>();
		Set<String> set1 = new TreeSet<String>();
		Set<String> set2 = new HashSet<String>();
		Set<String> set3 = new LinkedHashSet<String>();		
				
		
		
		// Map = Dictionary
		// K = Key = Schlüssel
		// V = Value = Wert = Inhalt
		Map<Integer, String> map1 = new HashMap<>();
		// put = hinzufügen
		map1.put(1111, "Element1");
		map1.put(2222, "Element2");
				
		System.out.println(map1.get(1111));
		// get = Schlüssel eingeben und das passende Element bekommen
		// keySet = gibt die Schlüssel aus
		for(Integer key: map1.keySet()) {
			System.out.println("Schlüssel: "+ key);
			String value = map1.get(key);
			System.out.println("Inhalt: " + value);
		}
		
		
		
		
	}

}
