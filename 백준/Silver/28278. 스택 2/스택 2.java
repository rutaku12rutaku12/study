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
			for(int i=0;i<N;i++) {
				String prom = br.readLine();
				StringTokenizer st = new StringTokenizer(prom);
				if(prom.contains("1")) {
					int a = Integer.parseInt(st.nextToken());
					int b = Integer.parseInt(st.nextToken());
					stack.add(b);
				}
				else if(prom.equals("2")) {
					if(!stack.isEmpty()) {
						bw.write(stack.pop()+"\n");
					}else bw.write("-1\n");
				}
				else if(prom.equals("3")) {
					bw.write(stack.size()+"\n");
				}
				else if(prom.equals("4")) {
					if(stack.isEmpty()) {
						bw.write("1\n");
					}else bw.write("0\n");
				}
				else if(prom.equals("5")){
					if(!stack.isEmpty()) {
						bw.write(stack.peek()+"\n");
					}else bw.write("-1\n");
				}
			}
		bw.flush();
		bw.close();
	}
}