import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int account = scan.nextInt();
        int N = scan.nextInt();
        int price=0; int n=0;
        int t=0;
        for( int i=0; i<N; i++ ){
            price = scan.nextInt();
            n = scan.nextInt();
            t += n*price;
        }
        if(account==(t)){
            System.out.println("Yes");
        }else System.out.println("No");
        scan.close();
    }
}