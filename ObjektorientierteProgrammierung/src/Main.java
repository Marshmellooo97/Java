
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Auto bmw = new Auto();
		bmw.marke = "BMW";
		bmw.preis = 5000;
		bmw.reifen = 4;
		
		Auto audi = new Auto(4, 5000, "Audi");
		
		audi.gasgeben();
		audi.vergleichePreis(6000);
		
		Hund bello = new Hund(5, "Bello", "Labi");
		bello.bellen();
		
		Auto.ausgabe();
	}

}
