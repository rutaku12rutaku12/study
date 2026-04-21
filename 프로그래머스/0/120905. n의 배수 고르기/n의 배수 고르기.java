class Solution {
    public int[] solution(int n, int[] numlist) {
        int k=0;
        for(int i=0; i<numlist.length;i++){
            if(numlist[i]%n==0){
                k++;
            }        
        }
        int[] answer = new int[k];
        int index=0;
        for(int i=0; i<numlist.length;i++){
            
            if(numlist[i]%n==0){
                answer[index]=numlist[i];
                index++;
            }
        }
        
        return answer;
    }
}