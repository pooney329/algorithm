package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120806}
 */
public class Solution120806 {

    public static void main(String[] args) {
        System.out.println(new Solution120806().solution(3,2));
    }

    public int solution(int num1, int num2) {
        return (int) ((double) num1 / num2 * 1000);
    }
}
