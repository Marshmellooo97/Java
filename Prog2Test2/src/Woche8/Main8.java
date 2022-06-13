package Woche8;

public class Main8 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		   TestClass i1 = new TestClass(1) ;
		   TestClass i2 = new TestClass(2) ;
		   TestClass i3 = new TestClass(3) ;
		   TestClass i4 = new TestClass(-1) ;
		   i4 = new TestClass(1) ;
		   i4 = new TestClass(2) ;
		   System.out.println(TestClass.x) ;
			}
	
	
	public static class TestClass {
		static int x = 5;
		 public TestClass(int val) {
		    TestClass.x *= val ;
		 }

	}
}
