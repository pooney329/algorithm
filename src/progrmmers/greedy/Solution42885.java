package progrmmers.greedy;


import java.util.*;

/**
 * {@link https://school.programmers.co.kr/learn/courses/30/lessons/42885}
 */
public class Solution42885 {

    public static void main(String[] args) {
        Solution42885 Solution42885 = new Solution42885();
        int[] people = new int[]{70, 50, 80, 50};
        int limit = 100;
        System.out.println(Solution42885.solution(people, limit));
    }
// 30 30 70 70(2) , 30 70 80(2)
    public int solution(int[] people, int limit) {
        int answer = 0;
        Integer[] arr = new Integer[people.length];
        for(int i=0; i<people.length; i++){
            arr[i] = people[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>(Arrays.asList(arr));

        while(!arrayDeque.isEmpty()){
            int first = arrayDeque.poll();
            if(!arrayDeque.isEmpty()){
                int last = arrayDeque.peekLast();
                if(first + last <= limit) {
                    arrayDeque.pollLast();
                }
            }
            answer++;
        }
        return answer;
    }
}
