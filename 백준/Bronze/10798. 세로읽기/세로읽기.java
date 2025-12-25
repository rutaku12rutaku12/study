import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(System.out));
		String [][] A = new String[5][15];
		for( int i =0; i<5; i++) {
			String line = br.readLine();
			for(int j = 0; j<line.length();j++) {
				A [i][j] = String.valueOf(line.charAt(j)); 
			}
		}
		String k = Arrays.deepToString(A)+"\n";
		for(int q= 0; q<A[0].length;q++) {
				for(int w= 0; w<A.length;w++) {
					if(A[w][q]!=null) {
						bw.write(A[w][q]);
					}
				}
			}
		bw.flush();
		bw.close();
	}
}