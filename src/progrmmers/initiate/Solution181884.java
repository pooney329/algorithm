package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181884}
 */
public class Solution181884 {
    public static void main(String[] args) {
        Solution181884 solution181884 = new Solution181884();
        solution181884.solution(new int[]{34, 5, 71, 29, 100, 34}, 123);
    }

    public int solution(int[] numbers, int n) {
        int answer = 0;
        for(int num : numbers) {
            if(answer > n) break;
            answer += num;
        }
        return answer;
    }


}
