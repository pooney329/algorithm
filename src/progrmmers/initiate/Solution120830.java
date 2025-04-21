package progrmmers.initiate;

/**
 * {@link  https://school.programmers.co.kr/learn/courses/30/lessons/120830}
 */
public class Solution120830 {

    public static void main(String[] args) {
        int n = 64, k = 6;
        System.out.println(new Solution120830().solution(n, k));
        ;
    }

    public int solution(int n, int k) {
        return (n * 12000) + (k * 2000) - (n / 10 * 2000);
    }


}
