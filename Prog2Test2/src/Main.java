import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		/*
		System.out.println(hat222(20220));
		System.out.println(hatHoechstens(3332, 1));
		System.out.println(hatKein222(333));
		*/
		System.out.println(linkeQuersummeN(1234, 2));
		System.out.println(pruefsumme(new int[] { 10, 10, 11 }, 5));
		System.out.println("Quersumme");
		System.out.println(quersumme(333));
		System.out.println(quersummeN(333, 2));
		System.out.println(sumOfMatrix(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } }));
		System.out.println(Arrays.deepToString(modelExample(new double[][] { { 1., 1., 1. }, { 2., 2., 2. }, { 3., 3., 3. } })));
		
		double[][] arr = new double[1][1];
		arr[0][0] = 1.0;
		System.out.println(arr);
		
		
		
	}
	/*
	public static boolean hat222(int x) {
		int count = 0;
		while (x != 0) {
			if(x%10 == 2) {count++;
			}else{count = 0;}
			x = x/10;
			if(count == 3) {return true;}
		}
		return false;
	}
	
	public static boolean hatHoechstens(int x, int n) {
		int count = 0;
		while (x != 0) {
			if(x%10 == 2) {count++;
			}else{count = 0;}
			x = x/10;
			if(count <= n) {return true;}
		}
		return false;
	}
	
	public static boolean hatKein222(int x) {
		int count = 0;
		while (x != 0) {
			if(x%10 == 2) {count++;
			}else{count = 0;}
			x = x/10;
			if(count == 3) {return true;}
		}
		return false;
	}

	public static boolean hatMindestens(int x, int n) {
		int count = 0;
		while (x != 0) {
			if(x%10 == 2) {count++;
			}else{count = 0;}
			x = x/10;
			if(count == 3) {return true;}
		}
		return false;
	}
	
	*/
	public static int linkeQuersummeN(int x, int N){
		ArrayList<Integer> zahlen = new ArrayList<Integer>();
		int count = 0;
		int erg = 0;
		while (x != 0) {
			zahlen.add(x%10);
			x = x/10;
		}
		for (int i = 0; i < N; i++) {
			erg = erg + zahlen.get(zahlen.size() - i -1);
		}
		return erg;
	}

	
	
	public static int pruefsumme(int[] x, int mod) {
		int erg = 0;
		for (int i : x) {
			erg = erg + i;
		}
		erg = erg % mod;
		return erg;
	}
	
	public static int quersumme(int x){
		int erg = 0;
		while (x != 0) {
			erg = erg + x%10;
			x = x/10;
		}
		return erg;
	}
	
	
	public static int quersummeN(int x, int N){
		int erg = 0;
		int count = 0;
		while (x != 0 && count != N) {
			erg = erg + x%10;
			x = x/10;
			count++;
		}
		return erg;
	}
	
	public static double sumOfMatrix(double[][] x){
		double erg = 0;
		for (double[] subArray : x) {
			for (double number : subArray) {
				erg = erg + number;
			}
		}
		return erg;
	}
	
	public static double[][] modelExample(double[][] x){
		double erg = 0;
		double[][] ergArr = new double[x.length][1];
		int i = 0;
		for (double[] subArray : x) {
			for (double number : subArray) {
				erg = erg + number;
			}
			
			ergArr[i][0] = erg;
			erg = 0;
			i++;
		}
		return ergArr;
	}
	
	// Test
	//Test 3
	// Test4
	// Test 5
	// Test 6
	
	public static int linkeQuersummeN2(int x, int N) 
	{
	        java.util.ArrayList<Integer> zahlen = new java.util.ArrayList<Integer>();
			int count = 0;
			int erg = 0;
			
			while (x != 0) {
				zahlen.add(x%10);
				x = x/10;
				if (x < 0){
			    return 0;}
			}
			if (N > zahlen.size()){
			    N = zahlen.size();
			}
			for (int i = 0; i < N; i++) {
				erg = erg + zahlen.get(zahlen.size() - i -1);
			}
			
			
			return erg;
	}

	
	
	
}
