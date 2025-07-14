package progrmmers.initiate;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181901}
 */
public class Solution181901 {
    public static void main(String[] args) {
        Solution181901 Solution181901 = new Solution181901();
        System.out.println(Arrays.toString(Solution181901.solution(10, 3)));
    }
    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(i -> i % k == 0).sorted().toArray();
    }
}
