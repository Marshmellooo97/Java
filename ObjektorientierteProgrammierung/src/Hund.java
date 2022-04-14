
public class Hund {

	String name;
	int alter;
	String rasse;
	
	// Konstruktor
	public Hund() {
		
	}
	
	public Hund(int alter, String name, String rasse) {
		this.alter = alter;
		this.name = name;
		this.rasse = rasse;
	}
	// Methoden
	public void bellen() {
		System.out.println(this.name + " bellt");
	}
	
}
