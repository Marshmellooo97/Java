
public class Audi extends Auto {

	
	boolean quattro;
	
	
	public Audi(boolean quattro , int ps, int tuerenAnzahl, String fahrzeugTyp) {
		super("Audi", ps, tuerenAnzahl, fahrzeugTyp);
		this.quattro = quattro;
		
	}


	@Override
	public void starten() {
		// TODO Auto-generated method stub
		super.starten();
		System.out.println("Audi Startet");
	}

	
	
	
	
	
	
}
