package progrmmers.initiate;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120585}
 */
public class Solution120585 {
    public static void main(String[] args) {
        Solution120585 Solution120585 = new Solution120585();

        int [] array = {149, 180, 192, 170};
        int hight = 167;
        System.out.println(Solution120585.solution(array, hight));
    }

    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array).filter(i->height < i).count();
    }
}
