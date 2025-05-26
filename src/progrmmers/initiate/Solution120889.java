package progrmmers.initiate;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120889}
 */
public class Solution120889 {

    public static void main(String[] args) {
        Solution120889 Solution120889 = new Solution120889();
        int[] sides = {1, 2, 3};
        System.out.println(Solution120889.solution(sides));
    }
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[2] < sides[1] + sides[0] ? 1 : 2;
    }

}
