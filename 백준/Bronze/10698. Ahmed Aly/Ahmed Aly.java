
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
		
			for(int i=0; i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				String d = st.nextToken();
				int b = Integer.parseInt(st.nextToken());
				String e = st.nextToken();
				int c = Integer.parseInt(st.nextToken());
				if(d.contains("+") && a+b==c) {
					bw.write("Case "+(i+1)+": "+"YES\n");
				}
				else if(d.contains("-") && a-b==c){
					bw.write("Case "+(i+1)+": "+"YES\n");
				}
				else { bw.write("Case "+(i+1)+": "+"NO\n");}
			}
		bw.flush();
		bw.close();
	}
}