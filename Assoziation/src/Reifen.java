
public class Reifen {

	
	String reifenMarke;
	String reifenTyp;
	
	
	public Reifen(String reifenMarke, String reifenTyp) {
		super();
		this.reifenMarke = reifenMarke;
		this.reifenTyp = reifenTyp;
	}
	
	public void ausgebenReifen(String reifenMarke, String reifenTyp) {
		System.out.println(reifenMarke + "  " + reifenTyp);
	}
	
	
	
}
