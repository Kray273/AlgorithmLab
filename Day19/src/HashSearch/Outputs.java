package HashSearch;

import java.util.*;
import HashSearch.Input;

public class Outputs {

	public static void main(String[] args) {
		int[] arrD = { 12, 25, 36, 20, 30, 8, 42 };
		int[] arrH = new int[11];
		
		Input ip = new Input();
		int[] arr = ip.Inputs(arrD,arrH);
		System.out.println(Arrays.toString(arr));
		
		System.out.println();
		
		int x = 8;
		int k = x;
		k = k % 11;

		while (arrH[k] != 0) {
			if (arrH[k] == x) {
				System.out.println(x + "의 저장 위치는 " + k + "번째 입니다.");
				break;
			}
			else {
				k = (k + 1) % 11;
			}
		}
		if (arrH[k] == 0) {
			System.out.println(x + "값은 존재하지 않습니다.");
		}
	}
}
