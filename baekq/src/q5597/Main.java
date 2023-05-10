package q5597;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] s = new int[28];
		int[] c = new int[30];
		for(int i=0;i<28;i++) {
			s[i] = sc.nextInt();
			c[s[i]-1] = s[i];
		}
		
		int n = 0;
		while(true){
			if(c[n]!=0) {
				if(n==29) {
					break;
				}
				n++;
			}else if(c[n]==0) {
				System.out.println(n+1);
				if(n==29) {
					break;
				}
				n++;
				
			}
		}
	}
}
