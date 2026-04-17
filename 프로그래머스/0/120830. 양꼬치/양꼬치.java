class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        answer+=12000*n;
        answer+=k*2000;
        while(n/10>0){
            n-=10;
            answer-=2000;
        }
        return answer;
    }
}