package d1;

import java.util.Arrays;
import java.util.Scanner;

public class D1_2029_몫과나머지출력하기 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int[] a = new int[t];
		int[] b = new int[t];
		
		for(int i = 0; i < t ; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		for(int i = 0; i < t; i++) {
			System.out.println("#" + (i+1) + " " + a[i]/b[i] + " " + a[i]%b[i]);
		}
	}
}
