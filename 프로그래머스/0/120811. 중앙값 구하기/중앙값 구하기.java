class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for(int j=0; j<array.length/2+1; j++){
            for(int i=0; i<array.length-1;i++){
                if(array[i]>array[i+1]){
                    int a = array[i];
                    array[i] = array[i+1];
                    array[i+1] = a;
                }
            }
        }
        answer+=array[array.length/2];
        return answer;
    }
}