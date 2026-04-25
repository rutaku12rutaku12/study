import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public ArrayList<Integer> solution(String my_string) {
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<my_string.length();i++){
            char c = my_string.charAt(i);
            if(c>='0' && c<='9'){
                String a = c+"";
                int k = Integer.parseInt(a);
                answer.add(k);
            }
        }
        Collections.sort(answer);
        return answer;
    }
}