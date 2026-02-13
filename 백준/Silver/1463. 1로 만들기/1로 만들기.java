
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

		int T = Integer.parseInt(br.readLine());
		int [] arr = new int [T+1];
		arr[1] = 0;
		for(int i = 2; i<=T;i++) {
			arr[i]= arr[i-1]+1;
			
			if(i%2==0) {
				arr[i] = Math.min(arr[i], arr[i/2]+1);
			}
			if(i%3==0) {
				arr[i] = Math.min(arr[i], arr[i/3]+1);
			}
		}
		bw.write(arr[T]+"");
		bw.flush();
		bw.close();
	}
}