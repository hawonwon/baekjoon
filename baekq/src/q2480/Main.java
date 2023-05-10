package q2480;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] dice = new int[3];
		int max =0;
		for(int i =0;i<dice.length;i++) {
			dice[i] = sc.nextInt();
			if(dice[i]>=max) {
				max = dice[i];
			}
			
		}
		if(dice[0]==dice[1]|dice[0]==dice[2]) {
			if(dice[1]==dice[2]) {
				System.out.println(10000+dice[0]*1000);
			}else {
				System.out.println(1000+dice[0]*100);
			}
		}else if(dice[1]==dice[2]) {
			System.out.println(1000+dice[1]*100);
		}else {
			System.out.println(max*100);
		}
		
	}

}

//		|dice[0]==dice[2]|dice[1]==dice[2]
		
		
		
		
		
		
		
		
//		int d = sc.nextInt();
//		int d2 = sc.nextInt();
//		int d3 = sc.nextInt();
//		int p1 = 10000+d*1000;
//		
		
		
		
//		if(d==d2&d2==d3) {
//			System.out.println(p1);
//		}
//		else if(d==d2||d2==d3||d==d3) {
//			if(d==d2) {
//				int p2 = 1000+d*100;
//				System.out.println(p2);
//			}else {
//				int p2b = 1000+d2*100;
//				System.out.println(p2b);
//			}
//		}else {
//			int x = 0;
//			while(true) {
//				if(d>x) {
//					x=d;
//				}
//			}
//		}
		
		
