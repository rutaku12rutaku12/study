import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int m = scan.nextInt();
        int t = scan.nextInt();

        if ((H+((m+t)/60)>=24) && m+t>=60 ){
            System.out.println((H+((m+t)/60))-24+" "+((m+t)-((m+t)/60)*60));
        }
        else if(m+t>=60){
            System.out.println((H+((m+t)/60))+" "+((m+t)-((m+t)/60)*60));
        }
        else if (H>=24){
            System.out.println(H-24 +" "+(m+t));
        }
        else System.out.println(H +" "+(m+t));

        scan.close();
    }
}