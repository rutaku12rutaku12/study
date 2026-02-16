
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
	
		int a = Integer.parseInt(br.readLine());
		char [] arr = br.readLine().toCharArray();
		for(int i=0; i<=a/2;i++) {
			int j = a-1-i;
			
			if(a%2!=0 && arr[i]=='?'&& arr[j]=='?') {
				arr[i]=arr[j]='a';
			}
			else if(arr[i]=='?' && arr[j]=='?') {
				arr[i]=arr[j]='a';
			}
			else if(arr[i]=='?') {
				arr[i]=arr[j];
			}
			else if (arr[j]=='?') {
				arr[j]=arr[i];
			}
			else {
				arr[j]=arr[i];
			}
		}
		for(int i=0;i<a;i++) {
			bw.write(arr[i]);
		}
		bw.flush();
		bw.close();
	}
}
