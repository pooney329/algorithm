package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181906}
 */
public class Solution181906 {
    public static void main(String[] args) {
        Solution181906 Solution181906 = new Solution181906();
        System.out.println(Solution181906.solution("banana", "ban"));
    }

    public int solution(String my_string, String is_prefix) {
        return my_string.startsWith(is_prefix) ? 1 : 0;
    }
}
