package q3052b;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int[] ar = new int[10];

		for (int i = 0; i < 10; i++) {
			int n = sc.nextInt();
			ar[i] = n % 42;

		}

		int cnt = 1;

		for (int i = 0; i < 10; i++) {
			int c = 0;
			for (int j = i + 1; j < 10; j++) {
				if (ar[i] == ar[j]) {
					c++;
				}
				if (j == 9) {
					if (c == 0) {
						cnt++;
					}
				}

			}
		}
		System.out.println(cnt);
	

	}

}
