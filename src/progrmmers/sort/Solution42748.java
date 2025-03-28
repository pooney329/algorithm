package progrmmers.sort;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42748}
 */
public class Solution42748 {

    public static void main(String[] args) {
        int array [] = new int[]{1, 5, 2, 6, 3, 7, 4};
        int commands [][] = new int[][]{
                {2, 5, 3}, {4, 4, 1}, {1, 7, 3}
        };
        System.out.println(Arrays.toString(new Solution42748().solution(array, commands)));
    }

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};

        int n=0;
        answer = new int[commands.length];
        for(int[] command : commands){
            int i = command[0];
            int j = command[1];
            int k = command[2];
            int[] temp = Arrays.copyOfRange(array, i - 1, j );
            Arrays.sort(temp);
            answer[n++] = temp[k-1];
        }
        return answer;
    }
}
