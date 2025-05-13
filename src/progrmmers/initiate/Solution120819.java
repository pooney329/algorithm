package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120819}
 */
public class Solution120819 {
    public static void main(String[] args) {
        Solution120819 Solution120819 = new Solution120819();
        System.out.println(Solution120819.solution(5500));
    }
    public int[] solution(int money) {
        int coffee = money/5500;
        int[] answer = {coffee, money % 5500};
        return answer;
    }
}
