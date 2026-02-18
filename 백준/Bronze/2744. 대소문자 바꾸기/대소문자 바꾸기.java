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
		
		String A = br.readLine();
		char [] arr = new char [A.length()];
		for(int i =0; i<A.length();i++) {
			char a = A.charAt(i);
			arr[i]=a;
		}
		for(int i=0;i <A.length();i++) {
			char a=arr[i];
			if(a>=65 && a<=90) {
				arr[i]+=32;
				bw.write(arr[i]+"");
			}
			if(a>=97 && a<=122) {
				arr[i]-=32;
			bw.write(arr[i]+"");
			}
		}
		bw.flush();
		bw.close();
	}	
}