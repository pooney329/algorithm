package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120908}
 */
public class Solution120908 {

    public static void main(String[] args) {
        Solution120908 solution120908 = new Solution120908();
        String st1 = "ab6CDE443fgh22iJKlmn1o";
        String st2 = "6CD";
        System.out.println(solution120908.solution(st1,st2));
    }

    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
