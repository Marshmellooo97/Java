package Woche9;

import java.util.ArrayList;
import java.util.Iterator;

public class Woche9Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> x2 = new ArrayList<Double>();
		x2.add(1.0);
		x2.add(2.0);
		x2.add(-3.0);
		ArrayList<Double> m2 = new ArrayList<Double>();
		m2.add(0.0);
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
		  Iterator<Double> it2 = x.iterator();
		  for (Iterator<Double> it = mask.iterator() ; it.hasNext() ; ) {
			  if(it.next() != 0) {
				  erg += it2.next();
			  }else {
				  it2.next();
			  }
		}  
		return erg;
	  }
	  public static double iteratorSquareSum(ArrayList<Double> x) {
		  double erg = 0.0;
		  for (Iterator<Double> it = x.iterator() ; it.hasNext() ; ) {
			  
			  erg += Math.pow(it.next(), 2);}
		  return erg;
	  }
	  public static double iteratorSum(ArrayList<Double> x) {
		  double erg = 0.0;
		  for (Iterator<Double> it = x.iterator() ; it.hasNext() ; ) {
			  erg += it.next() ;}
		  return erg;
		  
		}
	public static  double iteratorThresholdSum(ArrayList<Double> x) {
		double erg = 0.0;
		double tmp = 0.0;
		for (Iterator<Double> it = x.iterator() ; it.hasNext() ; ) {
			tmp = it.next();
			if (tmp >= 0) {
				erg += tmp;
			}
		}
			
		
		return erg;
	  }   
	  

}
