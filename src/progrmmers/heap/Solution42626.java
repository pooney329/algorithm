package progrmmers.heap;

import java.util.Arrays;

public class Solution42626 {


    public static void main(String[] args) {
        int scoville[] = new int[]{1, 2, 3, 9, 10, 12};
        int K = 7;
        System.out.println(solution(scoville, K));
    }

    public static int solution(int[] scoville, int K) {
        int answer = 0;
        while(scoville.length > 1){
            Arrays.sort(scoville);
            if(scoville[0] >= K){
                break;
            }
            answer++;
            int[] temp = new int[scoville.length-1];
            temp[0] = scoville[0] + (scoville[1] * 2);
            for(int i=2; i<scoville.length; i++){
                temp[i-1] = scoville[i];
            }
            scoville = temp;
        }
        return scoville[0] < K ? -1 : answer;
    }
}
