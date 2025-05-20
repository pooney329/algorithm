package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120814}
 */
public class Solution120814 {

    public static void main(String[] args) {
        Solution120814 Solution120814 = new Solution120814();
        System.out.println(Solution120814.solution(15));

    }

    public int solution(int n) {
        return  (int) Math.ceil(n / 7.0);
    }
}
