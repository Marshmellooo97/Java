import java.util.* ;

interface BaseInterface {

  void f() ;

}

public class Main extends BaseInterface {

  @Override
  void f() {
    System.out.println("XXX") ;
  }

  public static void main(String[] args) {
    BaseInterface ref = new Main() ;
    ref.f() ;    
  }
}
