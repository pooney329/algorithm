package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120807}
 */
public class Solution120807 {

    public static void main(String[] args) {
        int num1 = 2, num3 = 3;
        new Solution120807().solution(num1,num3);
    }

    public int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}
