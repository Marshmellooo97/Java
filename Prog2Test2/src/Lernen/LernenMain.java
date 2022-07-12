package Lernen;

import java.util.ArrayList;
import java.util.Arrays;

public class LernenMain {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Integer> arg4 = new ArrayList<Integer>(Arrays.asList(new Integer[] { 1, 2, 3 }));
		System.out.println(replaceInArrayList(arg4, 2, -10));
		
		
		
		
	}
	
	public static ArrayList<Integer> replaceInArrayList(ArrayList<Integer> arr, Integer toFind, Integer replacement){
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i) == toFind) {
				arr.set(i, replacement);
			}
			
		}
		
		return arr;
	}
}


