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
		int N = Integer.parseInt(br.readLine());
		int [] arr = new int[N];
		if(N>=1) {
		arr[0]=1;}
		if(N>=2) {
		arr[1]=2;}
		for(int i=2; i<N;i++) {
			arr[i]=i+1;
		}
		int last = arr[N-1];
		while(!is(last)) {
			last++;
		}
		arr[N-1]=last;
		bw.write(N+"\n");
		for(int i=0; i<N; i++) {
			bw.write(arr[i]+" ");
		}
		bw.flush();
		bw.close();
	}	
	static boolean is(int n ) {
		if(n<2)return false;
		for(int i=2; i*i<=n; i++) {
			if(n%i==0) return false;
		}
		return true;
	}
}
