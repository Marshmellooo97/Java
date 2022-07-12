package UnterOberklasse;

class Ober{
public Ober(){
		
	}
	public Ober(int x){
		
	}
	public void ober() {
		System.out.println("Ober");
	}
}

class Unter extends Ober{
	
	@Override
	public void ober() {
		System.out.println("Unter");
	}
}



public class UnterOberMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ober o = new Ober();
		o.ober();
		Ober o2 = new Unter();
		o2.ober();
	}

}
