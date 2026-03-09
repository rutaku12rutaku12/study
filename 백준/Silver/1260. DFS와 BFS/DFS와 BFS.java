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
	static ArrayList<Integer>[] graph;
	static boolean[] visited; 
	static BufferedWriter bw;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N+1];
		for( int i=1; i<=N; i++) graph[i] = new ArrayList<>();
		
		for(int i =0; i<M;i++) {
			StringTokenizer stt = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(stt.nextToken());
			int y = Integer.parseInt(stt.nextToken());
			graph[x].add(y);
			graph[y].add(x);
		}
		for(int i=1; i<=N; i++) Collections.sort(graph[i]);
		
		visited = new boolean[N+1];
		dfs(V);
		bw.newLine();
		
		visited = new boolean[N+1];
		bfs(V);
		bw.newLine();
		
		bw.flush();
		bw.close();
	}
	static void dfs(int v) throws Exception {
		visited[v]= true;
		bw.write(v+" ");
		for(int next: graph[v]) {
			if(!visited[next]) dfs(next);
		}
	}
	static void bfs(int start) throws Exception{
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		visited[start] = true;
		while(!queue.isEmpty()) {
			int v = queue.poll();
			bw.write(v+ " ");
			for( int next : graph[v]) {
				if( !visited[next]) {
					visited[next]=true;
					queue.add(next);
				}
			}
		}
	}
	
}