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
		while( true ) {
			int x = Integer.parseInt(br.readLine());
			if(x==0)break;
			String y = x+"";
			boolean k= true;
			for(int i =0; i<y.length()-1;i++) {
				if(y.charAt(i)==y.charAt(y.length()-1-i)){
					k= true;
				}
				else {
					k=false; 
					break;
				}
			}
			if(k) {
			bw.write("yes\n");
			}else {bw.write("no\n");}
		}
		bw.flush();
		bw.close();
	}
}