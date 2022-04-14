
public class Auto {

	int reifen;
	static int reifenAnzahl; // Kann ohne objekt leben 
							//ist global verfügbar
	int preis;
	String marke;
	
	
	
	// Konstruktoren
	//Wird immer Automatisch erstellt 
	public Auto() {
		
	}
	// Konstruktoren
	// Wird manuell erstellt
	public Auto(int reifen , int preis , String marke) {
		this.marke = marke;
		this.reifen = reifen;
		this.preis = preis;
	}
	
	// Methoden 
	// Klassenmethoden
	public static void ausgabe() {
		System.out.println("Kann ohne objekt aufgerufen werden");
	}
	
	// Objektmethoden
	public void gasgeben() {
		System.out.println("Das Auto " + this.marke +" gibt gas");
	}
	
	public void vergleichePreis(int preis) {
		if(this.preis < preis) {
			System.out.println("Der " + this.marke + " Ist billiger");
		}else {
			System.out.println("Der " + this.marke + " Ist teurer");
		}
	}
	
}
