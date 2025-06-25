package progrmmers.initiate;

import java.util.Locale;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181878}
 */
public class Solution181878 {

    public static void main(String[] args) {
        Solution181878 solution181878 = new Solution181878();
        String myString = "AbCdEfG", pat = "aBc";
        System.out.println(solution181878.solution(myString, pat));
    }

    public int solution(String myString, String pat) {
        return myString.toUpperCase(Locale.ROOT).contains(pat.toUpperCase()) ? 1 : 0;
    }
}
