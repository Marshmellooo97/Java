import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;
import java.util.Locale.IsoCountryCode;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		System.out.println("Test");
		
		// Variablen Deklarieren
		int test = 2;
		boolean xBool = true;
		
		System.out.println("das ist die Zahl : " + test);
		
		boolean vara = true;
		boolean varb = true;
		if(vara && varb) {
			System.out.println("geht");
		}
		
		// Eingabe der Console 
		//Scanner scan = new Scanner(System.in);
		//double zahl = scan.nextDouble();
		//System.out.println(zahl);
		//int iEingabe = scan.nextInt();
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
		System.out.println("FOR");
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
		// Array 
		int [] nameArray = new int[2]; // 2 gibt die Anzahl der Felder
		String [] nameArrayStr = {"platz0","platz1","platz2"};
		
		System.out.println("Beispiel");
		// Beispiel 
		String [] aFragen = {"Was ist 5+5?", "Was ist 3*5?"};
		int [] aErg = {10,15};
		int count = 0;
		while(count < aFragen.length) {
			System.out.println(aFragen[count]);
			Scanner scan = new Scanner(System.in);
			int iEingabeUser = scan.nextInt();
			if(iEingabeUser == aErg[count]) {
				System.out.println("Richtig");
				count++;
			}else {
				System.out.println("Falsch");
			}
			
		}
		
		// Strings können nicht verglichen werden
		String name = "Christian";
		String name2 = "Peter";
		if(name.equals(name2)) {
			System.out.println("Passt");
		}else {
			System.out.println("Passt nicht");
		}
		
	}

}


