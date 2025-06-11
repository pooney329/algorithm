package progrmmers.initiate;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/181929}
 */
public class Solution181929 {
    public static void main(String[] args) {
        Solution181929 Solution181929 = new Solution181929();
        System.out.println(Solution181929.solution(new int []{3,4,5,2,1}));
    }
    public int solution(int[] num_list) {
        int answer = 0;
        int multiple = 1;
        int sum =0;
        for(int num : num_list){
            multiple *= num;
            sum += num;
        }
        return multiple < Math.pow(sum, 2) ? 1 : 0;
    }
}
