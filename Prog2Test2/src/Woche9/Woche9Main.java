package Woche9;

import java.util.ArrayList;

public class Woche9Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> x2 = new ArrayList<Double>();
		x2.add(1.0);
		x2.add(2.0);
		x2.add(-3.0);
		ArrayList<Double> m2 = new ArrayList<Double>();
		m2.add(1.0);
		m2.add(1.0);
		m2.add(0.0);
		System.out.println(iteratorMaskSum(x2, m2));
		
		ArrayList<Double> x3 = new ArrayList<Double>();
		x3.add(1.0);
		x3.add(2.0);
		x3.add(-3.0);
		System.out.println(iteratorSquareSum(x3));
		ArrayList<Double> x1 = new ArrayList<Double>();
		x1.add(1.0);
		x1.add(2.0);
		x1.add(2.0);
		System.out.println(iteratorSum(x1));

	}
	
	  public static double iteratorMaskSum(ArrayList<Double> x, ArrayList<Double> mask) {
		  double erg = 0.0;
		  for (int i = 0; i < x.size(); i++) {
			  if(mask.get(i) != 0) {
				  erg += x.get(i);}
		}  
		return erg;
	  }
	  public static double iteratorSquareSum(ArrayList<Double> x) {
		  double erg = 0.0;
		  for (Double double1 : x) {
			  erg += double1 * double1;}
		  return erg;
	  }
	  public static double iteratorSum(ArrayList<Double> x) {
		  double erg = 0.0;
		  for (Double double1 : x) {
			  erg += double1 ;}
		  return erg;
		}
		   
	  

}
