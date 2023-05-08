package q2438star1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n;i++) {
			for(int i2=0;i2<=i;i2++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
