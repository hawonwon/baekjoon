package q10828;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class Number{
	
	private Stack<Integer> bnum; 
	
	public Number() {
		// TODO Auto-generated constructor stub
		bnum = new Stack<Integer>();
	}
	
	public void push(int x) {
		
		bnum.push(new Integer(x));
	}
	public void top() {
		if(bnum.isEmpty()) {
			System.out.println("-1");
		}else {
			System.out.println(bnum.peek());
		}
		
	}

	public int size() {
		// TODO Auto-generated method stub
		return bnum.size();
	}
	
	public void pop() {
		
		
		if(bnum.isEmpty()) {
			System.out.println("-1");
		}else {
			
			
			System.out.println(bnum.pop());
		}
		
	}
	public int empty() {
		if(bnum.isEmpty()) {
			return 1;
		}else {
			return 0;
		}
		
	}
	
}


public class Main {
	public static void main(String[] args) throws IOException{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
	

;
		Number box = new Number();
//		Stack<Integer> box = new Stack<Integer>();
		for(int i =0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			String x = st.nextToken();
			
			if(x.equals("push")) {
				int ix = Integer.parseInt(st.nextToken());
				box.push(ix);
			}else if (x.equals("top")) {
				box.top();
			}else if (x.equals("size")) {
				System.out.println(box.size());
				
			}else if(x.equals("pop")) {
				box.pop();
			}else if(x.equals("empty")) {
				System.out.println(box.empty());
			}
			
			
			
		}
//		for(int i =0;i<n;i++) {
//			String x = sc.next();
//			if(x.equals("push")) {
//				int ix = sc.nextInt();
//				box.push(ix);
//			}else if (x.equals("top")) {
//				box.top();
//			}else if (x.equals("size")) {
//				System.out.println(box.size());
//				
//			}else if(x.equals("pop")) {
//				box.pop();
//			}else if(x.equals("empty")) {
//				System.out.println(box.empty());
//			}
//			
//			
//			
//		}
		
	}
}
