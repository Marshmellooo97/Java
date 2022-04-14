package Übung;

public class Kontakt {

	private String name;
	private String nummer;
	
	
	public Kontakt(String name, String nummer) {
		this.name = name;
		this.nummer = nummer;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNummer() {
		return nummer;
	}
	public void setNummer(String nummer) {
		this.nummer = nummer;
	}
	
	public static Kontakt erelleKontakt(String name, String nummer) {
		return new Kontakt(name, nummer);
	}
	
		
	
	
}
