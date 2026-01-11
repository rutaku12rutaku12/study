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


public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int [][] arr = new int [N][3];
		for(int i=0; i<N; i++) {
			String A = br.readLine();
			StringTokenizer st = new StringTokenizer(A);
			arr[i][0]=(Integer.parseInt(st.nextToken()));
			arr[i][1]=(Integer.parseInt(st.nextToken()));
			arr[i][2]=1;
		}
		for(int i=0; i<N; i++) {

			for(int j =0; j<N;j++) {
				if(arr[i][0]<arr[j][0] &&
						arr[i][1]<arr[j][1] ) {
					arr[i][2]++;
				}
				
			}
			bw.write(arr[i][2]+" ");
		}
		bw.flush();
		bw.close();
	}
} 