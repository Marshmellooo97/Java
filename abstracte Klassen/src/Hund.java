
public class Hund extends Tiere{

	
	int zaehne;
	
	public Hund(String name, int groeﬂe , int gewicht, int zaehne) {
		super(name, groeﬂe, gewicht);
		this.zaehne = zaehne;
	}
	
	public void bellen() {
		
	}

	@Override
	public void essen() {
		System.out.println("Hund isst");
	}

	@Override
	public void atmen() {
		// TODO Auto-generated method stub
		System.out.println("Der Hund atmet");
	}
	
	
	
	
	
}

