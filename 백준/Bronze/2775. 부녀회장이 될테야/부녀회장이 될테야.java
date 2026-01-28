import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			int 층 = Integer.parseInt(br.readLine());
			int 호 = Integer.parseInt(br.readLine());
			int [][] arr = new int[(층+1)][호+1];
			for(int j=0; j<층+1;j++) {
				for(int k=1; k<호+1;k++) {
					if(j==0) {
						arr[j][k]=k;
					}else arr[j][k]= arr[j][k-1]+arr[j-1][k];
				}
			}bw.write(arr[층][호]+"\n");
		}
		bw.flush();
		bw.close();
	}
}