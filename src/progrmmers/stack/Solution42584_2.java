package progrmmers.stack;

import progrmmers.dynamic.Solution43163_2;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42584}
 */
public class Solution42584_2 {
    public static void main(String[] args) {
        Solution42584_2 Solution42584_2 = new Solution42584_2();
        System.out.println(Arrays.toString(Solution42584_2.solution(new int[]{1, 2, 3, 2, 3})));
    }

    public int[] solution(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length - 1; i++) {
            int time = 0;
            for (int j = i + 1; j < prices.length; j++) {
                time++;
                if (prices[i] > prices[j]) {
                    break;
                }
            }
            result[i] = time;
        }
        return result;
    }


}
