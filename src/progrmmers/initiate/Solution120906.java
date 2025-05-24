package progrmmers.initiate;

import java.util.Arrays;

/**
 * {@linl https://school.programmers.co.kr/learn/courses/30/lessons/120906}
 */
public class Solution120906 {

    public static void main(String[] args) {
        Solution120906 Solution120906 = new Solution120906();
        System.out.println(Solution120906.solution(1234));
    }
    public int solution(int n) {
        return Arrays.stream(String.valueOf(n).split("")).mapToInt(Integer::parseInt).peek(i -> System.out.println(i)).sum();
    }

}
