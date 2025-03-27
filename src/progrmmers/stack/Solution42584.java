package progrmmers.stack;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42584}
 */
public class Solution42584 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 2, 3})));
    }
    public static int[] solution(int[] prices) {
        int[] answer = new int [prices.length];

        for(int i = 0; i < prices.length - 1; i++){
            int time = 0;
            for (int j = i + 1; j < prices.length; j++){
                if(prices[i] <= prices[j]){
                    time++;
                    continue;
                }
                time++;
                break;
            }
            answer[i] = time;
        }
        return answer;
    }


}
