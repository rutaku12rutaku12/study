import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean[] A = new boolean[42];
        int sum =0;
        for (int i =0; i<10; i++){
            int N = scan.nextInt()%42;
            A[N]=true;
        }
        for (int i =0; i<42; i++){
            if(A[i]==true)
                sum++;
            
        }System.out.println(sum);
        scan.close();
    }
}