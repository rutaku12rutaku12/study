import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            int sum=0;
            int N = scan.nextInt();
            String K = scan.next();
            for (int i =0; i<N; i++){
                sum += Integer.parseInt(K.substring(i,i+1));
            }
        System.out.println(sum);
        scan.close();
    }
}