package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120831}
 */
public class Solution120831 {
    public static void main(String[] args) {
        Solution120831 solution120831 = new Solution120831();
        int n = 10;
        System.out.println(solution120831.solution(n));

    }

    public int solution(int n) {
        int answer = 0;

        for(int i=2; i<=n; i += 2){
            answer += i;
        }
        return answer;
    }
}
