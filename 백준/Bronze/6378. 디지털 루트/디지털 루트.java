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
		while(true) {
			
			String a= (br.readLine());
			if(a.equals("0")) {
				break;
			}
			int sum=0;
			do {
				sum=0;
				for(int i=0; i<a.length();i++) {
					sum+=a.charAt(i)-'0';
				}
				a=sum+"";
			}while(a.length()>1);
			bw.write(sum+"\n");
		}
		bw.flush();
		bw.close();
	}
}
