package progrmmers.initiate;

/**
 * {@link  https://school.programmers.co.kr/learn/courses/30/lessons/120816}
 */
public class Solution120816 {

    public static void main(String[] args) {
        Solution120816 Solution120816 = new Solution120816();
        System.out.println(Solution120816.solution(7,10));
    }

    public int solution(int slice, int n) {
        return (int) Math.ceil((double) n / slice);
    }
}
