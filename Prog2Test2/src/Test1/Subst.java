package Test1;

class ParentClass {
  String attr;

  public ParentClass(String x) {
    this.attr = x;
  }
}


public class Subst extends ParentClass {
	
	
  public Subst(String x) {
    super(x);
  }

  
  public static void main(String[] args) {
    Subst ref1 = new Subst("");
    Subst ref2 = new Subst("ref2");
    ParentClass ref3 = (ParentClass) new Object();
  }
}
