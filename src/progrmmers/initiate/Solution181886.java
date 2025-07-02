package progrmmers.initiate;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181886}
 */
public class Solution181886 {
    public static void main(String[] args) {
        Solution181886 solution181886 = new Solution181886();
        System.out.println(Arrays.toString(solution181886.solution(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"})));
    }

    public String[] solution(String[] names) {
        int count = (int) Math.ceil(names.length/5.0);
        String[] answer = new String[count];
        for(int i=0; i<count; i++) {
            answer[i] = names[i*5];
        }
        return answer;
    }

}
