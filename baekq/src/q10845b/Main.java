package q10845b;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
//import java.util.Stack;
import java.util.StringTokenizer;

class Quu {
	private Queue<Integer> ar;

	public Quu() {
		// TODO Auto-generated constructor stub
		ar = new  LinkedList<>();
	}

	public void push(int x) {

		ar.add(x);

	}

	public void front() {
		if (ar.isEmpty()) {
			System.out.println("-1");
		} else {
			System.out.println(ar.peek());
		}

	}

	public void back() {
		if (ar.isEmpty()) {
			System.out.println("-1");
		} else {
			Object[] q1 = ar.toArray();
			System.out.println(q1[q1.length-1]);
		}
	}

	public int size() {
		// TODO Auto-generated method stub
		return ar.size();
	}

	public void pop() {

		if (ar.size() == 0) {
			System.out.println("-1");
		} else {

			System.out.println(ar.peek());
			ar.poll();
		}

	}

	public int empty() {
		if (ar.isEmpty()) {
			return 1;
		} else {
			return 0;
		}

	}

}

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		Quu box = new Quu();
		int n = Integer.parseInt(st.nextToken());
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			String x = st.nextToken();

			if (x.equals("push")) {
				int ix = Integer.parseInt(st.nextToken());
				box.push(ix);
			} else if (x.equals("front")) {
				box.front();
			} else if (x.equals("back")) {
				box.back();

			} else if (x.equals("size")) {
				System.out.println(box.size());

			} else if (x.equals("pop")) {
				box.pop();
			} else if (x.equals("empty")) {
				System.out.println(box.empty());
			}
		}

	}
}
