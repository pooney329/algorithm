package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120903}
 */
public class Solution120903 {

    public static void main(String[] args) {
        Solution120903 solution120903 = new Solution120903();
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        System.out.println(solution120903.solution(s1, s2));
    }
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        for (String s : s1) {
            for (String value : s2) {
                if (s.equals(value)) {
                    answer++;
                }
            }
        }
        return answer;
    }
}
