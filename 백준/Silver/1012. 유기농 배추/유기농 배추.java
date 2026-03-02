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
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());
		for(int i =0; i<t;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			int [][] arr = new int [a][b];
			int result =0;
			for(int j=0; j<c;j++) {
				StringTokenizer stt = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(stt.nextToken());
				int y = Integer.parseInt(stt.nextToken());
				arr[x][y]=1;
			}
			boolean [][] visited = new boolean[a][b];
			for(int x=0;x<a;x++) {
				for(int y=0;y<b;y++) {
					if(arr[x][y]==1 && !visited[x][y]) {
						dfs(x,y,arr,visited,a,b);
						result++;
					}
				}
			}
			bw.write(result+"\n");
			
		}
		bw.flush();
		bw.close();
	}
	static void dfs(int x, int y ,int[][]arr, boolean[][]visited,int a, int b) {
		visited[x][y]=true;
		int[] dx= {1,-1,0,0};
		int[] dy= {0,0,1,-1};
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<a && ny<b) {
				if(arr[nx][ny]==1 && !visited[nx][ny]) {
					dfs(nx,ny,arr,visited,a,b);
				}
			}
		}
	}
}