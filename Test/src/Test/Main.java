package Test;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Hallo das ist ein Test");
		
		Passwort nameJustin = new Passwort("Justin", 1234);
		
		nameJustin.test();
		System.out.println("Funktion " + nameJustin.testInt(10)); 
		
		Ver nameVer = new Ver(555, "justin", 1234);
		nameVer.testVererbung();
		
		
		
	}

}
