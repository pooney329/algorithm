package progrmmers.initiate;

import java.util.Arrays;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/120833}
 */
public class Solution120833 {
    public static void main(String[] args) {
        Solution120833 Solution120833 = new Solution120833();
        int numbers[] = {1,2,3,4,5};
        int num1 = 1;
        int num2 = 3;
        System.out.println(Arrays.toString(Solution120833.solution(numbers, num1, num2)));
    }

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] array = new int[num2 - num1 + 1];
        int j = 0;
        for(int i = num1; i <= num2; i++) {
            array[j++] = numbers[i];
        }
        return array;
    }
}
