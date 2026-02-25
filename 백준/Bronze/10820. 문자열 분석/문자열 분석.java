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
		String k;
		while((k=br.readLine())!=null) {
			int a=0;
			int b=0;
			int c=0;
			int d=0;
			for(int i=0;i<k.length();i++) {
				int ch = k.charAt(i);
				if(ch>=97 && ch<=122) {
					a++;
				}
				if(ch>=65 && ch<=90) {
					b++;
				}
				if(ch>=48 && ch<=57) {
					c++;
				}
				if(ch==32) {
					d++;
				}
			}
			bw.write(a+" "+b+" "+c+" "+d+"\n");
		}
		bw.flush();
		bw.close();
	}
}