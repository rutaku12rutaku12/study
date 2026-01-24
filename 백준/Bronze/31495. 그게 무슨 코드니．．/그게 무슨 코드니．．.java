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

		
		String N = (br.readLine());
		
		for(int i=0; i<N.length();i++) {
			char ch = N.charAt(i);
		}
		if((N.charAt(0)=='"' && N.charAt(N.length()-1)=='"') && N.length()==2) {
			bw.write("CE");
		}
		else if(N.charAt(0)=='"' && N.charAt(N.length()-1)=='"' && N.length()!=1) {
			for(int j=1; j<N.length()-1;j++) {
				bw.write(N.charAt(j)+"");
			}
		}
		else {bw.write("CE");}
		bw.flush();
		bw.close();
	}
}