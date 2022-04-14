
public abstract class Tiere {

	
	String name;
	int groeﬂe;
	int gewicht;
	
	public Tiere() {
		
	}
	public Tiere(String name, int groeﬂe, int gewicht) {
		this.name = name;
		this.groeﬂe = groeﬂe;
		this.gewicht = gewicht;
	}
	
	public abstract void essen();
	
	public abstract void atmen();
	
	public String getName() {
		return name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
