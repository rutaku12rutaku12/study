import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] N = new int[scan.nextInt()];
        for (int i = 0; i<N.length; i++){
                N[i]=i+1;
        }
        int M = scan.nextInt();
        for (int i = 0; i<M; i++){
            int left = scan.nextInt()-1;
            int right = scan.nextInt()-1;
            while (left<right){
                int temp = N[left];
                N[left] = N[right];
                N[right] = temp;
                left++;
                right--;
            }
        }
        for (int i = 0; i<N.length; i++){
            System.out.print(N[i]+ " ");
        }
        scan.close();
    }
}