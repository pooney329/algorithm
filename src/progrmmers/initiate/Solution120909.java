package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120909}
 */
public class Solution120909 {

    public static void main(String[] args) {
        Solution120909 solution120909 = new Solution120909();
        int n = 143;
        System.out.println(144 == 144.00);
        System.out.println(Math.pow(12, 2));
        System.out.println(solution120909.solution(n));
    }

    public int solution(int n) {
        return  Math.sqrt(n) % 1 == 0 ? 1 : 2;
    }
}
