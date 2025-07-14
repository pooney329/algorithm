package progrmmers.initiate;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181909}
 */
public class Solution181909 {
    public static void main(String[] args) {
        Solution181909 solution181909 = new Solution181909();
        System.out.println(Arrays.toString(solution181909.solution("banana")));
    }

    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];

        for(int i=0; i<my_string.length(); i++) {
            answer[i] = my_string.substring(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}
