package q2000.q2941;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String  c = sc.next();
		int cl = c.length();
		
		int cnt =0;
		for(int i= cl-1;i>0;i--) {
			if(c.charAt(i)=='='|
			   c.charAt(i)=='-') {
				cnt++;
				if(i>1) {
					if(c.charAt(i-1)=='z'&c.charAt(i-2)=='d') {
					cl--;
				}
				}
				
			}
			if( c.charAt(i)=='j'&
				(c.charAt(i-1)=='l'|
				c.charAt(i-1)=='n')) {
				cnt++;
			}
		}
		cnt = cl - cnt;
		System.out.println(cnt);
		
	}

}
