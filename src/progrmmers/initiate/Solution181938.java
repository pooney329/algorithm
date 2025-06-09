package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181938}
 */
public class Solution181938 {
    public static void main(String[] args) {
        Solution181938 Solution181938 = new Solution181938();

        System.out.println(Solution181938.solution(2,91));
    }
    public int solution(int a, int b) {
        int stringInteger = Integer.parseInt(a + String.valueOf(b));
        int multiply = 2 * a * b;
        return Math.max(stringInteger,multiply);
    }
}
