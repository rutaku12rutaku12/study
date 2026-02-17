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
	static boolean [] visited;
	static int [] order;
	static int count=1;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int R = Integer.parseInt(st.nextToken());
		
		graph = new ArrayList[N+1];
		visited = new boolean[N+1];
		order = new int[N+1];
		
		for(int i=1;i<=N;i++ ) {
			graph[i]= new ArrayList<>();
		}
		for(int i=0; i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int v = Integer.parseInt(st.nextToken());
			int u = Integer.parseInt(st.nextToken());
			graph[v].add(u);
			graph[u].add(v);
		}
		for(int i=1; i<=N;i++) {
			Collections.sort(graph[i]);
		}
		dsf(R);
		for(int i=1;i<=N;i++) {
			bw.write(order[i]+"\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	static void dsf(int node) {
		visited[node] =true;
		order[node]=count++;
		for(int next : graph[node]) {
			if(!visited[next]) {
				dsf(next);
			}
		}
	}
}