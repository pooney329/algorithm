package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120826}
 */
public class Solution120826 {
    public static void main(String[] args) {
        Solution120826 solution120826 = new Solution120826();

        String my_string = "abcdef", letter = "f";
        System.out.println(solution120826.solution(my_string, letter));
    }

    public String solution(String my_string, String letter) {
        return my_string.replaceAll(letter, "");
    }
}
