package progrmmers.initiate;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120821}
 */
public class Solution120821 {

    public static void main(String[] args) {
        Solution120821 solution120821 = new Solution120821();
        int[] num_list= new int[]{1,2,3,4,5};
        System.out.println(Arrays.toString(solution120821.solution(num_list)));
    }

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for (int i = 0; i < num_list.length; i++){
            answer[i] = num_list[num_list.length -1 - i];
        }

        return answer;
    }
}
