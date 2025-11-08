
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int i=0; i<T; i++){
        int A = scanner.nextInt();
        int B = scanner.nextInt();
            System.out.println(A+B);
        }

        // 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
        //
        //각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
        //
        //출력
        //각 테스트 케이스마다 A+B를 출력한다.
        //
        //예제 입력 1
        //5
        //1 1
        //2 3
        //3 4
        //9 8
        //5 2




        scanner.close();
    }
}
