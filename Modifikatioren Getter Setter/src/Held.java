
public class Held {

	
	public String name;
	private int lebenpunkte ;
	
	
	public Held(String name, int lebenpunkte) {
		if (lebenpunkte<= 100 && lebenpunkte >0) {
			this.lebenpunkte = lebenpunkte;
		}
		this.name = name;
	
	}
	
	public void getLebenspunkte() {
		System.out.println(this.lebenpunkte);
	}
	
	public void setLebenspunkte(int lebenspunkte) {
		this.lebenpunkte = lebenspunkte;
	}
	
	public void setLebenspunkteSchaden(int schaden) {
		this.lebenpunkte -= schaden;
	}
	
	
	
	
	
	
	
}
