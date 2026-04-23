class Solution {
    public int solution(int n) {
        int answer = 0;
        String a = n+"";
        for(int i=0; i<a.length();i++){
            String k = a.substring(i,i+1);
            int kk = Integer.parseInt(k);
            answer+=kk;
        }
        return answer;
    }
}