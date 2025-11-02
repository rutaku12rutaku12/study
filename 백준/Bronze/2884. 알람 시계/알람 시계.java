import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if(H==0 && M-45>0){
            //System.out.println(1);
            System.out.println(0);
            System.out.println(M-45);}
        else if (H==0 && M-45<0){
            //System.out.println(2);
            System.out.println(23);
            System.out.println(60-(45-M));
        }
        else if(M<=45){
            if ((60-(45-M))==60){
                //System.out.println(3);
                System.out.println(H);
                System.out.println(0);
            }else {
                //System.out.println(4);
            System.out.println((H-1) );
            System.out.println((60-(45-M)));}
        }else {
            //System.out.println(5);
            System.out.println(H);
            System.out.println(M-45);
        }


        scanner.close();
    }
}



