package q10952;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int i= sc.nextInt();
			int i2= sc.nextInt();
			if(i==0&i2==0) {
				break;
			}
			int sum = i+i2;
			System.out.println(sum);
		}
	}

}
