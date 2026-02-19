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
		for(int i=0;i<N;i++) {
			int [] arr = new int[8];
			String K = br.readLine();
			for(int k=0; k<38;k++) {
				String cutK = K.substring(k,k+3);
				if(cutK.equals("TTT")) {
					arr[0]++;
				}
				else if (cutK.equals("TTH")) {
					arr[1]+=1;
				}
				else if (cutK.equals("THT")) {
					arr[2]+=1;
				}
				else if (cutK.equals("THH")) {
					arr[3]+=1;
				}
				else if (cutK.equals("HTT")) {
					arr[4]+=1;
				}
				else if (cutK.equals("HTH")) {
					arr[5]+=1;
				}
				else if (cutK.equals("HHT")) {
					arr[6]+=1;
				}
				else if (cutK.equals("HHH")) {
					arr[7]+=1;
				}
			}
			for(int j=0; j<8;j++) {
				bw.write(arr[j]+" ");
			}bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}