package Day19_1;

public class HashInput2 {

	public static void main(String[] args) {
		int[] arrD = {12, 25,36,20,30,8,42};
		int[] arrH = new int[11];
		
		for (int i = 0; i < arrD.length; i++) {
			int k = arrD[i] % 11;
			
			while(true) {
				if(arrH[k] == 0) {
					arrH[k] = arrD[i];
					break;
				} else {
					k = (k+1) % 11;
			}
			}
		}
		for (int i = 0; i < arrH.length; i++) {
			System.out.println(arrH);
		}
	}
}
