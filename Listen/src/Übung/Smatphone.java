package Übung;

import java.util.ArrayList;
import java.util.List;

public class Smatphone {

	private List<Kontakt> meineKontakte;

	
	public Smatphone() {
		meineKontakte = new ArrayList<Kontakt>();
	}
	
	public boolean addKontakt(Kontakt neuerkontakt) {
		for (Kontakt kontaktInListe : meineKontakte) {
			if(neuerkontakt.getName().equals(kontaktInListe.getName())) {
				System.out.println("Kontakt bereits vorhanden");
			return false;
			}
		}
		meineKontakte.add(neuerkontakt);
		System.out.println("Kontakt wurde hinzugefügt");
		return true;
	}
	
	public boolean findKontakt(String name) {
		for (Kontakt kontaktInListe : meineKontakte) {
			if(name.equals(kontaktInListe.getName())) {
				System.out.println("Gefunden -> Name: " + kontaktInListe.getName() + " Tel: " + kontaktInListe.getNummer());
				return true;
			}	
		}
		System.out.println("Nicht gefunden");
		return false;

	}
	public void ausgabe() {
		for (Kontakt kontaktInListe : meineKontakte) {
			System.out.println("Name: " + kontaktInListe.getName() + " Nummer: " + kontaktInListe.getNummer() );
		}
	}
	
	
	
	
	
	
	
	
}

