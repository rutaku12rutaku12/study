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

		
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<N; i++) {
			String prom = br.readLine();
			if(prom.contains("push")) {
				StringTokenizer st = new StringTokenizer(prom);
				String push = st.nextToken();
				int num = Integer.parseInt(st.nextToken());
				stack.push(num);
			}
			else if(prom.contains("top")) {
				if(stack.isEmpty()) {
					bw.write("-1\n");
				}
				else bw.write(stack.peek()+"\n");
			}
			else if(prom.contains("size")) {
				bw.write(stack.size()+"\n");
			}
			else if(prom.contains("empty")) {
				bw.write(stack.isEmpty() ? "1\n" : "0\n");
			}
			else if(prom.contains("pop")) {
				if(stack.isEmpty()) {
					bw.write("-1\n");
				}
				else bw.write(stack.pop()+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}