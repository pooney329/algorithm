package progrmmers.initiate;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120905}
 */
public class Solution120905 {
    public static void main(String[] args) {
        Solution120905 Solution120905 = new Solution120905();
        System.out.println(Arrays.toString(Solution120905.solution(3, new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12})));
    }
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }
}
