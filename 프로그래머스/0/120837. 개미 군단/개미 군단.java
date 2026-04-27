class Solution {
    public int solution(int hp) {
        int answer = 0;
        int J = 5;
        int B = 3;
        int I = 1;
        while(hp>0){
            if(hp>=5){
                answer+=hp/5;
                hp-=hp/5*J;
            }
             if(hp>=3){
                answer+=hp/3;
                hp-=hp/3*B;
            }
             if(hp>=1){
                answer+=hp/1;
                hp-=hp/1*I;
            }    
        }
        return answer;
    }
}