import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<>();
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		while(queue.size()>1) {
			queue.remove();
			queue.add(queue.remove());
		}
		bw.write(queue.peek()+"");
		bw.flush();
		bw.close();
	}
}