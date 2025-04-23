package progrmmers.initiate;

import java.util.Arrays;


/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120817}
 */
public class Solution120817 {

    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Solution120817 solution120817 = new Solution120817();
        System.out.println(solution120817.solution(numbers));
    }

    public double solution(int[] numbers) {
        return Arrays.stream(numbers)
                .average().orElse(0.0);
    }
}
