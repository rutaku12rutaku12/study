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

		while(true) {
			String line = br.readLine();
			if(line.equals(".")) {
				break;
			}
			Stack<Character> stack = new Stack<>();
			boolean is = true;

			for(int i =0; i< line.length();i++) {
				char ch = line.charAt(i);
				if(ch == '(' || ch == '[') {
					stack.push(ch);
				}
				else if(ch==')' ) {
					if(stack.isEmpty() || stack.pop()!='(') {
						is=false;
						break;
					}
				}
				else if(ch==']') {
					if(stack.isEmpty() || stack.pop()!='[') {
						is=false;
						break;
					}
				}
				
			}
			if(!stack.isEmpty()) is =false;
			bw.write(is ? "yes\n" : "no\n");
		}
		bw.flush();
		bw.close();
	}
}