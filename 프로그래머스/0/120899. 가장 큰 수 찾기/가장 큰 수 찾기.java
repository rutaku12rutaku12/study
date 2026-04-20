class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int hi = Integer.MIN_VALUE;
        int index =0;
        for(int i=0; i<array.length;i++){
            
            if(array[i]>hi){
                hi=array[i];
                index=i;
            }
          
        }
        answer[0]=hi;
        answer[1]=index;
        return answer;
    }
}