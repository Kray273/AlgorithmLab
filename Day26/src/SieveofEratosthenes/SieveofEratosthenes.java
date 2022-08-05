package SieveofEratosthenes;

import java.util.*;

public class SieveofEratosthenes {

	public static void main(String[] args) {
		// 101개의 배열을 생성하고 0으로 시작
		int[] arr = new int[101];
		System.out.println(Arrays.toString(arr));
		
//		for ( int i = 1; i < arr.length; i++) {
//			arr[i] = 1;
//		} //반복구조를 통해 arr를 1로 초기화 
		
//		Arrays.fill(arr,1); //for문을 사용하지 않고 1로 초기화

		
		//소수를 제외하고 1을 대입
		//for문
//		for (int k = 2; k*k <= arr.length-1; k++) {
//			if(arr[k] == 0) {
//				for (int i = k; i <= (arr.length-1)/k; i++) {
//					if(arr[i] <= (arr.length-1)/k) {
//					arr[k*i] = 1;					
//					}
//				}
//			}
//		}
		
		//while문
		int k = 2;
		while(k*k < arr.length-1) {
			if(arr[k] == 0) {
				int i = k;
				while(i <= (arr.length-1) / k) {
					arr[k*i] = 1;
					i++;
				}
			}
			k++;
		}
		System.out.println(Arrays.toString(arr));
		
		//소수를 출력(0을 출력) 
		int count = 0;
		for (int i = 2; i < arr.length-1; i++) {
			if(arr[i] == 0) {
				System.out.print(i+", ");
				count++;
			}
		}
		System.out.println();
		System.out.println("소수의 수 : "+count);
	}
}
