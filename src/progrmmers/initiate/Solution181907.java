package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181907}
 */
public class Solution181907 {
    public static void main(String[] args) {
        Solution181907 solution181907 = new Solution181907();
        System.out.println(solution181907.solution("ProgrammerS123", 11));
    }

    public String solution(String my_string, int n) {
        return my_string.substring(0,n);
    }

}
