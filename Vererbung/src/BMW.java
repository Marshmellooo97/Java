
public class BMW extends Auto{

	
	boolean xDrive;
	
	
	
	public BMW(boolean xDrive, int ps, int tuerenAnzahl, String fahrzeugTyp) {
		super("BMW", ps, tuerenAnzahl, fahrzeugTyp);
		this.xDrive = xDrive;
		
	}



	@Override
	public void starten() {
		super.starten();
		System.out.println("BMW Statet");
	}

	
	
	
	
	
	
}
