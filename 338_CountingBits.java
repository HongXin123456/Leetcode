public class Solution {
    public int[] countBits(int num) {
        int[] answer = new int[num+1];
        answer[0] = 0;
        for(int i = 1; i < answer.length; i++){
            answer[i] = answer[i / 2] + (i % 2);
        }
        return answer;
    }
}
