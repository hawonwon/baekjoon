package q2439star2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int cnt = n-1;
		for (int i = 0; i < n; i++) {
			for(int y=0; y<cnt; y++) {
				System.out.print(" ");
				
				}
			cnt--;
			for (int x = 0; x <= i; x++) {
				System.out.print("*");
			}
			System.out.printf("\n");
		}
	

	}

}
