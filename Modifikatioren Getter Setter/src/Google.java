import java.util.Scanner;

public class Google {

	
	private String benutzerName;
	private String passwort;
	String passwortAlt;
	String passwortNeu;
	
	public Google(String benutzerName, String passwort) {
		super();
		this.benutzerName = benutzerName;
		this.passwort = passwort;
	}

	public String getPasswort() {
		return passwort;
	}

	// Möglichkeit eins 
	public void setPasswort(String passwortalt, String passwortneu) {
		this.passwortNeu = passwortneu;
		this.passwortAlt = passwortalt;
		if ( this.passwort == this.passwortAlt) {
			this.passwort = this.passwortNeu;
		}
	}
	
	// Möglichkeit zwei
	public void setPasswort(String passwort) {
		if (passwort.equals(this.passwort)) {
			System.out.println("Passwort richtig");
			Scanner scan = new Scanner(System.in);
			String newPasswort = scan.nextLine();
			this.passwort = newPasswort;
			System.out.println("Passwort geändert in " + this.passwort);
		}else {
			System.out.println("Passwort kann nicht geändert werden");
		}
	}
	
	
	
	
	

	public String getBenutzerName() {
		return benutzerName;
	}

	public void setBenutzerName(String benutzerName) {
		this.benutzerName = benutzerName;
	}
	
	
	
	
	
}
