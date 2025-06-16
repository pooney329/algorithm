package progrmmers.initiate;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120813}
 */
public class Solution120813 {

    public static void main(String[] args) {
        Solution120813 solution120813 = new Solution120813();
        solution120813.solution(10);
    }

    public int[] solution(int n) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(n % 2 != 0) {
                list.add(i);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }

}
