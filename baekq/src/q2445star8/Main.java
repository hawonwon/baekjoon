package q2445star8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			for(int k=n*2-i-i;k>0;k--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i =n-1;i>0;i--) {
			for(int j =i;j>0;j--) {
				System.out.print("*");
			}
			for(int k =0;k<n*2-i-i;k++) {
				System.out.print(" ");
			}
			for(int j =i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
