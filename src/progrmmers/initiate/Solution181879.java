package progrmmers.initiate;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181879}
 */
public class Solution181879 {
    public static void main(String[] args) {
        Solution181879 solution181879 = new Solution181879();
        System.out.println(solution181879.solution(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));
    }

    public int solution(int[] num_list) {
        int answer = num_list.length >= 11 ? 0 : 1;
        for (int num : num_list){
            if(num_list.length >= 11){
                answer += num;
            }
            else{
                answer *= num;
            }
        }
        return answer;
    }
}
