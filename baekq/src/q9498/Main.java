package q9498;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
//		
//		if (i >= 90 && i <=100) {
//			System.out.println("A");
//		}else if (i >= 80 && i <=89) {
//			System.out.println("B");
//		}else if (i >= 70 && i <=79) {
//			System.out.println("C");
//		}else if (i >= 60 && i <=69) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
//		
		
		
		switch (i/10) {
		case 10 :
			System.out.println("A");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default :
			System.out.println("F");
			break;
		
	
		}
	}

}
