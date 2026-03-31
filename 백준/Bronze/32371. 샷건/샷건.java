import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[][] keyboard = new char[4][10];

        for (int i = 0; i < 4; i++) {
            keyboard[i] = br.readLine().toCharArray();
        }

        char[] input = br.readLine().toCharArray();
        Arrays.sort(input); // 기준 문자열 정렬

        for (int i = 1; i < 3; i++) {
            for (int j = 1; j < 9; j++) {

                List<Character> list = new ArrayList<>();

                // 3x3 탐색
                for (int dx = -1; dx <= 1; dx++) {
                    for (int dy = -1; dy <= 1; dy++) {
                        list.add(keyboard[i + dx][j + dy]);
                    }
                }

                // 리스트 → 배열 변환
                char[] temp = new char[9];
                for (int k = 0; k < 9; k++) {
                    temp[k] = list.get(k);
                }

                Arrays.sort(temp);

                // 비교
                if (Arrays.equals(input, temp)) {
                    System.out.println(keyboard[i][j]);
                    return;
                }
            }
        }
    }
}