package Woche6;
import java.util.*;

public class MainWoche6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Bla");
		
		ArrayList<Integer> arg3 = new ArrayList<Integer>(Arrays.asList(new Integer[] { 1, 2, 3 }));
		System.out.println(replaceInArrayList(arg3, 2, -10));
		ArrayList<Integer> arg4 = new ArrayList<Integer>(Arrays.asList(new Integer[] { 1, 2, 3 }));
		printArrayList(arg4);
		ArrayList<Double> arg1 = new ArrayList<Double>(Arrays.asList(new Double[] { 1., 2., 3. }));
		printSumOfSquares(arg1);
		ArrayList<Double> arg2 = new ArrayList<Double>(Arrays.asList(new Double[] { 1., 2., 3. }));
		System.out.println(calcSumOfSquares(arg2));
		ArrayList<Integer> arg5 = new ArrayList<Integer>(Arrays.asList(new Integer[] { 2 }));
		System.out.println(insertElementsAt0(arg5, 1, 3));
		ArrayList<Double> arg6 = new ArrayList<Double>(Arrays.asList(new Double[] { 1., 2., 3. }));
		System.out.println(reduceOp(arg6));
		LinkedList<Double> arg7 = new LinkedList<Double>(Arrays.asList(new Double[] { 1., 2., 3. }));
		System.out.println(reduceOp2(arg7));
		
	}

	public static ArrayList<Integer> replaceInArrayList(ArrayList<Integer> arr, Integer toFind, Integer replacement){
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i) == toFind) {
				arr.set(i, replacement);
			}
		}
		return arr;
	}
	
	public static void printArrayList(ArrayList<Integer> arr){
		String test = "";
		for (Integer integer : arr) {
			test = test + integer;
		}
		System.out.println(test);
	}
	public static void printSumOfSquares(ArrayList<Double> x){
		double erg = 0;
		for (Double double1 : x) {
			erg = erg + double1*double1;
		}
		System.out.println(erg);
	}
	public static double calcSumOfSquares(ArrayList<Double> x){
		double erg = 0;
		for (Double double1 : x) {
			erg = erg + double1*double1;
		}
		return erg;
	}
	public static ArrayList<Integer> insertElementsAt0(ArrayList<Integer> l, Integer el, int n){
		for (int i = 0; i < n; i++) {
			l.add(0, el);
		}
		return l;
	}
	public static double reduceOp(ArrayList<Double> x){
		double erg = 0;
		if(x.size() == 0) {
			return 0.0;
		}
		for (int i = 1; i < x.size(); i++) {
			erg = erg + x.get(i-1) * x.get(i);
		}
		erg = erg + x.get(0);
		return erg;
	}
	
	public static double reduceOp2(LinkedList<Double> x){
		double erg = 0;
		if(x.size() == 0) {
			return 0.0;
		}
		for (Double double1 : x) {
			if(erg < Math.abs(double1)) {
				erg = Math.abs(double1);
			}
			
		}
		return erg;
	}
	public static LinkedList<Integer> replaceInLinkedList(LinkedList<Integer> arr, Integer toFind, Integer replacement){
		if(arr.size() == 0) {
			return arr;
		}
		if(arr.indexOf(toFind) == -1) {
			return arr;
		}
		arr.set(arr.indexOf(toFind), replacement) ;
		return arr;
		    
		}
	
	
	
}
