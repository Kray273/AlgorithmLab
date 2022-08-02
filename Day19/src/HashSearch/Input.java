package HashSearch;

public class Input {
	
	public static int[] Inputs(int[] arrD, int[] arrH){
	
	for (int i = 0; i < arrD.length; i++) {
		int k = arrD[i] % 11;

		while (true) {
			if (arrH[k] != 0) {
				k = (k + 1) % 11;
			} else {
				arrH[k] = arrD[i];
				break;
			}
		}
	}
	return arrH;
 }
}
