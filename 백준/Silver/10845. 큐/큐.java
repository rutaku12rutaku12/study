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
			Queue<Integer> queue = new LinkedList<Integer>();
			int last = 0;
			for(int i=0;i<N;i++) {
				String prom = br.readLine();
				StringTokenizer st = new StringTokenizer(prom);
				if(prom.contains("push")) {
					String a = (st.nextToken());
					int b = Integer.parseInt(st.nextToken());
					last = b;
					queue.add(b);
				}
				else if(prom.equals("pop")) {
					if(!queue.isEmpty()) {
						bw.write(queue.poll()+"\n");
					}else bw.write("-1\n");
				}
				else if(prom.equals("size")) {
					bw.write(queue.size()+"\n");
				}
				else if(prom.equals("empty")) {
					if(queue.isEmpty()) {
						bw.write("1\n");
					}else bw.write("0\n");
				}
				else if(prom.equals("front")){
					if(!queue.isEmpty()) {
						bw.write(queue.peek()+"\n");
					}else bw.write("-1\n");
				}
				else if(prom.equals("back")){
					if(!queue.isEmpty()) {
						bw.write(last+"\n");
					}else bw.write("-1\n");
				}
			}
		bw.flush();
		bw.close();
	}
}