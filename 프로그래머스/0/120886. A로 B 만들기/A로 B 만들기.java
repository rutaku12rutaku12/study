import java.util.Arrays;
class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        int [] Arr = new int [40];
        for(int i=0; i<before.length();i++){
            char c = before.charAt(before.length()-i-1);
            Arr[c-'a']++;
        }
        int [] Brr = new int [40];
        for(int i=0; i<after.length();i++){
            char c = after.charAt(after.length()-i-1);
            Brr[c-'a']++;
        }
        if(Arrays.equals(Arr,Brr)){
            answer++;
        }
        return answer;
    }
}