import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main{
	public static void main(String[] args ) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int N = Integer.parseInt(br.readLine());
			Q [] arr = new Q[N];
			for(int i =0; i<N; i++) {
				String K = br.readLine();
				StringTokenizer st = new StringTokenizer(K);
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				Q q = new Q(a,b); 
				arr[i]=q;
			}
			Arrays.sort(arr,(a,b)->{
			if(a.y-b.y==0) return a.x-b.x;
			return a.y-b.y;
			});
			for(Q q : arr) {
				bw.write(q.x+" "+q.y+"\n");
			}
			
		bw.flush();
		bw.close();
	}
}
class Q {
	int x;
	int y;
	
	Q(int x , int y){
		this.x = x;
		this.y= y; 
	}
}