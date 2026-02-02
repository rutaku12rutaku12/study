import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int [][] board = new int[N][M];
		
		for(int i =0; i<N; i++) {
			String line = br.readLine();
			for(int j =0; j<M;j ++) {
				if(line.charAt(j)=='W') board[i][j]=0;
				else board[i][j]=1;
			}
		}
		int answer = Integer.MAX_VALUE;
		
		for(int i =0; i<=N-8; i++) {
			for(int j =0; j<=M-8; j++) {
				int W= 0;
				int B= 0;
				
				for (int x = i; x<i+8; x++) {
					for (int y =j; y<j+8; y++) {
						int current = board[x][y];
						int exW=(x+y)%2;
						int exB=1-exW;
						
						if(current != exW) W++;
						if(current != exB) B++;
					}
				}
				answer = Math.min(answer, Math.min(W,B));
			}
		}
		bw.write(answer+"");
		bw.flush();
		bw.close();
	}
}