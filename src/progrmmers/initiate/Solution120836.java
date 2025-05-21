package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120836}
 */
public class Solution120836 {

    public static void main(String[] args) {
        System.out.println(new Solution120836().solution(100));
    }
    public int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n -1; i++) {
            if(n % i == 0) answer++;
        }
        return answer + 1;
    }
}
