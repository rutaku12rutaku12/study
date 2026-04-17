class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        char b = letter.charAt(0);
        for(int i=0; i<my_string.length();i++){
            char a = my_string.charAt(i);
            
            if(a!=b){
                answer+=a;
            }
        }
        return answer;
    }
}