package Exceptions;

import java.util.* ;
public class Exceptions {
 static void tryout(int x) {
   try{
     System.out.print("0") ;
     int z = 10/x ;
     System.out.print("1") ;
   } catch(ArithmeticException e) {
     System.out.print("2") ;
     return ;
   } catch(NullPointerException e) {
     System.out.print("3") ;
     return ;
   } catch(Exception f) {
     System.out.print("4") ;
     
   }
   finally {
		System.out.println("jhasjf");
	}
   System.out.print("5") ;
 }
 public static void main(String[] args) {
   tryout(0) ;
 }
}
