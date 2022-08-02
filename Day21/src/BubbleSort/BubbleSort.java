package BubbleSort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,3,4,1,2};
		int k, i = 0;
		System.out.print("정렬 전:");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(" "+arr[j]);
		}
		System.out.println();
		
		for (k = 0; k < arr.length; k++) {
			for(i=4; i > k; i--) {
				if(arr[i-1] > arr[i]){
//					int t = 0;
					int t = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = t;
				}
			}
			for(int h : arr) {
				System.out.print(h+" ");
			}System.out.println();
		}
		System.out.print("정렬 후 :");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}
}
