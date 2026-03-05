import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main{
	static boolean[][] visited;
	static int[][] arr;
	static int M,N;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i =0; i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			visited = new boolean[M][N];
			arr = new int [M][N];
			for(int j=0; j<k; j++) {
				StringTokenizer stt = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(stt.nextToken());
				int y = Integer.parseInt(stt.nextToken());
				arr[x][y]=1;
			}
			int result =0;
			for(int j=0;j<M;j++) {
				for(int q=0;q<N;q++) {
					if(arr[j][q]==1&&!visited[j][q]) {
						dfs(j,q);
						result++;
					}
				}
			}
			bw.write(result+"\n");
		}
		bw.flush();
		bw.close();
	}
	static void dfs(int x, int y ) {
		visited[x][y] = true;
		int [] dx= {-1,1,0,0};
		int [] dy= {0,0,-1,1};
		for(int i=0; i<4;i++) {
			int nx= x+dx[i];
			int ny= y+dy[i];
			if(nx>=0 && ny>=0 && nx<M && ny<N) {
				if(arr[nx][ny]==1&& !visited[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
	}
}