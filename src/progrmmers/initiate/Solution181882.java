package progrmmers.initiate;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181882}
 */
public class Solution181882 {
    public static void main(String[] args) {
        Solution181882 solution181882 = new Solution181882();
        System.out.println(Arrays.toString(solution181882.solution(new int[]{1, 2, 3, 100, 99, 98})));
    }
    public int[] solution(int[] arr) {
        int[] answer = {};
        return  Arrays.stream(arr).map(i -> {
            if (i >= 50 &&i % 2 == 0) return i / 2;
            else if (i <= 50 && i % 2 != 0) return i * 2;
            else return i;
        }).toArray();
    }
}
