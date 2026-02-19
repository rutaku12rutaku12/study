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
		int n = Integer.parseInt(br.readLine());
		String [] arr = new String[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]= st.nextToken();
		}
		String [] ar = new String[n-1];
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		for(int i=0; i<n-1; i++) {
			ar[i]= st2.nextToken();
		}
		boolean [] is = new boolean[n];
		for(int i=0;i<n;i++) {
			for(int j=0; j<n-1;j++) {
				if(arr[i].equals(ar[j])) {
					is[i]=true;
				}
			}
		}
		for(int i=0; i<n;i++) {
			if(!is[i]){
				bw.write(arr[i]+"");
			}
		}
		bw.flush();
		bw.close();
	}
}
