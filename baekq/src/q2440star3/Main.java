package q2440star3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = n;
		for(int i=0;i<n;i++) {
			for(int i2 =c;i2>0;i2--) {
				System.out.print("*");
				
			}
			c--;
			System.out.println();
		}
	}

}
