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
			
		
		int T = Integer.parseInt(br.readLine());
		for(int i=0; i<T; i++) {
			String a = (br.readLine());
			boolean [] arr = new boolean[10];
			for(int j=0; j<a.length();j++) {
				if(a.contains("0")) {
					arr[0] =true;
				}
				if(a.contains("1")) {
					arr[1] =true;
				}
				if(a.contains("2")) {
					arr[2] =true;
				}
				if(a.contains("3")) {
					arr[3] =true;
				}
				if(a.contains("4")) {
					arr[4] =true;
				}
				if(a.contains("5")) {
					arr[5] =true;
				}
				if(a.contains("6")) {
					arr[6] =true;
				}
				if(a.contains("7")) {
					arr[7] =true;
				}
				if(a.contains("8")) {
					arr[8] =true;
				}
				if(a.contains("9")) {
					arr[9] =true;
				}
			}
			int sum=0;
			for(int w=0; w<10;w++) {
				if(arr[w]) {
					sum++;
				}
			}
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}