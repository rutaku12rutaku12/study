
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
	static int count = 0;
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		graph = new ArrayList[A+1];
		visited = new boolean[A+1];
		
		for(int i =1; i<=A;i++) {
			graph[i]=new ArrayList<>();
		}
		for(int i=1;i<=B;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			graph[x].add(y);
			graph[y].add(x);
		}
		
		dfs(1);
		bw.write(count-1+"");
		bw.flush();
		bw.close();
		br.close();
	}
	static void dfs(int node) {
		visited[node] = true;
		count++;
		for(int next: graph[node]) {
			if(!visited[next]) {
				dfs(next);
			}
		}
	}	
}

