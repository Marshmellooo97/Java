
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Test");
		
		int[] arr = {1,2,3,7,5};
		
		System.out.println(sort(arr));
		int[] unsortiert = { 4, 1, 8, -3, 5, 7 };
		int[] sortiert = selectionsort(unsortiert);

		for (int i = 0; i < sortiert.length; i++) {
			System.out.print(sortiert[i] + ", ");
		
		}
	}
	
	public static int[] sort(int[] a) {
		int caschG;
		int caschK;
		int first = a[0];
		for (int i = 1; i < a.length; i++) {
			if(first > a[i]) {
				caschK = a[i];
				caschG = a[i-1];
				a[i] = caschG;
				a[i-1] = caschK;
				
			}
			first = a[i];
			
		}
		
		return a;
	}
	
	
	public static int[] selectionsort(int[] sortieren) {
		for (int i = 0; i < sortieren.length - 1; i++) {
			for (int j = i + 1; j < sortieren.length; j++) {
				if (sortieren[i] > sortieren[j]) {
					int temp = sortieren[i];
					sortieren[i] = sortieren[j];
					sortieren[j] = temp;
				}
			}
		}

		return sortieren;
	}
	

}
