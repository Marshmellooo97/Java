
public class Auto {

	Reifen reifen;
	String autoMarke;
	
	

	
	public Auto(String reifenMarke, String reifenTyp, String autoMarke) {
		reifen = new Reifen(reifenMarke, reifenTyp);
		this.autoMarke = autoMarke;
	}
	
	public void ausgeben() {
		System.out.println(reifen.reifenMarke + reifen.reifenTyp + this.autoMarke);
	}
	
	
}
