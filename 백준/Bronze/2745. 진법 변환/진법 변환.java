import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String N=st.nextToken();
		String B=st.nextToken();
		int b = Integer.parseInt(B);
		int sum = 0;
		for(int i=0; i<N.length(); i++) {
			char [] y = new char[N.length()]; 
			y [i] = N.charAt(i);
			int k = N.charAt(i)-'0';
			//bw.write(k+"gg"+ "\n");
			if(k>9) {
				//bw.write("if");
				for(char j = 'A'; j<='Z';j++) {
					if(y[i]==j) {
						double q = (k-7)*(Math.pow(b,N.length()-i-1));
						//bw.write(q+"\n");
						sum += q;
					}
				}
			}else {//bw.write("else");
				double q = (k)*(Math.pow(b,N.length()-i-1));
				//bw.write(q+"\n");
				sum+=q;
			}	
		}
		bw.write(sum+"");
		bw.flush();
		bw.close();
	
	}
}