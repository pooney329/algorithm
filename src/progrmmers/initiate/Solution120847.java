package progrmmers.initiate;

import java.util.Arrays;

    /**
     * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120847}
     */
public class Solution120847 {

    public static void main(String[] args) {
        Solution120847 solution120847 = new Solution120847();
        System.out.println(solution120847.solution(new int[]{1,2,3,4,5}));
    }
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}
