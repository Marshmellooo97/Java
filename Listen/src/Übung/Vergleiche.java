package Übung;

public class Vergleiche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Smatphone iphone6 = new Smatphone();
		
		iphone6.addKontakt(Kontakt.erelleKontakt("Christian", "1234"));
		iphone6.addKontakt(Kontakt.erelleKontakt("Peter", "2222"));
		iphone6.addKontakt(Kontakt.erelleKontakt("Hans", "3333"));
		iphone6.addKontakt(Kontakt.erelleKontakt("Hans", "3333"));
		iphone6.ausgabe();
		
		
		iphone6.findKontakt("Hans");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/* String name = "Christian";
		String name2 = "Peter";
		
		// Stringsvergleichen 
		if(name.equals(name2)) {
			System.out.println("Passt");
		}else {
			System.out.println("Passt nicht");
		}
		*/
		
		
		
		
		
		
	}
	

}
