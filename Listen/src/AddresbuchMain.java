import java.util.ArrayList;
import java.util.Scanner;

public class AddresbuchMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Adresse peterAdresse = new Adresse("Peter", "Strpeter", "Berlin");
		Adresse hansAdresse = new Adresse("Hans", "StrHans", "Leipzig");
		Adresse michalAdresse = new Adresse("Michael", "StrMichael", "Hamburg");
		
		// Datenstrucktur erstellen
		ArrayList<Adresse> adressliste = new ArrayList<Adresse>();
		Adresse [] adressArray = {peterAdresse, hansAdresse, michalAdresse};
		
		
		// Eingabe
		adressliste.add(peterAdresse);
		adressliste.add(hansAdresse);
		adressliste.add(michalAdresse);
		
		// Neue Daten einlesen
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		String straße = scanner.nextLine();
		String stadt = scanner.nextLine();
		
		Adresse adresse4 = new Adresse(name, straße, stadt);
		adressliste.add(adresse4);
		
		// Ausgabe
		for (Adresse adresse : adressliste) {
			System.out.println("Name: "+ adresse.getName()+ " Straße: " + adresse.getStraße()+ " Stadt: "+ adresse.getStadt());
		}
		for (Adresse adresse : adressArray) {
			System.out.println("Name: "+ adresse.getName()+ " Straße: " + adresse.getStraße()+ " Stadt: "+ adresse.getStadt());
		}
		
		
		
	}

}
