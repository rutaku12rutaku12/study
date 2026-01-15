import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;


public class Main{
	public static void main(String[] args ) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int A = Integer.parseInt(br.readLine());
		Person [] arr = new Person[A];
		for(int i =0; i<A; i++) {
			String K = br.readLine();
			StringTokenizer st = new StringTokenizer(K);
			int a = Integer.parseInt(st.nextToken());
			String b = st.nextToken();
			Person person = new Person(a,b);
			arr[i]=person;
		}
		Arrays.sort(arr,(a,b) ->a.age-b.age);
		for(Person p : arr) {
			bw.write(p.age+" "+p.name+"\n");
		}
		bw.flush();
		bw.close();
	}
}
class Person {
	int age;
	String name;
	
	Person(int age , String name){
		this.age = age;
		this.name= name; 
	}
}