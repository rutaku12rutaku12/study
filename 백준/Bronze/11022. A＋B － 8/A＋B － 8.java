import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        for( int i=0; i<N; i++ ) {
            int A = scan.nextInt();
            int B = scan.nextInt();
            System.out.println("Case #"+(i+1)+": "+A+" + "+B+" = "+(A+B));
        }
        scan.close();
    }
}