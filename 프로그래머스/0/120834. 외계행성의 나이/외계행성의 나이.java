class Solution {
    public String solution(int age) {
        String answer = "";
        String s = age+"";
        for(int i=0; i<s.length();i++){
            char c= (char)(s.charAt(i)+'1');
            answer+=c;
            
        }
        return answer;
    }
}