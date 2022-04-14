
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Held player1 = new Held("Held", 100);
		player1.getLebenspunkte();
		
		player1.setLebenspunkte(90);
		player1.getLebenspunkte();
		player1.setLebenspunkteSchaden(20);
		player1.getLebenspunkte();
		
		//_______________________________________
		
		Google peter = new Google("Max Müller", "1234");
		System.out.println(peter.getPasswort());
		peter.setPasswort("1234", "55555555");
		System.out.println(peter.getPasswort());
		//peter.setPasswort("3333");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
