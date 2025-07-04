package progrmmers.initiate;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181898}
 */
public class Solution181898 {

    public static void main(String[] args) {
        Solution181898 solution181898 = new Solution181898();
        int[] arr = {0,0,0,1};
        int idx = 1;

        System.out.println(solution181898.solution(arr, idx));
    }
    public int solution(int[] arr, int idx) {
        int answer = -1;

        for(int i=idx; i<arr.length; i++) {
            if(arr[i] == 1) {
                answer = i;
            }
        }
        return answer;
    }
}
