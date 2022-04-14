
public class Methoden_Aufruf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ausgabe();
		erstelleGegner("Test", 100);
		int iErgebnis = taschenrechner(3, 40);
		System.out.println(iErgebnis);
		
	}

	public static void ausgabe() {
		System.out.println("Ich bin eine Methode");
	}
	
	public static void erstelleGegner(String name, int lebenpunkte) {
		String gegnerName = name;
		int gegnerLeben = lebenpunkte;
		System.out.println(gegnerName + gegnerLeben);
	}
	
	public static int taschenrechner(int iZahl1, int iZahl2) {
		int iErg;
		return iErg = iZahl1 + iZahl2;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
