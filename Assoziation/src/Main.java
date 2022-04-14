
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Computer pc1 = new Computer();
		
		Mainboard board = new Mainboard(4, 1, 10);
		
		Computer pc2 = new Computer("Intel", board, 500);
		
		
		Auto c63 = new Auto("Conti", "Winter", "Mercedes");
		c63.ausgeben();
		
		
	}

}
