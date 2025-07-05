package progrmmers.initiate;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181899}
 */
public class Solution181899 {
    public static void main(String[] args) {
        Solution181899 solution181899 = new Solution181899();
        System.out.println(Arrays.toString(solution181899.solution(10, 3)));
    }
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];

        for(int i = start_num; i >= end_num; i--) {
            answer[start_num - i] = i;
        }
        return answer;
    }


}
