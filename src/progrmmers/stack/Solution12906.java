package progrmmers.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/12906}
 */
public class Solution12906 {
    public static void main(String[] args) {
        Solution12906 Solution12906 = new Solution12906();
        int arr[] = {1, 1, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(Solution12906.solution(arr)));
    }

    public int[] solution(int[] arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            if (!stack.isEmpty()) {
                Integer peek = stack.peek();
                if (peek != null && peek == num) {
                    continue;
                }
            }
            list.add(num);
            stack.add(num);
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
