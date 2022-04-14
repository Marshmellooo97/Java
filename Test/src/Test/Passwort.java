package Test;


public class Passwort {

	String name;
	int passwort;
	
	public Passwort(String name, int passwort) {
		super();
		this.name = name;
		this.passwort = passwort;
	}
	
	public void test() {
		System.out.println(this.passwort);
	}
	
	public int testInt(int test) {
		return test;
	}
}
