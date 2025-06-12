package progrmmers.initiate;

import java.util.Locale;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181877}
 */
public class Solution181877 {

    public static void main(String[] args) {
        Solution181877 solution181877 = new Solution181877();
        System.out.println(solution181877.solution("aBcDeFg"));
    }

    public String solution(String myString) {
        return myString.toUpperCase(Locale.ROOT);
    }

}
