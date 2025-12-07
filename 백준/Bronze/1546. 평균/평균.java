import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] A = new double[scan.nextInt()];
        double[] B = new double[A.length];
        double max = 0;
        double sum = 0;
        for (int i =0; i<A.length; i++){
                A[i]=scan.nextInt();
            if(max<=A[i]){
                max = A[i];
            }
        }
        for (int i =0; i<B.length; i++){
            if(A[i]/max*100>=100){
                B[i]=100; 
            }
            else {B[i]=A[i]/max*100;
            }
            sum+= B[i];
        }
        System.out.println(sum/A.length);
        scan.close();
    }
}