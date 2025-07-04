package progrmmers.initiate;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181891}
 */
public class Solution181891 {
    public static void main(String[] args) {
        Solution181891 solution181891 = new Solution181891();
        System.out.println(Arrays.toString(solution181891.solution(new int[]{2, 1, 6}, 1)));
    }

    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];

        int index = 0;
        for (int i = n; i < num_list.length; i++) {
            answer[index++] = num_list[i];
        }
        for (int i = 0; i < n; i++) {
            answer[index++] = num_list[i];
        }

        return IntStream.range(0, num_list.length)
                .map(i -> num_list[(i + n) % num_list.length])
                .toArray();
    }


}
