package q10811b;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] ar = new int[n];
		
		for(int b=0;b<n;b++) {
			ar[b] = b+1;
		}
		
		for(int a =0;a<m;a++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int tmp =0;
			for(;j>=i;j--,i++) {
				tmp =ar[j-1];
				ar[j-1] = ar[i-1];
				ar[i-1] = tmp;
			}
		}
		
//		System.out.println(Arrays.toString(ar));
		
		for(int i =0;i<n;i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
