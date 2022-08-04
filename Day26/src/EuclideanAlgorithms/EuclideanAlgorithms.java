package EuclideanAlgorithms;

import java.util.*;
public class EuclideanAlgorithms {

	public static void main(String[] args) {
		System.out.print("a를 입력하세요: ");
		Scanner no = new Scanner(System.in);
		int a = no.nextInt();
		System.out.print("b를 입력하세요: ");
		int b = no.nextInt();
		int r = 0;
		
		do{
			r = a % b;
			a = b;
			b = r;
		} while (r !=0);
		System.out.printf("a와 b의 최대공약수는 %d입니다.", a);
	}
}
