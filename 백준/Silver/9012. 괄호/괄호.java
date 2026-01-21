import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for(int i =0; i<T; i++) {
			String line = br.readLine();
			Stack<Character> stack = new Stack<>();
			boolean is = true;
			for(int j = 0; j<line.length();j++) {
				
				char ch = line.charAt(j);
				if(ch=='(') {
					stack.push(ch);
				}
				else if(ch==')') {
					if(stack.isEmpty() || stack.pop()!='(') {
						is = false;
						break;
					}
				}
			}
			if(!stack.isEmpty()) {
				is = false;
			}
			bw.write(is ? "YES\n" : "NO\n");
			bw.flush();
		}
	}
}