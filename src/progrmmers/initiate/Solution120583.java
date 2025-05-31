package progrmmers.initiate;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120583}
 */
public class Solution120583 {

    public static void main(String[] args) {
        Solution120583 Solution120583 = new Solution120583();
        System.out.println(Solution120583.solution(new int[]{1, 1, 2, 3, 4, 5}, 1));
    }
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array).filter(i -> i == n).count();
    }
}
