package KlausurTest;


interface ArrayProcessor {
	public boolean checkArray(int[] arr);
	public void displayArray(int[] arr);
}


class Trial implements ArrayProcessor{
	public boolean checkArray(int[] arr) {
		for (int i : arr) {
			if(i>=10) {
				return false;
			}
		}return true;
	}
	public void displayArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+":"+arr[i]+"--");
		}
	}

}

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {0};
		int[] arr2 = {1,2,6,16};
		
		Trial tesTrial = new Trial();
		;
		System.out.println(tesTrial.checkArray(arr));
		tesTrial.displayArray(arr2);
		
	}

}
