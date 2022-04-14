package Test;

public class Ver extends Passwort{

	int vererbung;

	public Ver(int vererbung, String name, int passwort) {
		super(name, passwort);
		this.vererbung = vererbung;
	}
	public void testVererbung() {
		System.out.println(this.vererbung + name + passwort);
	}
}

