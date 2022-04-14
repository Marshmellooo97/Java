
public class Adresse {

	// Eigenschaften / Attribute
	private String name;
	private String Straﬂe;
	private String stadt;
	
	
	//Konstruktor
	public Adresse(String name, String straﬂe, String stadt) {
		super();
		this.name = name;
		Straﬂe = straﬂe;
		this.stadt = stadt;
	}
	
	// Methoden
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStraﬂe() {
		return Straﬂe;
	}
	public void setStraﬂe(String straﬂe) {
		Straﬂe = straﬂe;
	}
	public String getStadt() {
		return stadt;
	}
	public void setStadt(String stadt) {
		this.stadt = stadt;
	}
	
	
	
	
	
}
