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
		int X = Integer.parseInt(br.readLine());
		int Y = Integer.parseInt(br.readLine());
		int Z = Integer.parseInt(br.readLine());
		if(X==60 && Y==60 && Z==60) {
			bw.write("Equilateral");
		}
		else if(X+Y+Z==180 && (X==Y || X==Z || Y==Z)) {
			bw.write("Isosceles");
		}
		else if(X+Y+Z==180 && (X!=Y && Y!=Z && X!=Z)) {
			bw.write("Scalene");
		}
		else if(X+Y+Z!=180) {
			bw.write("Error");
		}
		bw.flush();
		bw.close();
	}
}